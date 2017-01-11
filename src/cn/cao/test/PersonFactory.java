package cn.cao.test;

/**
 * Created by hasee on 2017/1/8.
 */
interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}

class test01{
    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory=Person::new;
       Person p=   personPersonFactory.create("a","v");
    }

}
