package com.company.subtask2;

class factory {

    public transport getTransport(String type) {
        switch(type) {
            case "CAR" :
                return new Car();
            case "BOAT" :
                return new Boat();
            default:
                return null;
        }
    }
}
