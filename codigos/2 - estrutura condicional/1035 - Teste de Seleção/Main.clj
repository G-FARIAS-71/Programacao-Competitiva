(defn eh_valido [A B C D]
    (and
        (> B C)
        (> D A)
        (> (+ C D) (+ A B))
        (pos? C)
        (pos? D)
        (zero? (mod A 2))))

(defn main []
    (if (apply eh_valido (repeatedly 4 read))
        (println "Valores aceitos")
        (println "Valores nao aceitos")))

(main)