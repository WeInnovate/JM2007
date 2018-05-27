package com.jm2007.learn.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(value=ElementType.TYPE)
public @interface ClassInfoAnnotation {

	String author() default "Punitha";

	String description();

	String creationDate();

	double targetJvm();

	String[] reviewers();

}
