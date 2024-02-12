//this object holds the infortmation stored in the transaction obects, will be used in the higher degree classes(ones that use this object).
public class Transaction{ 

    //fields

private int day;
private int month;
private double charge;

//constructors

public Transaction(double myCharge, int myDay, int myMonth){
charge = myCharge;
day = myDay;
month = myMonth;
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