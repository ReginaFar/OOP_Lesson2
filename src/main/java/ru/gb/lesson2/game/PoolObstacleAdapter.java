package ru.gb.lesson2.game;

public class PoolObstacleAdapter implements Obstacle {

    private final SwimmingPool swimmingPool;

    public PoolObstacleAdapter(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPool.pass(participant);
    }

}
