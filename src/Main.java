import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("enter number a : ");
        a = input.nextInt();

        System.out.print("enter number b : ");
        b = input.nextInt();

        System.out.print("enter number c : ");
        c = input.nextInt();

        if(a<b && a<c){
            if (b<c){
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        } else if (c<a && c<b) {
            if (a<b){
                System.out.print("c<a<b");
            }else{
                System.out.print("a<b<c");
            }
        }else {
            if (a<c){
                System.out.print("b<a<c");
            }else{
                System.out.print("b<c<a");
            }
        }
    }
}
