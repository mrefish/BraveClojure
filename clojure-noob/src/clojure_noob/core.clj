(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(defn train
  []
  (println "choo choo"))

(defn get-names
  []
  (def failed-names
    ["KittyCatness Everdinertime" "Deadkittypool" "Iron Mantis"])
  failed-names)

(defn error-message
  [severity]
  (str "oh god! its a calamity! we're "
       (if (= severity :mild)
         "mildly inconvenienced"
         "dooooomed")))
