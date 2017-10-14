## ScalaIO 2016 - Lyon, France, October 28

Slides and code for my talk "Beautiful Scala".

This presentation is meant to be run inside the Scala REPL.
To view it, download and save the files `ScalaIO2016.scala`
and `ScalaIO2016.txt` to the same folder and proceed as follows:

```sh
$ scala -Dscala.color -language:_ -nowarn -i ScalaIO2016.scala
Loading ScalaIO2016.scala...
defined class ScalaIO2016

Welcome to Scala version 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_112).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val scalaIO2016 = ScalaIO2016(intp=$intp)
scalaIO2016: ScalaIO2016 = ScalaIO2016(0,0,ScalaIO2016.txt,false,false,scala.tools.nsc.interpreter.ILoop$ILoopInterpreter@5ebe903a)

scala> import scalaIO2016._
import scalaIO2016._

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
