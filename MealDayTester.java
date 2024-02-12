import java.util.ArrayList;

public class MealDayTester {
    public static void main(String[] args) {
    
    System.out.println("making roster");
    Roster school = new Roster();
    
    System.out.println("creating students following the handout");
    Student bobbyBobbs1 = new Student("Bobby Bobbs");
    Student joeSchmo = new Student("Joe Schmo");
    Student kellyShelly = new Student("Kelly Shelly");
    Student bobbyBobbs2 = new Student("Bobby Bobbs");
    
    System.out.println("adding students to the school roster");
    school.addStudent(bobbyBobbs1);
    school.addStudent(joeSchmo);
    school.addStudent(kellyShelly);
    school.addStudent(bobbyBobbs2);

    System.out.println("calling to string on studetns");
    System.out.println(school.toString());
    
    System.out.println("Adding funds/making purchases in accordance with the handout");
    bobbyBobbs1.chargeMeal(2, 4, 1);
    bobbyBobbs1.chargeMeal(2, 4, 1);
    joeSchmo.addFunds(2, 4, 2, 40);
    joeSchmo.chargeMeal(2, 5, 2);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 4, 3);
    kellyShelly.chargeMeal(2, 8, 3);
    kellyShelly.chargeMeal(2, 8, 3);
    bobbyBobbs2.addFunds(2, 9, 4, 5);
    bobbyBobbs2.addFunds(2, 9, 4, 5);

    System.out.println(school.toString());

    System.out.println("Testing negative balance method...");
    System.out.println(school.isNegative().toString());
    
    System.out.println("testing hasidno methhon on idno 2:");
    System.out.println(school.hasIdNo(2).toString());;
    
    System.out.println("Testing day-specific transcations(Extra credit)");
    System.out.println(school.getTransactions(2, 4).toString());;










    }
}







