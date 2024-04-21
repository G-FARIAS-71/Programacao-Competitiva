(defn calcular-media [A B C]
  (/ (+ (* 2 A) (* 3 B) (* 5 C)) 10.0))

(defn main []
  (let [A (read)
        B (read)
        C (read)
        media (calcular-media A B C)]
      (println "MEDIA =" (format "%.1f" media))))
  
(main)