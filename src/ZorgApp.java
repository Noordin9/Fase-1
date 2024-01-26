import java.time.LocalDate;

class ZorgApp {

    public static void main(String[] args) {
        LoPatients patientList = new LoPatients(1,"","", LocalDate.of(2023,12,20),80,1.70,"",0);
        LoUsers userList = new LoUsers(0, "");
        Meds.addMeds();
        userList.addUser();
        patientList.addPatient();
        Administration administration = new Administration(LoPatients.PatientList, LoUsers.UserList, Meds.MedsList);

        Administration.MainMenu();
        Administration.menu();
    }
}
