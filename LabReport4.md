# **Lab Report 4**

***

STEPS 4 - 9

STEP 4
I logged into ssh using my login cs15lfa23**@ieng6-201.ucsd.edu and was not prompted to enter my password because I had set up an SSH key previously

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/867efb59-0311-4114-957f-4ddb3321b935)

STEP 5
I ran the following command to clone the repository using an SSH URL which successfully cloned the repo to my remote access computer
`$ git clone git@github.com:AnikAlam/lab7AnikAlamLabReport4.git <enter>`

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/533729c4-951a-4172-8087-e24944bd3c84)

STEP 6
I ran the tests using:
`$ bash test.sh <enter>`
which yielded an output of 2 tests ran with 1 failure which can be seen in the markdown block below.
```
JUnit version 4.13.2
..E
Time: 0.534
There was 1 failure:
1) testMerge2(ListExamplesTests)
org.junit.runners.model.TestTimedOutException: test timed out after 500 milliseconds
        at ListExamples.merge(ListExamples.java:44)
        at ListExamplesTests.testMerge2(ListExamplesTests.java:19)

FAILURES!!!
Tests run: 2,  Failures: 1
```
![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/a317cdff-f6e7-4876-80bd-1bff941c8f0a)

STEP 7
In order to fix the failing tests, I changed the code by doing the following:
```
$ vim ListExamples.java
?index1 <enter>
```
Which opened the `ListExamples.java` file in vim and searched for the value "index1" starting from the bottom. Because this is what is causing the issue with the test, I changed it to "index2" by doing the following:

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/412dca73-bd72-4f62-8827-612872b18180)

`:s/index1/index2 <enter>`
Because I had already navigated to the value that I wanted to change, I did not need to use any arrow keys to navigate the file and immediately jumped to the desired place. The command above allowed me to select the desired value to change and used the second parameter as what was replacing the original text. 

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/83609cbb-9347-4cb1-a186-1c24cb9d1bb7)

I then used the 
`:wq <enter>`
command to save and exit the file so that I could run the tests again and determine if that had fixed the issue.

STEP 8
I ran the tests once more using: `$ bash test.sh <enter>`
And this time around, all of the tests succesfully passed as shown in the test output below.
```
[cs15lfa23ps@ieng6-201]:lab7AnikAlamLabReport4:178$ bash test.sh 
JUnit version 4.13.2
..
Time: 0.015

OK (2 tests)
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/cb4b2fc1-3370-43aa-a2ba-41251f2f435f)

STEP 9
I then proceeded to add, commit, and push the file to my existing github repository; Seeing as I only had made changed to `ListExamples.java`, that was the only file I needed to add, commit, and push.

The first step was to add the file to the staging area which I did by typing:
`git add ListExamples.java <enter>`

The next step would be to use the `commit` command to commit all of the files currently in the staging area.
`git commit -m "ListExamples.java was edited using VIM so that when ListExamplesTests.java was ran, all tests would pass" <enter>`
The block above shows my use of the command with the associated commit message.

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/4f79f660-0a3f-449e-8d94-6d4940849bb3)

The final step was to push it to my repository by using the command:
`git push <enter>`

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/931aacea-3a68-44d1-b797-3cd5b4e01c3d)

By this point I had checked my repository to confirm if the push had gone through with my commit message, and it had as can be seen in the screenshot below. 

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/7c12d278-6f1e-4b90-ae3c-5d3b51519f07)
