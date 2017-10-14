## Scala Up North 2015 - Toronto, Canada, September 25

Slides and code for my talk "Powerful and Elegant Scala One-Liners".

This presentation is meant to be run inside the Scala REPL.
To view it, download and save the files `ScalaUpNorth2015.scala`
and `ScalaUpNorth2015.txt` to the same folder and proceed as follows:

```sh
$ scala -Dscala.color -language:_ -nowarn -i ScalaUpNorth2015.scala
Loading ScalaUpNorth2015.scala...
defined class ScalaUpNorth2015

Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_60).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val scalaUpNorth2015 = ScalaUpNorth2015(intp=$intp)
scalaUpNorth2015: ScalaUpNorth2015 = ScalaUpNorth2015(0,0,ScalaUpNorth2015.txt,false,false,scala.tools.nsc.interpreter.ILoop$ILoopInterpreter@26c8b296)

scala> import scalaUpNorth2015._
import scalaUpNorth2015._

scala> h
Usage:
  next          n      >     go to next build/slide
  previous      p      <     go back to previous build/slide
  redraw        z            redraw the current build/slide
  Next          N      >>    go to next slide
  Previous      P      <<    go back to previous slide
  i next        i n          advance i slides
  i previous    i p          go back i slides
  i go          i g          go to slide i
  first         f      |<    go to first slide
  last          l      >|    go to last slide
  Last          L      >>|   go to last build of last slide
  run           r      !!    execute code that appears on slide
  blank         b            blank screen
  help          h      ?     print this help message
scala> f
```

For more information about the presentation tool, visit https://github.com/marconilanna/REPLesent
