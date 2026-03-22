import models.Student;
import models.DrivingSchool;
import models.Instructor;
import models.Vehicle;

/**
 * Main
 */

public class Main {
    public static void main(String[] args){
        Student student = new Student();            
        student.name = "Jorge";
        student.age = 21;
        student.cardType = "Carro";
        student.theoricClasses = 5;
        student.practicalClasses = 5;

        Instructor instructor = new Instructor();
        instructor.name = "Claudio";
        instructor.experiency = 20;
        instructor.category = "Car";

        Vehicle vehicle = new Vehicle();
        vehicle.vehicleType = "Car";
        vehicle.carPlate = "110XP";
        vehicle.carModel = "Kwid";

        DrivingSchool drivingS = new DrivingSchool();
        student.cancelTheoricClass();
        student.cancelPraticalClass();

        student.scheduleTheoricClass();
        student.schedulePraticalClass();

        student.doExam();

        drivingS.showSummary(student);
    }
}
