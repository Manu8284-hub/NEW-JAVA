import java.util.*;
class student{
    final String calculateGrade(double marks){
        if(marks>=90){
            return "A";
        }else if(marks >=75){
            return "B";
        }else if(marks >=50){
            return "C";
        }else{
            return "Fail";
        }
    }
    
}
class engineeringStudent extends student{

    }
public class grading {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double marks= sc.nextInt();
        student s1= new  engineeringStudent();
        System.out.println(s1.calculateGrade(marks));
    }
}
