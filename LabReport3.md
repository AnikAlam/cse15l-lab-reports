# **Lab Report 3**

***
## Part 1 - Bugs

##Part 2 - Researching Commands

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
Example 1: Searching for "hypergeometric probability" and changing the color to stand out
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep --color "hypergeometric probability" ./technical/biomed/*.txt
./technical/biomed/1471-2105-3-34.txt:          hypergeometric probability of pathway p containing c
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/b6158aad-bbdc-434e-a517-110983091535)

Example 2: Searching for "sulfur-utilization" and changing the color to stand out
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
                27, 2002).
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/76acbae3-059b-419c-9ad8-b5580941b8c9)


Example 2: Outputting every line that does not contain `and`
```
Anik@DESKTOP-67GBBR1 MINGW64 ~/docsearch (main)
$ grep -v "and" ./technical/911report/preface.txt
            PREFACE
                Democrats chosen by elected leaders from our nation's capital at a time of great
                partisan division-have come together to present this report without dissent.
```

![image](https://github.com/AnikAlam/cse15l-lab-reports/assets/55520027/3cfed400-9f0b-4ba1-8077-800433729146)

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
1)https://www.digitalocean.com/community/tutorials/grep-command-in-linux-unix2
2)https://www.linuxbuzz.com/grep-command-examples-linux/#5_Searching_the_line_or_word_along_with_the_line_numbers
