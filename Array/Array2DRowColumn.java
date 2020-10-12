/*
  Author : Arnob Mahmud

  Mail : arnob.tech.me @ gmail.com
*/

package Array;
public class Array2DRowColumn {
    public static void main(String[] args) {

        int m = 1;
        int[][] nums = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = m;
                m++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }
    }
}
