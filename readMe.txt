=============
INTRODUCTION:
=============
This assignment question (to count words in given text file using map reduce technique) is implemented in Java which reads the given text file content of the hadoop file system, counts unique words of the given file using map reduce library and generates the resultant word counts in a file stored in the hadoop file system.


============
SOURCE CODE:
============
Placed the source code in /src folder. Source code comprises 3 .java files namely wcDriver.java, wcMapper.java and wcReducer.java. Using Eclipse IDE, developed the Jar with these 3 .java file and the necessary hadoop and mapreduce libraries. 


============
COMPILATION:
============
Using Eclipse IDE's export option, generated the jar file and stored that as assignment2_wordcount.jar in C:\Users\browser\eclipse-workspace\Assignment2\ directory.


==========
EXECUTION:
==========
Hadoop is already running in the server. Created a text document having random text in local OS file system and then pushed that text file to hadoop file system using the 'hadoop dfs -copyFromLocal C:\Users\browser\Downloads\inputWords.txt .' command.

Later executed the jar using the 'hadoop jar C:\Users\browser\eclipse-workspace\Assignment2\assignment2_wordcount.jar wcDriver inputWords.txt wcOutput' command.

The successfully executed jar has created a directory in the hadoop file system with the given name (i.e., wcOutput). The created wcOutput directory in hadoop FS, got populated with the output file with the 'wcOutput/part-00000' name.  Upon listing the 'wcOutput/part-00000' using 'hadoop fs -cat wcOutput/part-00000' command, it listed the output onto monitor.

