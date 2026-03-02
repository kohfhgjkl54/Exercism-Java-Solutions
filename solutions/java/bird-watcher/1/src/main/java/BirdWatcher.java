
class BirdWatcher {
    private final int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeek;
    }

    public int getToday() {
        int today = birdsPerDay[6]; 
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int amountBirds : birdsPerDay){
            if(amountBirds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countFirstDays = 0;
        for(int i = 0; i < numberOfDays; i++){
            countFirstDays += birdsPerDay[i];
            if(i == 6){
                return countFirstDays;
            }
        }
        return countFirstDays;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int amountBirds : birdsPerDay){
            if(amountBirds >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
