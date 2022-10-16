package Home_task.Hospital;

public class Hospital {
    public static void main(String[] args) {
        Patient patient = new Patient("code1");
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
therapist.choiceDoctor(patient);
    }
}
