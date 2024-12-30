import java.util.ArrayList;

public class clsTeacher {
    private String name;
    private ArrayList<String> Subject = new ArrayList<>(5);
    private int age;
    private int salary;
    private ArrayList<String> currentcourses= new ArrayList<>(5);
    private String  phonenumber;
  
public clsTeacher(){}

public clsTeacher(String name, ArrayList<String> subject, int age, int salary, ArrayList<String> currentcourses,
        String phonenumber) {
    this.name = name;
    Subject = subject;
    this.age = age;
    this.salary = salary;
    this.currentcourses = currentcourses;
    this.phonenumber = phonenumber;
}
public void enAddToTeacherCourse(String courseName){
currentcourses.add(courseName);
return;
}

public static clsTeacher GetEmptyObject()
{
    clsTeacher Teacher = new clsTeacher("" , null , 0 , 0 , null , "");
    return Teacher;
}

public static clsTeacher findTeacher(String teacherNameOrNumber , ArrayList <clsTeacher> Teachers) {
   for (clsTeacher Teacher : Teachers) {
  
       if (Teacher.getName().equalsIgnoreCase(teacherNameOrNumber) || Teacher.phonenumber.equals(teacherNameOrNumber)){
           return Teacher;
       }
   }

   return GetEmptyObject(); 
}

public boolean isEmpty(clsTeacher Teacher1)
{
    clsTeacher Teacher = GetEmptyObject();
    if(Teacher1.getName().equals(Teacher.getName()))
       return true;

       return false;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public ArrayList<String> getSubject() {
    return Subject;
}

public void setSubject(ArrayList<String> subject) {
    Subject = subject;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public ArrayList<String> getCurrentcourses() {
    return currentcourses;
}

public void setCurrentcourses(ArrayList<String> currentcourses) {
    this.currentcourses = currentcourses;
}

public String getPhonenumber() {
    return phonenumber;
}

public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
}
//f
}