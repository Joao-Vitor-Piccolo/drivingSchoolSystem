package models;
import services.SchoolService;

/**
 * DrivingSchool
 */

import models.Student;

public class DrivingSchool {
    public void showSummary(Student student){
       SchoolService service = new SchoolService();
       service.showSummary(student);
    }
}
