(def notas [100 50 20 10 5 2])
(def moedas [1 0.5 0.25 0.1 0.05 0.01])

(defn notas-op 
  ([valor]
   (notas-op valor [] 0))
  ([valor resultados i]
   (if (= i (count notas))
     [valor resultados]
     (let [nota (notas i)
           qntd (int (/ valor nota))]
       (recur (- valor (* qntd nota)) (conj resultados qntd) (inc i))))))

(defn moedas-op
  ([valor]
   (moedas-op valor [] 0))
  ([valor resultados i]
   (if (= i (count moedas))
     resultados
     (let [moeda (moedas i)
           qntd (int (/ valor moeda))]
       (recur (- valor (* qntd moeda)) (conj resultados qntd) (inc i))))))

(defn main []
  (let [valor (float (+ (read) 0.000001))
        [valor-apos-notas resultados-notas] (notas-op valor)
        resultados-moedas (moedas-op valor-apos-notas)]
    (println "NOTAS:")
    (doall (map #(println %2 "nota(s) de R$" (format "%.2f" (float %1))) notas resultados-notas))
    (println "MOEDAS:")
    (doall (map #(println %2 "moeda(s) de R$" (format "%.2f" (float %1))) moedas resultados-moedas))))

(main)