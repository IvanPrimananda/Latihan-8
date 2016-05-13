package latihan8;
import java.util.Scanner;
public class Nilai implements I1,D1{
    public void methodI1(){
        System.out.println("Tipe Data            : Integer");
    }
    public void methodD1(){
        System.out.println("Tipe Data            : Double");
    }
    public void nilai(){
       Scanner in=new Scanner(System.in);
       System.out.print("Masukan Nilai        : ");
       String nilai=in.next();
       System.out.println("==================================================");
       if(nilai.contains(".")){
           System.out.println("Nilai Anda           : "+nilai);
           methodD1();
       }else if(nilai.contains(",")){
           System.out.println("Nilai Anda           : "+nilai);
           methodD1();
       }else{
           System.out.println("Nilai Anda           : "+nilai);
           methodI1();
        }
    }
}
