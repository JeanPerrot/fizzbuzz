(ns fizzbuzz.core)

(defn fizzbuzz []
  (dotimes [n 100]
    (let [n (inc n)]
      (cond (zero? (rem n 15)) (prn "fizzbuzz")
            (zero? (rem n 3)) (prn "fizz")
            (zero? (rem n 5)) (prn "buzz")
            :else (prn n)
            ))))


(defn fizzbuzz-2[]
  (defn divisible? [n x] (zero? (rem n x)))
  (defn mapTo [n]
    (cond (divisible? n 15) "fizzbuzz"
          (divisible? n 3) "fizz"
          (divisible? n 5) "buzz"
          :else n
          ))
  (dotimes [n 100]
    (let [n (inc n)]
      (prn (mapTo n)))))
          