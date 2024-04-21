(defn main []
    (let [number (int (read))
          horas (int (read))
          salario_hora (float (read))]
        (println "NUMBER =" number)
        (println "SALARY = U$" (format "%.2f" (* horas salario_hora)))))

(main)