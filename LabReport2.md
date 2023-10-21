# **Lab Report 2**

***
## Part 1 - String Server

```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // Two arraylists to store messages as they are entered, and the other to put them in a list format
    ArrayList<String> incomingMessages = new ArrayList<String>();
    ArrayList<String> totalMessages = new ArrayList<String>();
```

I used the same imports as I had during week 2's lab, adding ArrayList and creating two different arraylists for storage of incoming messages.

```
//if adding a message, splits the portion after '=' and adds the rest of the information to incomingMessages
    if (url.getPath().contains("/add-message")) {
        String[] parameters = url.getQuery().split("=");
        incomingMessages.add(parameters[1]);
    }
```
This portion of the code handles incoming messages and stores them into the first of the two array lists. This array list is then looped through for each message and stored within a second array list, `totalMessages`, which will be used in the following for loop in order to display all of the currently input messages into a numbered list.

```
//compiledList works through totalMessages and formats it so that the output is a numbered list 
    String compiledList = "";
    for(int j = 0; j < totalMessages.size(); j++) {
        compiledList += String.format("%d: %s %n", j+1, totalMessages.get(j));
    }
    return compiledList
```

The following code shows the class `StringServer` which will start and run the server when given a port number and throw an error otherwise.
```
//Starting the server
class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
```
## Examples of Adding Messages
![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/a5e7fb38-04f4-4c96-a59f-f0837909ddad)

For this first screenshot, I chose to add two different messages to show that the output will work for multiple, successive, inputs. As I had shown above, I did not utilize any methods for this project, rather I used similar code to what was used in the week 2 lab and made edits to fit the tasks for this lab. As there are no used methods because no code is repeated, there are no method arguments, but the arguments placed onto the website would be whatever phrase is given after `/add-message?s=`. The value of `incomingMessages` and `totalMessages` are changed for every entry in their size for every element that was added, two in this case which are both used in for loops to iterate up to each of their respective sizes. The value of the `compiledList` String had been edited so that it would contain the two new elements that would be placed in the numbered list.

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/ca4cf89d-a248-4700-b15f-cffc01b4e228)

As mentioned in the first screenshot, no methods or arguments were used within the code because there were no instances of repeating code, and so all of the loops and formatting had been completed within the `Handler` class. The only argument passed through would be what was entered in the server URL to add a message, which in this case, was used to add two more messages to the list. As before, the value of the two array lists were changed because two more entries were added and because their sizes grew, the for loops using their sizes would iterate additional times accordingly. The value of the `compiledList` String had been edited so that it would contain the two new elements that would be placed in the numbered list.

## Part 2 - Keys

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/cb888a01-4655-4c33-ba17-27e1161040bc)

The image above shows the path to the folder that contains all of my java and class files for this assignment, as well as the two files that were created for the private and public SSH keys. I had created the file within the current working directory, `/Lab-Report-2` which can be seen in the screenshot.

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/b9d5e4b1-68d0-4bdb-b1cf-280c81158e2c)

This image shows the different directories available for me to select and navigate, specifically `.ssh/`, which I had changed to in order to use the `ls` command and display the `authorized_keys` file. It can be seen that I am logged in using ssh because of the username within the brackets. 

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/84631db1-b557-4a23-b5ac-5e110330bd1b)

This third image demonstrates that I was able to log into `ieng6` without having to enter my password as it did not prompt me to enter my password.

## Part 3 - What I Newly Learned

Something that I had learned from the week 2 lab was the ability to be able to start a server using the given tools and then be able to take those tools alongside the information about URLs, to then be able to add conditions for input or behavioral change for the website to react accordingly. The case last week involved incrementing or adding a number using certain commands, which helped me get a better idea of how to solve this lab similarly with adding messages instead. 
