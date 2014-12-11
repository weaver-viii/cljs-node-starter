(defproject smoker-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "smoker-cljs"
              :source-paths ["src"]
              :compiler {
                :output-to "out/smoker_cljs.js"
                :output-dir "out"
                :target :nodejs
                :optimizations :none
                :source-map true}}]})
