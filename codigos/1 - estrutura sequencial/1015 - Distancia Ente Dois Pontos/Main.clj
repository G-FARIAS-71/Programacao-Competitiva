(defn distancia [x1 y1 x2 y2]
    (Math/sqrt (+ (Math/pow (- x2 x1) 2) (Math/pow (- y2 y1) 2))))

(defn main []
    (println (format "%.4f" (float (apply distancia (repeatedly 4 read))))))

(main)