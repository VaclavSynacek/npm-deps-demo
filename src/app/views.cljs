(ns app.views
  (:require [reagent.core :as reagent]
            [react-helmet :as rh]))

(def meta-tags (reagent/adapt-react-class rh/Helmet))


(defn main-panel []
  [:div.container
   [meta-tags
     [:title "new title"]
     [:meta {:id "description" :content "new description"}]]
   [:h1 "Check for the meta-tags presence"]])
