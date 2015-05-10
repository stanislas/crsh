(defproject crsh "0.1.0"
  :description "Clojure Shell"
  :url "https://github.com/stanislas/crsh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.fusesource.jansi/jansi "1.11"]
                 [org.tobereplaced/nio.file "0.4.0"]
                 [clj-http "1.1.2"]]
  :main clojure.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
