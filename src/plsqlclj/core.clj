(ns plsqlclj.core
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def SQLDB {:classname "oracle.jdbc.OracleDriver"
            :subprotocol "oracle:oci"
            :subname "@TEST"
            ;:subname "@DEVL"
            :user "lei203"
            :password "IstandBehindYourMother"})

(def rs (j/query SQLDB ["select * from UOFREXEC.Y_CAT_SCHD WHERE ROWNUM <=5"]))

(first rs)
