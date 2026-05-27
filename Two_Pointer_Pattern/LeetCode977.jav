import java.util.Scanner;

class LeetCode977 {

    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {

                res[k] = nums[i] * nums[i];
                i++;

            } else {

                res[k] = nums[j] * nums[j];
                j--;
            }

            k--;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LeetCode977 obj = new LeetCode977();

        int[] result = obj.sortedSquares(nums);

        System.out.println("Sorted Squares Array:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}