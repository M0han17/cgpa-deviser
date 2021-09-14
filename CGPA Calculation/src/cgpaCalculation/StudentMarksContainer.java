package cgpaCalculation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashMap;

class StudentMarksContainer extends RuntimeException {
    Scanner s = new Scanner(System.in);
    Integer semester;
    Integer numOfSub;
    Float sgpa;
    public LinkedHashMap<String, Integer> subjects = new LinkedHashMap<String, Integer>();
    public ArrayList<Float> CIEMarks = new ArrayList<Float>();
    public ArrayList <Float> SEEMarks = new ArrayList<Float>();
    public ArrayList <Float> finalMarks = new ArrayList<Float>();
    public ArrayList<Integer> gradePoints = new ArrayList<Integer>();
    public ArrayList<Character> grades = new ArrayList<Character>();

    StudentMarksContainer(String msg){
        super(msg);
    }


    StudentMarksContainer(Integer n){
        this.semester = n;
    }

    void assignSubjects(DataContainer D){
        switch (semester){
            case 1:
                numOfSub = D.sem1.size();
                subjects = D.sem1;
                break;
            case 2:
                numOfSub = D.sem2.size();
                subjects = D.sem2;
                break;
            case 3:
                numOfSub = D.sem3.size();
                subjects = D.sem3;
                break;
            case 4:
                numOfSub = D.sem4.size();
                subjects = D.sem4;
                break;
            case 5:
                numOfSub = D.sem5.size();
                subjects = D.sem5;
                break;
            case 6:
                numOfSub = D.sem6.size();
                subjects = D.sem6;
                break;
            case 7:
                numOfSub = D.sem7.size();
                subjects = D.sem7;
                break;
            case 8:
                numOfSub = D.sem8.size();
                subjects = D.sem8;
                break;
        }
    }
    void readCIE(){
        Float marks = 0.0f;
        for(String subject : subjects.keySet()){
            System.out.println("ENTER THE  CIE MARKS FOR SUBJECT " + subject+":");
            for(int j=0;j<1;j++)
                marks = s.nextFloat();
            if (marks > 50 || marks < 0) {
                throw new StudentMarksContainer("THE ENTERED MARKS RANGE FOR CIE HAS EXCEEDED. PLEASE ENTER VALUES FROM 0 TO 50.");
            }

            CIEMarks.add(marks);
        }
    }
    void readSEE(){
        float marks = 0.0f;
        System.out.println("ENTER SEE MARKS BELOW:");
        for(String subject : subjects.keySet()){
            System.out.println("ENTER THE  SEE MARKS FOR SUBJECT "+subject+":" );
            marks = s.nextFloat();
            if (marks > 100 || marks < 0) {
                throw new StudentMarksContainer("THE ENTERED MARKS RANGE FOR CIE HAS EXCEEDED. PLEASE ENTER VALUES FROM 0 TO 100.");
            }
            SEEMarks.add(marks);
        }
    }

}