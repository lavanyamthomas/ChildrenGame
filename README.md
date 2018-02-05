# Children Circle Game

*n children stand around a circle.
*To play the game there needs to be more than 1 child.
* Starting with a given child and working clockwise, each child gets a sequential
number, which we will refer to as it’s id.
* Then starting with the first child, they count out from 1 until k. The k’th child
is now out and leaves the circle. The count starts again with the child
immediately next to the eliminated one.
* k can be larger than or less than the number of children
* Children are so removed from the circle one by one. The winner is the child
left standing last.


###Prerequisites

Java 1.8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
Maven 3 (http://www.sonatype.com/books/mvnref-book/reference/installation.html)
git command line tool (https://help.github.com/articles/set-up-git)


###Project from GIT Repo

git clone https://github.com/lavanyamthomas/ChildrenGame.git

###Setup application in Eclipse (Spring Tool Suite)

Working with Children Circle Game in Eclipse/STS

Note : Eclipse will create the needed .project, .settings, .classpath files based on your pom.xml and environment settings (installed Java version, etc.) . The earlier versions of Eclipse needed to have run the command mvn eclipse:eclipse which produced the same result.

Import as Existing Maven Project and run it as maven Application.
mvn(Maven) clean via eclipse
mvn(Maven) install via eclipse
 
### Run application from eclipse

 *ChildrenGameMain.java* run as java application
 
### Run application from command line
 
 mvn clean install
 get the *ChildrensGame-0.0.1-SNAPSHOT.jar* under target folder
 execute the app suing the following command
 *java -jar ChildrensGame-0.0.1-SNAPSHOT.jar*
 