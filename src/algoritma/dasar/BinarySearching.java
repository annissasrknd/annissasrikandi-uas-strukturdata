package algoritma.dasar;
/**
 * 
 * @author Annissa Srikandi
 *
 */
import java.util.Scanner;

public class BinarySearching
{
    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count;
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Jumlah data : ");		
        int jlh = scan.nextInt();
        
        data = new int[jlh];
        for(int x = 0; x < data.length; x++)
        {
            System.out.print("Masukkan Data ke-"+(x+1)+" : ");	
            data[x] = scan.nextInt();
        }
        
        System.out.print("\nData    : ");
        for(int x = 0; x < data.length; x++)
            System.out.print(data[x]+" ");
        
        sorting();
        
        System.out.println();
        System.out.print("Sorting : ");
        for(int x = 0; x < data.length; x++)
            System.out.print(data[x]+" ");
       
        System.out.print("\nData yang dicari : ");		
        int cari = scan.nextInt();
        
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while(temu != true)
        {								
            tengah = (awal + akhir) / 2;
            iterasi++;
            
            if(data[tengah] == cari)
            {
                System.out.print(iterasi+"   ");
                System.out.print(awal+"   ");
                System.out.print(akhir+"   ");
                System.out.print(tengah+"   ");
                System.out.print(data[tengah]+"\n");
                temu = true;
                    break;
            }
            
            else if(data[tengah] < cari)
            {
                System.out.print(iterasi+"   ");
                System.out.print(awal+"   ");
                System.out.print(akhir+"   ");
                System.out.print(tengah+"   ");
                System.out.print(data[tengah]+"\n");
                awal = tengah + 1;
                
            }
                
            else if(data[tengah] > cari)
            {
                System.out.print(iterasi+"   ");
                System.out.print(awal+"   ");
                System.out.print(akhir+"   ");
                System.out.print(tengah+"   ");
                System.out.print(data[tengah]+"\n");
                akhir = tengah - 1;
            }
            
            if(temp != data[tengah])
                temp = data[tengah];
            else
                count++;
            
            if(count == 3)
                break;
        }
        
        if(temu == true)
            System.out.println("\nData "+cari+" ditemukan pada index ke-"+tengah+"\n"+
            "dan Iterasi ke-"+iterasi);
        
        else
            System.out.println("\nData "+cari+" tidak ditemukan");
            
    }
    
    public static void sorting()
    {
        int temp = 0;
        for(int x = 0; x < data.length; x++)
        {
            for(int y = 0; y < data.length; y++)
            {
                if(x == y)
                    continue;
                
                else
                {
                    if(data[x] < data[y])
                    {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;
                        
                    }
                }
            }
        }
    }
}