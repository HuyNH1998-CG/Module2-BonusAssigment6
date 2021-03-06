public class CanBo {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, String dateOfBirth, String gender, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + this.getName()
                + ", Date of Birth: " + this.getDateOfBirth()
                + ", Gender: " + this.getGender()
                + ", Address: " + this.getAddress());
    }
}
