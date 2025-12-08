# calc

A simple Java calculator program that demonstrates inheritance by implementing basic arithmetic operations (addition, subtraction, multiplication, and division) through separate classes.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Demonstrates object-oriented programming with inheritance

## Requirements

- Java 8 or higher
- No external dependencies required

## Usage

1. Compile the program:
```bash
javac calc.java
```

2. Run the program:
```bash
java calc
```

## Output

The program performs the following operations and displays the results:
```
3  (1 + 2)
1  (2 - 1)
4  (2 * 2)
2  (4 / 2)
```

## How It Works

The program uses inheritance to organize arithmetic operations:

1. **Base class (`calculator`)**: Stores the answer in the `ans` variable
2. **Derived classes**: Each arithmetic operation (add, sub, mul, div) extends the calculator class
3. **Main class (`calc`)**: Creates instances of each operation class and displays results

## Code Structure

- `calculator` - Base class with ans variable
- `add` - Addition operation class
- `sub` - Subtraction operation class
- `mul` - Multiplication operation class
- `div` - Division operation class
- `calc` - Main class with program execution

## About

This project was created as part of the Tuwaiq Academy Software Development Bootcamp.

The code was AI-generated as a learning tool. The primary objective was to study and understand the code structure, analyze the program flow, and gain the ability to modify and enhance the functionality independently through hands-on practice.
