package za.domain.race;

public class Race {
    private String race;
    private Race(){}
    public Race(Builder builder){
        this.race = builder.race;
    }
    public static class Builder{
        private String race;

        public Builder race(String race){
            this.race = race;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}
