(defproject rabbit-robo "0.1.0-SNAPSHOT"
  :description "Robocode"
  :url "http://wal.sh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts [ "-Xmx512M" "-XX:MaxPermSize=512M"]
  :aot [#".*bot"]
  :plugins [[lein-ancient "0.5.4"]]
  :dependencies [
    [org.clojure/clojure "1.5.1"]
    [org.nakkaya.robocode/robocode "1.7.2.0"]
    [alter-ego "0.0.4-SNAPSHOT"]])
