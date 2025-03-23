package com.JavaSpringLearning.Service.Impl;

public class Star implements SuperStar{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "sing a song" + name);
        return "thanks";
    }

    @Override
    public void dance(String name) {
        System.out.println(this.name + "dance a song" + name);

    }
}
