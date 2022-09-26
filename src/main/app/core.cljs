(ns app.core
  (:require [app.tailwind :as t]
            [reagent.dom :as d]
            [app.routes :refer [router-start! current-page]]))

(defn ^:dev/after-load start
  []
  (d/render
   [current-page]
   (.getElementById js/document "app")))

(defn ^:export init
  []
  (router-start!)
  (start))

;; Rich comment block with redefined vars ignored
#_{:clj-kondo/ignore [:redefined-var]}
(comment
  (js/alert "testing...")
  (println "ello")) ;; End of rich comment block
