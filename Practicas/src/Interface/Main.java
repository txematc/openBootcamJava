package Interface;

public class Main {

    static EmpleadoCRUD empleadoCRUD;


    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
