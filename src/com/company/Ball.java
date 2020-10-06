package com.company;

public abstract class Ball {
    private int size;
    private String name;

    protected Ball(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getExtraInfo();


    @Override
    public String toString() {
        return "Ball {" + "size:" + size + ", name:" + name + "} " + getExtraInfo();
    }

}
