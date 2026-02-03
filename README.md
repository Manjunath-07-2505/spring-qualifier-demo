Project Name

Spring Core – @Qualifier Annotation Example


Project Description

This is a Spring Core practice project developed to understand Dependency Injection and the usage of the @Qualifier annotation.

The project demonstrates how Spring resolves ambiguity when multiple beans implement the same interface by using @Qualifier.


Project Overview

An interface named ElectronicDevice is created.

The interface contains a method:
useDevice()

Two classes Laptop and Mobile implement the ElectronicDevice interface.

Both classes override the useDevice() method with their own implementation.

A Student class depends on ElectronicDevice.

Since multiple implementations exist, @Qualifier is used in the Student class to specify which bean should be injected.

The application is executed using Spring Tool Suite (STS).


⚙️ Technologies Used

Java

Spring Core

Maven

Spring Tool Suite (STS)

Git & GitHub


🎯 Key Concepts Covered

Spring Dependency Injection

Interface-based programming

Multiple bean implementations

@Autowired annotation

@Qualifier annotation

Loose coupling in Spring
