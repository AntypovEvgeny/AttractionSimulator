import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person s = queue.poll();
            if (s.tickets > 0){
                s.tickets--;
                queue.offer(s);
                System.out.println(s.name + " " + s.surname + " прокатился на аттракционе");
            }
        }
    }

    private static List<Person> generateClients() {
        Person person1 = new Person("Olya", "Vlasova", 6);
        Person person2 = new Person("Sveta", "Malinina", 2);
        Person person3 = new Person("Lena", "Nravova", 1);
        Person person4 = new Person("Kolya", "Krasnov", 3);
        Person person5 = new Person("Vera", "Sinikova", 5);
        return Arrays.asList(person1, person2, person3, person4, person5);
    }
}
