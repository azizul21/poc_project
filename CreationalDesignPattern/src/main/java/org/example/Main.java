package org.example;

import org.example.interfaces.Route;

public class Main {
    public static void main(String[] args) {

        System.out.println("Singleton Example ==============");
        SingletonExample.getGlobalInstance().testMethod();

        System.out.println("Factory Example ==============");
        Route r = new FactoryDesignExample().getRoute("ROAD");
        System.out.println("Factory  ======::"+r.message());

        System.out.println("Builder Pattern Example ==============");
        Person person = new Person.AddressWithBuilder("Kolkata","West Bengal","India")
                .setName("Aziz")
                .setGender("Male")
                .setMarried(true)
                .build();

        System.out.println(person);

        System.out.println("Prototype Example ==============");
        PrototypeExample prototypeExampleOri = new PrototypeExample("Azizul","Haque");
        System.out.println("Original Prototype =============="+prototypeExampleOri);
        PrototypeExample cloneOne = (PrototypeExample) prototypeExampleOri.clone();
        System.out.println("Original Prototype =============="+cloneOne);

    }
}