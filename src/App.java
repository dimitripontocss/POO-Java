public class App {
    public static void main(String[] args) throws Exception {
        Student Dimitri = new Student();

        Dimitri.name = "Dimitri";

        Dimitri.setCpf("12345678910");
        Dimitri.setEmail("dimitri@email.com");

        System.out.println(Dimitri.getCpf());
        System.out.println(Dimitri.getEmail());

        Subject calculus = new Subject();

        calculus.setId(1);
        calculus.name = "Calculus";

        calculus.type.setId(1);
        calculus.type.name = "Math";

        System.out.println(calculus.getId());
        System.out.println(calculus.name);

        Registers reg1 = new Registers();

        reg1.userId = Dimitri.getId();
        reg1.subjectId = calculus.getId();

    }
}
