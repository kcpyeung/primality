(ns primality.primality-test
  (:require [clojure.test :refer :all]
            [primality.primality :refer :all]))

(deftest even-numbers
  (testing "2 is prime"
    (is (prime? 2)))

  (testing "all other even numbers are not prime"
    (is (not (prime? 4)))))
