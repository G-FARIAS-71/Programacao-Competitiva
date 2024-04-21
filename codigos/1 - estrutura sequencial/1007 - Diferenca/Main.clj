(defn main []
  (let [A (read)
        B (read)
        C (read)
        D (read)
        Diferenca (- (* A B) (* C D))]
      (println "DIFERENCA =" Diferenca)))

(main)