package week02.day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentTracker {

    public static double average(List<Integer> grades) {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static String letterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80){
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static boolean isPassing(double average) {
        return average >= 60;
    }

    public static void printSummary(HashMap<String, List<Integer>> studentHashMap) {
        String highestName = "";
        String lowestName = "";
        double lowest = Double.MAX_VALUE;
        double highest = Double.MIN_VALUE;
        double overall = 0;

        for (String name:studentHashMap.keySet()) {
            double average = average(studentHashMap.get(name));
            if (average > highest) {
                highest = average;
                highestName = name;
            }

            if (average < lowest) {
                lowest = average;
                lowestName = name;
            }

            overall += average;
        }

        double classAvg = overall / studentHashMap.size();

        for (String name: studentHashMap.keySet()) {
            List<Integer> grades = studentHashMap.get(name);
            double avg = average(grades);

            System.out.println();
            System.out.println("Student: " + name);
            System.out.println("Grades: " + grades);
            System.out.printf("Average: %.2f%n", avg);
            System.out.printf("Letter grade: %s%n", letterGrade(avg));
            System.out.printf("Pass: %s%n", (isPassing(avg) ? "Yes" : "No"));
            System.out.println();
        }

        System.out.println();
        System.out.println("--------- Class Summary ---------");
        System.out.printf("Highest average: %s - %.2f%n", highestName, highest);
        System.out.printf("Lowest average: %s - %.2f%n", lowestName, lowest);
        System.out.printf("Class average: %.2f%n", classAvg);
        System.out.println();
    }


    
    public static void main(String[] args) {
        HashMap<String, List<Integer>> studentGrades = new HashMap<>();

        List<Integer> robGrades = new ArrayList<>();
        robGrades.add(85);
        robGrades.add(96);
        robGrades.add(89);
        studentGrades.put("Rob", robGrades);

        List<Integer> johnGrades = new ArrayList<>();
        johnGrades.add(88);
        johnGrades.add(92);
        johnGrades.add(79);
        studentGrades.put("John", johnGrades);

        List<Integer> manGrades = new ArrayList<>();
        manGrades.add(55);
        manGrades.add(100);
        manGrades.add(61);
        studentGrades.put("Man", manGrades);

        printSummary(studentGrades);


    }
}
