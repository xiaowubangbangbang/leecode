package leecode;

import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(this.n);
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(this.n);
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(this.n);
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);
    }
}