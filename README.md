99 Scala problems lab project
=========================

Forked from Amir Moulavi who also used this project to learn Scala.

Intended for educational purpose.

Based on the original 99 Scala problems http://aperiodic.net/phil/scala/s-99/

Content of the 99 problems
------------------------

As described in the original work these areas are covered in the problems

### "Working with lists" (P01-P28)

A common implementation is Recursion i combination with the match case statement.

Where lists should shrink (e.g. compress) then consider foldRight

*Status: all tests exists and all implementations*

### "Arithmetic" (P31-P41)

*Status: P31-P37 implemented *

### "Logic and Codes" (P46-P50)


### "Binary Trees" (P55-P69)

### "Multiway Trees" (P70C-P73)

### "Graphs" (P80-P89)

### "Miscellaneous Problems" (P90-P99)

*Status: Only a few problems are implemented by original project*





Ideas on how to make a lab
------------------------

Meta idea: The purpose of this project is for me to learn Scala. A positive side effect would be to provide a lab that
could help even more people to learn Scala.

Baseline for all ideas: Make it test driven. Define the tests and allow student
to implement code so that tests go green.

All the implementations could have "dummy shells" so that they compile but tests fail.

Lab participants may look at a working implementation if they get stuck (see below for how this could be done).

Hopefully students will also find interesting implementations and they could be committed to the project for others to learn from.



### So how to allow students to verify their attempts or how to assist when stuck?

a) have a working implementation done but commented a few lines down on each implementation class. The student would see
the working code unless deliberately scrolling down a page or two.

b) have a working implementation done in a git branch

c) refer to teh internet where the original S99 project with working code or other variants out there

e) have a working implementation in a git tag while the git head goes on with interesting submissions from students.


Project requirements
------------------

The original goal of the project was to relatively easily come up with a lab to learn Scala. The idea was to leverage
the 99 Scala problems and just provide unit tests for the problems. Of course there could be lot of other material in
the lab so here is a *prioritized* project requirements list to work out of.

1. Provide unit tests for some of the problems in all areas.

2. Provide unit tests for all of the problems.

3. Provide working implementations for most of the problems.

4. Provide means of "hiding" the implementations so that an empty implementation could be empty shells while a solution is
available elsewhere.

5. Provide student aids like hints, references to books and articles and reference sources to assist learning.


Development ideas
-----------------

Reorganize code to follow original project's file structure ( e.g. aperiodic.net/phil/scala/s-99/arithmetic1.scala )

Similar ideas
-------------

Make a lab out of the http://projecteuler.net/problems (in the same way, by providing the unit tests).


