package dev.smhr.L001Generics;

public class Generics {
    public static void main(String[] args) {
        DataHolder<String> holder1 = new DataHolder<>();
        holder1.setData("Hello");
        System.out.println("Value= " + holder1.getData());

        DataHolder<Integer> holder = new DataHolder<>(1);
        System.out.println("Number= " + holder.getData());
    }
}

class DataHolder<T> {
    private T data;

    public DataHolder(T name) {
        data = name;
    }

    public DataHolder() {
    }

    public T getData() {
        return data;
    }

    public void setData(T newData) {
        this.data = newData;
    }
}