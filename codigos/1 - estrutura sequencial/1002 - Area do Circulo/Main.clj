(def PI 3.14159)

(defn calcular-area [raio]
    (format "%.4f" (* PI (Math/pow raio 2))))

(defn main []
    (let [raio (read)
          area (calcular-area raio)]
        (println (str "A=" area))))

(main)