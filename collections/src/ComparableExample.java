public class ComparableExample implements Comparable<ComparableExample>{

    private String name;
    private int age;

    /*
    This is how we implement a logic for having a natural ordering of objects
    Here we want to return a positive value if this object is greater
    We return a negative value if the other object is greater
    We return 0 if both are equal in terms of sorting (Doesn't mean the objects are equal)
     */
    @Override
    public int compareTo(ComparableExample other) {
        // Let's say we want to compare by age
        // return this.age - other.age; (Not doing this to handle edge cases like Integer overflow)
        return Integer.compare(this.age, other.age);
    }


}
