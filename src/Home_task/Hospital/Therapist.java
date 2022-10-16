package Home_task.Hospital;

public class Therapist extends Doctor {
    @Override
    void treatPatient() {
        System.out.print("Therapist: ");
        super.treatPatient();
        System.out.println("I do diagnostics.");
    }

    void choiceDoctor(Patient p) {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        if (p.treatmentPlan == "code1") {
            p.patientDoctor = "surgeon";
            System.out.println("Therapist: I appoint a " + p.patientDoctor);
            surgeon.treatPatient();
        } else if (p.treatmentPlan == "code2") {
            p.patientDoctor = "dentist";
            System.out.println("Therapist: I appoint a " + p.patientDoctor);
            dentist.treatPatient();
        } else {
            p.patientDoctor = "therapist";
            System.out.println("Therapist: I appoint a " + p.patientDoctor);
            therapist.treatPatient();
        }
    }
}


