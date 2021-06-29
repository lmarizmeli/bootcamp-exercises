package JavaAula2.contas;

public class Counter {

    private int value = 0;

    public Counter(int value) {
        this.value = value;
    }

    public Counter(Counter counter) {
        this(counter.getValue());
    }

    public Counter() {
    }


    private void increment() {
        value++;
    }

    private void decrement() {
        if (value <= 0) {
            return;
        }
        value--;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}