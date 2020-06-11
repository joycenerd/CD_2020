Small C compiler for Java assembly code (Jasmin)
==

## Introduction

The goal of our project this semester is to develop a prototype C compiler. This is done by compiling C programs into embedded platforms such as 68K, MIPS, ARM, or pseudo assemblies. In this class we will use Java assembly code (Jasmin,
http://jasmin.sourceforge.net/) as the target codes. Choose the set of language features which you want to develop in this course, and write the whole compiler (including the code generator). In this project there are also a x86 version as extra.

## Requirements

```
antlr-3.5.2-complete.jar
openjdk 11.0.7
```

You should execute this program in Linux or Unix-like system

## Setup

1. Locate the project folder 406410035_prj4_v1
2. Check you have the required java jdk installed in your environment
3. Check if antlr-3.5.2-complete.jar is working in your environmnet by typing `java -jar antlr-3.5.2-complete.jar`. If not working you must download it from ANTLR website and put it in the project folder

Jasmine java byte code version
1. Locate to jasmine: `cd jasmine`
2. type `make`
3. java byte code .j files will be saved in "jasmine"
    * test_1.c: comments, variable, basic arithmetic expression, print statement -> test_1.j
    * test_2.c: nested if else statements -> test_2.j
    * test_3.c: nested for loop, while with if statement -> test_3.j
    * test_4.c: arithmetic expression with many variables -> test_4.j


x86 version
1. Locate to X86: `cd x86`
4. type `make`
5. x86 .s files will be saved in "x86" folder, and the execution result from test_.s will shown on screen since x86 assembly code is executable on Linux system
    * test1.c: comments and arithmetic computation -> test1.s
    * test2.c: variable and if else statement -> test2.s
    * test3.c: if and while loop -> test3.s
