import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz :");
        int bas = input.nextInt();

        for (int i=bas-1; i>0;i--){
            for (int j =1; j <(bas-i)+1 ;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}