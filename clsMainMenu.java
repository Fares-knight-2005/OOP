import java.util.Scanner;



public class clsMainMenu {

    public enum enWhatToDo {enShowCourses , enAddNewCourse , enFindaCourse , enShowTeachers , enAddNewTeacher ,enFindTeacher ,
         enAddToTeacherCourse , enShowStudents , enAddNewStudent , enFindStudent , enRegesterStudent , enDeleteCourseToAStudent , enGoOut};


    private static Scanner input = new Scanner(System.in);

    private static void GenrateMAinMenu(enWhatToDo WhatToDo)
    {
       
        switch (WhatToDo)
        {
        
            case enShowCourses:
            System.out.println("chow courses Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enAddNewCourse:
            System.out.println("Add Course Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enFindaCourse:
            System.out.println(" Find Course Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enShowTeachers:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enAddNewTeacher:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enFindTeacher:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enAddToTeacherCourse:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enShowStudents:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enAddNewStudent:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enFindStudent:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enRegesterStudent:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go2 Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enDeleteCourseToAStudent:
            System.out.println("Will Be Here Nearly\n");
            System.out.println("press Any Key To Go Back To Main Menu ....");
            input.nextLine(); input.nextLine();
            MAinMenu();
            break;

            case enGoOut:
            break;
        }
    }



    public static void MAinMenu()
    {
        clsScreen.NewMenu("\t     Main Menu" , "  ");

        System.out.println("===================================");
        System.out.println("         Choose What To Do         ");
        System.out.println("===================================");

        System.out.println("  Show Cousres                [1]");
        System.out.println("  Add New Course              [2]");
        System.out.println("  Find a Course               [3]");
        System.out.println("  Show Teachers               [4]");
        System.out.println("  Add New Teacher             [5]");
        System.out.println("  Find Teachet Card           [6]");
        System.out.println("  Add To Teacher a New Course [7]");
        System.out.println("  Show Students               [8]");
        System.out.println("  Add a New Student           [9]");
        System.out.println("  Find a Student Card         [10]"); 
        System.out.println("  Regester Student in course  [11]");
        System.out.println("  Delete Course To a Student  [12]");
        System.out.println("  GO OUT OF HERE              [13]");
        System.out.println("===================================");
 

     

        int ToDo = 0;


        System.out.print("Enter What To Do [1 --> 13] : ");
        ToDo = input.nextInt();


        GenrateMAinMenu(enWhatToDo.values()[ToDo - 1]);
    }
}
