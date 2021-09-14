package cgpaCalculation;

import java.util.LinkedHashMap;

public class DataContainer {
    LinkedHashMap<String, Integer> sem1 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem2 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem3 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem4 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem5 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem6 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem7 = new LinkedHashMap<String, Integer>();
    LinkedHashMap <String, Integer> sem8 = new LinkedHashMap<String, Integer>();
    public void initializeData(){

        // 1st Semester Credits Data
        sem1.put("Engineering Mathematics - 1", 4);
        sem1.put("Engineering Chemistry", 5);
        sem1.put("Elements of Electrical Engineering", 4);
        sem1.put("Engineering Mechanics", 4);
        sem1.put("Elements of Engineering Drawing", 3);


        // 2nd Semester Credits Data

        sem2.put("Engineering Mathematics - 2", 4);
        sem2.put("Applied Physics", 5);
        sem2.put("Elements of Electronics Engineering", 3);
        sem2.put("Elements of Mechanical Engineering", 4);
        sem2.put("C Programming", 4);


        // 3rd Semester Credits Data

        sem3.put("Operating System", 4);
        sem3.put("Statistics & Discrete Mathematics", 4);
        sem3.put("Data Structures with C", 4);
        sem3.put("Object Oriented Programming using C++", 4);
        sem3.put("Digital Logic Design", 3);
        sem3.put("Computer Organization and Architecture", 3);
        sem3.put("Environmental Studies", 2);
        sem3.put("Web Application Development", 2);

        // 4th Semester Credits Data

        sem4.put("Linear Algebra", 4);
        sem4.put("Database Management System", 4);
        sem4.put("Analysis and Design of Algorithms", 4);
        sem4.put("Java Programming", 4);
        sem4.put("Theoretical Foundations of Computations", 4);
        sem4.put("Constitution of India, Professional Ethics and Human Rights", 1);
        sem4.put("Seminar Based on Summer/Winter Internship", 1);
        sem4.put("UNIX System Programming", 2);

        // 5th Semester Credits Data

        sem5.put("Machine Learning", 4);
        sem5.put("Cloud Computing", 3);
        sem5.put("Software Engineering and Object Oriented Modeling Design", 4);
        sem5.put("Computer Networks - 1", 4);
        sem5.put("Entrepreneurship, Management and IPR", 2);
        sem5.put("Mobile Application Development", 2);
        sem5.put("Internet of things\nRobotic Process Automation Design and Development\nData Mining\nAdvanced Python Programming", 3);
        sem5.put("Advanced Data Structures and Algorithms\nCompiler Design\nArtificial Intelligence\nComputer Graphics", 3);

        // 6th Semester Credits Data

        sem6.put("Cryptography and Network Security", 3);
        sem6.put("Computer Networks - 2", 4);
        sem6.put("Software Testing", 4);
        sem6.put("Software Project Management and Finance", 2);
        sem6.put("Multi-disciplinary Project", 2);
        sem6.put("Seminar Based on Summer/Winter Internship", 1);
        sem6.put("Software Architecture and Design Patterns\nSocial Network Analysis\nBig Data Analytics\n Pattern Recognition", 3);
        sem6.put("Mobile Computing and 5G Technologies\nNatural Language Processing\nDeep Learning\nDigital Image Processing", 3);
        sem6.put("Data Structures and Algorithms\nRobot Process Automation Design and Development", 3);

        // 7th Semester Credits Data

        sem7.put("Biology for Engineers", 2);
        sem7.put("Cyber Law and Forensic", 3);
        sem7.put("Capstone Project -1", 3);
        sem7.put("Technical Seminar", 1);
        sem7.put("Industry Motivated Course", 1);
        sem7.put("Information Security", 3);
        sem7.put("Business Enterprise Architecture\nDevops\nData Visualization and Reporting\nVirtual Reality", 3);
        sem7.put("Java Programming\nMachine Learning", 3);

        // 8th Semester Credits Data

        sem8.put("Green Computing", 2);
        sem8.put("Capstone Project - 2", 10);
        sem8.put("Seminar Based on Summer/Winter Internship", 1);
        sem8.put("Big Data Analytics\nWeb Technologies", 3);


    }

}
