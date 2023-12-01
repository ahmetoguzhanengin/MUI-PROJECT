(ns core (:require [reagent.core :as reagent]))

(defn app []
      [:> material/CssBaseline
       [:> material/Container
        [:> material/Box
         {:marginTop "2rem"}
         [:> material/Typography
          {:variant "h4" :component "h1"}
          "Material-UI ile Clojure Projesi"]
         [:> material.Button
          {:variant "contained" :color "primary"}
          "Buton"]]]])

(defn mount-root []
      (reagent/render [app]
                      (.getElementById js/document "app")))

(defn init! []
      (mount-root))