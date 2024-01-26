import java.time.LocalDate;
import java.util.List;

class Patient {
    int id; // Patient ID
    double weight; // " weight
    double height; // " height
    int bmi; // " BMI
    String currentMeds; // " current medication
    String surname; // " surname
    String firstName; // " first name
    LocalDate dateOfBirth; // " birthdate
    double dosage;

    /**
     * Constructor
     */
   Patient(int id, String surname, String firstName, LocalDate dateOfBirth, double weight, double height, String currentMeds, double dosage) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
        this.bmi = (int) BMIcalc();
        this.currentMeds = currentMeds;
        this.dosage = dosage;
    }

    double BMIcalc() {
        return weight / (height * height);
    }
    double getBMI() {return bmi;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setSurname(String surname){this.surname = surname;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setHeight(double height) {
        this.height = height;
    }
    public void setDosage(double dosage){this.dosage = dosage;}
    public void setMeds(List<Meds> currentMeds){this.currentMeds = currentMeds.toString();}


    /**
     * Shorthand for a Patient's full name
     */
    String fullName() {
        return String.format("%s %s ", firstName, surname);
    }

    /**
     * Shorthand for a Patient's last name
     */
    String getSurname() {
        return surname;
    }

    /**
     * Shorthand for a Patient's 1st name
     */
    String getFirstName() {
        return firstName;
    }
}


/*      static List<Patient> patientList = new ArrayList<>();

        void addPatients(){

        Patient patient = new Patient(1, "Van Puffelen ", "Pierre", LocalDate.of(2000, 2, 29));
        Patient patient2 = new Patient(2, "Habib ", "Kamil", LocalDate.of(2004, 9, 15));
        Patient patient3 = new Patient(3, "Van der Vaart ", "Jaap", LocalDate.of(1985, 4, 06));
        Patient patient4 = new Patient(4, "Helen ", "Elen", LocalDate.of(1962, 6, 12));
        Patient patient5 = new Patient(5, "Nasib", "Jamal", LocalDate.of(2002, 2, 24));

        patientList.add(patient);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);
        */