package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1; // 4
        int left = 0;
        while (right >= left) {   //4 >= 0  //4>=2 // 4==4

            int mid = left + (right - left) / 2;  //mid == 2 // 4 //
            if (sortedNumbers[mid] > n) {  //false 3 >6
                right = mid-1;
            } else if (sortedNumbers[mid] < n) { // true 3<6
                left = mid +1; //left == 2 // 4
            } else {
                return mid;
            }

        }
        return -1;
    }

}
