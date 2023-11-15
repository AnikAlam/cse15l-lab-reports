# **Lab Report 3**

***
## Part 1 - Bugs

The following code block shows the test and the image after it shows that `testFilter` had failed.
```
@Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        StringChecker sc = new ListTests();
        assertArrayEquals(new String[]{ "cats" }, ListExamples.filter(testList, sc).toArray());
    }
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/b9124ba5-0878-45dd-8e35-02e8bcb28ac6)

The following code in this case shows the test and the image after it shows the passing result after the change had been made.
```
@Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        StringChecker sc = new ListTests();
        assertArrayEquals(testList.toArray(), ListExamples.filter(testList, sc).toArray());
    }
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/69b33b5d-e296-42b4-aa8c-ce7bb8b45d69)


What can be seen as the issue is that the test in the first case will attempt to compare it to "cats" without ever having inserted the element into the newly created ArrayList utilized by the test. The original test is attempting to check for the value "cats" to a test list that contains no data which will always fail, and so by adding in a line of code to add the "cats" element into the instantiated arrayList, it will properly be able to search and verify the value stored. The first block of code shows that the test list reached the end of the array rather than any other value which displays the issue that was discussed, and the second one had passed because both empty arrays were compared to each other which would always work for that case but is not a proper test. In order to fix it, there is a simple change made which will be shown.

BEFORE changes were made:
```
@Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        StringChecker sc = new ListTests();
        assertArrayEquals(new String[]{ "cats"} , ListExamples.filter(testList, sc).toArray());
    }
```

AFTER changes were made:
```
 @Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        StringChecker sc = new ListTests();
        testList.add("cats");
        testList.add("null");
        testList.add("wowza!");
        assertArrayEquals(new String[]{ "cats"} , ListExamples.filter(testList, sc).toArray());
    }
```
After changes were made, I had added three entries to the `testList` and then ran the individual test which returned a successful result because despite adding multiple values after "cats", it still is successfully able to filer through the list and see that the value being compared to DOES exist and match, therefore it is comparatively successful to before when no value had been added to `testList` and resulted in a failed test.

***
## Part 2 - Researching Commands

The command that I chose to research was `grep`. The four command line options that I thought were interesting with `grep` are the following: `grep -r "desiredData *" ` which can search for a string within the current working direction as well as every other subdirectories, specifically with the `-r` flag. The next is `grep --color "desiredText" "desiredFile` which will change the color of whatever text is being searched for in the output to make it contrast from other kinds of text which is useful in the case that the operating system or terminal of choice that doesn't differentiate color. The third is the `-v` flag which will take all lines that match the given phrase in the command and then output every phrase that does NOT contain the given phrase given to the terminal. The fourth command uses the `-n` flag to search for given text in order to output what line number it is located. 

Starting with the first command flag, `r`: This command flag searches for a given phrase recursively through the current directory as well as every subdirectory as mentioned(Source 1).
Example 1: Searching for the term "hypergeometric probability" in the current and every subdirectory
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -r "hypergeometric probability" ./technical/
./technical/biomed/1471-2105-3-34.txt:          hypergeometric probability of pathway p containing c
```

Example 2: Searching for the term "sulfur-utilization" in the current and every subdirectory
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -r "sulfur-utilization" ./technical/
./technical/biomed/gb-2003-4-7-r43.txt:          of these genes have confirmed roles in sulfur-utilization
./technical/biomed/gb-2003-4-7-r43.txt:          sulfur-utilization genes (hypergeometric 
./technical/biomed/gb-2003-4-7-r43.txt:          lack of direct annotation as sulfur-utilization genes.
./technical/biomed/gb-2003-4-7-r43.txt:        sulfur-utilization genes [ 5 ] .
```

Both examples highlight how I was able to take specific phrases and search for them, not only in the `./technical` directory, which is the current working directory as seen in the examples, but also in every subsequently in other subdirectories. While I did not post other examples because general words result in an incredibly long output, there are results in various different subdirectories for some search options which is useful in determining similar information located in slightly varying locations which would take a long time to search for manually. 

