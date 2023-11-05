package org.velezreyes.quiz.question6;

public class MyDrink implements Drink {
    private String name;
    private boolean isFizzy;

    public MyDrink(String name, boolean isFizzy) {
        this.name = name;
        this.isFizzy = isFizzy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return isFizzy;
    }
}
