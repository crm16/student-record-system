import java.util.*;
public class StudentsGradeManagementSystem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int size = sc.nextInt();
        System.out.print("\n");

        String [] names = new String[size];
        int [] marks = new int[size];
        char [] grade = new char[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter name of student" + (i+1) + ": ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks [i] = sc.nextInt();
            if(marks[i] >=90 && marks[i] <=100){
                grade[i] = 'A';
            }
            else if(marks[i] >= 80 && marks[i] <= 89){
                grade[i] = 'B';
            }
            else if(marks[i] >= 70 && marks[i] <= 79){
                grade[i] = 'C';
            }
            else if(marks[i] >= 60 && marks[i] <= 69){
                grade[i] = 'D';
            }
            else if(marks[i] >= 50 && marks[i] <= 59){
                grade[i] = 'E';
            }
            else{
                grade[i] ='F';
            }
        }
        System.out.println();
        boolean found = false;
        System.out.print("Enter name of student: ");
        sc.nextLine();
        String search = sc.nextLine();

        for(int i = 0; i < size; i++){
            if(names[i].equals(search)){
                System.out.println(names[i] + " scored '" + marks[i] + "' and received grade '" + grade[i] +"'.");
                found = true;
            }
        }
        if(!found){
            System.out.println("Record not found...");
        }
        sc.close();
    }
}
