package services;
import models.Student;

/**
 * SchoolService
 */

public class SchoolService {
    public void showSummary(Student student){
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Practical Classes: " + student.practicalClasses);
        System.out.println("Theoric Classes: " + student.theoricClasses);
        System.out.println("Is Approved: " + student.isApproved);
    }
}
