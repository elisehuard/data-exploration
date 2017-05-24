(ns data-exploration.core
  (:use [incanter.io :only (read-dataset)])
  (:require [clojure.core.matrix.dataset :refer :all]
            [clojure.java.io :as io]))

(defn foo
  "I don't do a whole lot."
  []
  (let [basic-income-ds (read-dataset (io/resource "basic_income_dataset_dalia.csv")  :header true)
        colnum (count (column-names basic-income-ds))]
    (map (fn [colnr] (filter #(== "NULL" (nth % colnr)) basic-income-ds)) (range 1 colnum))
    ))
