@main
def change_age(): Unit = {
  var age = 10
  var new_age = 0
  println(age)
  new_age = age+1
  println(new_age)

  var var = 10 //error
  var println = "cat" // Ok but don't use.
}