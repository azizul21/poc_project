package org.example;

import org.example.interfaces.Prototype;

public class PrototypeExample implements Prototype {

    private String fname;
    private String lname;

    public PrototypeExample(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public Prototype clone() {
        return new PrototypeExample(this.fname,this.lname);
    }

    @Override
    public String toString() {
        return "PrototypeExample{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
