** Readme **

### Strings:
A string is a chain of zero or more characters surrounded by double quotes.

```scala code
print("Cat \n") // \n is used for new line\
print("Dog")
print("this is also a string #$$#@ 1123 21 ^&*")
print(" ") //empty string
```
refer: `src/main/scala/strings.scala`

### Variables:
A variable is like a container for data.

##### Creating or Assigning a variable in scala:
``` Scala code
var variable1 = "XYZ"
var variable2 = 10
```
we can change variables of same type.
for example:
if a variable is integer, and we want to change it to string this is not possible.

#### Types of Variables:
1. **Mutable**: The variables whose values can be changed.
- example: `var`

2. **Immutable**: The Variables whose values can not be changed or modified.(Read only).
- example: `val`

### Naming Conventions for Variables:

1. Names can contain letters, numbers and underscores(_).
2. Names must start with a letter or underscore.
3. Names can be anything accept scala keywords.
4. Names should be descriptive not too short not to long.
5. Names should be written in camel case. 
- example: `productPricePerUnit`

### String Functions:
- The functions which we can apply to our strings.
1. **Length of the string**: This can be done by using the function `.length`
- example:
```scala code
var myVar = "this is variable"
println(myVar.length) // print the length of the variable
```
2. **capitalize**: This fucntion is used for capitalizing the first letter of string.
- example:
```scala code 
val myName = "harshal"
println(myName)
println(myName.capitalize) // output: Harshal
```
3.**toUpperCase**: This fucntion is used to capitalizing all the characters of an array.
- example:
```scala code
val myPet = "dog"
println(myPet)
println(myPet.toUpperCase) // output: DOG
```
3. **toLowerCase**: This function is used for de-capitalizing the characters in a string.
- example: 
```scala code
val myPhone = "Iphone"
println(myPhone)
println(myPhone.toLowerCase) // output: iphone
```
4. **Getting character a particular index**:
- example:
```scala code
val myPhone = "Iphone"
println(myPhone(3)) // output: o
```
5. **charAt**: This is also used to print character at the given index in a string.
- example:
```scala code
val myPhone = "Iphone"
println(myPhone.charAt(3)) // output: o
```
6. **substring**: This is used to break the string from the given index and prints the rest of the string.
- example: substring(start_index, end_index)
```scala code
val myPhone = "Iphone"
println(myPhone)
println(myPhone.substring(2,6)) // output: hone
```
7. **trim**: This is used to remove spaces.
- example: 
```scala code
val myText = "this  contains    to many spac es"
println(myText.trim)
```
also we can find length of the string after removing the spaces.
```scala code
println(myText.trim.length)
```
**note**: we can use combination of the above methods, until its same variable type, and to find the list of functions available for a variable we can just do `mytext.` and this is  will generate whole list of functions available for that particular variable.

### String Interpolation:
String Interpolation simply mean we can insert some other variables or expressions inside our strings.

*In Scala we have 3 types of interpolators* :
1. s
2. f
3. raw: it does'nt really interpolate the strings, like it ignores `\n` and `\\`

- example: 
```scala code 
val myName = "Harshal"
println(s"My name is $myName") // expressions starts with $ sign and can have braces {}
```
```scala code 
val height = 1.75
val formattedString = f"My height is $height%2.2f meters."
```
```scala code
  println(s"this is a \n new line") // this is generate new line.
  println(raw"this is a \n new line") // this will not generate new line.
```
### Multiline Strings:
- There are several ways to create multiline strings:
1. Using `\n`:
```scala code 
val str1 = "this is\na multiline\nstring!!"
println(str1)
```
2. using `"""` operator: 
```scala code 
 val str2 ="""this is a
    multiline
    string"""
println(str2)

val str3 =
  """this is a
    |multiline
    |string
    |""".stripMargin // this is used to remove spaces.
println(str3)
```
### Getting User Input: 
- User input can come from many sources.
1. Through command line:
```scala code
println("Enter your name:")
val input = StdIn.readline()
println(s"Hello ${input}")
```
###### Getting number as a input:
- Inputs a read as strings and can be converted into numbers (integers).
```scala code
val input = StdIn.readline()
val i = input.toInt
```
###### Generating a random number:
```scala code
println(Random.nextInt())
println(s"Random number generated: ${Random.nextInt(1000)}")
println((Random.nextString(30)))
println(Random.nextPrintableChar())
println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
```
###### Types of Numbers in scala: 
```scala code

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
```
