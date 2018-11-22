package com.mycompany.battleship2.Logic;

public class Player {
    private int score;
    private int maxNumOfShips;
    private int currentNumOfShips;
    private Ship ships[];


    public Player(int maxNumOfShips, Ship[] ships) {
        this.score = 0;
        this.maxNumOfShips = maxNumOfShips;
        this.currentNumOfShips = maxNumOfShips;
        this.ships = ships;
    }


    public int getScore() {
        return score;
    }

    public int getMaxNumOfShips() {
        return maxNumOfShips;
    }

    public int getCurrentNumOfShips() {
        return currentNumOfShips;
    }

    public Ship[] getShips() {
        return ships;
    }


    public void setScore() {
        this.score ++;
    }

    public void setCurrentNumOfShips() {
        this.currentNumOfShips --;
    }

    public boolean updateHit(int shipNum){
        if(ships[shipNum].isDestroyed())
            return false;
        ships[shipNum].setHits();
        if(ships[shipNum].isDestroyed()){
            setScore();
            setCurrentNumOfShips();
        }
        return true;
    }

    public void setShips() { //TODO didn't do yet!!

    }
}
