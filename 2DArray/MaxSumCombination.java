import java.util.*;
public class MaxSumCombination {
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={1,2,5,6};
        System.out.println(maxCombinations(4, 4, A, B));
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // Sort arrays A and B in ascending order
        Arrays.sort(A);
        Arrays.sort(B);
        
        // Create a PriorityQueue to store the top K sum combinations
        PriorityQueue<Integer> p = new PriorityQueue<>();
        
        // Create a List to store the final result
        List<Integer> list = new ArrayList<>();
        
        // Iterate over the last K elements in both arrays
        for (int i = N - 1; i >= N - K; i--) {
            for (int j = N - 1; j >= N - K; j--) {
                int sum = A[i] + B[j];
                
                // Add the sum to the PriorityQueue if it contains less than K elements
                if (p.size() < K) {
                    p.add(sum);
                } else {
                    // If the PriorityQueue is full, compare the smallest element in it with the current sum
                    // If the current sum is larger, remove the smallest element and add the current sum
                    if (p.peek() < sum) {
                        p.remove();
                        p.add(sum);
                    } else {
                        // If the current sum is not larger, we can break out of the inner loop
                        break;
                    }
                }
            }
        }
        
        // Extract elements from the PriorityQueue and add them to the result list
        while (!p.isEmpty()) {
            list.add(0, p.poll());
        }
        
        return list;
    }
}
// N = 4
// K = 3
// A = [1, 4, 2, 3]
// B = [2, 5, 1, 6]
// We sort arrays A and B in ascending order:

// A = [1, 2, 3, 4]
// B = [1, 2, 5, 6]
// We create an empty PriorityQueue p and an empty ArrayList list.

// We iterate over the last K elements of both arrays (i and j both range from N-1 to N-K):

// i = 3, j = 3, sum = A[3] + B[3] = 4 + 6 = 10
// Add 10 to the PriorityQueue (p): [10]
// i = 3, j = 2, sum = A[3] + B[2] = 4 + 5 = 9
// Add 9 to the PriorityQueue (p): [9, 10]
// i = 3, j = 1, sum = A[3] + B[1] = 4 + 2 = 6
// Add 6 to the PriorityQueue (p): [6, 9, 10]
// i = 2, j = 3, sum = A[2] + B[3] = 3 + 6 = 9
// Add 9 to the PriorityQueue (p): [6, 9, 9] (we remove the smallest element 10)
// i = 2, j = 2, sum = A[2] + B[2] = 3 + 5 = 8
// Since 8 is smaller than the smallest element in p (9), we break out of the inner loop.
// After the inner loops, we have the PriorityQueue p containing the top K sum combinations: [6, 9, 9].

// We extract elements from the PriorityQueue and add them to the result list in ascending order (hence the use of list.add(0, p.poll())). The result list becomes: [9, 9, 6].

// Finally, we return the result list: [9, 9, 6].

// This code efficiently finds the maximum K sum combinations using a min heap (PriorityQueue) and returns them in descending order, as required.





