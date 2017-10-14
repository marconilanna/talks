## Scala Toronto - February 4, 2016

Slides and code for my talks "Idiomatic Scala: Your Options Do Not Match"
and "F-Bounded Polymorphism".

The presentations are meant to be run inside the Scala REPL.
To view it, download and save all files to a folder and proceed as follows:

```sh
$ scala -Dscala.color -language:_ -nowarn -i ScalaTor.scala
Loading ScalaTor.scala...
defined class ScalaTor

Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_72).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val scalator = ScalaTor(intp=$intp)
scalator: ScalaTor = ScalaTor(0,0,IdiomaticOptions.txt,false,false,scala.tools.nsc.interpreter.ILoop$ILoopInterpreter@6c951ada)

scala> import scalator._
import scalator._

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

For the second presentation, use `val scalator = ScalaTor(input = "FBounded.txt", intp=$intp)`.

For more information about the presentation tool, visit https://github.com/marconilanna/REPLesent
