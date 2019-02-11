import java.util.*;

class StudentList {

    private ArrayList<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentBystCode(String stCode) {
        for (int i = 0; i < students.size(); i++)
                {
                    if (students.get(i).GetCode() == stCode)
                    students.remove(i); 
                }
                System.out.println("NOT FOUND");
    }   

    public void showAllStudent() {
        System.out.println(students);
    }

    public int searchStudentBystCode(String stCode) { // return index array list
        int index = 0;
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).GetCode() == stCode){
                index = students.size();
            }
            else
                System.out.println("Not Found");
        }
     //   return index-i; // still bug 
    }

    public int getNumberOfStudent() { // return number of student
        return students.size();
    }

    public StudentList() {
        students = new ArrayList<Student>();
    }
}