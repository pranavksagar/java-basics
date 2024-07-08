import java.util.Comparator;

public class ComparatorExample implements Comparator<Person> {

    /*
    A Comparator class is a third party class to compare two instances of a given Object in a specific way. For example this is a name comparator
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
