(ns plsqlclj.core
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def SQLDB {:classname "sun.jdbc.odbc.JdbcOdbcDriver"
            :subprotocol "odbc"
            ;:subname "TEST"
            :subname "BANNER"
            :user "xxx"
            :password "xxxx"})

(def rs (j/query SQLDB ["select * from UOFREXEC.Y_CAT_SCHD WHERE ROWNUM <=5"]))

(first rs)
