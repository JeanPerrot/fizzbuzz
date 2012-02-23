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
  (defn mapTo [n]
    (defn divisible? [x] (zero? (rem n x)))
    (cond (divisible? 15) "fizzbuzz"
          (divisible? 3) "fizz"
          (divisible? 5) "buzz"
          :else n
          ))
  (dotimes [n 100]
    (let [n (inc n)]
      (prn (mapTo n)))))
 
(defn fizzbuzz-3[]
  (defn special [n]
    (defn divisible? [x] (zero? (rem n x)))
    (str (when (divisible? 3) "fizz")
         (when (divisible? 5) "buzz")))
  (defn mapTo[n]
    (let [spec (special n)]
      (if (empty? spec) n
        spec)))
  (dotimes [n 100]
    (let [n (inc n)]
      (prn (mapTo n)))))


(def par {3 "fizz" 5 "buzz"})

(defn fizzbuzz-4[]
  (defn special [n]
    (defn divisible? [x] (zero? (rem n x)))
    (defn mapSingle [entry]
      (if (divisible? (entry 0)) (entry 1)))
    (apply str (map mapSingle par)))
  (defn mapTo[n]
    (let [spec (special n)]
      (if (empty? spec) n
        spec)))
  (dotimes [n 100]
    (let [n (inc n)]
      (prn (mapTo n)))))


