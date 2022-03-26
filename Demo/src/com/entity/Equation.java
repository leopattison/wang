package com.entity;

public class Equation {
    private String suanshi ;
    private String jieguo ;

    public Equation(String suanshi, String jieguo) {
        this.suanshi = suanshi;
        this.jieguo = jieguo;
    }

    public Equation() {

    }

    public void setSuanshi(String suanshi) {
        this.suanshi = suanshi;
    }

    public void setJieguo(String jieguo) {
        this.jieguo = jieguo;
    }


    public String getSuanshi() {
        return suanshi;
    }

    public String getJieguo() {
        return jieguo;
    }
}