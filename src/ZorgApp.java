
class ZorgApp {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        Userlist userlist = new Userlist();
        userlist.addUser();
        patientList.addPatient();
        Administration administration = new Administration(PatientList.patientList, Userlist.ListofUsers);

        administration.menu();
    }
}
