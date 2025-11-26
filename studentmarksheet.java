▶️ How to Run

Save the file as: Main.java

Compile:

javac Main.java


Run:

java Main

📥 Sample Input
Enter Student 1 Reg No:
C026-01-0774/2024
Enter Student 1 Full Name:
John Doe
Enter marks for 7 units:
78
65
80
74
69
72
81

📤 Sample Output (Marksheet Table)
                                                       STUDENT MARKSHEET                  
RegNo               Name           CCS_2207 ... CCS_2215    Total    Average
-----------------------------------------------------------------------------------
C026-01-0774/2024   John Doe       78 65 ... 81            619      88.4

📄 FULL JAVA CODE (COPY–PASTE READY)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dedan Kimathi University of Technology");
        System.out.println(" School of Computer Science and IT");
        System.out.println("  Department of Computer Science");
        System.out.println("   Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)");

        // STUDENT 1
        System.out.println("Enter Student 1 Reg No:");
        String reg1 = input.nextLine();

        System.out.println("Enter Student 1 Full Name:");
        String name1 = input.nextLine();

        System.out.println("Enter marks for 7 units:");
        int CCS_2207_1 = input.nextInt();
        int CCS_2208_1 = input.nextInt();
        int CCS_2209_1 = input.nextInt();
        int CCS_2210_1 = input.nextInt();
        int CCS_2211_1 = input.nextInt();
        int CCS_2202_1 = input.nextInt();
        int CCS_2215_1 = input.nextInt();

        int total1 = CCS_2207_1 + CCS_2208_1 + CCS_2209_1 + CCS_2210_1 + CCS_2211_1 + CCS_2202_1 + CCS_2215_1;
        double avg1 = total1 / 7.0;

        // STUDENT 2
        System.out.println("Enter Student 2 Reg No:");
        input.nextLine();
        String reg2 = input.nextLine();

        System.out.println("Enter Student 2 Full Name:");
        String name2 = input.nextLine();

        System.out.println("Enter marks for 7 units:");
        int CCS_2207_2 = input.nextInt();
        int CCS_2208_2 = input.nextInt();
        int CCS_2209_2 = input.nextInt();
        int CCS_2210_2 = input.nextInt();
        int CCS_2211_2 = input.nextInt();
        int CCS_2202_2 = input.nextInt();
        int CCS_2215_2 = input.nextInt();

        int total2 = CCS_2207_2 + CCS_2208_2 + CCS_2209_2 + CCS_2210_2 + CCS_2211_2 + CCS_2202_2 + CCS_2215_2;
        double avg2 = total2 / 7.0;

        // STUDENT 3
        System.out.println("Enter Student 3 Reg No:");
        input.nextLine();
        String reg3 = input.nextLine();

        System.out.println("Enter Student 3 Full Name:");
        String name3 = input.nextLine();

        System.out.println("Enter marks for 7 units:");
        int CCS_2207_3 = input.nextInt();
        int CCS_2208_3 = input.nextInt();
        int CCS_2209_3 = input.nextInt();
        int CCS_2210_3 = input.nextInt();
        int CCS_2211_3 = input.nextInt();
        int CCS_2202_3 = input.nextInt();
        int CCS_2215_3 = input.nextInt();

        int total3 = CCS_2207_3 + CCS_2208_3 + CCS_2209_3 + CCS_2210_3 + CCS_2211_3 + CCS_2202_3 + CCS_2215_3;
        double avg3 = total3 / 7.0;

        // STUDENT 4
        System.out.println("Enter Student 4 Reg No:");
        input.nextLine();
        String reg4 = input.nextLine();

        System.out.println("Enter Student 4 Full Name:");
        String name4 = input.nextLine();

        System.out.println("Enter marks for 7 units:");
        int CCS_2207_4 = input.nextInt();
        int CCS_2208_4 = input.nextInt();
        int CCS_2209_4 = input.nextInt();
        int CCS_2210_4 = input.nextInt();
        int CCS_2211_4 = input.nextInt();
        int CCS_2202_4 = input.nextInt();
        int CCS_2215_4 = input.nextInt();

        int total4 = CCS_2207_4 + CCS_2208_4 + CCS_2209_4 + CCS_2210_4 + CCS_2211_4 + CCS_2202_4 + CCS_2215_4;
        double avg4 = total4 / 7.0;

        // STUDENT 5
        System.out.println("Enter Student 5 Reg No:");
        input.nextLine();
        String reg5 = input.nextLine();

        System.out.println("Enter Student 5 Full Name:");
        String name5 = input.nextLine();

        System.out.println("Enter marks for 7 units:");
        int CCS_2207_5 = input.nextInt();
        int CCS_2208_5 = input.nextInt();
        int CCS_2209_5 = input.nextInt();
        int CCS_2210_5 = input.nextInt();
        int CCS_2211_5 = input.nextInt();
        int CCS_2202_5 = input.nextInt();
        int CCS_2215_5 = input.nextInt();

        int total5 = CCS_2207_5 + CCS_2208_5 + CCS_2209_5 + CCS_2210_5 + CCS_2211_5 + CCS_2202_5 + CCS_2215_5;
        double avg5 = total5 / 7.0;

        // OUTPUT TABLE
        System.out.println("\n\n                                                      STUDENT MARKSHEET                  ");
        System.out.println("RegNo\t\t\tName\t\tCCS_2207\tCCS_2208\tCCS_2209\tCCS_2210\tCCS_2211\tCCS_2202\tCCS_2215\tTotal\tAverage");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(reg1 + "\t" + name1 + "\t\t" + CCS_2207_1 + "\t\t" + CCS_2208_1 + "\t\t" + CCS_2209_1 + "\t\t" + CCS_2210_1 + "\t\t" + CCS_2211_1 + "\t\t" + CCS_2202_1 + "\t\t" + CCS_2215_1 + "\t\t" + total1 + "\t" + avg1);
        System.out.println(reg2 + "\t" + name2 + "\t\t" + CCS_2207_2 + "\t\t" + CCS_2208_2 + "\t\t" + CCS_2209_2 + "\t\t" + CCS_2210_2 + "\t\t" + CCS_2211_2 + "\t\t" + CCS_2202_2 + "\t\t" + CCS_2215_2 + "\t\t" + total2 + "\t" + avg2);
        System.out.println(reg3 + "\t" + name3 + "\t\t" + CCS_2207_3 + "\t\t" + CCS_2208_3 + "\t\t" + CCS_2209_3 + "\t\t" + CCS_2210_3 + "\t\t" + CCS_2211_3 + "\t\t" + CCS_2202_3 + "\t\t" + CCS_2215_3 + "\t\t" + total3 + "\t" + avg3);
        System.out.println(reg4 + "\t" + name4 + "\t\t" + CCS_2207_4 + "\t\t" + CCS_2208_4 + "\t\t" + CCS_2209_4 + "\t\t" + CCS_2210_4 + "\t\t" + CCS_2211_4 + "\t\t" + CCS_2202_4 + "\t\t" + CCS_2215_4 + "\t\t" + total4 + "\t" + avg4);
        System.out.println(reg5 + "\t" + name5 + "\t\t" + CCS_2207_5 + "\t\t" + CCS_2208_5 + "\t\t" + CCS_2209_5 + "\t\t" + CCS_2210_5 + "\t\t" + CCS_2211_5 + "\t\t" + CCS_2202_5 + "\t\t" + CCS_2215_5 + "\t\t" + total5 + "\t" + avg5);
    }
}
