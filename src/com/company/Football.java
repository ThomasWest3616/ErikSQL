package com.company;

public class Football extends Ball {
    public Football(int size, String name) {
        super(size,name);
    }

    @Override
    public String getExtraInfo() {
        return "Jeg er en fodbold";
    }

}
