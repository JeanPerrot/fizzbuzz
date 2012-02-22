(ns fizzbuzz.core)

(defn fizzbuzz []
  (dotimes [n 100]
    (cond (zero? (rem n 15)) (prn "fizzbuzz")
          (zero? (rem n 3)) (prn "fizz")
          (zero? (rem n 5)) (prn "buzz")
          :else (prn n)
          )))