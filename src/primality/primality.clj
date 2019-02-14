(ns primality.primality)

(defn prime? [n]
  (cond
    (= n 2)           true
    (zero? (rem n 2)) false))
