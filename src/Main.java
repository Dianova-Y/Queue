import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()){
        Person s = queue.poll();
        System.out.println(s + " прокатился на аттракционе");

        //уменьшить кол-во билетов; num =- 1;

        //if (num != 0) {
           queue.offer(s);
           //}
        }

}

    public static List<Person> generateClients() {
        Person person1 = new Person("Петр", "Иванов", 5);
        Person person2 = new Person("Ольга", "Петрова", 2);
        Person person3 = new Person("Николай", "Сидоров", 3);
        Person person4 = new Person("Анна", "Сергеева", 1);
        Person person5 = new Person("Никон", "Корнеев", 4);

        List<Person> generateClients = Arrays.asList(person1, person2, person3, person4, person5);
        return generateClients;

    }


}
