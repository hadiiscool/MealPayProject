import java.util.ArrayList;

public class Student {
    //fields

    private String name;
    private int idNo;
    private static int idGen; //doesnt change throught class
    private double balance;
    ArrayList<Transaction> charges = new ArrayList<Transaction>();//takes transaction objects
    

//constructos

public Student(String myName){
name = myName;
idNo = idGen;
idGen++;
balance = 0;
}

//methods

public void chargeMeal(int day, int month, int idNo){
Transaction cm = new Transaction(day, month, idNo);
balance-= 7.0; //this assumes that all meals are 7 dollars
charges.add(cm);
}


}
