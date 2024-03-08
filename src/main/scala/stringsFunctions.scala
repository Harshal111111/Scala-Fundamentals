@main
def stringsFunctions(): Unit = {
  val myPet = "dog"
  println(myPet.length) // used to print length of the string

  // positions always starts at 0.
  println(myPet(2)) // used to print the character at that position.
  val myName = "harshal"
  println(myName.capitalize) // used for capitalizing the first letter.
  val myName1 = "HArshaL"
  println(myName1.toLowerCase) // used for lower casing all the letters.
  println(myName1.toUpperCase) // used for capitalizing all the letters.

  val myText = "     Hello I have to many spaces      "
  println(myText)
  println(myText.trim) // used to remove spaces (start and end spaces).

  val myPhone = "Iphone"
  println(myPhone.substring(2,6))
}