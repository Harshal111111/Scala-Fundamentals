import scala.io.StdIn
import scala.util.Random

@main
def useInput(): Unit = {
//  println("Enter your name:")
//  val input = StdIn.readLine()
//  println(s"Hello ${input}")
//  println("Enter your age:")
//  val input2 = StdIn.readLine()
//  val i = input2.toInt
//  println(s"you are ${i} years old")

  // Generating a random number
  println(Random.nextInt())
  println(s"Random number generated: ${Random.nextInt(1000)}")
  println((Random.nextString(30)))
  println(Random.nextPrintableChar())
  println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
}