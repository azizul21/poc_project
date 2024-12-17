package org.example;

public class Person {

    private String name;
    private String gender;
    private boolean isMarried;
    private String add_city;
    private String add_state;
    private String add_country;

    private Person(AddressWithBuilder address){
        this.name = address.name;
        this.gender = address.gender;
        this.isMarried = address.isMarried;
        this.add_city = address.add_city;
        this.add_country = address.add_country;
        this.add_state = address.add_state;
    }

    public static class AddressWithBuilder{
        private String add_city;
        private String add_state;
        private String add_country;
        private String name;
        private String gender;
        private boolean isMarried;

        public AddressWithBuilder(String add_city, String add_state, String add_country) {
            this.add_city = add_city;
            this.add_state = add_state;
            this.add_country = add_country;
        }

        public AddressWithBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AddressWithBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public AddressWithBuilder setMarried(boolean married) {
            this.isMarried = married;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", isMarried=" + isMarried +
                ", add_city='" + add_city + '\'' +
                ", add_state='" + add_state + '\'' +
                ", add_country='" + add_country + '\'' +
                '}';
    }



}
