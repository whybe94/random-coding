
;Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

;1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

;By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


(defn term [p-2 p-1]
  (+ p-2 p-1))

(defn fib [max p-2 p-1 acc]
  (if (>= p-1 max) acc
      (fib max p-1 (term p-2 p-1) (concat acc [p-1]))))

(defn fibonacci [max p-2 p-1]
  (fib max p-2 p-1 [1]))

(defn bla [a]
  (if (even? a) a 0))

(defn answer [max]
  (reduce + (map #(if (even? %1) %1 0) (fibonacci max 1 2))))

(println (answer 4000000))