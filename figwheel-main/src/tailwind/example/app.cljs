(ns ^:figwheel-hooks tailwind.example.app
  (:require
    [reagent.core :as r]
    [reagent.dom :as dom]))

(def toggled (r/atom false))

(defn app []
  [:div {:class '[bg-gray-100 h-screen]}
   [:div {:class '[max-w-3xl mx-auto pt-12]}
    [:div {:class '[bg-white shadow sm:rounded-lg]}
     [:div {:class '[px-4 py-5 sm:p-6]}
      [:h3 {:class '[text-lg leading-6 font-medium text-gray-900]}
       "Example Tailwind UI Action Panel"]
      [:div {:class "mt-2 sm:flex sm:items-start sm:justify-between"}
       [:div {:class "max-w-xl text-sm leading-5 text-gray-500"}
        [:p "This is an example of how you can set up Tailwind (UI) and ClojureScript. Lorem ipsum dolor sit amet consectetur adipisicing elit. Explicabo totam non cumque deserunt officiis ex maiores nostrum."]]
       [:div {:class '[mt-5 sm:mt-0 sm:ml-6 sm:flex-shrink-0 sm:flex sm:items-center]}
        [:span
         {:role     "checkbox"
          :tabIndex "0"
          :on-click #(swap! toggled not)
          :class    (conj
                      '[relative inline-block flex-no-shrink h-6 w-11 border-2
                        border-transparent rounded-full cursor-pointer
                        transition-colors ease-in-out duration-200
                        focus:outline-none focus:shadow-outline bg-gray]
                      (if @toggled 'bg-indigo-600 'bg-gray-200))}
         [:span
          {:class (conj
                    '[inline-block h-5 w-5 rounded-full bg-white shadow
                      transform transition ease-in-out duration-200]
                    (if @toggled 'translate-x-5 'translate-x-0))}]]]]]]]])

(defn ^:after-load render []
  (dom/render [app] (js/document.getElementById "app")))

(defn ^:export main []
  (render))