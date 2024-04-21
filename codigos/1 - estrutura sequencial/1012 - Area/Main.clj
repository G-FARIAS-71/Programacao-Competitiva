(defn calcular-areas [a b c]
    (let [tri (format "%.3f" (/ (* a c) 2.0))
          circ (format "%.3f" (* 3.14159 (Math/pow c 2)))
          tra (format "%.3f" (/ (* (+ a b) c) 2.0))
          qua (format "%.3f" (float (Math/pow b 2)))
          ret (format "%.3f"(float (* a b)))]
        [tri circ tra qua ret]))

(defn printar-resultados [a b c]
    (let [areas (calcular-areas a b c)]
        (println "TRIANGULO:" (areas 0))
        (println "CIRCULO:" (areas 1))
        (println "TRAPEZIO:" (areas 2))
        (println "QUADRADO:" (areas 3))
        (println "RETANGULO:" (areas 4))))

(defn main []
    (apply printar-resultados (repeatedly 3 read)))

(main)