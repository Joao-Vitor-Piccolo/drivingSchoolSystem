package models;

import services.StudentService;

/**
 * Student
 */

public class Student {
   public String name;
   public int age;
   public String cardType;
   public int theoricClasses;
   public int practicalClasses;
   public boolean isApproved = false;

   public void schedulePraticalClass(){
        this.practicalClasses = this.practicalClasses + 1;
   }

   public void scheduleTheoricClass(){
        this.theoricClasses = this.theoricClasses + 1;
   }

   public void cancelPraticalClass(){
        this.practicalClasses = this.practicalClasses - 1;
   }

   public void cancelTheoricClass(){
        this.theoricClasses = this.theoricClasses - 1;
   }

   public void doExam(){
       StudentService studentService = new StudentService();
       boolean result = studentService.doExamService(this.theoricClasses, this.practicalClasses);
       this.isApproved = result;
   }
}
