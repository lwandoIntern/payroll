package za.ac.cput.pentec.domain.demography.race;

public class Race {
    private String raceId,race;
    private Race(){}
    public Race(Builder builder){
        this.race = builder.race;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getRace() {
        return race;
    }

    public static class Builder{
        private String raceId,race;

        public Builder raceId(String r){
            this.raceId = r;
            return this;
        }
        public Builder race(String race){
            this.race = race;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}
