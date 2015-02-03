# **Project Plan -- Team 18**
-------------------------
##1 Introduction

In our first project, team-18 will develop a software program that helps instructor Lauren's writing class. Lauren is our client who requested a software tool for her teaching purposes. She is an instructor at a university nearby Udacity and she is teaching a class which requires her students to write essays. Her students have written very long and wordy sentences in their essays, so Lauren wants to help her students improve their writing styles. Therefore, she came to the Udacity and asked for help in developing a software tool to track the length of sentences in her students' essays.
Our team-18 will take these requirements and develop a software tool that counts the average number of words per sentence in a file. The program is intended to be used by a large number of students (up to 270) using a variety of computer platforms and with varied technical backgrounds from not very technical to very technical.

We will write the program in Java. We are planning to test the program on a machine with a vanilla installation of Java 1.7. The program will compile on the command line using the javac command without any additional options. The source code will include all code required to execute the program that is not part of the standard JDK. The program is an application that it has a main method and should be executable from the command line using the java command. The user will be able to provide a file path to the file they wish to be analyzed as a command line argument. the user will also be able to provide the specific characters that will be recognized as sentence delimiters, using the flag -d and the user will be able to provide a lower limit for word length, using the flag -1.  If these parameters are not specified, reasonable default values provided by Lauren will be used. Finally, the program will provide an integer output for the length of the average sentence in the file. 

##2 Process Description

This project will be planned and executed using a waterfall development methodology.  The process will include the following activities:

###2.1 Requirements gathering and definition
User and system requirements will be collected, analyzed, documented, and reviewed by the team.  The initial set of requirements will come from the problem specification provided, but this initial requirement list will be iteratively refined and improved based on Q & A interviews with the relevant stakeholders, in this case Lauren.
- **Entrance criteria**
- Initial requirements received, stakeholder(s) identified, stakeholder interviews planned/scheduled
- **Exit criteria**
- Stakeholder interview completed, requirements and stakeholder answers analyzed, requirements documented, requirement document reviewed and approved by team members

###2.2 Software Design
Documented requirements will be used as the basis for creating a design for the software.  The design will include architecture, user interface design, and technical design details sufficient for developers to implement software that is compliant with all specified requirements.
- **Entrance criteria**
- Requirements specified and approved
- **Exit criteria**
- Software design specification created, reviewed, and approved by team members (depending on project complexity, there may or may not be formal documentation)

###2.3 Software Implementation
Developers will implement production code per the approved design and will write unit tests to ensure that programming units behave as intended.
- **Entrance criteria**
- Software design completed and agreed upon, developer resources assigned and available
- **Exit criteria**
- Software program completely implemented according to the design and all unit tests pass

###2.4 Verification and Validation
Software will be tested to validate that it meets all of the specified requirements and to verify that it operates correctly and robustly.  The software will be tested for requirements compliance, proper operation, correctness of output, and reliability/robustness of operation.
- **Entrance criteria**
- Software implementation completed, testers assigned and available, test plan/test cases created and approved
- **Exit criteria**
- Software testing completed, all tests pass or any exceptions have been reviewed and approved, customer, user documentation created, acceptance criteria are met and customer accepts the software (if applicable, customer acceptance is not always required depending on the project)

###2.5 Maintenance
After software has been released, it will continue to be modified throughout its lifetime for various reasons: to add additional features, to fix bugs that are discovered after release or reported from the field, etc.  Whilel this is an important activity in the lifecycle of real-world software systems, it is beyond the scope of this project.
- **Entrance criteria**
- Software released
- **Exit criteria**
- Software end of life or end of support obligation
 
 
##3 Team

Describe the team and their roles (there may be more roles than there are team members)

####Team members' names: 
- Mark Smith, Dom Roselli, Aaron Reed, Zhoujian Hu

####Roles: 
- **Project Manager**: initialization of the project, coordination and tracking, pushing project to the remote depository on GitHub;
-  **Development Lead**: lead and coordinate software development, assign engineering tasks, provide technical guidance to developers;
-  **Documentation Lead**: specify documentation requirements, coordinate writing of documentation, and publish documents;
-  **QA Manager**: manage the quality of document and code testing, ensure that code meets quality requirements and final exit criteria before release
-  **Developer**: write software per requirements specification and under guidance of development lead
-  **Tester**: perform software testing to verify and validate software meets requirements specification and exit criteria

####Team role assignments for Project 1:
| Team Member | Proj Mgr | Dev Lead | Doc Lead | QA Mgr | Developer | Tester |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| Mark Smith  | X | | | | X | X |
| Dom Roselli | | X | | | X | X |
| Aaron Reed  | | | X | | X | X |
| Zhoujian Hu | | | | X | X | X ||

##4 Estimates

Provide estimates for the following metrics:

- Effort hours (total for 4 team members): 80 hours
- Lines of code: total (production code only, excludes test code): approximately 400 lines 
