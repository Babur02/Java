import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
    public static void main(String[] args) {
        int A[] = { 0, 0, 2, 1, 1 };
        int k = 3;
        fourSum(A, k);
    }

    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int s = j + 1, e = n - 1;
                while (s < e) {
                    int sum = arr[i] + arr[j] + arr[s] + arr[e];
                    if (sum == k) {
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[s], arr[e]));
                        if (!hs.contains(l)) {
                            list.add(l);
                            hs.add(l);
                        }
                        s++;
                        e--;
                    } else if (sum < k)
                        s++;
                    else
                        e--;
                }
            }
        }
        return list;
    }

}

// import java.util.*;

// public class tUf {
// public static List<List<Integer>> fourSum(int[] nums, int target) {
// int n = nums.length; // size of the array
// List<List<Integer>> ans = new ArrayList<>();

// // sort the given array:
// Arrays.sort(nums);

// // calculating the quadruplets:
// for (int i = 0; i < n; i++) {
// // avoid the duplicates while moving i:
// if (i > 0 && nums[i] == nums[i - 1]) continue;
// for (int j = i + 1; j < n; j++) {
// // avoid the duplicates while moving j:
// if (j > i + 1 && nums[j] == nums[j - 1]) continue;

// // 2 pointers:
// int k = j + 1;
// int l = n - 1;
// while (k < l) {
// long sum = nums[i];
// sum += nums[j];
// sum += nums[k];
// sum += nums[l];
// if (sum == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(nums[i]);
// temp.add(nums[j]);
// temp.add(nums[k]);
// temp.add(nums[l]);
// ans.add(temp);
// k++;
// l--;

// // skip the duplicates:
// while (k < l && nums[k] == nums[k - 1]) k++;
// while (k < l && nums[l] == nums[l + 1]) l--;
// } else if (sum < target) k++;
// else l--;
// }
// }
// }

// return ans;
// }

// public static void main(String[] args) {
// int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
// int target = 9;
// List<List<Integer>> ans = fourSum(nums, target);
// System.out.println("The quadruplets are: ");
// for (List<Integer> it : ans) {
// System.out.print("[");
// for (int ele : it) {
// System.out.print(ele + " ");
// }
// System.out.print("] ");
// }
// System.out.println();
// }
// }
