(ns app.tailwind
  (:require [tailwind-hiccup-tooling.core :refer [tw]]))

(defn colors
  []
  [:<>
    ;; Default colors
    ;; white, black, red, green, blue, orange, yellow, purple, lime, emerald, teal, cyan, indigo, violet, fuchsia, pink, rose, sky, gray, slate, zinc, neutral, stone, amber,

    ;; Text Colors
   [:p.text-black "Tailwind is awsome"]
   [:p.text-white "Tailwind is awsome"]
   [:p.text-red-500 "Tailwind is awsome"]
   [:p.text-zinc-500 "Tailwind is awsome"]
   [:p.text-slate-800 "Tailewind is awsome"]
   [:p.text-lime-500 "Tailwind is awsome"]
   ;; Backgrounds
   [:p.bg-lime-500 "Tailwind is awsome"]
   [:p.bg-emerald-400 "Tailwind is awsome"]
   [:p.bg-yellow-300 "Tailwind is awseome"]
   ;; Underline
   [:p.underline.decoration-red-600 "Tailswind is awsome"]
   [:p.underline.decoration-emarald-600 "Tailswind is awsome"]
   [:p.underline.decoration-yellow-600 "Tailswind is awsome"]
   ;; Border Colors
   [:input.border.border-blue-500 {:type "text"}]
   [:input.border.border-green-500 {:type "text"}]
   [:input.border.border-orange-500 {:type "text"}]
   ;; Divide Colors
   [:div.divide-y.divide-blue-300
    [:div "Item 1"]
    [:div "Item 2"]
    [:div "Item 3"]
    [:div "Item 4"]
    [:div "Item 5"]]
   ;; Outlines
   [:button.outline.outline-red-500 "Hello"]
   [:button.outline.outline-blue-200 "Hello"]
   ;; Box Shadows
   [:button.shadow-lg.bg-cyan-500.shadow-cyan-500
    "Subscribe"]
   ;; Shadow with opacity 50%
   [:button.shadow-lg.bg-cyan-500
    {:class "shadow-purple-500/60"}
    "Subscribe"]
   ;; Accents (disable '@tailwindcss/forms')
   [:input {:type "checkbox"
            :class "accent-pink-500"}]
   [:input {:type "checkbox"
            :class "accent-purple-500"}]
   ;; Arbitrary Colors
   [:div {:class "bg-[#427fab]"} "Tailwind is Awsome"]
   [:div {:class "bg-[rgb(255,0,0)]"} "Tailwind is Awsome"]])

