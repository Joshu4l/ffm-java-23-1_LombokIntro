package de.github.joshu4l;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    // Automatically generates Getters, Setters as well as all Override Methods (ToString, HashCode, Equals)
@Builder // Allows for an alternative version of Instantiation (using the .builder().build(); syntax)
@AllArgsConstructor  // Automatically generates the Custom Constructor (this.argument = argument; etc.)
@NoArgsConstructor   // Automatically generates the (empty) Default Constructor
public class Student {

    /* TODO: Note to myself -> making any of these "final" would result in NOT having any setters being available
       In this case a workaround would be annotating @With above the corresponding attribute, so it can be set that way
     */
    private String id;
    private String name;
    private String address;
    private int grade;

}
