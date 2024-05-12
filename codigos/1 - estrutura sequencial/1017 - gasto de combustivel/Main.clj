(defn calcular-gasto [h km]
    (/ (* h km) 12.0))

(defn main []
    (let [gasto (calcular-gasto (read) (read))]
        (println (format "%.3f" gasto))))

(main)