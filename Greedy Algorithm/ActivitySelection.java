import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        activitySelection1();
        activitySelection2();
    }

    public static void activitySelection1() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        // end is sorted
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // To store (ans) count and activity
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Select 1st Activity to perform as it's end time is less
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            // Non-overlap
            if (start[i] >= lastEnd) {
                // Activity Select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activity: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }

    public static void activitySelection2() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        // end is not sorted
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // Sort End
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // Index
            activities[i][1] = start[i]; // Start
            activities[i][2] = end[i]; // End
        }
        // Sort on the basis of col2 i.e. end;
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // To store (ans) count and activity
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Select 1st Activity to perform as it's end time is less
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            // Non-overlap
            if (activities[i][1] >= lastEnd) {
                // Activity Select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activity: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
