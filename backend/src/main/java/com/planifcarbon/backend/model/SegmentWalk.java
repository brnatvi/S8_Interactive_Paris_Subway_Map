package com.planifcarbon.backend.model;

/**
 * {@summary Represents a segment walked by a pedestrian with average walking speed between two points.}
 */
public final class SegmentWalk extends Segment {

    /* Reference Information: Average walking speed by age:
    20-29 years: 3.00 mph (4.83 km/h)
    30-39 years: 2.82 mph (4.54 km/h)
    40-49 years: 2.82 mph (4.54 km/h)
    50-59 years: 2.75 mph (4.43 km/h)
    >60 years: 2.71 mph (4.36 km/h)
    Sourse:  https://blog.mypacer.com/what-your-walking-speed-says-about-your-health-and-how-long-youll-live/
    */

    /** Average walking speed (km/h) **/
    private static final double SPEED = 4.4;
    private static final int HTOMS = 3600000; // 60 * 60 * 1000

    /**
     * {@summay Main constructor.}
     *
     * @param node1 first point of walking segment
     * @param node2 second point of walking segment
     * @param distance distance between two points
     * Duration will be calculated based on distance and the average walking speed.
     */
    public SegmentWalk(Node node1, Node node2, double distance) {
        super(node1, node2, distance, (int)(distance * HTOMS / SPEED));
    }

    /**
     * Function for tests only
     * {@return SPEED constant wich represent sverage walking speed (km/h).}
     */
    public static double getSpeed() {  return SPEED;  }

    // Not needed.
    // @Override
    // public boolean equals(Object o) {
    //     return super.equals(o);
    // }

    // Not needed.
    // @Override
    // public String toString() {
    //     return super.toString();
    // }
}