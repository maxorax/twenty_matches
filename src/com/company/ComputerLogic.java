package com.company;


public class ComputerLogic {
    private int matches=17;

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public  int computerMove(int countMatches){
        int count=getMatches()-countMatches;
        switch (count){
            case 1:{count=3; break;}
            case 2:{count=2; break;}
            case 3:{count=1; break;}
        }
        setMatches(countMatches-count);
        ConsoleOutput.computerOutput(count);
        return(count);
    }
}
