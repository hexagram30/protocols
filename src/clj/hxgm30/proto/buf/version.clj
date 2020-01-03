(ns hxgm30.proto.buf.version)

(def version "0.1.0-SNAPSHOT")
(def build-date "2020-01-03T22:19:27Z")
(def git-commit "f7e3044")
(def git-branch "feature/9/dice-roll-api")
(def git-summary "f7e3044-dirty")

(defn build-info
  []
  (format "%s, %s@%s, %s" version git-branch git-commit build-date))

(defn version-info
  []
  {:version version
   :build-date build-date
   :git-commit git-commit
   :git-branch git-branch
   :git-summary git-summary
   :build-info (build-info)})
