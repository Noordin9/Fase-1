import java.time.LocalDate;

class Patient {
 /*   static final int RETURN = 0;
    static final int SURNAME = 1;
    static final int FIRSTNAME = 2;
    static final int DATEOFBIRTH = 3;*/

    int id;
    double weight;
    double height;
    int bmi;
    String currentMeds;
    String surname;
    String firstName;
    LocalDate dateOfBirth;


    /**
     * Constructor
     */
    Patient(int id, String surname, String firstName, LocalDate dateOfBirth, double weight, double height, String currentMeds) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
        this.bmi = (int) BMIcalc();
        this.currentMeds = currentMeds;
    }
    double BMIcalc() {
        return weight / (height * height);
    }
    double getBMI() {
        return bmi;
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
     * Shorthand for a Patient's full name
     */
    String fullName() {
        return String.format("%s %s ", firstName, surname);
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