(defn containers
  []
  [:div.container.mx-auto
   [:article
    [:h3 "Article One"]
    [:p
     "Lorem ipsum dolor sit amet consectetur adipisicing elit.
      Exercitationem laboriosam libero molestiae recusandae accusantium
      voluptates? Expedita dignissimos amet eveniet dolore nobis odio a
      sunt, maiores quasi. Modi amet quos dolores!"]]
   ;; Margin
   [:div.bg-slate-200.m-2 "Margin"]
   [:div.bg-slate-200.ml-4 "Margin"]
   [:div.bg-slate-200.mr-4 "Margin"]
   [:div.bg-slate-200.mt-4 "Margin"]
   [:div.bg-slate-200.mb-4 "Margin"]
   [:div.bg-slate-200 {:class "mt-[20px]"} "Margin"]
   ;; Padding
   [:div.bg-slate-200.p-2 "Padding"]
   [:div.bg-slate-200.pl-4 "Padding"]
   [:div.bg-slate-200.pr-4 "Padding"]
   [:div.bg-slate-200.pt-4 "Padding"]
   [:div.bg-slate-200.pb-4 "Padding"]
   [:div.bg-slate-200 {:class "pt-[20px]"} "Padding"]
   ;; Space Between X
   [:div.flex.mt-24.space-x-4
    [:div "Item 1"]
    [:div "Item 2"]
    [:div "Item 3"]
    [:div "Item 4"]
    [:div "Item 5"]
    [:div "Item 6"]]
   ;; Space Between Y
   [:div.flex.flex-col.mt-24.space-y-4
    [:div "Item 1"]
    [:div "Item 2"]
    [:div "Item 3"]
    [:div "Item 4"]
    [:div "Item 5"]
    [:div "Item 6"]]])


(defn typography
  []
  [:<>
   ;; Font Family
   [:div.font-sans "Font Family"]
   [:div.font-serif "Font Family"]
   [:div.font-mono "Font Family"]
   ;; Font Size
   [:div.text-xs "Font Size"]
   [:div.text-sm "Font Size"]
   [:div.text-base "Font Size"]
   [:div.text-lg "Font Size"]
   [:div.text-xl "Font Size"]
   [:div.text-2xl "Font Size"]
   [:div.text-3xl "Font Size"]
   ;; Font Weight
   [:div.font-light "Font Weight"]
   [:div.font-normal "Font Weight"]
   [:div.font-medium "Font Weight"]
   [:div.font-semibold "Font Weight"]
   [:div.font-bold "Font Weight"]
   ;; Letter Spacing
   [:div.tracking-tight "Letter Spacing"]
   [:div.tracking-normal "Letter Spacing"]
   [:div.tracking-wide "Letter Spacing"]

   ;; Text Alignment
   [:div.text-left "Text Alignment"]
   [:div.text-center "Text Alignment"]
   [:div.text-right "Text Alignment"]

   ;; Text Decoration
   [:div.underline.decoration-4.decoration-blue-300 "Text Decoration"]
   [:div.underline.decoration-double "Text Decoration"]
   [:div.underline.decoration-dotted "Text Decoration"]
   [:div.underline.decoration-dashed "Text Decoration"]
   [:div.underline.decoration-wavy "Text Decoration"]

   ;; Decoration Offset
   [:div.underline.decoration-4.decoration-blue-300.underline-offset-8 "Decoration Offset"]

   ;; Text Transform
   [:div.normal-case "Text Transform"]
   [:div.uppercase "Text Transform"]
   [:div.lowercase "Text Transform"]
   [:div.capitalize "Text Transform"]])

(defn width-height
  []
  [:<>
   ;; Width
   [:div.bg-black.text-white.w-4 "Width"]
   [:div.bg-black.text-white.w-48 "Width"]
   [:div.bg-black.text-white.w-96 "Width"]

   ;; Percentages
   [:div.bg-green-700.text-white {:class "w-1/4"} "Percantage"]
   [:div.bg-green-700.text-white {:class "w-1/3"} "Percantage"]
   [:div.bg-green-700.text-white {:class "w-1/2"} "Percantage"]

   ;; Width of the viewport
   [:div.bg-blue-500.text-white.w-screen "Width of the viewport"]
   ;; 100% of container
   [:div.bg-blue-300.text-white.w-full "100% of container"]
   ;; Arbitrary width
   [:div.bg-gray-300.text-white.max-w-sm.mx-auto "rbitrary width - Occaecat do ea anim incididunt amet nisi voluptate in amet ut.
                                          Eu pariatur deserunt nisi qui et fugiat duis esse non non adipisicing laborum.
                                          Quis aliquip cupidatat laboris proident nostrud sunt nisi.
                                          Ea cillum deserunt tempor nisi esse quis qui culpa. Ut ut tempor ullamco labore
                                          dolore magna nisi anim. Laboris amet consectetur magna sint commodo mollit sunt aliquip ipsum ex."]
   ;; Max Width

   ;; Height (Most of the same options as widths)

   [:div.flex.items-end
    [:div.bg-orange-500.w-20.h-24 "Hello"]
    [:div.bg-orange-500.w-20.h-32 "Hello"]
    [:div.bg-orange-500.w-20.h-40 "Hello"]
    [:div.bg-orange-500.w-20.h-48 "Hello"]
    [:div.bg-orange-500.w-20.h-64 "Hello"]
    [:div.bg-orange-500.w-20.h-96 "Hello"]]
  ;; Full screen height
   [:div.bg-blue-300.text-white.h-screen "Hello"]])

(defn layout-and-positioning []

  [:<>
   ;; Positioning
   [:div.relative.h-12.bg-red-200 {:class "w-1/2"}
    [:p "Parent Element"]
    [:div.absolute.bottom-0.right-0.bg-red-500
     [:p "Child Elements"]]]
   ;; Top left corner
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolut.left-0.top-0.h-16.w-16.bg-yellow-300]]
   ;; Top right corner
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.right-0.top-0.h-16.w-16.bg-yellow-300]]
   ;; Bottom left corner
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.left-0.bottom-0.h-16.w-16.bg-yellow-300]]
   ;; Bottom right corner
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.right-0.bottom-0.h-16.w-16.bg-yellow-300]]
   ;; Span top edge
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.inset-x-0.top-0.h-16.bg-yellow-300]]
   ;; Span left edge
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.inset-y-0.left-0.w-16.bg-yellow-300]]
   ;; Span right edge
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.inset-y-0.right-0.w-16.bg-yellow-300]]
   ;; Span bottom edge
   [:div.relative.h-32.w-32.bg-yellow-100
    [:div.absolute.inset-x-0.bottom-0.h-16.bg-yellow-300]]
   ;; Display Classes
   [:div
    "Sunt id veniam mollit do tempor sint officia et id est est id dolor. "
    [:span.inline.bg-yellow-100 "This is inline"]
    "laboris anim ex cupidatat non excepteur laborum excepteur anim."
    [:span.inline-block.bg-yellow-200 "This is inline block"]
    " Lorem officia sunt qui enim. Ipsum consequat fugiat"
    [:span.block.bg-yellow-300 " this is block"] "fugiat veniam id pariatur sit dolor cillum. "
    [:span.hidden.bg-yellow-400 "this is hidden"]
    "Et incididunt ullamco eu occaecat eiusmodLorem."]
   ;; Z-Index
   [:div.relative.h-36
    [:div.absolute.left-10.w-24.h-24.bg-blue-300.z-40 "1"]
    [:div.absolute.left-20.w-24.h-24.bg-blue-400 "2"]
    [:div.absolute.left-40.w-24.h-24.bg-blue-500.z-10 "3"]
    [:div.absolute.left-60.w-24.h-24.bg-blue-600.z-20 "4"]
    [:div.absolute.left-80.w-24.h-24.bg-blue-700.z-30 "5"]]])
   ;; Floats - DON'T USE IT


