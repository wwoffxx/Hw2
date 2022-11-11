public class Reptilia {

    public Reptilia(String species, int ageLimit) {
        this.species = species;
        this.ageLimit = ageLimit;
    }

    private String species;
    private int ageLimit;

    public String about() {
        return String.format("This is %s, they live up to %s",species, ageLimit);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }
}
