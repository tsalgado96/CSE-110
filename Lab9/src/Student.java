/*-------------------------------------------------------------
//AUTHOR: Teodoro Salgado
//FILENAME: Lab9.java
//SPECIFICATION: your own description of the program.
//FOR: CSE 110 - Lab #9
//TIME SPENT: 20 Minutes
//-----------------------------------------------------------*/

public class Student {
    private String fullName, id;
    private double grade;
    private int numUpdated = 0, numAccessed = 0;

    public String getFullName(){
        numAccessed++;
        return this.fullName;
    }

    public String getId(){
        numAccessed++;
        return this.id;
    }

    public double getGrade(){
        numAccessed++;
        return this.grade;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
        numUpdated++;
    }

    public void setId(String id){
        this.id = id;
        numUpdated++;
    }

    public void setGrade(double grade){
        this.grade = grade;
        numUpdated++;
    }

    public int getNumUpdated(){
        numAccessed++;
        return numUpdated;
    }

    public int getNumAccessed(){
        numAccessed++;
        return numAccessed;
    }
}
