//this file takes all other objects into use, so its the highest order
import java.util.ArrayList;

public class Roster {
  

    //fields
   
    ArrayList<Student> students = new ArrayList<Student>(); //takes in an arraylist of students

    //comstructos
    public Roster(){//this just has to be here for some reason
    }


    //methods
    
    public ArrayList<ArrayList<Transaction>> getTransactions(int month, int day){ //makes an arraylist of the arraylist of transactions in the student file, this. I have to put the month and day in the right order here or it doesnt work
        ArrayList<ArrayList<Transaction>> flist = new ArrayList<ArrayList<Transaction>>(); //intializied one of these double lists
        for(int i = 0; i < students.size(); i++){
           if(students.get(i).getTransactionByDate(month, day) != null){ //if there is smth there...
            flist.add(students.get(i).getTransactionByDate(month, day)); // add it to the final list
           } 
    }
        return flist;
    }

    public ArrayList<Student> isNegative(){ //makes an arraylist of students called isegative
        ArrayList<Student> negative = new ArrayList<Student>(); //initialzed one of these
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getBalance() < 0){ //if the students is broke!!...
                negative.add(students.get(i)); //add him to the negative pile
            }
        }
        return negative;
    }

    public Student hasIdNo(int idNumber){ //checks if bro has an id
        Student Hadi = new Student("Hadi"); //makes a student 
         for(int i = 0; i < students.size(); i++){ //runs through the student list
             if (students.get(i).getIdNo() == idNumber){ //if the idnumbr mathches...
                 Hadi = students.get(i); //then the student in that position has is validified
             }
         }
         return Hadi; 
     }
    
    
     public void addStudent(Student a){
        students.add(a);
    }
    
    public String toString(){
        return "Students: " + students;
    }



}
