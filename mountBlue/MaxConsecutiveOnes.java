package mountBlue;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int maxCount1 = 0;
        int count1 = 0;

        for (int num : arr1) {
            if (num == 1) {
                count1++;
                maxCount1 = Math.max(maxCount1, count1);
            } else {
                count1 = 0;
            }
        }
        System.out.println("Output for arr1: " + maxCount1);
    }
}
