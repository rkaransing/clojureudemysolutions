(ns age-in-human-years.core
  (:gen-class))

(defn in-human-years
  "This function gives back Age of Pet in Human-Years"
  [age pet-name]
  (let [pet-map {:dog 7 :cat 5 :fish 10}]
    (* age (pet-name pet-map))))
