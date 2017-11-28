
/**
 * Write a description of class Trails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trails {
    int[] markers;

    /**
     * Constructor for objects of class Trails
     */
    public Trails(int[] markers) {
        this.markers = markers;
    }

    /**
     * Determines whether the given segment has close values
     *
     * @param start The first boundary
     * @param end The second boundary
     * @return Whether or not the trail is level
     */
    public boolean isLevelTrailSegment(int start, int end) {
        int max = markers[0];
        int min = markers[0];
        for (int i = start; i <= end; i++) {
            if (markers[i] > max) {
                max = markers[i];
            }
            else if (markers[i] < min) {
                min = markers[i];
            }
        }
        return max - min <= 10;
    }
    
    /**
     * Determines whether the trail has too many large changes
     * 
     * @return Whether or not the trail is difficult
     */
    public boolean isDifficult() {
        int count = 0;
        for (int i = 1; i < markers.length; i++) {
            if (Math.abs(markers[i] - markers[i-1]) >= 30) {
                count++;
            }
        }
        return count >= 3;
    }
}
