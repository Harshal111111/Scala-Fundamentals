@main
def stringInterpolation(): Unit = {
  val myName = "Harshal"
  println(s"My name is $myName")
  println(s"I'm ${20+2} years old!!") // we can put any expression here.

  val height = 1.75
  println(f"My height is $height%2.2f meters.")

  println(s"this is a \n new line") // this is generate new line.
  println(raw"this is a \n new line") // this will not generate new line.
}

