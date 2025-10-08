package com.gmail.ahmedded.homework.homework21;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Author {
    String firstName();
    String lastName();
}

