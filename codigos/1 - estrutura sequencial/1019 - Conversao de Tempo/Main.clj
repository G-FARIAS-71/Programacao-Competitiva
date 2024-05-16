(defn main []
    (let [total (read)
          horas (int (/ total 3600))
          minutos (int (/ (- total (* horas 3600)) 60))
          segundos (- total (* horas 3600) (* minutos 60))]
        (println (str horas ":" minutos ":" segundos))))

(main)