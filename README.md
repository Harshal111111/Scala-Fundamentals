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
if a variable is integer and we want to change it to string this is not possible.

#### Types of Varibales:
1. Mutable: The variables whose values can be changed.
- expample: `var`
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
  -example:
  ```scala code
  var myVar = "this is variable"
  println(myVar.length) // print the length of the variable
```