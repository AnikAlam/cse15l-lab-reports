# **Lab Report 1**

***
 `cd`

 
<img width="527" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/99adb57d-eab6-44b6-acbd-74cff57cf224">

Starting with the `cd` command, I found that the command alone does not make any sort of change because the purpose of the command is to change the directory, and without any arguments or a target directory to go to, nothing will happen. In the second example, I gave the argument `cd /home/lecture1` which gave a corresponding result of changing the directory to `lecture1`. And finally with the third example of using the command with a path to a file as the argument, the terminal gave an error because again, the purpose of the command is to change *directories*, and a file is not a directory, therefore it is an invalid argument. The output for the third example was an error because it was given a file path as an argument which is not compatible with the command.

The working directory in the first case had been the default directory since I had yet to change the directory, however as mentioned in the second example, I had changed the working directory to `/home/lecture1`. And as mentioned in the third example, the working directory remained `/home/lecture1` because the argument given was a file path which is not a valid directory to traverse to.

***

`ls`

<img width="200" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/79f74b5c-a3e3-402f-b67d-468cd39f714a">

Moving onto the `ls` command, I trialed the first example first in the home directory, which is why it gave an output of only `lecture1` as it is the only directory within the home. Afterwards I changed the directory to `lecture1` and ran the command which listed all of the files within. 
The working directory had been the home directory in the first portion, and then I had changed it to `lecture1` to test what the difference would have been. The output was not an error and gave the expected results.

<img width="383" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/b4cf44cb-ef53-462b-b922-54de69aa6197">

For the second example, I reset the directory back to `/home/` and then ran the command with the argument `ls /home/lecture1/` which output four items which it should as those are the four items present within the `lecture1` directory. The output was not an error and the command with the given argument worked as expected. The working directory in this case would have been `/home/lecture1/` because the output had been all of the four items placed within the `lecture1` directory.

<img width="429" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/484a5f8f-52fa-477a-b623-c0e777d2a0b6">

For the third example, running the command with a path to a file will result in nothing happening as the command's purpose is to list all of the contents directly under the target directory, however, in the case of a file, nothing will output as there are no sub-directories or files within that file.

The working directory in this case would have also been `lecture1` because that is the directory that had been set in the previous example and had not been changed since then.
***
`cat`


<img width="306" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/32c024e3-fdef-4045-a2da-9193527de814">

Finally onto the 'cat' command, after running it with no arguments, the terminal allowed me to continuously hit the enter key or type out any sort of text. If I did type out text and hit enter, the terminal would output the exact same text and return back to the previous stage of allowing me to hit enter or type in some input. Because I was unsure on how to escape or be able to enter in a new command, I created a new terminal in order to continue working on the lab. The working directory was the home directory. Through one of the TAs, I learned that it is possible to break out of the loop by pressing `control + c`.

The working directory in this case would have been the home directory as I had to escape and create a new terminal to start the process over.

<img width="359" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/4fa44102-9001-4b95-8951-7677baa1cc66">

In the second example, running the command with a path to a directory as an argument caused the terminal to return a message stating that the path given led it to a directory. Because the command is used for viewing or creating a file, when given a directory I believe that it returns that message as sort of an error message. 

The working directory was the home directory and the path given was `/home/lecture1/` which did not change or affect the current directory in any way as the argument was not a valid input for the command. 

<img width="497" alt="image" src="https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/573de471-a5ea-4a88-9d19-7985bd9c844c">

In the third example, a path to a file was given as the argument for the command and the output onto the terminal consisted of the contents within the file as expected. Because this command is used for viewing/creating files, it is expected that this would have been the outcome unlike the first two examples where non-compatible arguments were given. 

The working directory was also the home directory in this example.
