(ns prime.primality-test
  (:require [clojure.test :refer :all]
            [prime.primality :refer :all]))

(deftest smaller-than-two
  (testing "0 is not prime"
           (is (not (prime? 0))))

  (testing "1 is not prime"
           (is (not (prime? 1)))))

(deftest even-numbers
  (testing "2 is prime"
    (is (prime? 2)))

  (testing "all other even numbers are not prime"
    (is (not (prime? 4)))))

(deftest brute-force-division
  (testing "not prime"
           (is (not (prime? 35))))

  (testing "prime"
           (is (prime? 11))))
