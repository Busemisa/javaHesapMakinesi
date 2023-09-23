import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input =new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz : ");
        n1=input.nextInt();

        System.out.print("İkinci sayiyi giriniz :");
        n2=input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiniz : ");
        select= input.nextInt();

        switch (select){

            case 1:
                System.out.print("toplama işlemi sonucu: " + (n1+n2));
                break;

            case 2:
                System.out.print("çıkarma işleminin sonucu :" + (n1-n2));
                break;

            case 3:
                System.out.print("çarpma işleminin sonucu : "+ (n1*n2));
                break;

            case 4:
                if(n2!=0){
                    System.out.print("bölme işleminin sonucu :" + (n1/n2));

                }
                else{
                    System.out.print("bir sayı 0 a bölünemez işlem başarısız");
                }
                break;

            default:
                System.out.print("geçersiz seçim!");
                break;

        }


    }
}
