package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
                new Student(110002, "Anna", LocalDate.of(1990, 12, 7)),
                new Student(110003, "Erica", LocalDate.of(1974, 1, 31)),
                new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
                new Student(110005, "Bob", LocalDate.of(1990, 3, 5))
        };
        // Print the list of students in ascending order of names
        printListOfStudents(students);

        // Get and print the list of Platinum Alumni Students
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
//        platinumAlumni.forEach(student -> System.out.println(student.getName() + " - " + student.getDateOfAdmission()));
        platinumAlumni.forEach(student -> System.out.println(student));
    }

    public static void printListOfStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("List of Students :");
        for (Student student : students) {
//            System.out.println(student.getName() + " - " + student.getDateOfAdmission());
            System.out.println(student);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumni = new ArrayList<>();
        System.out.println("List of Platinum Alumni Students :");
        for (Student student : students) {
            if (student.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30))) {
                platinumAlumni.add(student);
            }
        }
        platinumAlumni.sort((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()));
        return platinumAlumni;
    }
}

