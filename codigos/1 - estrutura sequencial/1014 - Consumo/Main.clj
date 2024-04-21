(defn main []
    (let [A (int (read))
          B (double (read))]
        (println (format "%.3f" (/ A B)) "km/l")))

(main)