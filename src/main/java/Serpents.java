public class Serpents extends Reptilia{

    public Serpents(String species, int ageLimit, int numberOfSpicies) {
        super(species, ageLimit);
        this.numberOfSpicies = numberOfSpicies;
    }

    private int numberOfSpicies;

    public int getNumberOfSpicies() {
        return numberOfSpicies;
    }

    public void setNumberOfSpicies (int numberOfSpicies) {
        this.numberOfSpicies = numberOfSpicies;
    }

    @Override
    public String about() {
        return String.format("This is %s, they live up to %s, science knows about %s species", getSpecies(), getAgeLimit(), getNumberOfSpicies());
    }
}
