package exceptions;

import java.util.IllegalFormatException;

public class Potato {
    double weight;
    int sizeInches;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException();
        } else {
            this.name = name;
        }
    }

    public int getSize() {
        return sizeInches;
    }

    public void setSize(int sizeInches) {
        if (sizeInches <= 0) {
            throw new IllegalArgumentException("Size must be more than 0");

        } else {
            this.sizeInches = sizeInches;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

class Kitchen {
    public static void cookPotatos(Potato potato) {
        System.out.println("Washing and trimming potatos");
        try {
           potato.setSize(-1);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("");
        }

    }
}
