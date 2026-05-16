# Student Tracker

## Description
A CLI app that tracks student grades and computes per-student and class-wide statistics.

## Features
- Stores students with multiple grades using `HashMap<String, List<Integer>>`
- Calculates average, letter grade (A–F), and pass/fail per student
- Reports highest average, lowest average, and overall class average

## Sample Output

Student: Rob  
Grades: [85, 96, 89]  
Average: 90.00  
Letter grade: A  
Pass: Yes


Student: John  
Grades: [88, 92, 79]  
Average: 86.33  
Letter grade: B  
Pass: Yes


Student: Man  
Grades: [55, 100, 61]  
Average: 72.00  
Letter grade: C  
Pass: Yes


--------- Class Summary ---------  
Highest average: Rob - 90.00  
Lowest average: Man - 72.00  
Class average: 82.78


## How to run
```bash
javac week02/day06/StudentTracker.java
java week02.day06.StudentTracker
```

## Concepts Used
- HashMap
- ArrayList
- Loops
- Methods