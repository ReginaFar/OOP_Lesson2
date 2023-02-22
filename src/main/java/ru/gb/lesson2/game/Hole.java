package ru.gb.lesson2.game;

public class Hole {

    private final int length;

    public Hole(int length) {
        this.length = length;
    }

    public boolean pass(CanJumpHole canJumpHole) {
        return canJumpHole.getJumpHole() >= length;
    }

}
