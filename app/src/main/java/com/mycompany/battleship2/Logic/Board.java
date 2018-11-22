package com.mycompany.battleship2.Logic;

public class Board {

    private Tile tile[][];

    public Board(Tile[][] tile) {
        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile[i].length; j++) {
                this.tile[i][j] = tile[i][j];
            }
        }
    }

    public Tile[][] getTile() {
        return tile;
    }

    public void setTile(Tile[][] tile) {
        this.tile = tile;
    }

    public boolean placeShips(Ship ship) {                                                          //TODO is placing correctly??
        if (ship.getStartPoint().getX() < this.tile.length && ship.getStartPoint().getY() < this.tile[0].length) {
            if (ship.getDirection() == eDirection.DOWN) {
                if (ship.getStartPoint().getX() + ship.getSize() < tile.length) {
                    for (int i = ship.getStartPoint().getX(); i < ship.getSize(); i++)
                        tile[i][ship.getStartPoint().getY()].setState(eState.HASSHIP);
                    return true;
                }
            }
            if (ship.getDirection() == eDirection.RIGHT) {
                if (ship.getStartPoint().getX() + ship.getSize() >= tile.length) {
                    for (int i = ship.getStartPoint().getY(); i < ship.getSize(); i++)
                        tile[ship.getStartPoint().getX()][i].setState(eState.HASSHIP);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hitShip(Point point){                            //TODO return false??
        if(point.getX()<tile.length&&point.getY()<tile[0].length){
            eState state = tile[point.getX()][point.getY()].getState();
            switch (state){
                case EMPTY:
                    tile[point.getX()][point.getY()].setState(eState.MISS);
                    return false;
                case HIT:
                    return false;
                case MISS:
                    return false;
                case HASSHIP:
                    tile[point.getX()][point.getY()].setState(eState.HIT);
                    return true;
            }
        }
        return false;
    }
}
