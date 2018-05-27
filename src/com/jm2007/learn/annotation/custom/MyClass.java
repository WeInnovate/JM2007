package com.jm2007.learn.annotation.custom;

// Author: Amit

// Date: 2018-05-27
// Reviewer: Atul, Akshay
// Target JVM: 1.8
// Description: This is normal Java Class

@ClassInfoAnnotation(/*author = "Amit",*/ creationDate = "2018-05-27", description = "This is normal Java Class", reviewers = {
		"Atul", "Akshay" }, targetJvm = 1.8)
public class MyClass {

}
