/**
 *
 * @author Anissa Srikandi
 */
package algoritma.dasar;
import java.util.Scanner;

public class liniersearching {
	int recursionSearch(int arr[], int start, int last, int x)
	{
	     if (last < start)
	        return -1;
	     if (arr[start] == x)
	        return start;
	     return recursionSearch(arr, start+1, last, x);
	}
      public static void main(String args[])
      {
	liniersearching ref=new liniersearching();
	
      	int i,len, key, array[];
 
	Scanner input = new Scanner(System.in);
 
      	System.out.println("Masukkan Jumlah Data:");
 
      	len = input.nextInt(); 
 
      	array = new int[len]; 
 
      	System.out.println("Enter " + len + " elements");
 
      	for (i = 0; i < len; i++)
      	{
        	array[i] = input.nextInt();
      	}
      	System.out.println("Cari Nilai Data:");
      
	key = input.nextInt();
 
	int index=ref.recursionSearch(array,0,len-1,key);
     
	if (index!=-1) 
        {
           System.out.println(key+" data di temukan pada "+(index+1));
        }
      	else
	{
	  System.out.println(key + " Data Array tidak dapat ditemukan.");
   	}
      }
}
