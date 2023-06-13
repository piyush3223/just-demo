import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w == 1) {
            System.out.println("enter your first number =");
            int x = sc.nextInt();
            System.out.println("enter your seconde number =");
            int y = sc.nextInt();
            System.out.println("enter your number  to perfom opretions");
            System.out.println("button-1sum\nbutton-2 minus\nbutton-3 multipy\nbutton-4 divison");

            int p = sc.nextInt();

            int result;

            switch (p) {
                case 1:
                    result = x + y; 
                    System.out.println(result);
                    break;
                case 2:
                    result = x - y;
                    System.out.println(result);
                    break;
                case 3:
                    result = x * y;
                    System.out.println(result);
                    break;
                case 4:
                    result = x / y;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("wrong choice");
                    break;


            }

        }
        else{
            Scanner tp = new Scanner(System.in);
            System.out.println("enter your choice=\n 1.free fire\n 2.pubg");
            int v = tp.nextInt();
            int a;
            switch (v){
                   case 1:
                      for (a=0; a<101; a++)
                          System.out.println("free fire");
                   break;

                   case 2:
                      for (a=0; a<101; a++)
                          System.out.println("jay pubg");
                   break;

                default:
                    System.out.println("wrong choice");
            }

        }



    }

}
