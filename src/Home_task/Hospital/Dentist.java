package Home_task.Hospital;

public class Dentist extends Doctor{
    @Override
    void treatPatient() {
        System.out.print("Dentist: ");
        super.treatPatient();
        System.out.println("I am filling a tooth");
    }
}
