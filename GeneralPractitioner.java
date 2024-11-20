public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner() {
        super();
        this.specialty = "";
    }

    public GeneralPractitioner(int id, String name, String info, String specialty) {
        super(id, name, info);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}
