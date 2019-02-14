(ns prime.factorisation
  (:require [prime.primality :refer [prime?]]))

(defn primes-up-to [n]
  (->> (inc n)
       (range 2)
       (filter prime?)))

(defn factors-of [n]
  [1])
