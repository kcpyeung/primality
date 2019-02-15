(ns prime.factorisation
  (:require [prime.primality :refer [prime?]]))

(defn primes-up-to [n]
  (->> (inc n)
       (range 2)
       (filter prime?)))

(defn factors-of [n]
  (if (= n 1)
    [1]
    (->> n
         primes-up-to
         (map #(/ n %))
         (filter integer?)
         first
         (* n)
         vector)))
