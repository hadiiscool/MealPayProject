//this object holds the infortmation stored in the transaction obects, will be used in the higher degree classes(ones that use this object).
public class Transaction{ 

    //fields

private int day;
private int month;
private double charge;

//constructors

public Transaction(int myMonth, int myDay, double myCharge){
month = myMonth;
day = myDay;
charge = myCharge;

}

//methods
public double getCharge(){
    return charge;
}

public int getDay(){
    return day;
}

public int getMonth(){
    return month;
}
public String toString(){
    return "(" + month + "/" + day + ", " + charge + ")";
}

}