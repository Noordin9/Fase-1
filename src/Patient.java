import java.time.LocalDate;

class Patient {
 /*   static final int RETURN = 0;
    static final int SURNAME = 1;
    static final int FIRSTNAME = 2;
    static final int DATEOFBIRTH = 3;*/

    int id;
    int weight;
    int height;
    String surname;
    String firstName;
    LocalDate dateOfBirth;


    /**
     * Constructor
     */
    Patient(int id, String surname, String firstName, LocalDate dateOfBirth, int weight, int height) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;

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
    }

  /*  static String calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);

        int years = age.getYears();
        return years + " years ";
    }
*/

    String getSurname() {
        return surname;
    }

    String getFirstName() {
        return firstName;
    }

    /**
     * Display patient data.
     */
    void viewData() {
        System.out.format("===== Patient id=%d =============\n", id);
        System.out.format("%-17s %s\n", "Surname:", surname);
        System.out.format("%-17s %s\n", "firstName:", firstName);
        System.out.format("%-17s %s\n", "Date of birth:", dateOfBirth);
    }

    /**
     * Shorthand for a Patient's full name
     */
    String fullName() {
        return String.format("%s %s ", firstName, surname);
    }
}