(ns cloursera.core
  (:import [Point]))

(def point-slope-order
  (reify java.util.Comparator
    (compare [_ x y] 1)))

(defn point-slope-to [this that]
  (prn 'point-slope-to this that)
  1.2)

(defn point-compare-to [this that]
  (prn 'point-slope-to this that)
  3)

(defn -main []
  (let [p (Point. 0 0)]
    (doseq [x (range 0 10)
            y (range 0 10)]
      (.drawTo p (Point. x y))))
  (prn (.slopeTo (Point. 0 0) (Point. 1 2)))
  (prn (.compareTo (Point. 0 0) (Point. 1 2))))
