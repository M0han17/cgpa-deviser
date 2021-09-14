package cgpaCalculation;

import java.util.ArrayList;

public class CalculateSGPA {

    ArrayList<Float> calculateFinalMarks(StudentMarksContainer S) {
        ArrayList<Float> finalMarks = new ArrayList<Float>();
        for (Integer i = 0; i < S.numOfSub; i++) {
            finalMarks.add(S.CIEMarks.get(i) + (S.SEEMarks.get(i) / 2));
        }
        return finalMarks;
    }

    ArrayList<Character> AssignGrades(StudentMarksContainer S) {
        ArrayList<Character> grades = new ArrayList<Character>();
        for (Float mark : S.finalMarks) {
            if (mark >= 90) grades.add('S');
            else if (80 <= mark && mark < 90) grades.add('A');
            else if (70 <= mark && mark < 80) grades.add('B');
            else if (60 <= mark && mark < 70) grades.add('C');
            else if (50 <= mark && mark < 60) grades.add('D');
            else if (40 <= mark && mark < 50) grades.add('E');
            else grades.add('F');
        }

        return grades;

    }

    ArrayList<Integer> AssignGradePoints(StudentMarksContainer S) {
        ArrayList<Integer> gradePoints = new ArrayList<Integer>();
        for (Character grade : S.grades) {
            switch (grade) {
                case 'S':
                    gradePoints.add(10);
                    break;
                case 'A':
                    gradePoints.add(9);
                    break;
                case 'B':
                    gradePoints.add(8);
                    break;
                case 'C':
                    gradePoints.add(7);
                    break;
                case 'D':
                    gradePoints.add(6);
                    break;
                case 'E':
                    gradePoints.add(4);
                    break;
                case 'F':
                    gradePoints.add(0);
                    break;
            }
        }
        return gradePoints;
    }

    Float calculate(StudentMarksContainer S){
        Float sgpa = 0.0F;
        Integer product;
        Float sum=0.0F;
        Integer totalCredits = 0;
        Integer credit;
        int i =0;
        for(String subject : S.subjects.keySet()){
            credit = S.subjects.get(subject);
            product = (credit*S.gradePoints.get(i));
            if(product==0){
                sgpa=0.0F;
                return sgpa;
            }
            sum = sum + product;
            totalCredits = totalCredits + credit;
            i++;
        }
        sgpa = (sum/totalCredits);

        return sgpa;
    }
}
