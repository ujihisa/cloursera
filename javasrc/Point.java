/*************************************************************************
 * Name:
 * Email:
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Comparator;

public class Point implements Comparable<Point> {

    // compare points by slope
    public final Comparator<Point> SLOPE_ORDER;       // YOUR DEFINITION HERE

    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        ClassLoader previous = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        try {
            clojure.lang.RT.loadResourceScript("cloursera/core.clj");
        } catch (Exception e) {}

        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
        this.SLOPE_ORDER = null;
    }

    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(Point that) {
        return Double.parseDouble(clojure.lang.RT.var("cloursera.core", "point-compare-to").invoke(this, that).toString());
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(Point that) {
        return Integer.parseInt(clojure.lang.RT.var("cloursera.core", "point-compare-to").invoke(this, that).toString());
    }

    // return string representation of this point
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }

    /*
    private void invokeClojureFunc() {
        try {
            ClassLoader previous = Thread.currentThread().getContextClassLoader();
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());

            clojure.lang.RT.loadResourceScript("cloursera/core.clj");
            clojure.lang.RT.var("cloursera.core", enableFunction).invoke(arg);

            Thread.currentThread().setContextClassLoader(previous);
        } catch (Exception e) {
            System.out.println("Something broke setting up Clojure");
            e.printStackTrace();
        }
    }
    */
}
