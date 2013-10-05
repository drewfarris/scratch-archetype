Scratch Archetype
============================

Quickly setup a Maven artifact that includes: 

- A pom that
   - sets the java compiler to 1.6
   - sets UTF-8 as the project encoding
   - adds JUnit as a dependency.
- A basic .gitignore
- A basic README.md (and disclaimer)
- Basic Java Class with JCommander command-line parsing 

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
 The example below creates a project directory in `~/src/sample-scratch`
 
Sample run:
 
    mybox:~$ cd ~/src
    mybox:~/src$ mvn archetype:generate -DarchetypeCatalog=local
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] Building Maven Stub Project (No POM) 1
    [INFO] ------------------------------------------------------------------------
    [INFO]
    [INFO] >>> maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom >>>
    [INFO]
    [INFO] <<< maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom <<<
    [INFO]
    [INFO] --- maven-archetype-plugin:2.2:generate (default-cli) @ standalone-pom ---
    [INFO] Generating project in Interactive mode
    [INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
    Choose archetype:
    1: local -> drew:mapreduce-archetype (mapreduce-archetype)
    2: local -> drew:scratch-archetype (A simple java project archetype. Use this for a starting point
        for a simple java project, with reasonable defaults.)
    Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 2
    Define value for property 'groupId': : drew
    Define value for property 'artifactId': : sample-scratch
    Define value for property 'version':  1.0-SNAPSHOT: :
    Define value for property 'package':  drew: :
    Define value for property 'scratch-base-name': : Sample
    Confirm properties configuration:
    groupId: drew
    artifactId: sample-scratch
    version: 1.0-SNAPSHOT
    package: drew
    scratch-base-name: Sample
     Y: :
    [INFO] ----------------------------------------------------------------------------
    [INFO] Using following parameters for creating project from Archetype: scratch-archetype:1
    [INFO] ----------------------------------------------------------------------------
    [INFO] Parameter: groupId, Value: drew
    [INFO] Parameter: artifactId, Value: sample-scratch
    [INFO] Parameter: version, Value: 1.0-SNAPSHOT
    [INFO] Parameter: package, Value: drew
    [INFO] Parameter: packageInPathFormat, Value: drew
    [INFO] Parameter: package, Value: drew
    [INFO] Parameter: version, Value: 1.0-SNAPSHOT
    [INFO] Parameter: groupId, Value: drew
    [INFO] Parameter: scratch-base-name, Value: Sample
    [INFO] Parameter: artifactId, Value: sample-scratch
    [INFO] project created from Archetype in dir: /Users/andrewfarris/src/sample-scratch
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 17.459s
    [INFO] Finished at: Fri Oct 04 22:16:20 EDT 2013
    [INFO] Final Memory: 7M/81M
    [INFO] ------------------------------------------------------------------------
