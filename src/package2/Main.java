package package2;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Şeyma Yılmaz on 2.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        HashSet<Person> hashSet = new HashSet<>();
        
        Person person1 = new Person("Şeyma Yılmaz", 23);
        Person person2 = new Person("Burak Köken", 22);
        Person person3 = new Person("Berkan Yılmaz", 22);
        Person person4 = new Person("Berkan Yılmaz", 22);
        Person person5 = person3;

        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person5);

        System.out.println();


    }
}
