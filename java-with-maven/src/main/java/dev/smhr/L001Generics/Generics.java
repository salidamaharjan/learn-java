package dev.smhr.L001Generics;

public class Generics {
    public static void main(String[] args) {
        DataHolder holder = new DataHolder("Salida");
        DataHolder holder1 = new DataHolder();
        holder1.setData("Hello");
        System.out.println("Value= " + holder.getData());
        System.out.println("Value= " + holder1.getData());

    }
}

class DataHolder {
    private String data;

    public DataHolder(String name) {
        data = name;
    }

    public DataHolder() {
    }

    public String getData() {
        return data;
    }

    public void setData(String newData) {
        this.data = newData;
    }
}