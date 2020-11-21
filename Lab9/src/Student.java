/*-------------------------------------------------------------
//AUTHOR: Teodoro Salgado
//FILENAME: Student.java
//SPECIFICATION: Creates a Student object and initializes it with setters
//FOR: CSE 110 - Lab #9
//TIME SPENT: 20 Minutes
//-----------------------------------------------------------*/

public class Student {
    private String fullName, id;
    private double grade;
    private int numUpdated = 0, numAccessed = 0;

    // Returns the name of the object it is called on
    public String getFullName(){
        numAccessed++;
        return this.fullName;
    }

    // Returns the ID of the object it is called on
    public String getId(){
        numAccessed++;
        return this.id;
    }

    // Returns the grade of the object it is called on
    public double getGrade(){
        numAccessed++;
        return this.grade;
    }

    // Sets the name of the object it is called on
    public void setFullName(String fullName){
        this.fullName = fullName;
        numUpdated++;
    }

    // Sets the ID of the object it is called on
    public void setId(String id){
        this.id = id;
        numUpdated++;
    }

    // Sets the grade of the object it is called on
    public void setGrade(double grade){
        this.grade = grade;
        numUpdated++;
    }

    // Returns the amount of times a variable has been updated
    public int getNumUpdated(){
        numAccessed++;
        return numUpdated;
    }

    // Returns the amount of times a variable has been accessed
    public int getNumAccessed(){
        numAccessed++;
        return numAccessed;
    }
}
