package ru.gb.lesson2.game;

public class SwimmingPool implements Obstacle {

    private final int distance;

    public SwimmingPool(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean pass(Participant participant) {
        return participant.getSwim() >= distance;
    }
}
