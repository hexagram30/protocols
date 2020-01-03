(ns hxgm30.proto.buf.version)

(def version "0.1.0-SNAPSHOT")
(def build-date "2020-01-04T16:47:53Z")
(def git-commit "57fb50d")
(def git-branch "master")
(def git-summary "57fb50d-dirty")

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
