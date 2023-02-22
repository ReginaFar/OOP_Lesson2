package ru.gb.lesson2.game;

public class HoleObstacleAdapter implements Obstacle {
    private final Hole hole;

    public HoleObstacleAdapter(Hole hole) {
        this.hole = hole;
    }

    @Override
    public boolean pass(Participant participant) {
        return hole.pass(participant);
    }
}
