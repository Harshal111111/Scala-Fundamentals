@main
def multilineString(): Unit = {
  val str1 = "this is\na multiline\nstring!!"

  println(str1)
  val str2 ="""this is a
    multiline
    string"""
  println(str2)

  val str3 =
    """this is a
      |multiline
      |string
      |""".stripMargin


}