# Assignment 1: Practice Scala
###### _Submission deadline: Monday, Sept. 15 at 11:59pm_
###### _Critique deadline: Wednesday, Sept. 17 at noon_

The assignment is a modified version of the
[Scala Labs](http://scala-labs.github.io/) project.<sup>1</sup> The goal of this
assignment is to help you become familiar with Scala and the development tools
we'll be using this semester. When you're done, you should feel good about:

- the basics of scala: variables, data structures, functions, classes, tests

*<sup>1</sup> Normally, it would be good practice to fork the 
[Scala Labs repository](https://github.com/scala-labs/scala-labs/), then modify
the fork. But I didn't want our pull requests to accidentally go to Scala Labs,
so I cloned the lab instead. We'll do only a small part of the lab, but I
included all the parts in our repository, in case you want to do more than is
required.*

## Instructions
**Read the WHOLE document (and the linked pages) very carefully, before you
start coding.**

Here's what to do:

- Get things set up
  - [ ] Make your team on GitHub.
     1. Go to the [team sign-up page](https://github.com/hmc-cs111-fall2014/practice-scala/wiki/Team-sign-ups)
     2. Add your and your partner's names to the table. Erase your names from below the table.
  - [ ] Get your team's copy of the assignment.
     1. *One* of the partners should fork this assignment. This will be the fork to which you both contribute and the fork from which you issue the pull request. (But, of course, you may each have your own clones.)
     2. The partner who forked should make sure that the other partner has access to the fork. 
        1. On the fork's page, click  Settings (on the right-hand side).
        2. Click on Collaborators (on the left-hand side).
        3. Add your partner's GitHub ID as a collaborator.
     3. Both partners should be able to push to and pull from the fork.

- Work on the assignment
  - [ ] Read the lab instructions, hints, and tips, below.
  - Do the following labs (it's probably best to do them in the following order)
     - [ ] Basic lab 1, `HelloWorldExercise`
     - [ ] Basic lab 1, `OOExercise`
     - [ ] Basic lab 2, `ListManipulationExercise01`
     - [ ] Basic lab 2, `ListManipulationExercise02`
     - [ ] Basic lab 2, `CollectionExercise01`
     - [ ] Basic lab 3, `PatternMatchingExercise`
     - [ ] Basic lab 3, `RecursionPatternMatchingExercise`
     - [ ] Basic lab 3, `OptionExercise`
  - [ ] Review the solutions included with the lab
  - [ ] Review Ben's solutions (some of which are different)
  - [ ] Write about Scala in `scala-thoughts.md`

- Submit the assignment 
  - [ ] Submit your work (by issuing a pull request).
  - [ ] Review and comment on other teams' code. 

## Lab instructions, hints, and tips

### Loading project into ScalaIDE
If you want use ScalaIDE to work on your project, **run `sbt eclipse` in the `labs` subdirectory**, then import the project, as usual.

### Basic Lab 1

The following readings could be helpful for this lab:

-   *Scala for the Impatient* Chapter 1
-   *Scala for the Impatient* Sections 6.1--6.4 (companion objects)
-   *Scala for the Impatient* Sections 5.1, 5.2, 5.6, 5.7 (classes)
-   *Scala for the Impatient* Sections 6.1--6.4 (companion objects)
-   [Scala string interpolation](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
-   The comments in the lab files

Here's how to do the lab:

1.  Run tests for `src/test/scala/org/scalalabs/basic/lab01`
  -   In ScalaIDE, right-click and select `Run as Scala JUnit test`

2.  Fix the broken tests by modifying the files in `src/main/scala/org/scalalabs/basic/lab01`

Hints and tips:

-   `HelloWorldExercise`
  -   These tasks are easy. The goal is to become familiar with the tools. Be sure to read the comments in the files.
-   `OOExercise`
  -   All the tests will pass initially. Read the `OOExercise.scala` file for instructions, then modify `OOExerciseTest.scala` as you go along.
  - It's difficult to find documentation for Scala string interpolation. To format a string with a variable whose value is an integer and which should be represented using two digits, use: `f"$varName%02d"`

### Basic Lab 2

The following readings could be helpful for this lab:

-   [Scala Collections](http://docs.scala-lang.org/overviews/collections/introduction.html)
    -   Note: the online documentation is more up-to-date than the book
-   *Scala for the Impatient* Sections 12.1--12.2 (anonymous functions, i.e., lambdas)

Hints and tips:

-  `ListManipulationExercise01`
  -   Many of these can be solved using built-in [collection methods](http://docs.scala-lang.org/overviews/collections/introduction.html). Use the documentation to find these simple solutions first. You can always come back to try some of the more complicated solutions hinted at in the comments.

- `ListManipulationExercise02`
  -   `map` and `reduce` are your friends on a couple of these tasks
  -   Some solutions might need an empty list of integers. Here's how you create one: `List.empty[Int]`

- `CollectionExercise01`
  -   Remember: built-in methods are your friends!

### Basic lab 3

The following readings could be helpful for this lab:

-   *Scala for the Impatient* Sections 14.1--14.5 (pattern matching)
-   [The Neophyte's Guide to Scala](http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html) (`Option`s)

Hints and tips:

- `RecursionPatternMatchingExercise`
  - Many of the solutions to these tasks have the same structure.
  - Find a built-in method that does most of the work.

### Write about Scala
Take about 20 minutes to collect and write about your initial impressions of
Scala. Some possible topics include: 

  - What's easy to do in Scala? What's not?
  - What is/are your favorite language design choice(s) that the designers of Scala 
  made? Why?
  - What is/are your least favorite language design choice(s)? Why? And why do
  you think the designers made that / those choice(s)?
  - What Scala features would you like to learn more about?

## Peer-review other teams' work
Comment on at least two other teams' work. You should look through their
solutions to each of the exercises, as well as their `scala-thoughts.md` file.
You don't need to comment on everything, but find some interesting parts of
their work to evaluate. Some questions you might consider / answer when 
providing feedback:

  - How does this team's solution compare to yours? To the provided solutions?
  To other people's solutions? Is there anything they did that you like better?
  Is there any way to improve their solution?
  - How readable is their code? How elegant is their solution? If you think it's
  inelegant, was that because the team was trying to show an alternative
  solution?
  - How Scala-y is the code? Most of us are just learning the language, and we
  can help each other spot cases when a functional approach would have worked in
  place of an imperative one, etc.
  - If a team has raised a question in the comments of their code, or in their
  writings about Scala, try to answer it!
