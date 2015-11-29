(ns handy.map-values)

(def ^:private empty-transient (comp transient empty))

(defn- reduce-values [f op init coll]
  (reduce-kv
   (fn [m k v] (op m k (f v)))
   init coll))

(defn map-values
  "Apply f to each value in the key-value coll, preserving keys"
  [f coll]
  {:pre [(satisfies? clojure.core.protocols/IKVReduce coll)]}
  (if (instance? clojure.lang.IEditableCollection coll)
    (persistent! (reduce-values f assoc! (empty-transient coll) coll))
    (reduce-values f assoc (empty coll) coll)))
