# Encryption
Solution to the Encryption coding challenge provided by SnapCheck.

## Problem
An English text needs to be encrypted. This function as a line of text as the input and the encrypted text is the output.
A grid is being used to determines the function outout. We will use the length of the input text without the spaces to determine the column and row of the grid being used. The column of the grid
is determined by the sqrt of the length of text and rounded up to the nearest whole number. The row of the grid
is determined by the sqrt of the length of text and rounded down to the nearest whole number.

For example: s = "feedthedog " and length = 10 and row = 3 & column = 4
```
f e e d
t h e d
o g
```
The output will be the concatenation of the characters as you go down each column. You add a space after concatenating
all characters of the column until the last column.
```
output: "fto ehg ee dd"
```

Constraints: 1 <= s <= 81 & s is comprised only of characters in the range ascii[a-z].

## Solution
The solution focuses on the backend part. In my implementation, I created an Encryption class because I think in a professional setting, there might be
multiple methods of encryption that might be used in an application such as those involving number amounts, routing numbers, etc. To implement the encryption
function, I created the encryptString method in the encryption class. I did not use a grid to determine the output, but I used the same idea to 
sucessfully obtain the expected output. In my code, basically, I used the idea of interating through the first column of the grid and used each character to get
the others down the column.

##### Reason: 
The use of a 2d-array or similar would be needed if a grid were to be used. However, the code would 
be unnecessarily long due to adding all the elements into the 2d-array and traversing it to get the output. The runtime would be longer and inefficient.

In the professional setting, the methods do not necessarily have to be static. I made it static so I can test the method easier. If I had additional time, I would have 
created more test cases that would cover the edge cases as well. I would also add and deal with the exceptions that might be exist due to the constraints.

## About Me
  I am a first-year at the University of California, San Diego pursuing Computer Science. Java is my favorite and strongest programming language. Although I have
  not used Java in a professional setting before, I am eager to learn more about how it can be used to contribute to SnapCheck. I want to grow as a software engineer
  and continually learn new things that build on my knowledge of Computer Science. I hope to not only learn from building products and services but also from the team
  engineers and developers. In the future, I aim to use my skills give back to my community and bring greater conveniences to society.
  
  Additonal information about my experiences and skills are included in my [resume](https://drive.google.com/file/d/1GBQ96-MmNzMW13NOuEoLYKTfZUw0vUlp/view?usp=sharing) and
  [LinkedIn profile](http://linkedin.com/in/jenniferwong1808).
  
  Courses I am currently taking: Intro to Object-Oriented Programming, Discrete Mathematics
  Courses I am going to taking next semester: Basic Data Structurs & Algorithms, Computer Organization and Systems Programming, and Mathematics for Algorithms
  
  Some of my other projects include:
  - [PokemonGoDemo](https://github.com/jenniferwong1808/PokemonGoDemo.git) (Java): a program that simulates the Pokemon Go game demo, and let's the player catch
  pokemons using pokeballs and items
  - [About Us Blog](https://jenniferwong1808.github.io/about-us-blog/) (HTML & CSS): a disproportionate-looking website that shares interests about my partner and me
  - [City Planner](https://shaniahao.github.io/cityplanner/) (Unity & C#): a first-person game where the player tries to find his way to the beach by finding cubes to reach the next level





