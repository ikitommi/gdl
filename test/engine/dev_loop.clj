(ns engine.dev-loop
  (:require [clojure.tools.namespace.repl :refer [refresh-all]]

            [engine.input-test :refer [app]]
            ;[engine.simple-test :refer [app]]

            ))

; refresh-all because global state in engine.core/initialize

(defn dev-loop []
  (app)
  (refresh-all :after 'engine.dev-loop/dev-loop))
