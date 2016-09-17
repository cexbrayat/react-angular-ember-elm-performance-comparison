(defproject todomvc "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :jvm-opts ^:replace ["-Xms512m" "-Xmx512m" "-server"]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.40"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [secretary "0.4.0"]
                 [org.omcljs/om "0.8.8"]]

  :source-paths ["src"]

  :clean-targets ["out"])
