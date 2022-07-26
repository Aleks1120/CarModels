package com.exsersice.cars;

public class RaceEvent {

    private RaceTour raceTour;
    private int raceYear;
    private int racePlace;

    RaceEvent(RaceTour raceTour, int raceYear, int racePlace) throws Exception {
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

        boolean nascarCondition = 1 > racePlace || racePlace > 30;
        boolean dakarRallyCondition = 1 > racePlace || racePlace > 120;

        if(this.raceTour == RaceTour.NASCAR && nascarCondition){
            throw new Exception(" Error! ");
        } else if (this.raceTour == RaceTour.DAKAR_RALLY && dakarRallyCondition){
            throw new Exception(" Error!");
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
