package de.github.joshu4l;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Example for instantiating some students using the "new"-keyword
        // (works because of the AllArgsConstructor-Annotation)
        Student my1stStudent = new Student("S-0001", "Jörg", "An der Elbe 1", 1);
        Student my2ndStudent = new Student("S-0002", "Josh", "An der Elbe 2", 4);
        // Print the student object by assuming the ToString Default from lombok does its job
        System.out.println(my1stStudent);
        System.out.println(my2ndStudent);


        // Example for instantiating a student using the .build() method
        Student my3rdStudent = Student.builder()
                .id("S-0003")
                .name("Leonie")
                .address("An der Elbe 3")
                .grade(2)
                .build();
        // Print the student object by assuming the ToString Default from lombok does its job
        System.out.println(my3rdStudent);


        // Prepare an ArrayList of Student objects
        List<Student> courseParticipants = new ArrayList<>();
        courseParticipants.add(my1stStudent);
        courseParticipants.add(my2ndStudent);
        courseParticipants.add(my3rdStudent);


        // Instantiate some teachers (a .build() method is not necessary here, because Teacher is already a Record class)
        Teacher my1stTeacher = new Teacher("T-0001", "Peter Anderson", "WebDev");
        System.out.println(my1stTeacher);
        Teacher my2ndTeacher = new Teacher("T-0002", "Daniel Schwarz", "Java");
        System.out.println(my2ndTeacher);

        // Making use of the With-Annotation here
        // (which allows to easily clone and correct another Teacher despite the record object being immutable)
        Teacher my2ndTeacher_clonedAndCorrected = my2ndTeacher.withSubject("JavaDev");
        System.out.println(my2ndTeacher_clonedAndCorrected);


        // Example for instantiating a course using the "new"-keyword
        // (works because of the AllArgsConstructor-Annotation)
        Course my1stCourse = new Course("C-0001", "Web Development", my1stTeacher, courseParticipants);
        // Print the Course object by assuming the ToString Default from lombok does its job
        System.out.println(my1stCourse);

        // Example for instantiating a student using the .build() method
        Course my2ndCourse = Course.builder()
                .id("C-0001")
                .name("Java Development")
                .teacher(my2ndTeacher)
                .students(courseParticipants)
                .build();
        // Print the Course object by assuming the ToString Default from lombok does its job
        System.out.println(my2ndCourse);
        /*
            Important to know at this point:
            Since our Course was refactored by inserting a @Value annotation,
            WE CANNOT SET ITS ATTRIBUTES ANYMORE, EXCEPT USING WITH-METHODS!
         */



    }
}