package com.exsersice.cars;

public class RaceHistory {

    private RaceTour raceTour;
    private int raceYear;
    private int racePlace;

    RaceHistory(RaceTour raceTour, int raceYear, int racePlace) throws Exception {
        setRaceTour(raceTour);
        setRaceYear(raceYear);
        setRacePlace(racePlace);
    }
    private void setRaceTour(RaceTour raceTour) throws Exception {
        if (raceTour == null){
            throw new Exception("No race attended");
        }
        this.raceTour = raceTour;
    }
    private void setRaceYear(int raceYear) throws Exception {
        if (raceYear < 1950 || raceYear > 2022){
            throw new Exception("Invalid Year of race");
        }
        this.raceYear = raceYear;
    }
    private void setRacePlace(int racePlace) throws Exception {
        if(racePlace< 1 || racePlace > 30){
            throw new Exception(" Invalid placement for NASCAR");
        } else if (racePlace > 120){
            throw new Exception(" Invalid placement for DAKAR RALLY");
        }
        this.racePlace = racePlace;
    }

    @Override
    public String toString() {
        return "RaceHistory" +
                " raceTour: " + raceTour +
                ", raceYear: " + raceYear +
                ", racePlace: " + racePlace;
    }
}
