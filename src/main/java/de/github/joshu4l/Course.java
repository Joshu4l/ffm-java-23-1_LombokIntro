package de.github.joshu4l;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Value // Allows for the automated Generation of Getters, Setters as well as all Override Methods (ToString, HashCode, Equals)
       // IMPORTANT DIFFERENCE hereby is: after Instantiation, an object of this class will behave like one of a Record class!
       // so it will be immutable after it has been created!
@Builder
@With
@AllArgsConstructor
public class Course {

    /* TODO: Note to myself -> making any of these "final" would result in NOT having any setters being available
       In this case a workaround would be annotating @With above the corresponding attribute, so it can be set that way
    */
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
    /*
        ALSO IMPORTANT WHEN DECLARING ATTRIBUTES WITHIN A CLASS THAT'S ANNOTATED WITH @VALUE:
        -> No accessibility statement (public, private, protected) needed!
        -> new ArrayList<>(); / new HashMap<>(); is not needed
        JUST REMEMBER: it is treated like a Record!
     */



}
