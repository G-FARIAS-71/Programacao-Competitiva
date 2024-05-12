(def cedulas [100 50 20 10 5 2 1])

(defn qntd-notas 
    ([n] (qntd-notas [] 0 n))
    ([qntd_cedulas i valor-atual]
        (if (= i (count cedulas))
            qntd_cedulas
            (let [qntd (quot valor-atual (cedulas i))
                valor (* qntd (cedulas i))]
                (recur (conj qntd_cedulas qntd) (inc i) (- valor-atual valor))))))

(defn main []
    (let [n (read)]
        (println n)
        (doall (map #(println (str %1 " nota(s) de R$ " %2 ",00")) (qntd-notas n) cedulas))))

(main)