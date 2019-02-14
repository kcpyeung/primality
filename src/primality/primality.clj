(ns primality.primality)

(defn prime? [n]
  (cond
    (= n 0)           false
    (= n 1)           false
    (= n 2)           true
    (= n 3)           true
    (zero? (rem n 2)) false
    :else
    (->> n
         Math/sqrt
         int
         inc
         (range 3)
         (filter odd?)
         (map #(/ n %))
         (not-any? integer?))))
