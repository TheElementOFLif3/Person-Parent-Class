# Person-Parent-Class
Text parsing

The following String representing the data of three persons is given:

String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow".


It is necessary to create a logic that will extract individual data from this record:

Name;
surname;
place of birth.

In other words, it is necessary to process the displayed String using methods of the String class and extract the individual data of each person. The basic method that needs to be used is that of dividing Strings into multiple parts.

The obtained individual parts (name, surname, city) must be used to create objects of the Person type. Therefore, it is necessary to create the Person class in the program, as well as adequate fields within it (name, surname, city). So, in the Person class there should be three properties and a constructor to initialize their values.

All objects representing persons need to be packed into one array (the array should be of type Person[]). In order to make sure that everything is done correctly, at the end it is necessary to go through the series of objects and print the data about the people. The following printout should be obtained at the output:

John Davidson Belgrade
Michael Barton Krakow
Ivan Perkinson Moscow


In short, the program flow should be like this:

split the given String into multiple parts to get first names, last names and cities;
use the obtained data to create three objects of the Person type;
you place the obtained objects of the Person type inside a Person[] array;
finally, you loop through the person array and display their data on the output.
