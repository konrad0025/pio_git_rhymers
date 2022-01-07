package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
//
//Wiersze o numerach 5, 12, 14, 15
//
//Zweryfikuj działanie kombinacji klawiszy alt + ← oraz alt + →
//
//Kombinacja ta pozwala na przełączanie się pomiędzy otwartymi plikami