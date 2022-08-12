public class Person {
    protected String name;
    protected String surname;
    public int ticked;

    public Person(String name, String surname, int ticked) {
        this.name = name;
        this.surname = surname;
        this.ticked = ticked;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicked() {
        return ticked;
    }

    public boolean minus() {
        if (ticked > 0) {
            ticked--;
            return true;
        } else {
            return false;
        }
    }
}


