package practice;

class GenericClass<T> {
    T value;

    T get() {
        return value;
    }

    void set(T t) {
        this.value = t;
    }
}

public class Generic {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();
        GenericClass<String> genericClass2 = new GenericClass<>();

        genericClass.set(10);
        genericClass2.set("10");

        System.out.println(genericClass.get());
        System.out.println(genericClass.get().getClass());

        System.out.println(genericClass2.get());
        System.out.println(genericClass2.get().getClass());
    }
}
