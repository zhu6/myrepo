# **Requirements Document -- Team 18**

##1 User Requirements

This section describes the intended users of the system, what they expect the software to be able to do, and how they expect to interact with the system.

###1.1 User Characteristics

1.1.1 Users of the software are the University students in the instructor Lauren's classes. 

1.1.2 There are up to 45 students per section and up to 6 sections of a course per semester (up to 270 students in total).

1.1.3 Users' technical skills range from non-technical to very technical.

1.1.4 Users submit their essays as raw text through email.

###1.2 System's functionality

1.2.1 The system is required to be run from command line and to accept input as command line parameters.

1.2.2 The system is required to accept the text file to be analyzed as a command line parameter with the path of the input file.

1.2.3 The system should output the text "The average words per sentence is: " followed by the average number of words per sentence rounded down to the nearest integer.

###1.3 User Interfaces

1.3.1 Users should be able to input parameter via command line.

1.3.2 Users should be able to use a file path for the input.

1.3.3 Users should specify a word length using -l (default is 3, meaning words of length less than 3 are not counted)

1.3.4 Users should specify a delimiter set with -d (default is ".?!")

1.3.5 Users will see the results of the analysis printed to the console.

1.3.6 Users will see friendly error messages when an error is encountered in the program.

##2 System Requirements

These subsections contain all the software requirements at a level of detail sufficient to enable designers/developers to design/develop a system that satisfies those requirements, and testers to test that the system satisfies those requirements. This part of the document should provide a numbered (possibly hierarchical) list of simple, complete, and consistent functional and non-functional requirements.
 
###2.1 Functional Requirements

2.1.1 System reads text from a file. File path should be passed in as a parameter.

2.1.2 System should default to counting only words with 3 or more letters. The minimum number of letters constituting a word should also be configurable if a parameter is passed in, using the parameter -l for this option.

2.1.3 System should default to delimiting sentences with periods, question marks, and exclamation marks.

2.1.4 System should also accept a string parameter with other characters which would replace those characters as the delimiting set and use the parameter -d for this option.

2.1.5 System should output the average number of words per sentence, rounded down to the nearest integer.

###2.2 Non-Functional Requirements

2.2.1 System must be compatible with Java 1.6 or higher version

2.2.2 System should be executable via command line

2.2.3 System must compile with javac, no options

2.2.4 The system must not depend on any external libraries or code other than the standard JRE.

2.2.5 System must be compatible in a variety of operating systems

2.2.6 System should handle the wordy, lengthy sentences in the essays

2.2.7 System should provide detailed, user-friendly error message for any problems encountered.
