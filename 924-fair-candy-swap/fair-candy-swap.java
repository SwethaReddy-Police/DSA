import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            c1 += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            c2 += bobSizes[i];
        }

        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {

            int a = aliceSizes[i];

            int b = a + (c2 - c1) / 2;

            int low = 0;
            int high = bobSizes.length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (bobSizes[mid] == b) {
                    return new int[]{a, b};
                }
                else if (bobSizes[mid] < b) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return new int[]{};
    }
}