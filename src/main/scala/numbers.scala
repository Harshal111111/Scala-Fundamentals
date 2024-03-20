@main
def numbers(): Unit = {

  val number1 = 33.22
  println(number1.getClass) //double
  val number2 = 34
  println(number2.getClass) //int
  val number3 = 80000000000l // l is used to remove the number is to large error. o/p = long
  println(number3.getClass)
  val number4 = 34.34f
  println(number4.getClass) //float
  val number5 = 20_000_000
  println(number5.getClass) //int
}