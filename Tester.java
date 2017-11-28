
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
    public static void main(String[] args) {
        int[] markers1 = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        int[] markers2 = {15, 10, 18, 12, 25, 30, 15, 5, 10, 50};
        int[] markers3 = {20, 50, 50, 80};
        
        Trails m1 = new Trails(markers1);
        Trails m2 = new Trails(markers2);
        Trails m3 = new Trails(markers3);
        
        System.out.println(m2.isLevelTrailSegment(0, 3));
        System.out.println(m1.isDifficult());
    }
}