(defn backgrounds-and-shadows []
  [:<>
   ;; Background Classes
   [:div.h-64.w-72 {:style {:background-image "url('https://fakeimg.pl/300/')"}
                    :class "bg-no-repeat bg-cover bg-center"}]
   ;; Gradients
   [:div.h-24.bg-gradient-to-l.from-cyan-500.to-blue-500]
   ;; Shadows
   [:div.w-96.mt-6.ml-4.p-3.shadow
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-md
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-lg
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-xl
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-2xl
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-inner
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-xl.shadow-blue-500
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]
   [:div.w-96.mt-6.ml-4.p-3.shadow-xl.shadow-blue-500
    "Nostrud aliquip consectetur eiusmod irure pariatur. Cillum laborum cillum reprehenderit tempor veniam laboris amet sit enim ex fugiat dolor irure. Ea proident tempor ullamco deserunt anim eiusmod reprehenderit aute irure adipisicing labore reprehenderit. Officia proident sint nostrud et incididunt dolor in eu aliquip. Nulla exercitation tempor proident sit consequat id ad nostrud sint elit sunt officia labore."]

   ;; Mix Blend
   [:div.flex.justify-center.-space-x-24
    [:div.mix-blend-multiply.bg-blue-400 "Irure tempor cupidatat nisi dolore cupidatat. Ullamco veniam aute commodo laborum culpa nostrud occaecat voluptate consectetur dolor ad consectetur. Mollit voluptate aute mollit minim tempor quis labore occaecat anim nulla. Amet voluptate ipsum culpa irure excepteur dolore nostrud id exercitation laboris."]
    [:div.mix-blend-multiply.bg-pink-400 "Irure tempor cupidatat nisi dolore cupidatat. Ullamco veniam aute commodo laborum culpa nostrud occaecat voluptate consectetur dolor ad consectetur. Mollit voluptate aute mollit minim tempor quis labore occaecat anim nulla. Amet voluptate ipsum culpa irure excepteur dolore nostrud id exercitation laboris."]]])

