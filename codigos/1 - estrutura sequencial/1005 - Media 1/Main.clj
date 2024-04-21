(defn calcular-media [A B]
  (/ (+ (* 3.5 A) (* 7.5 B)) 11.0))

(defn main []
  (let [A (read)
        B (read)
        media (calcular-media A B)]
      (println "MEDIA =" (format "%.5f" media))))
  
(main)