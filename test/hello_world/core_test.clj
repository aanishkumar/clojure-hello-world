(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))

(deftest verify-main
  (is (= (with-out-str (-main))
    "Hello, World!\n")))
