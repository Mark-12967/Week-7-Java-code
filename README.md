[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21109803)
# CSCI160-CH3PE62
Programming Exercise 62 From Java Illuminated Book by Anderson and Franceschi  
Write a program that takes three __double__ numbers from the Java console representing, respectively, the three coefficients __a__, __b__, and __c__ of a quadratic equation.  
Solve the equation using the following formulas:  
x1 = (-b + square root (b^2 - 4 ac))/(2a)  
x2 = (-b - square root (b^2 - 4 ac))/(2a)

Run your program on the following sample values:
a = 1.0, b = 3.0, c = 2.0
a = 0.5, b = 0.5, c = .125
a = 1.0, b = 3.0, c = 10.0

In your program, write a comment for each run, discussing what happens with each case.  Pay special attention to the last case.

## AutoGrader Tests:  
**Test 1:**  
Input: 1.0  
Input: 3.0  
Input: 2.0  
Output:  x1 = -1.0 and x2 = -2.0  

**Test 2:**  
Input: 0.5   
Input: 0.5  
Input: 0.125  
Output:  x1 = -0.5 and x2 = -0.5  

**Test 3:**  
Input: 1.0   
Input: 3.0  
Input: 10.0  
Output:  x1 = NaN and x2 = NaN  
