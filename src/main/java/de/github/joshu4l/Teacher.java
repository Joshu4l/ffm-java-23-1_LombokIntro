package de.github.joshu4l;

import lombok.With;

public record Teacher(
        String id,
        String name,
        @With
        String subject
) { }
