Scala thoughts!

List manipulation was really easy, because it always broke down into some
combination of built-in functions. More generally, anything that broke down
into builtins or builtins and recursion was really nice.

We really liked the automatic typing of values.  It was really convenient to
let Scala figure out the types for us.  It also wasn't very annoying when we
did have to annotate things with types - type annotations worked very nicely.

It was really annoying not to be able to loop over lists, or loop over something
and break out if a case was met.  Some of the examples would have been easier
with looping instead of folding or reducing or recursion.  Though functional
programming is really nice, this is one of the downsides of it.  The limitation
of not having looping constructs is one of the difficult things about Scala,
because you have to work around it with recursion and other functions.

It's really nice that Scala is functional by default.  All of the functional
features were really easy to access and use.

We also liked the ability to define functions inside other functions, and the
ability to create lambda functions whenever we needed them.

Though we didn't make use of it, we appreciated that we could use any Java
library we wanted in Scala because they both compile to the JVM.

It was mildly annoying to have to create lists by wrapping something in List[]
instead of just being able to wrap something in brackets directly (which
Haskell can do, we believe).  We think this was done so that square brackets
could be reserved for parameterizing on a type.

It was mildly annoying to have to use parenthesis to index into lists, and
annoying to have to use special functions to index into tuples.  We think
parenthesis indexing was chosen so that bracket notation could be used to
indicate parameterizing on a type for a function.  We think the special
functions for tuples are there because they are auto-generated based on the
size of the tuple.  Also, because tuples are different than lists in functional
programming and are usually treated differently.

We would like to better learn how fold/foldl/foldr work, and how to use them
effectively.  We know that you can do a lot with fold and feel like we only
scratched the surface in these labs.

We would like to learn more about the philosophy of Scala and why it was
designed like it was.  We have been speculating on why things were designed
like they were, and it would be nice to actually know why choices were made.
We would also like to know how closely our approaches to these examples were in
line with Scala philosophy and proper Scala programming.
