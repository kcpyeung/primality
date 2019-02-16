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

(defn pretty-index-notation[[factor power]]
  (if (= power 1)
    (str factor)
    (str factor "^" power)))

(defn index-notation [ns]
  (->> ns
       frequencies
       (map pretty-index-notation)
       (clojure.string/join " * ")))

(defn factors-of [n]
  (if (not (> n 1))
    "only integers greater than 1 are supported"
    (->>
     (factors-of0 n [])
     index-notation)))
