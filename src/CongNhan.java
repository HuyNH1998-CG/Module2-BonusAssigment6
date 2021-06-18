public class CongNhan extends CanBo {
    private String type;
    private String specialty;

    public CongNhan(String name, String dateOfBirth, String gender, String address, String type, String specialty) {
        super(name, dateOfBirth, gender, address);
        this.type = type;
        this.specialty = specialty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                + ", Type: " + this.getType()
                + ", Specialty: " + this.getSpecialty());
    }
}
