import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double heat;
        int status;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz :");
        heat = inp.nextDouble();

        if(heat<=5){
            status =1;
        }else if(heat>5 & heat<=10){
            status =2;
        }else if(heat>10 & heat<=15){
            status =3;
        }else if(heat>15 & heat<=25){
            status =4;
        }else{
            status =5;
        }

        switch (status){
            case 1:
                System.out.println("Kayak Yapabilirsiniz.");
                break;
            case 2:
                System.out.println("Sinemaya Gidebilirsiniz.");
                break;
            case 3:
                System.out.println("Sinemaya ve ya Pikniğe Gidebilirsiniz.");
                break;
            case 4:
                System.out.println("Pikniğe Gidebilirsiniz.");
                break;
            case 5:
                System.out.println("Yüzmeye Gidebilirsiniz.");
                break;
        }

    }
}