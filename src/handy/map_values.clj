(ns handy.map-values)

(defn map-values
  "Apply f to each value in the key-value coll, preserving keys"
  [f coll]
  {:pre [(satisfies? clojure.core.protocols/IKVReduce coll)]}
  (reduce-kv
   (fn [m k v] (assoc m k (f v)))
   (empty coll) coll))
