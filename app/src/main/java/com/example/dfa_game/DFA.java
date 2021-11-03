package com.example.dfa_game;

import java.util.List;

public class DFA {

    public static int idCount = 0;

    static class State {
        int id;         // 'name' of State
        int locx;       // location on gameboard
        int locy;
        boolean isStart;    // is the Start State
        boolean isAccept;   // is an accept state
        boolean isLoop;     // points to itself //TODO : probably uneccessary

        // constructor
        State(){
            id = idCount++;     // sets State ID and increments for next State created
            isStart =  false;   // defaults to regular transition state
            isAccept = false;
            isLoop =   false;
        } // end constructor

    } // end State class

    static class Arrow {
        State from;     // State arrow points FROM
        State to;       // State arrow points TO
        boolean hasA;   // whether element a accepted
        boolean hasB;   // whether element b accepted
        boolean hasEp;  // whether empty set accepted // TODO : for future NFA implementation

        Arrow(State from, State to, boolean a, boolean b, boolean ep) {
            this.from = from;
            this.to = to;
            this.hasA = a;
            this.hasB = b;
            this.hasEp = ep;
        } // end constructor

    } // end Arrow class

} // end DFA class