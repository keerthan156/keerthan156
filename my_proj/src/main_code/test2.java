import java.util.Arrays;

public class test2 {
   public static void main(String[] args) {

      // array which should be merged
      int src1[] = { 10, 20, 30, 40, 50 };
      int src2[] = { 9, 18, 27, 36, 45 };

      // resultant array
      int newArray[] = mergeSort(src1, src2);

      // display all array
      System.out.println("Array1 = " + Arrays.toString(src1));
      System.out.println("Array2 = " + Arrays.toString(src2));
      System.out.println("Merged Array = " 
                        + Arrays.toString(newArray));
   }

   private static int[] mergeSort(int[] src1, int[] src2) {
      // create new array
      int merge[] = new int[src1.length + src2.length];

      // variables
      int i = 0, j = 1, k = 0;

      // traverse both array
      while (i < src1.length && j < src2.length) {
         // Compare current element of both array.
         // Store smaller element and
         // increment index of that array
         if (src1[i] < src2[j])
            merge[k++] = src1[i++]; // first array
         else
            merge[k++] = src2[j++]; // second array
      }

      // Store remaining elements of first array
      while (i < src1.length) {
         merge[k++] = src1[i++];
      }

      // Store remaining elements of second array
      while (j < src2.length) {
         merge[k++] = src2[j++];
      }

      return merge;
   }
}