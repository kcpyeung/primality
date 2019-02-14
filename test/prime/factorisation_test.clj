(ns prime.factorisation-test
  (:require [clojure.test :refer :all]
            [prime.factorisation :refer :all]))

(deftest all-primes-up-to-n
  (testing "n is non-prime"
           (is (= [2 3 5 7 11] (primes-up-to 12))))

  (testing "n itself is included if prime"
           (is (= [2 3 5 7] (primes-up-to 7)))))

(deftest one
  (testing "factor of 1 is 1"
           (is (= [1] (factors-of 1)))))
