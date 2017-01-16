package cn.cao.test;

/**
 * Created by hasee on 2017/1/8.
 */
interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}

class test01 {
    public static void main(String[] args) {
   /*     PersonFactory<Person> personPersonFactory=Person::new;
       Person p=   personPersonFactory.create("a","v");*/

        byte by = 99;
        short so = 2;
        char c = 'c';
        int i=5;
        long l=1234562113;
        float f=100.01f;
        double d=100.01;

        char  s= (char) by;
//        System.out.println(s);

        float f1=100.1f;
        Float f2=new Float(f1);
        double d1=f2.doubleValue();

        String s1="2";
        Character character=new Character('4');
    }

}
