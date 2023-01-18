public class Person {
    String firstName;
    String lastName;
    String city;

    public Person(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;

    }

    public String getInfo() {
        return firstName + " " +  lastName + " " + city;

    }


}