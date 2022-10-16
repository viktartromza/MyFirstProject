package Home_task.Hospital;

public class Surgeon extends Doctor{
    @Override
    void treatPatient() {
        System.out.print("Surgeon: ");
        super.treatPatient();
        System.out.println("I am doing surgery.");
    }
}

