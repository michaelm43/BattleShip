package com.mycompany.battleship2.Logic;

enum eState{HIT, MISS ,HASSHIP ,EMPTY}

public class Tile {

    private eState state;

    public Tile(eState state){
        this.state = state;

    }

    public eState getState() {
        return state;
    }

    public void setState(eState state) {
        this.state = state;
    }
}
