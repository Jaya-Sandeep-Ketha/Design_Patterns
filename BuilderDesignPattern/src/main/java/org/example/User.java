package org.example;

public class User {
    public String name;
    public String email;
    public int age;
    public String address;
    public boolean isPremiumUser;

    private User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
        this.isPremiumUser = builder.isPremiumUser;
    }

    public static class Builder{
        public String name;
        public String email;
        public int age;
        public String address;
        public boolean isPremiumUser;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder isPremiumUser(boolean isPremiumUser){
            this.isPremiumUser = isPremiumUser;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
    public void displayInfo() {
        System.out.println("User: " + name + ", Email: " + email + ", Premium: " + isPremiumUser);
    }
}
