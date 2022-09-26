(ns app.routes
  (:require [reagent.core :as r]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]
            [reitit.coercion.spec :as rss]
            [clojure.string :as s]
            [app.tailwind :as t]))

(defonce match (r/atom nil))

(defn home-page []
  [:div])

(defn class-names [& classes]
  (s/join " " classes))

(declare routes)

(defn navigation
  []
  [:nav.flex.items-stretch
   (for [[_ item] routes]
     [:a {:href (rfe/href (:name item))
          :key (:name item)
          :aria-current (when (:current item) "page")
          :class (class-names
                  (if (:current item)
                    "bg-gray-100 text-gray-900"
                    "text-gray-600 hover:bg-gray-50 hover:text-gray-900")
                  "flex items-center px-3 py-2 text-sm font-medium rounded-md")}
      [:span.truncate (:name item)]])])

(defn current-page []
  [:div
   [navigation]
   (when @match
     (let [view (:view (:data @match))]
       [view @match]))])

(def routes
  [["/colors"
    {:name ::colors
     :view t/colors}]

   ["/containers"
    {:name ::containers
     :view t/containers}]

   ["/typograhy"
    {:name ::typography
     :view t/typography}]

   ["/width-height"
    {:name ::width-height
     :view t/width-height}]

   ["/layout-and-positioning"
    {:name ::layout-and-positioning
     :view t/layout-and-positioning}]

   ["/backgrounds-and-shadows"
    {:name ::backgrounds-and-shadows
     :view t/backgrounds-and-shadows}]

   ["/borders-and-border-radius"
    {:name ::borders-and-border-radius
     :view t/borders-and-border-radius}]

   ["/filters"
    {:name ::filters
     :view t/filters}]

   ["/interactivity"
    {:name ::interactivity
     :view t/interactivity}]])

(def root-route
  ["/"
   {:name ::frontpage
    :view home-page}])

(defn router-start! []
  (rfe/start!
   (rf/router (into [root-route] routes) {:data {:coercion rss/coercion}})
   (fn [m] (reset! match m))
    ;; set to false to enable HistoryAPI
   {:use-fragment true}))