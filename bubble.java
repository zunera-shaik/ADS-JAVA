import java.util.Scanner;
public class bubble {
   public static void main( String [] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("ENTER THE NUM OF ELEMENTS");
       int n=in.nextInt();
       int[] a = new int[n];
       for ( int i=0;i<n;i++) 
          a[i]=in.nextInt();
       bubbleSort(a);
       System.out.println("SORTED ELEMENETS::");
       for(int i=0;i<n;i++) 
          System.out.print(a[i]+" ");
     }     
   public static void bubbleSort (int[] a) {
          int n= a.length;
          for(int i=1;i<n;i++) 
            for(int j=0;j<n-i;j++) 
               if(a[j] >a[j+1]) {
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
               }
       }
 }  