(defn borders-and-border-radius []
  [:div
   ;; Borders
   [:div.w-96.m-3.p-5.border "Deserunt enim veniam irure veniam nulla enim commodo sunt ad culpa fugiat commodo eu laboris. Magna elit ut sunt eiusmod pariatur aliquip duis adipisicing. Aliqua adipisicing magna ex non amet aliqua irure labore irure aute. Anim nulla culpa sunt commodo esse mollit. Deserunt mollit dolor et do cupidatat sunt magna. Sint sunt minim nulla velit duis cillum irure."]
   [:div.w-96.m-3.p-5.border-2 "Deserunt enim veniam irure veniam nulla enim commodo sunt ad culpa fugiat commodo eu laboris. Magna elit ut sunt eiusmod pariatur aliquip duis adipisicing. Aliqua adipisicing magna ex non amet aliqua irure labore irure aute. Anim nulla culpa sunt commodo esse mollit. Deserunt mollit dolor et do cupidatat sunt magna. Sint sunt minim nulla velit duis cillum irure."]
   [:div.w-96.m-3.p-5.border-4 "Deserunt enim veniam irure veniam nulla enim commodo sunt ad culpa fugiat commodo eu laboris. Magna elit ut sunt eiusmod pariatur aliquip duis adipisicing. Aliqua adipisicing magna ex non amet aliqua irure labore irure aute. Anim nulla culpa sunt commodo esse mollit. Deserunt mollit dolor et do cupidatat sunt magna. Sint sunt minim nulla velit duis cillum irure."]
   [:div.w-96.m-3.p-5.border-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-x-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-y-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-t-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-b-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-r-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   [:div.w-96.m-3.p-5.border-l-4.border-red-500 "Deserunt enim veniam irure veniam nulla enim"]
   ;; Border Radius
   [:div.w-96.m-3.p-5.border-4.rounded-sm "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-md "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-lg "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-2xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-3xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-full "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-t-2xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-b-2xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-l-2xl "Deserunt enim veniam irure veniam nu"]
   [:div.w-96.m-3.p-5.border-4.rounded-r-2xl "Deserunt enim veniam irure veniam nu"]
   ;; Outlines
   [:button.border-4.rounded-r-2xl.outline.outline-offset-2.outline-4.outline-red-500.m-4 "Button"]])

(defn filters []
  [:<>
   ;; Bluring
   [:div.text-red-300.blur-none "Tempor tempor labore ex anim commodo sunt ut duis."]
   [:div.text-blue-300.blur "Tempor tempor labore ex anim commodo sunt ut duis."]
   [:div.text-blue-500.blur-sm "Tempor tempor labore ex anim commodo sunt ut duis."]
   [:div.blur-lg "Tempor tempor labore ex anim commodo sunt ut duis."]
   [:div.blur-2xl "Tempor tempor labore ex anim commodo sunt ut duis."]
   [:img.blur-sm {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"
                  :alt ""}]
   ;; Brightness 
   [:img.brightness-50 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg" :alt ""}]
   [:img.brightness-75 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg" :alt ""}]
   [:img.brightness-100 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg" :alt ""}]
   [:img.brightness-150 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg" :alt ""}]
   [:img.brightness-200 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg" :alt ""}]
   ;; Contrast
   [:img.contrast-0 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   [:img.contrast-50 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   [:img.contrast-100 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   [:img.contrast-150 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   [:img.contrast-200 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   ;; Grayscale
   [:img.grayscale {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   ;; Invert
   [:img.invert {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   ;; Sepia
   [:img.sepia {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]
   ;; Hue Rotate
   [:img.hue-rotate-100 {:src "http://www.html.am/images/samples/remarkables_queenstown_new_zealand-300x225.jpg"}]])

 
(defn interactivity 
  []
  [:div 
   ;; Hover State Styling
   [:button.bg-black.text-white.py-3.px-5.rounded-lg.m-3.hover:bg-orange-500.hover:text-white
    "Hover"]
   ;; Focus
   [:button.bg-black.text-white.py-3.px-5.rounded-lg.m-3.focus:bg-orange-500.focus:text-white
    "Focus"]
   ;; Active
   [:button.bg-black.text-white.py-3.px-5.rounded-lg.m-3.active:bg-orange-500.active:text-white
    "Active"]
   ;; Styling based on parent state
   [:a (tw :group.block.max-w-xs.mx-auto.rounded-lg.p-6.bg-white.w-1!4
           :shadow-lg.space-y-3.hover:text-red
           {:on-click #(println "click!")
            :class "hover:text-red"}) "Parent"]])
