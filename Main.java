import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
  static ArrayList<People> people;
  static String filename;
  static FileReader myFile;

public static void main(String[] args) {
  person = newArrayList<Person>();
  filename = "data.txt";

  String person = "",age = "", color = "";

try{
myFile = new FileReader(filename);
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()){
  person = reader.readLine();
  age = reader.readLine();
  color = reader.readLine();
  System.out.println(person + "\t" + age + "\t" + color);

  Person thePerson = new Person(person, Integer.parseInt(age), color);
}
reader.close();
} catch (IOException exception) {
System.out.println("An error occurred: " + exception);
}

for(int i=0; i<person.size(); i++) {
  System.out.printf("%-25s %-20s %-20s %n", persons.get(i).getPerson(), persons.get(i).getAge(), person.get(i).getColor());
}
System.out.printf("%-25s %-20s %-20s %n", person, age, color);

FileWriter toWriteFile;
try
{
toWriteFile = new FileWriter("data.txt");
BufferedWriter output = new BufferedWriter(toWriteFile);

output.write("Data");
output.newLine();
output.write(Integer.toString(100));
output.newLine();
output.flush();
output.close();
}
catch (IOException excpt)
{
excpt.printStackTrace();
}
}
}