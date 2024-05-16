(defn main []
    (let [idade-dias (read)
          anos (int (/ idade-dias 365))
          meses (int (/ (- idade-dias (* anos 365)) 30))
          dias (- idade-dias (* anos 365) (* meses 30))]
        (println anos "anos(s)")
        (println meses "mes(es)")
        (println dias "dia(s)")))

(main)