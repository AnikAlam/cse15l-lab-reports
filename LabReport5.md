# **Lab Report 4**

***
## Part 1 - Debugging Scenario 

1) Original student post showing symptom and describing a guess of the issue and failure inducing input
2) TA response asking another question/giving a suggestion for commands to try
3) Terminal screenshot/output of the information the student got from the TA suggestion; clear bug description
4) Include all the needed information: file directory/structure -> file content before fix -> command line cmd to trigger bug -> what to edit to fix the bug

1) Original Student Post:
   Student: "Hello, I ran into an issue with my `ArrayExamples.java` file where I'm currently failing two tests. The first error I ran into was for `testRevered2` where the expected value was different from the actual value, and the same issue for `testReversedInPlace2`. Here are two screenshots of the errors and a third screenshot with my code. My guess is that something in my reversing functions are not working as intended, but I'm not sure what."

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/d4b16afa-8634-46df-9ab4-88335ace5fa2)
![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/774f2cd3-c5a1-4445-97ce-87bc76f4c7d1)
![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/43bb326d-6d7a-4632-be93-1bd31589a570)

2) TA Response:
   TA: "After looking at your code, something to consider would be to try running through each of your reverse functions with a set and writing out what happens to the set as it runs through the function! Are your values being replaced properly by the associated 'reversed' value, or are they being lost/overwritten? And are you storing all of these values in their intended locations? Also if you haven't yet, I would strongly suggest creating a bash script to compile and run your test file so that you do not have to manually do this while troubleshooting"

3) Student Followup:
   Student: "After thinking about your questions, I went through and realized several issues with my code! I used VIM to edit the files since I did not have them locally and made several changes to my functions. For reverse in place, I realized that the values were overwriting themselves and created a placeholder array to hold values as the original array is reversing itself. For my reversed method, I realized that the incorrect array was used to store new values and was returned, which resulted in a jumbled array instead of one that was intended. After that, all my tests passed with changes to the original which I included a screenshot of. I also took your advice and made a bash script which automatically compiles and runs which made it much easier to troubleshoot!" 

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/f03e9e2f-586d-4994-85d7-a3281e8dd940)
![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/a554e15f-f58d-4fe5-acf3-0d364fa4e225)

4) Setup Information
   The directory and file structure consisted of the the [lab 3 repository](https://github.com/ucsd-cse15l-f23/lab3), particularly the original `ArrayExamples` and `ArrayTest` files for the demonstration which have their contents display in the following two images:
   ![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/f417263c-aa11-4ca0-b06f-516f0c559f70)
   ![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/569342cf-267f-4d13-a8e3-2d374690f59f)
   
   The command line ran to trigger the failed tests involved compiling and running the test file with JUnit through a bash script to prevent the need to manually compile and run each time:
   ```
   $ bash test.sh
    JUnit version 4.13.2
    ....
    Time: 0.009
    
    OK (4 tests)
    
    Finished Compilation and Test
   ```

   The changes made to fix the bugs were as follows:
   ```
   <vim ArrayExamples.java>
   ```
   Followed by entering another for loop in `reverseInPlace` which is commented for its specific purpose. The next portion of changes were swapping the positions of `arr` and `newArray` so that the newly created array was the one being used for the reversed array rather than the original which was overwriting itself. 


***
## Part 2 - Reflection

Something that I've learned throughout the labs in the second half of the quarter was how to use and navigate VIM. Using it in tandem alongside the terminal commands we've learned has been very informative and interesting to learn about. I didn't particularly understand either of these subjects during the lectures, but once I was able to sit down and read the documentation for the commands and operations we learned, I gained a much better understanding. It also helped to engage with the material in the quizzes, labs, and skill demos because I personally find it much easier to retain information after applying it. On a similar note, the lab report where we were tasked with researching a specific command and some modifiers that can be used alongside it was another big topic of interest to learn and apply. 
