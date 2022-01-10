package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FULL_VALUE = 11;
    public static final int TOTAL_VALUE = -1;
    public static final int ERROR_RETURN = -1;
    public static final int SIZE = 12;

    private final int[] numbers = new int[SIZE];

    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {

        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_RETURN;
        return numbers[total--];
    }

}
