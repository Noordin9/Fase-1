import java.time.LocalDate;
import java.util.*;

public class BMI {

    static void BMIgraph(ArrayList<Patient> departmentList) {
        Patient selectedPatient = departmentList.get(LoPatients.currentPatient);
        String[] colors = {"🟥", "🟧","🟩","🟧","🟥"};

        System.out.printf("%-18s","Current");
        int[] width = {15,4,7,15,10};
        int j= 0;
        for (int i= 0; i <colors.length; i++){
            for (int k =0; k <width[i];j++,k++) {
                if (j==(int) selectedPatient.getBMI()) {
                    System.out.print("⬛");
                } else {
                    System.out.print(colors[i]);
                }
            }
        }
    }
}
