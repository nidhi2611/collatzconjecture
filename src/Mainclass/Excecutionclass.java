package Mainclass;

import java.util.ArrayList;

public class Excecutionclass {
    private int n;

    Excecutionclass(int number) {
        n = number;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Integer> getCollatzString(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        if (number == 1) {
            return list;
        } else if (number > 0) {
            while (number != 1) {
                if (number % 2 == 0) {
                    list.add(number / 2);
                    number = number / 2;
                } else if (number % 2 != 0) {
                    list.add(3 * number + 1);
                    number = 3 * number + 1;
                }
            }
        }
        return list;
    }

}
