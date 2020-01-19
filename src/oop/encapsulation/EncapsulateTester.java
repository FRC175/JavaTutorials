package oop.encapsulation;

import oop.encapsulation.Encapsulate;

public class EncapsulateTester {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        obj.setName("_Odell");
        obj.setAge(150);
        obj.setRoll(-5);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll());

        /*obj.name = "156465456s4fa sdfa sdfasdf5464sdf6sa4d";
        obj.age = -10254;
        obj.roll = 8;
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.roll);*/
    }

}
