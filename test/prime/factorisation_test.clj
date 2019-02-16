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

(deftest invalid-numbers
  (testing "1"
           (is (= "only integers greater than 1 are supported" (factors-of 1))))

  (testing "0"
           (is (= "only integers greater than 1 are supported" (factors-of 1))))

  (testing "-5"
           (is (= "only integers greater than 1 are supported" (factors-of 1)))))

(deftest factors-of-prime-numbers
  (testing "2"
           (is (= "2" (factors-of 2))))

  (testing "11"
           (is (= "11" (factors-of 11)))))

(deftest factors-of-composite-numbers
  (testing "simple multiplication"
           (is (= "2 * 3" (factors-of 6))))

  (testing "single index notation"
           (is (= "2^5" (factors-of 32))))

  (testing "multiple index notations"
           (is (= "2^2 * 5^2" (factors-of 100)))))

(deftest pretty-print-index-notation
  (testing "single number"
           (is (= "3" (index-notation [3]))))

  (testing "simple multiplication"
           (is (= "2 * 3" (index-notation [2 3]))))

  (testing "single index notation"
           (is (= "2^5" (index-notation [2 2 2 2 2]))))

  (testing "multiple index notations"
           (is (= "2^5 * 3^2" (index-notation [2 2 2 2 2 3 3])))))
