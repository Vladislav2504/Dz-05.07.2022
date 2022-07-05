public class Author {

    private String lastName;
    private String firstName;
    private String nationality;
    private int yearOfBrith;
    private int yearOfDeath;

    public Author(String lastName, String firstName, String nationality, int yearOfBrith, int yearOfDeath) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationality = nationality;
        this.yearOfBrith = yearOfBrith;
        this.yearOfDeath = yearOfDeath;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBrith() {
        return yearOfBrith;
    }

    public void setYearOfBrith(int yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBrith=" + yearOfBrith +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}
