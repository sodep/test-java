Ejercicio para evaluación de candidatos para Developers Java
===========================================================

Descripción del Proyecto
------------------------

Esta aplicación es para un manejador de tareas. Actualmente, la aplicación
lee una lista de tareas de una base de datos relacional y la presenta en una
página.

El resto de esta documentación se escribe en inglés con propósitos de evaluar
la comprensión del idioma de los participantes.

Your Tasks
-----------

## Backend Tasks

Add a REST web service for querying, adding, updating and removing tasks.
The service should respond to the following URLs:

*   `api/tasks` - list all tasks; optionally 
*   `api/tasks` - list tasks accepting query parameters for
     pagination and filters, for example to filter all 'completed' tasks.
*   `api/tasks` - create a new task
*   `api/tasks/<id>` - retrieve details of the task identified by *id*
*   `api/tasks/<id>` - update the existing task identified by *id*
*   `api/tasks/<id>` - delete the existing task identified by *id*

## Bugs to Fix

*   When you run the project (see section below), and you access
    to `http://localhost:8080/`, you will see the column 'Assignee' with `none`
    values for every row. 
    
    This is a BUG in the provided code base. Some tasks do have assignee and the columns
    for those tasks should not be empty. 
    
    Your task here is to fix the bug with as few lines of code as possible.

## Easy Tasks

Write an utility class with the following methods:

*   A method that returns `true` if a given `Task` was completed.
*   A method that returns `true` if a given `Task` was completed BEFORE its due date.
*   A method that returns `true` if a `Task` due date has expired.
*   A method that returns `true` if a `Task` due date has expired and the `Task` was not completed.  
*   Write UNIT tests for the utility class and its methods.

## Frontend Tasks

*   When you build and run the project (see section below), you will
    have access to the URL `http://localhost:8080/tasks.html`. There 
    you will see a page that allows the user to create, list and mark tasks 
    as completed. 
    
    This page stores information about the tasks only client-side by using 
    the [browser localStorage](http://www.w3schools.com/html/html5_webstorage.asp). 
    
    Your task here is to connect the JavaScript code with the REST services 
    added to the backend, by using AJAX requests. 
    
    To give an example, when you add a new task in the page, the REST URL to add 
    new tasks should be invoked with an AJAX request in order to store the new task 
    in the backend database. 
    
    Similar operations should be implementend in JavaScript to list or update the tasks, 
    and also when you "clear completed" tasks.

## General guidelines

The URLs for the REST services should have the appropiate HTTP verb regarding each operation.

The services MUST accept and return resources in JSON format. Design the 
JSON schema you feel is appropriate given the existing data structure.

Add any necessary unit or integration tests.

You may use any IDE or text editor you are comfortable with.  You are
encouraged to add any open source third-party library (must be available on
Maven Central) that you feel makes your task easier.


Evaluation Criteria
-------------------

1.  Correctness of solution

    Naturally, the project you submit must be functional.  You will also be
    evaluated on *how* your solution addresses the assigned tasks.  

2.  Platform knowledge

    Does your code demonstrate your knowledge of the capabilities of the
    Java platform and its resources?

3.  Coding style

    Is your coding style neat?  Does it fit in with the prevailing style of
    the project?  Is it idiomatic such that it will be easily understood by
    other Java developers?  Is it adequately (but not excessively)
    commented?

4.  Understanding the specification

    You should be able to complete the tasks by reading the specification
    in this README and building the solution as the specification is asking.


Getting Started
---------------

### Clone the project to your local machine

You are probably reading this on GitHub already.  If not, you can find the
project [on GitHub](https://www.github.com/rodrigojv/test-java).

To begin work on the project, start by cloning the repository to your local
machine.  Do your work locally, committing your changes to your local git
repository as you go.


### Building the project

The project includes a pom.xml file allowing it to be built by
[Maven](http://maven.apache.org).  Simply running `mvn package` will
download all dependencies and build a standard JAR file.


### Managing the database

The project uses an [H2 Database](http://www.h2database.com) which is a
simple in-process file-backed data store.  This saves the trouble of
configuring a database server.

The project tables are created and populated when you run the project
with maven.

Running the project will create a database file in the project root directory 
called `development.h2.db` (there may be other, similarly named, supplemental
files). Running the project will also create the two project tables, and populate
them with some sample data.  

If you ever need to reset the database to its default state, simply
delete the development.\*.db files and run the project again.

If you require changes to the database schema, just change the classes
annotated with `@Entity` (or create a new one) and run the project. This
will apply the changes to the database.


### Running the application

You can run the project inside a Tomcat container using this command:

    mvn spring-boot:run

This starts a Tomcat server on your local machine listening on port 8080.  To
see the application's home page, point your browser to
`http://localhost:8080/`.  This page shows a list of tasks in the tasks
database.


Submitting Your Code For Evaluation
-----------------------------------

When you are finished and ready to submit your work, commit your changes
and use the following command to generate a series of patch files with all 
of your changes:

    git format-patch origin/master

This will create one or more numbered patch files.

Send an email with the patch files attached to the person who sent you this
test.
