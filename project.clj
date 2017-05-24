(defproject data-exploration "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.60.3"]
                 [incanter "1.9.2-SNAPSHOT"]
                 [core-matrix-gorilla "0.1.0"]]
  :plugins [[lein-gorilla "0.4.0"]]
  :profiles {:uberjar {:aot :all}})
