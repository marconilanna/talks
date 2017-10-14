## Northeast Scala (NEScala) 2015 - Boston MA, January 30

Slides and code for my talk "F-Bounded Polymorphism: Recursive Type Signatures in Scala".

This presentation is meant to be run inside the Scala REPL.
To view it, download and save the files `NEScala2015.scala`
and `NEScala2015.txt` to the same folder and proceed as follows:

```sh
$ scala -Dscala.color -language:_ -nowarn -i NEScala2015.scala
Loading NEScala2015.scala...
defined class NEScala2015

Welcome to Scala version 2.11.5 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_31).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val nescala2015 = NEScala2015()
nescala2015: NEScala2015 = NEScala2015(0,0,NEScala2015.txt)

scala> import nescala2015._
import nescala2015._

scala> h
Usage:
  next          n      >     next slide
  previous      p      <     previous slide
  i next        i n          advance i slides
  i previous    i p          go back i slides
  i go          i g          go to slide i
  first         f      <<    go to first slide
  last          l      >>    go to last slide
  blank         b            blank screen
  help          h      ?     print this help message
scala> f
```
