(ns handy.map-values-test
  (:require [clojure.test :refer [deftest testing is]]
            [handy.map-values :refer [map-values]]))

(deftest map-values-test
  (testing "works on maps"
    (let [m {:a 1 :b 2 :c 3}
          result (map-values inc m)]
      (is (= {:a 2 :b 3 :c 4} result))
      (is (map? result))))
  (testing "works on vectors"
    (let [v [1 2 3 4]
          result (map-values inc v)]
      (is (= [2 3 4 5] result))
      (is (vector? result)))))
