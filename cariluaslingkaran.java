import java.util.*;

public class lingkaran
{
public static void main(String[] args)

{
Scanner input = new Scanner(System.in);

double phi = 22/7;
double r, luas;

System.out.println("Program Luas Lingkaran\n");
System.out.print("Masukkan Panjang Jari-jari : ");
r = input.nextDouble();

luas = 0.5 * phi * r * r;

System.out.print("Luas Lingkaran = " + (int)luas);

}

}
