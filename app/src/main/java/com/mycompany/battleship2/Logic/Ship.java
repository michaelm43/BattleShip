package com.mycompany.battleship2.Logic;

enum eDirection{RIGHT, DOWN}

public class Ship{


    private int size;           //the size of the ship
    private Point startPoint;
    private eDirection direction;
    private int hits;           //how much hits from the size


    public Ship(int size, Point startPoint, eDirection direction) {
        this.size = size;
        this.startPoint = startPoint;
        this.direction = direction;
        this.hits = 0;
    }

    public void setHits() {
        if(hits<size)
            this.hits++;
    }

    public int getSize() {
        return size;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public eDirection getDirection() {
        return direction;
    }

    public int getHits() {
        return hits;
    }

    public boolean isDestroyed(){ //TODO check if we need to check if more hits than size
        if(this.hits==this.size)
            return true;
        return false;
    }

}

