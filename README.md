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
1. Mutable: The variables whose values can be changed.
- example: `var`

2. Immutable: The Variables whose values can not be changed or modified.(Read only).
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
1. Length of the string: This can be done by using the function `.length`
- example:
```scala code
var myVar = "this is variable"
println(myVar.length) // print the length of the variable
```
2. capitalize: This fucntion is used for capitalizing the first letter of string.
- example:
```scala code 
val myName = "harshal"
println(myName)
println(myName.capitalize) // output: Harshal
```
3.toUpperCase: This fucntion is used to capitalizing all the characters of an array.
- example:
```scala code
val myPet = "dog"
println(myPet)
println(myPet.toUpperCase) // output: DOG
```
3. toLowerCase: This function is used for de-capitalizing the characters in a string.
- example: 
```scala code
val myPhone = "Iphone"
println(myPhone)
println(myPhone.toLowerCase) // output: iphone
```
4. Getting character a particular index:
- example:
```scala code
val myPhone = "Iphone"
println(myPhone(3)) // output: o
```
5. charAt: This is also used to print character at the given index in a string.
- example:
```scala code
val myPhone = "Iphone"
println(myPhone.charAt(3)) // output: o
```
6. substring: This is used to break the string from the given index and prints the rest of the string.
- example: substring(start_index, end_index)
```scala code
val myPhone = "Iphone"
println(myPhone)
println(myPhone.substring(2,6)) // output: hone
```
