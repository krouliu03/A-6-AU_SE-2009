package com.company.subtask2;

public class Main {

    public static void main(String[] args) {
        transport t1 = service.getInstance().getCab("CAR");
        System.out.println(t1.getRate());

        transport t2 = service.getInstance().getCab("BOAT");
        System.out.println(t2.getRate());    }
}
