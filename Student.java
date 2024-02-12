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

public void chargeMeal(int month, int day, double cost){
Transaction cm = new Transaction(day, month, -7);
balance-= 7.0; //this assumes that all meals are 7 dollars
charges.add(cm);
}


public void addFunds(int month, int day, int idNo, double amount){
    Transaction addF = new Transaction(month, day, amount);
    balance += amount;
    charges.add(addF);
}



//getters
public int getIdNo(){
    return idNo;
}

public double getBalance(){
    return balance;
}

public ArrayList<Transaction> getCharges(){
    return charges;
}

// end of getters
//extra credit???? :)

public ArrayList<Transaction> getTransactionByDate(int month, int day){ //makes an arraylist called transaction that takes the month/day of the trasnactions
    ArrayList<Transaction> inDay = new ArrayList<Transaction>();//initialized one of these lists for each day
    for(int i = 0; i < charges.size(); i++){ //runs through all charges
        if((charges.get(i).getMonth() == month) && (charges.get(i).getDay() == day)){ //if the charge matches with the month provides and the day is the same...
            inDay.add(charges.get(i)); //the charge gets added
        }
    }
    
    if(inDay.size() == 0){//protecting against the cases wheere thier is no transaction in a paricular day
        return null; 
    } 
    else {
    return inDay;
    }
}



public String toString(){
    return "Student: " + name + ", ID: " + idNo + ", Balance: " + balance + ", Transaction: " + charges.toString();
}




}

