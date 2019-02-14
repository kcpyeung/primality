(ns prime.factorisation-test
  (:require [clojure.test :refer :all]
            [prime.factorisation :refer :all]))

(deftest one
  (testing "factor of 1 is 1"
           (is (= [1] (factors-of 1)))))
