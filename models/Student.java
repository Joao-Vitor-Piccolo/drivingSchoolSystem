package models;

import java.util.Random;

/**

- Student

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

if (this.practicalClasses > 0) {

this.practicalClasses = this.practicalClasses - 1;

}

}

public void cancelTheoricClass(){

if (this.theoricClasses > 0) {

this.theoricClasses = this.theoricClasses - 1;

}

}

public void doExam(){

if (this.practicalClasses >= 5 && this.theoricClasses >= 5) {

Random random = new Random();

int result = random.nextInt(2);

if (result == 1) {

this.isApproved = true;

}

} else {

System.out.println(this.name + “ cannot take the exam. Insufficient classes.”);

}

}

}
 