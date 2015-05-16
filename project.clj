(defproject
  crsh "0.1.0"
  :description "Clojure Repl Shell"
  :url "https://github.com/stanislas/crsh"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.fusesource.jansi/jansi "1.11"]
                 [org.tobereplaced/nio.file "0.4.0"]
                 [clj-http "1.1.2"]]
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-resource "14.10.1"]]
  :prep-tasks ["javac" "compile" "resource"]
  :resource {
             :resource-paths ["resources"]
             :target-path "target/bin"
             :extra-values {:crsh-shell "/bin-sh"
                            :crsh-java "drip"}
             })
