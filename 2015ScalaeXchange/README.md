## Scala eXchange 2015 - London, United Kingdom, December 10

Slides and code for my talk "Idiomatic Scala: Your Options Do Not Match".

This presentation is meant to be run inside the Scala REPL.
To view it, download and save the files `ScalaeXchange2015.scala`
and `ScalaeXchange2015.txt` to the same folder and proceed as follows:

```sh
$ scala -Dscala.color -language:_ -nowarn -i ScalaeXchange2015.scala
Loading ScalaeXchange2015.scala...
defined class ScalaeXchange2015

Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_66).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val scalaeXchange2015 = ScalaeXchange2015(intp=$intp)
scalaeXchange2015: ScalaeXchange2015 = ScalaeXchange2015(0,0,ScalaeXchange2015.txt,false,false,scala.tools.nsc.interpreter.ILoop$ILoopInterpreter@46394f65)

scala> import scalaeXchange2015._
import scalaeXchange2015._

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
