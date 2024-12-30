import java.util.Scanner;
import java.util.ArrayList;

// Find Screen

public class clsFindTeacherCard {

    static Scanner input = new Scanner(System.in);


    public static void FindTeacherCard(ArrayList <clsTeacher> Teachers)
    {
        clsScreen.NewMenu("\t\t  Find Teacher Menu" , " \t\t\t\t\t\t ");

        System.out.print("Enter Teacher Name Or Number : ");
        String TeacherNumOrName = input.next();

        clsTeacher Teacher = clsTeacher.findTeacher(TeacherNumOrName , Teachers );

        if(Teacher.isEmpty(Teacher))
        {
            System.out.println();
            System.out.println("Couldn't Find Teacher :( ");
        }
        else if(Teacher.isEmpty(Teacher))
        {
            System.out.println();
            System.out.println();
            System.out.println("=================================");
            System.out.println("Teacher Name : " + Teacher.getName());
            System.out.println("Teacher Number : " + Teacher.getPhonenumber());
            System.out.println("Teacher Salary : " + Teacher.getSalary());
            System.out.println("Teacher Age : " + Teacher.getAge());
            System.out.println("The Courses That Teacher Can Teach : ");

            for(String Subject : Teacher.getSubject())
            {
                System.out.println(Subject);
            }

            System.out.println();

            System.out.println("The Courses That Teacher is Teaching Now : ");

            for(String Subject : Teacher.getCurrentcourses())
            {
                System.out.println(Subject);
            }

            System.out.println("=================================");
        }

        input.nextLine();
    }
}
//f