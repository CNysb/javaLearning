package basic.classAndObject;

public class execute {
    public static void main(String[] args) {
//        Person aa = new Person.Builder().age(11).name("aa").build();
//        System.out.println(aa.getName());
//        Animal aa = new Animal("aa", 11);
        Teacher t = Teacher.builder().age(11).name("teacher").subject("sub").build();
        System.out.println(t.getAge());
    }
}
