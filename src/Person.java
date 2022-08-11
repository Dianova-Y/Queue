public class Person {
    protected String name;
    protected String surname;
    protected int ticked;

    public Person (String name, String surname, int ticked){
        this.name = name;
        this.surname = surname;
        this.ticked = ticked;
    }

    public void spent() {
        ticked -= 1;
    }

    public String toString() {

        return name + " " + surname + " " + ticked + " шт.";
    }
}
