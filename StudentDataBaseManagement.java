import java.util.*;
public class StudentDataBaseManagement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of records: ");
        int size = sc.nextInt();
        System.out.println();

        String [] names = new String[size];
        int [] eMarks = new int[size];
        int [] sMarks = new int[size];
        int [] mMarks = new int[size];
        int [] pMarks = new int[size];
        int [] iMarks = new int[size];
        char [] grade = new char[size];
        int [] average =new int[size];

        for(int i = 0; i < size ; i++){
            sc.nextLine();
            System.out.print("Enter name of student" + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter english score of " + names[i] + ": ");
            eMarks[i] = sc.nextInt();
            System.out.print("Enter Science score of " + names[i] + ": ");
            sMarks[i] = sc.nextInt();
            System.out.print("Enter Math score of " + names[i] + ": ");
            mMarks[i] = sc.nextInt();
            System.out.print("Enter Political Science score of " + names[i] + ": ");
            pMarks[i] = sc.nextInt();
            System.out.print("Enter IT score of " + names[i] + ": ");
            iMarks[i] = sc.nextInt();
            System.out.println();
            average[i]= (eMarks[i]+sMarks[i]+mMarks[i]+pMarks[i]+iMarks[i])/5;
            if(average[i] <= 100 && average[i] >= 90){
                grade[i] = 'A';
            }
            else if(average[i] <= 89 && average[i] >= 80){
                grade[i] = 'B';
            }
            else if(average[i] <= 79 && average[i] >= 70){
                grade[i] = 'C';
            }
            else if(average[i] <= 69 && average[i] >= 60){
                grade[i] = 'D';
            }
            else if(average[i] <= 59 && average[i] >= 50){
                grade[i] = 'E';
            }
            else{
                grade[i] = 'F';
            }
        }

        System.out.printf("%55s\n", "STUDENT'S DATABASE");
        System.out.println();
        System.out.printf("%-20s %-10s %-10s %-7s %-12s %3s %10s %7s\n","NAMES","ENGLISH","SCIENCE","MATH","POL-SCIENCE","IT","AVERAGE","GRADE");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        for(int i = 0; i < size; i++){
            System.out.printf("%-20s %4d %10d %9d %10d %9d %7d %8c\n",names[i],eMarks[i],sMarks[i],mMarks[i],pMarks[i],iMarks[i],average[i],grade[i]);
        }

        int maxMarks = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < size; i++){
            if(average[i] > maxMarks){
                maxMarks = average[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("* Congratulations, "+ names[maxIndex] + " for scoring highest with average of '" + maxMarks + "' obtaining grade '" + grade[maxIndex] + "'.");
        sc.close();
    }
}