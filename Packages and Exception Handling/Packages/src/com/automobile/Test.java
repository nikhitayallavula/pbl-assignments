package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("----- Hero Details -----");
        System.out.println("Model Name : " + hero.getModelName());
        System.out.println("Registration Number : " + hero.getRegistrationNumber());
        System.out.println("Owner Name : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed() + " km/hr");
        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println("----- Honda Details -----");
        System.out.println("Model Name : " + honda.getModelName());
        System.out.println("Registration Number : " + honda.getRegistrationNumber());
        System.out.println("Owner Name : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed() + " km/hr");
        honda.cdplayer();
    }
}