package Arrays;

public class array1 {




public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {4, 8, 12, 10}, 
            {3, 6, 5} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}

