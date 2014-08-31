* auto-gen TOC:
{:toc}

# Assignment 1: Practice Scala
The assignment is a modified version of the
[Scala Labs](http://scala-labs.github.io/) project.<sup>1</sup> The goal of this
assignment is to help you become familiar with Scala and the development tools
we'll be using this semester. When you're done, you should feel good about:

- the basics of scala: variables, TODO
- the GitHub workflow for our assignments


*1. Normally, it would be good practice to fork the 
[Scala Labs repository](https://github.com/scala-labs/scala-labs/), and modify
the fork. But I didn't want our pull requests to accidentally go to Scala Labs,
so I copied the lab instead.*

## Instructions
There are four steps to the assignment:

1. Fork the official repository to get the assignment.
2. Work on the assignment.
3. Submit your work via a pull request.
4. Comment on other people's code. 

<p style="color: red">**Read the instructions below very carefully.**</pre> 

You can use this document as a
checklist, if you'd like. Here's how: 

1. After you've forked the repository, open your version of `README.md` in a
text editor.
2. When you see a list that looks like this:

```
- [ ] A task
- [ ] Another task
```

you can check off the things you've done:

```
- [X] A task
- [ ] Another task
```

The list will then show up on the front page of your GitHub repository like this
:

- [X] A task
- [ ] Another task


# Doing the assignment

## Basic labs


### Lab 1

Reading:

-   *Scala for the Impatient* Chapter 1
-   *Scala for the Impatient* Sections 6.1--6.4 (companion objects)
-   *Scala for the Impatient* Sections 5.1, 5.2, 5.6, 5.7 (classes)
-   *Scala for the Impatient* Sections 6.1--6.4 (companion objects)
-   [Scala string interpolation](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
-   comments in the lab files

1.  Run tests for `src/test/scala/org/scalalabs/basic/lab01`
    -   In ScalaIDE, right-click and select `Run as Scala JUnit test`

2.  Fix the broken tests by modifying the files in `src/main/scala/org/scalalabs/basic/lab01`

-   `HelloWorldExercise`
    -   Required:
    -   These tasks are easy. The goal is to become familiar with the tools. Be sure to read the comments in the files.
-   `OOExercise`
    -   All the tests will pass initially. Read the `OOExercise.scala` file for instructions, then modify `OOExerciseTest.scala` as you go along.
    -   It's difficult to find documentation for Scala string interpolation. To format a string with a variable whose value is an integer and which should be represented using two digits, use: `f"$varName%02d"`

### Lab 2

Reading:

-   [Scala Collections](http://docs.scala-lang.org/overviews/collections/introduction.html)
    -   Note: the online documentation is more up-to-date than the book
-   *Scala for the Impatient* Sections 12.1--12.2 (anonymous functions, i.e., lambdas)

Do the labs in this order:

1.  `ListManipulationExercise01`
    -   Many of these can be solved using built-in [collection methods](http://docs.scala-lang.org/overviews/collections/introduction.html). Use the documentation to find these simple solutions first. You can always come back to try some of the more complicated solutions hinted at in the comments.

2.  `ListManipulationExercise02`
    -   `map` and `reduce` are your friends on a couple of these tasks
    -   Some solutions might need an empty list of integers. Here's how you create one: `List.empty[Int]`

3.  `CollectionExercise01`
    -   Remember: built-in methods are your friends!

### Lab 3

Reading:

-   *Scala for the Impatient* Sections 14.1--14.5 (pattern matching)
-   [The Neophyte's Guide to Scala](http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html) (`Option`s)

Do the labs in this order:

1.  `PatternMatchingExercise`
2.  `RecursionPatternMatchingExercise`
    -   Many of the solutions to these tasks have the same structure.
    -   Find a built-in method that does most of the work.

3.  `OptionExercise`

### Lab 4

Optional: You're on your own!

