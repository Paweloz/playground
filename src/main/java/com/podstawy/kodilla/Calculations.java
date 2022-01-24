package com.podstawy.kodilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {

    public double calculateBestAverage(Map<Student, Grades> scores) {
        double bestAverage = 0;
        double average = 0;

        for (Map.Entry<Student, Grades> studentsSet : scores.entrySet()) {
            average = getAverage(studentsSet);
            if (average > bestAverage) {
                bestAverage = average;
            }
        }
        return bestAverage;
    }

    private double getAverage(Map.Entry<Student, Grades> studentsSet) {
        double average;
        double sum = 0;
        Grades grades = studentsSet.getValue();
        List<Integer> totalGrades = new ArrayList<>();
        totalGrades.addAll(grades.getEnglish());
        totalGrades.addAll(grades.getMaths());
        totalGrades.addAll(grades.getPhysics());
        if(!totalGrades.isEmpty()) {
            for (Integer totalGrade : totalGrades) {
                sum += totalGrade;
            }
        }
        average = sum / totalGrades.size();
        return average;
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {
        List<String> studentsWithBestAvrage = new ArrayList<>();
        double bestAverage = 0;
        for (Map.Entry<Student, Grades > studentsSet : scores.entrySet()) {
            Student student = studentsSet.getKey();
            double average = getAverage(studentsSet);
            if(average >= bestAverage) {
                bestAverage = average;
                String studentFullName = student.getFirstName() + " " + student.getLastName();
                studentsWithBestAvrage.add(studentFullName);
            }
        }
        if(bestAverage == 0.0) {
            return new ArrayList<>();
        }
        return studentsWithBestAvrage;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        List<Student> studentsWithPolishAndMathAbove4 = new ArrayList<>();
        for (Map.Entry<Student, Grades > studentsSet : scores.entrySet()) {
            double sum = 0;
            double average = 0;
            Student student = studentsSet.getKey();
            Grades grades = studentsSet.getValue();
            for (int i = 0; i < grades.getMaths().size() ; i++ ) {
                sum += grades.getMaths().get(i);
            }
            average = sum / grades.getMaths().size();
            if (average > 4.0 && student.getLanguage().equals("PL")) {
                studentsWithPolishAndMathAbove4.add(student);
            }
        }
        return studentsWithPolishAndMathAbove4;
    }

}