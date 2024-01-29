import java.util.Arrays;
import java.util.Collections;

public class DefaultSortingMethods {
    public static void main(String[] args) {
        int nums[] = { 2, 5, 3, 4, 1, 2 };
        System.out.println("Before Sorting : " + Arrays.toString(nums));

        // For Primitive Data type => Quick Sort is implemented in backend
        // For Non-Primitive Data type => Merge Sort is implemented in backend

        Arrays.sort(nums);
        System.out.println("After Sorting : " + Arrays.toString(nums));

        // it skips last index for sorting
        Arrays.sort(nums, 2, 5);
        System.out.println("After Sorting  : " + Arrays.toString(nums));

        // Need to declare Wrapper class if we wants to sort in descending order
        Integer nums2[] = { 2, 5, 3, 4, 1 };
        Arrays.sort(nums2, Collections.reverseOrder());
        System.out.println("After Sorting in Descending Order : " + Arrays.toString(nums2));

    }
}
// UnstableSortingAlgo          StableSortingAlgo          InplaceSortingAlgo           ExtraSpaceSortingAlgo
//      Selection                   Insertion                  Insertion                       Merge
//      Quick                       Bubble                      Bubble                         Quick
//      Heap                        Merge                      Selection                       Heap