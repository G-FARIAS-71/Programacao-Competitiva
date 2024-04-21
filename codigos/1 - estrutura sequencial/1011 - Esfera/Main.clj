(def PI 3.14159)

(defn get-volume [raio]
    (* (/ 4 3.0) PI (Math/pow raio 3)))

(defn main []
    (let [raio (read)
          volume (get-volume raio)]
        (println "VOLUME =" (format "%.3f" volume))))

(main)