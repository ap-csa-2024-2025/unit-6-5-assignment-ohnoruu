import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static void reverse(String[] arr)
  {
    for (int i=arr.length(); i>0; i--){
      System.out.println(arr[i]);
    }
  }

  public int product(int[] arr)
  {
    product = arr[0]
    for (int i=1; i<=arr.length(); i++){
      product*=i;
    }
    return product;
  }

  public double average(double[] arr)
  {
    double sum = 0;
    for (int i=0; i<arr.length(); i++){
      sum+=arr[i];
    }
    return sum/2;
  }
}
