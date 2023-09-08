package de.github.joshu4l;

import java.util.ArrayList;
import java.util.List;

public record University(
        String id,
        String name,
        List<Course> courses
) { }
