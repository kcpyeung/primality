(ns prime.factorisation-test
  (:require [clojure.test :refer :all]
            [prime.factorisation :refer :all]))

(deftest all-primes-up-to-n
  (testing "n is non-prime"
           (is (= [2 3 5 7 11] (primes-up-to 12))))

  (testing "2 works"
           (is (= [2] (primes-up-to 2))))

  (testing "1 is not a prime"
           (is (= [] (primes-up-to 1))))

  (testing "n itself is included if prime"
           (is (= [2 3 5 7] (primes-up-to 7)))))

(deftest factors-of-prime-numbers
  (testing "1"
           (is (= [] (factors-of 1))))

  (testing "2"
           (is (= [2] (factors-of 2))))

  (testing "11"
           (is (= [11] (factors-of 11)))))

(deftest factors-of-composite-numbers
  (testing "6"
           (is (= [2 3] (factors-of 6))))

  (testing "32"
           (is (= [2 2 2 2 2] (factors-of 32))))

  (testing "100"
           (is (= [2 2 5 5] (factors-of 100)))))
