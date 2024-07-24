package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {
        //ráp menu cảm giác 1 cái app, hơi theo C và hard code
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE");
        do {
            printMenu();
            System.out.print("Input your choice (1...6): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1...6 option");
                    break;
            }
        } while (choice != 6);  //chưa chọn 6 thì vẫn chưa kế thúc

    }

    public static void printMenu() {
        System.out.println("Welcome to QUAN LY SINH VIEN");
        System.out.println("Choose the following function to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }

    public static void testShelf() {
        //inputStudentList();
        Shelf tuSE = new Shelf("PINK", "SE");
        tuSE.inputAStudent();
        tuSE.inputAStudent();

        Shelf tuGD = new Shelf("RAINBOW", "GD");
        tuGD.inputAStudent();

        System.out.println("The student list for all");
        tuSE.printStudentList();
        tuGD.printStudentList();
    }

//    public static void inputStudentList() {
//        Scanner sc = new Scanner(System.in);
//        
//        String id, name;
//        int yob, count;
//        double gpa;
//        
//        System.out.print("How many students do you want to input? ");
//        count = Integer.parseInt(sc.nextLine());
//        
//        Student arr[] = new Student[count]; //count = 5
//        
//        for (int i = 0; i < count; i++) {
//            System.out.println("Input student " + (i + 1) + "/" + count);
//            System.out.print("Input id: ");
//            id = sc.nextLine();
//            
//            System.out.print("Input name: ");
//            name = sc.nextLine();
//            
//            System.out.print("Input yob: ");
//            yob = Integer.parseInt(sc.nextLine());
//            
//            System.out.print("Input gpa: ");
//            gpa = Double.parseDouble(sc.nextLine());
//            
//            arr[i] = new Student(id, name, yob, gpa);
//            
//        }
//        
//        System.out.println("The student list");
//        for (Student x : arr) {
//            x.showProfile();
//        }
//    }
}
