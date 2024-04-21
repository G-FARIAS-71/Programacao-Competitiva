(defn calculo [id1 q1 v1 id2 q2 v2]
    (float (+ (* q1 v1) (* q2 v2))))

(defn main []
    (let [valores (repeatedly 6 read)]
        (println "VALOR A PAGAR: R$" (format "%.2f" (apply calculo valores)))))

(main)