Moving onto the second command flag `--color`: This flag modifies the desired search result so that it appears in a different color to differentiate it (Source 1). 
Example 1: Searching for "hypergeometric probability" and changing the color to stand out. I chose to include the associated image rather than a text block because the alteration in color would not appear unless I included it as an image.
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep --color "hypergeometric probability" ./technical/biomed/*.txt
./technical/biomed/1471-2105-3-34.txt:          hypergeometric probability of pathway p containing c
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/b6158aad-bbdc-434e-a517-110983091535)

Example 2: Searching for "sulfur-utilization" and changing the color to stand out. I also included the image for the same reason as before, to demonstrate that it will actually change the color which cannot be shown through a code block.
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep --color "sulfur-utilization" ./technical/biomed/*.txt
./technical/biomed/gb-2003-4-7-r43.txt:          of these genes have confirmed roles in sulfur-utilization
./technical/biomed/gb-2003-4-7-r43.txt:          sulfur-utilization genes (hypergeometric
./technical/biomed/gb-2003-4-7-r43.txt:          lack of direct annotation as sulfur-utilization genes.
./technical/biomed/gb-2003-4-7-r43.txt:        sulfur-utilization genes [ 5 ] .
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/0f114c1a-cb65-4048-a38c-7666ccad8802)

Because the change in color cannot be seen in the code block itself, I provided an additional image for each example to demonstrate the effect. But as can be seen in the code blocks, after each command was run using this flag, the output appeared with motified colors for the desired text to differentiate it and make it easier to parse through. In much larger scale cases where some term or text might appear hundreds of times, making it stand out would put much less strain on the eyes for trying to find where in the line it appeared and the frequency it would appear at. 

Moving onto the third command flag `-v`: This flag takes all the lines that match the given phrase and outputs lines that do NOT match the phrase as mentioned (Source 1).

Because the output is incredibly long, I will include a small portion of it and then provide the entire output through an image to show the full thing.
Example 1: Outputting every line that does not contain `the`
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -v "the" ./technical/911report/preface.txt 
            PREFACE
                Democrats chosen by elected leaders from our nation's capital at a time of great
                avoid such tragedy again?
            Our mandate was sweeping. The law directed us to investigate "facts and circumstances
                to intelligence agencies, law enforcement agencies, diplomacy, immigration issues
                reviewed more than 2.5 million pages of documents and interviewed more than 1,200
                current and previous administrations who had responsibility for topics covered in
                our mandate. We have sought to be independent, impartial, thorough, and nonpartisan.
                public testimony from 160 witnesses.
                27, 2002).
```
The code block above displays only a portion of the output from that command as it yields a large number of output lines that I will omit for the sake of reducing the size bloat of the markdown block.

Example 2: Outputting every line that does not contain `and`
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -v "and" ./technical/911report/preface.txt
            PREFACE
                Democrats chosen by elected leaders from our nation's capital at a time of great    
                partisan division-have come together to present this report without dissent.        
                avoid such tragedy again?
                Commission on Terrorist Attacks Upon the United States (Public Law 107-306, November
                27, 2002).
```
The code block above also only displays a small portion of the output as it is also incredibly long, and I am choosing to display a small portion to prevent size bloat.

As seen in both examples and their subsequent pictures to capture the entire output, all of the lines shown do NOT include the term that was specified in the command inquiry which I thought to be rather interesting. As seen by both outputs, in this case where there are are a plethora of files, the usage can vary, but in cases where you want to exclude certain data, results, or the like, this command flag is perfect for doing so. 

Finally, the last command flag `-n`: This command flag adds the numbered line for the file that has the corresponding desired data (Source 2).

Example 1:
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -n "hypergeometric probability" ./technical/biomed/*.txt
./technical/biomed/1471-2105-3-34.txt:142:          hypergeometric probability of pathway p containing c
```

Example 2:
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -n "sulfur-utilization" ./technical/biomed/*.txt
./technical/biomed/gb-2003-4-7-r43.txt:480:          of these genes have confirmed roles in sulfur-utilization
./technical/biomed/gb-2003-4-7-r43.txt:486:          sulfur-utilization genes (hypergeometric 
./technical/biomed/gb-2003-4-7-r43.txt:495:          lack of direct annotation as sulfur-utilization genes.
./technical/biomed/gb-2003-4-7-r43.txt:695:        sulfur-utilization genes [ 5 ] .
```

As seen in Example 1, the desired text was found on line `142` which can be seen in the code blocked below Example 1, and for Example 2, there are several results, each with their own corresponding line number listed by the command flag. This is useful for pinpointing appearances of whatever we choose to search in the event that we need to edit, replace, or utilize the information that is there. 

The resources used to find the information for all of these command flags:

1)[Resource 1: Digital Ocean](https://www.digitalocean.com/community/tutorials/grep-command-in-linux-unix2)

2)[Resource 2: Linux Buzz](https://www.linuxbuzz.com/grep-command-examples-linux/#5_Searching_the_line_or_word_along_with_the_line_numbers)
