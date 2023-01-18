public class Main {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] parts = text.split(" ");
        Person[] persons = new Person[parts.length];
        for (int i = 0; i < parts.length; i++) {
            String[] personParts = parts[i].split("/");
            String[] nameParts = personParts[0].split("\\.");
            persons[i] = new Person(nameParts[0], nameParts[1], personParts[1]);
        }
        for (Person person : persons) {

            System.out.println(person.getInfo());
        }
    }
}