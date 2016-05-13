package latihan8;
import java.util.Scanner;
public class Latihan8 {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       Nilai A=new Nilai();
       String lagi;
       do{
           A.nilai();
           System.out.print("Lakukan Pengecekan Lagi?(y/t)          : ");
           lagi=in.next();
    }while(lagi.equalsIgnoreCase("y"));
    }
}
