
class ZorgApp {
    public static void main(String[] args) {
        LoPatients patientList = new LoPatients();
        LoUsers UserList = new LoUsers();
        Meds.addMeds();
        UserList.addUser();
        patientList.addPatient();
        Administration administration = new Administration(LoPatients.GPList,LoPatients.PhysioList,LoPatients.ICUList,LoPatients.ApothecaryList, LoUsers.UserList, Meds.LoMeds);

        Administration.menu();
    }
}
