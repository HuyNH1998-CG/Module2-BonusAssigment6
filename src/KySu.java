public class KySu extends CanBo{
    private String specialty;

    public KySu(String name, String dateOfBirth, String gender, String address, String specialty) {
        super(name, dateOfBirth, gender, address);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void display() {
        System.out.println("Name: " + this.getName()
                + ", Date of Birth: " + this.getDateOfBirth()
                + ", Gender: " + this.getGender()
                + ", Address: " + this.getAddress()
                + ", Specialty: " + this.getSpecialty());
    }
}
