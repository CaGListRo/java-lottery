# Lottery Number Generator

Overview
The Lottery program is a simple Java application that generates 6 unique random lottery numbers between 1 and 49. The program ensures that no duplicate numbers are included and displays the generated numbers in the console.

How It Works

Random Number Generation:
A Random object is used to generate random integers between 1 and 49.
The range includes numbers from 1 to 49 (nextInt(50) generates numbers from 0 to 49, and 0 is excluded via a condition).

Ensuring Unique Numbers:
A HashSet is used to store the lottery numbers. Since a HashSet does not allow duplicates, it ensures that each generated number is unique.

Logic Flow:
The program generates random numbers in a loop.
If a number is 0, it is ignored and a new number is generated.
If a number is already in the HashSet, it is ignored to avoid duplicates.
The loop continues until 6 unique numbers are added to the HashSet.

Output:
Each valid number is printed to the console in the format:

1. Number = <number>
   After generating 6 numbers, the program stops.

How to Run
Compile the program:
javac Lottery.java

Run the program:
java Lottery

The program will output 6 unique random lottery numbers to the console.

Example Output

1. Number = 23
2. Number = 7
3. Number = 42
4. Number = 15
5. Number = 9
6. Number = 34

Key Features
Ensures that all numbers are unique.
Ignores invalid numbers like 0.
Uses efficient storage with HashSet for duplicate handling.

Customization
Change the Range:
To change the range of numbers (e.g., 1 to 100), update the nextInt parameter:
number = generator.nextInt(101);

Change the Number of Lottery Picks:
To generate more or fewer numbers, modify the condition in the if (count == 6) statement:
if (count == 10) { // Generate 10 numbers

Known Limitations
Hardcoded Range: The range is fixed to 1–49 unless modified in the code.
Performance: Although minimal, duplicate numbers require regeneration, which may take more iterations as the set fills up.

Feel free to adapt or expand this program to meet your requirements!
