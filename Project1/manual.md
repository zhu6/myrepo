Average Word Counter User Manual
================================
This document contains user instructions for running the Average Word Counter application.  
Introduction
------------
The Average Word Counter application was created to help authors identify trends in writing, specifically identifying trends in the overuse of wordy sentences.  By running the application and passing in a text file the user can quickly see a snapshot of the average number of words per sentence.  The application reads the entire text file, parses the sentences, and returns a single integer representing the average number of words per sentence in the file, rounded down to the nearest integer.
Usage
-----------
The Average Word Counter application can be executed by executing the following command:

    java Main

Running the application with no parameters or with the flag **-help (e.g. "java Main -help")** will bring up the help menu, showing the user the various flags used to customize the way the application behaves.

Passing in a Text File
-----------------------
In order for the Average Word Counter to operate, the application needs access to a text file.  The user passes this file in by providing the path to the file when executing the application.  For example, if your  text file was called "Writing.txt" and was located in "C:\Files" you would execute the following command to have the Average Word Counter analyze that file:

    java Main C:\Files\Writing.txt
    
Minimum Word Length
-------------------
By default, the Average Word Counter will ignore any words which have fewer than three characters.  The user can change this setting by using the **-l** flag when executing the application.  For example, the following execution of the Average Word Counter will ignore any words with fewer than 10 characters:

    java Main C:\Files\Writing.txt -l 10
  
Delimiters
----------
The Average Word Counter will count sentences ending in periods (.), question marks (?), and exclamation points (!).  The user can manipulate this setting by using the **-d** flag and passing in a new set of delimiting characters.  For example, the following line will execute the Average Word Counter using only periods, commas, and semicolons to end sentences:

    java Main C:\Files\Writing.txt -d ".,;"
    
Results
-------
Proper execution of the Average Word Counter will yield an integer value to the user representing the average number of words per sentence in the specified text file, rounded down to the nearest integer.  Remember that by default the application ignores words of fewer than 3 characters and uses periods, questions marks, and exclamation points to delimit sentences.  Hence the following text file:

    I am so tired of people whining about sentence length.  Why is it such a big deal to so many people.  Sentences are supposed to be extra long.
    
Would yield the following result if executed by the command **java Main C:\Files\Writing.txt**:

    5
    
Because the Average Word Counter would only count the words with three or more characters, the three sentences in the file are of length 6, 6, and 5, yielding an average of 5.667 words per sentence or 5, when rounded down to the nearest integer.  To illustrate further, the contents of the example text file are listed below with the words which are counted marked in bold:

I am so **tired** of **people whining about sentence length**.  **Why** is it **such** a **big deal** to so **many people**.  **Sentences are supposed** to be **extra long**.

Acknowledgements
----------------
The authors would like to acknowledge the spectacular work of Lauren and Alvin in the design of this fine application.  They also recognize the great institution of Georgia Tech for making all of this possible.
