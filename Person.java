class Person {
private String person;
private int age;
private String color;

Person(String aPerson, int Age, String aColor){
  person = aPerson;
  age = aAge;
  color = aColor;

}
String getPerson(){
  return person;
}
int getAge(){
  return age;
}
String getColor(){
  return color;
}
void setPerson(String thePerson){
  person = thePerson;
}
void setAge(int theAge){
  age = theAge;
}
void setColor(String theColor){
  person = thePerson;
}
}