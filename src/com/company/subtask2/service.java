package com.company.subtask2;

class service{
    private static service onlyInstance;

    private service() {
    }


    synchronized public static service getInstance() {

        if (onlyInstance == null) {
            synchronized (service.class) {
                if (onlyInstance == null) {
                    onlyInstance = new service();
                }
            }
        }
        return onlyInstance;
    }

    public transport getCab(String type) {
        return new factory().getTransport(type);
    }
}
