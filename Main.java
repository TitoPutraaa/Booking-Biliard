import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int total_table = 5;
    static String[] name = new String[total_table];
    static float[] duration_order = new float[total_table];
    static float[] time_now = new float[total_table];
    static int[] list = new int[total_table];

    public static void main(String[] args) {
        do {
            System.out.println("\nWELCOM TO EIGHT BILIARD");
            System.out.println("===MENU===");
            System.out.println("1 : ORDER TABLE");
            System.out.println("2 : ORDER LIST");
            System.out.println("3 : EXIT ");
            System.out.print("menu : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    input_order();
                    break;
                case 2:
                    showlist();
                    break;
                case 3:
                    System.out.println("THANKYOU :)");
                    return;
                default:
                    break;
            }

        } while (true);
    }

    static boolean isFull() {
        for (int i = 0; i < total_table; i++) {
            if (name[i] == null) {
                return false;
            }
        }
        return true;
    }

    static void input_order() {
        if (isFull()) {
            System.out.println("\nSORRY TABLE IS FULL");
        } else {
            for (int i = 0; i < total_table; i++) {
                if(name[i] == null) {
                    System.out.print("\nNAME : ");
                    name[i] = sc.next();
                    System.out.print("CURRENT TIME : ");
                    time_now[i] = sc.nextFloat();
                    System.out.print("DURATION : ");
                    duration_order[i] = sc.nextFloat();
                    System.out.println("ORDER SUCCESS, ENJOY ");
                    return;
                }
            }
        }
    }

    static void showlist() {
        for (int i = 0; i < total_table; i++) {
            if (name[i] != null) {
                System.out.println("\n===TABLE " + (i+1) + "===");
                System.out.println("NAME : " + name[i]);
                System.out.println("ORDER TIME  : " + time_now[i]);
                System.out.println("DURATION  : " + duration_order[i] + " hour");
            } else {
                System.out.println("\n===TABLE " + (i+1) + "===");
                System.out.println("THIS TABLE IS EMPTY");
            }
        }
    }

}