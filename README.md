Scratch Archetype
============================

Quickly setup a Maven artifact that includes: 

- A pom that
   - sets the java compiler to 1.6
   - sets UTF-8 as the project encoding
   - adds JUnit as a dependency.
- A basic .gitignore
- A basic README.md (and disclaimer)
- Basic Java Class and JUnit Test

This is for creating a quick-and-dirty Maven project that includes just enough to start
coding. A Java scratchpad if you will.

Inspried by the [mapreduce-archetype][1]

[1]: https://github.com/drewfarris/mapreduce-archetype

Install
----------------------------

You install the archetype on your own box by cloning the repo and running 
the Maven installer. Like this: 

    git clone git://github.com/drewfarris/scratch-archetype.git 
    cd scratch-archetype
    mvn install
    
Usage 
-----------------------------

Once installed on your own box you quickly create your own simple java project
like this:

    mvn archetype:generate -DarchetypeCatalog=local

this starts an interactive session where you enter: 

 - the number of the scratch-archetype
 - group id, artifact id and version
 - a java package
 - the name of your main class
 
Run `mvn package` to build your project.

Example run
-----------------------------
 The example below creates a project directory in `~/src/scratch`
 
Sample run: 

