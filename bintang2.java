import java.util.Scanner;
public class bintang2
{
public static void main (String [] args)
{
		int i,j;
		int bintang;
		Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        bintang=input.nextInt();
		
for (i=bintang; i>=1; i--)
{
for (j=1; j<=i; j++)
{
System.out.print ("*");
}
System.out.println ();
}
}
} 