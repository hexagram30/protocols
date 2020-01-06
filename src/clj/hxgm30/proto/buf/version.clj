(ns hxgm30.proto.buf.version)

(def version "0.2.0")
(def build-date "2020-01-06T03:37:19Z")
(def git-commit "d892e96")
(def git-branch "master")
(def git-summary "v0.1.1-SNAPSHOT-2-gd892e96-dirty")

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
