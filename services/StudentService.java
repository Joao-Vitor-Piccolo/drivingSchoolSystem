package services;

import models.Student;
import java.util.Random;

/**
 * StudentService
 */

public class StudentService {
    public boolean doExamService(int practicalClasses, int theoricClasses){
        if (practicalClasses > 4 && theoricClasses > 4){
            Random random = new Random();                        
            int result = random.nextInt(2);
            if (result == 1) {
                return true;
            }
        }
    return false;
    }
}
