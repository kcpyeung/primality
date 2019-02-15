(ns prime.factorisation
  (:require [prime.primality :refer [prime?]]))

(defn primes-up-to [n]
  (->> (inc n)
       (range 2)
       (filter prime?)))

(defn- factors-of0 [n factors]
  (if (= n 1)
    factors
    (let [quotient        (->> n
                               primes-up-to
                               (map #(/ n %))
                               (filter integer?)
                               first)
          smallest-factor (/ n quotient)]
      (factors-of0 quotient (conj factors smallest-factor)))))

(defn factors-of [n]
  (factors-of0 n []))
