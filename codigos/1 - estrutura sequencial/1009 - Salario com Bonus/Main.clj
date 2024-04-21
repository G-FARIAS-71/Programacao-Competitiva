(defn main []
    (read)
    (let [salario-fixo (double (read))
          receita-vendas (double (read))
          salario-total (+ salario-fixo (* 0.15 receita-vendas))]
        (println "TOTAL = R$" (format "%.2f" salario-total))))

(main)