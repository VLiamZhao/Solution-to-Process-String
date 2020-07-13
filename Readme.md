# The solution to process an input String
## Description 
This is an application for answering the assessment given by Plena Data.<br />
Programming Language: Java <br />
Input: input String<br />
Output: Processed String<br />
High-level description: My method is to use map to record the number of every distinct charactor.<br />
One map is to record the total number of uppercase and lowercase. Another is to record uppercase and lowercase charactors separately.<br />
Then, I sort a list of the Entry of the first map to find the expected order of each charactor in output.<br />
Finally, I use a StringBuilder to build the charactors into a String. <br />