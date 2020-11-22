package pt.iade.unimanage.models;

import java.time.LocalDate;
import java.util.ArrayList;


public class studentrepository {
    private static ArrayList<Student> students = new ArrayList<Student>();
    public static void populate() {
        Student s; 
        s = new Student("John",LocalDate.parse("2000-05-24"),'M');
        s.setEmail("john@gmail.com");
        students.add(s);
        students.add(new Student("Mary",LocalDate.parse("1999-12-23"),'F'));
        s = new Student("James",LocalDate.parse("2001-07-02"),'M');
        students.add(s);
    }
    public static ArrayList <Student> getStudents() {
        return students;
    }
    public static Student getStudent(int number) {
        for (Student student : students){
            if(student.getNumber(number) == number)
                return student;
        }
        return null;
    }
    public static boolean deleteStudent(int number) {
        return students.removeIf((s) -> s.getNumber(number) == number);
    }

    public static Student addStudent(Student student) {
        students.add(student);
        return student; 
    }
}