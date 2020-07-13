# The solution to process an input String
## Description 
This program is an application for answering the assessment given by Plena Data.<br />
Programming Language: Java<br />
Input: input String<br />
Output: Processed String<br />
High-level description: My method is to use a map to record the number of every distinct character.<br />
I also record the maximum number of numbers in all Characters.<br />
Then, I use a for loop to collect the characters. In each iteration, I receive a certain number of appearances of characters.<br />
Simultaneously, I use a StringBuilder to build the characters into a String.<br />
The time complexity is O(n^2) in worst case.<br />
The space complexity is O(n).<br />
## How to use
1. Create an instance of the ProcessString class.
2. Create a String for the input. Call the processString() method.
3. The return is the result of the program.