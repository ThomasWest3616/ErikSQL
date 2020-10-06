package com.company;

public class Tennisball extends Ball {
    public Tennisball(int size, String name) {
        super(size, name);
    }

    @Override
    public String getExtraInfo() {
        return "Jeg er en tennisbold";
    }
}
