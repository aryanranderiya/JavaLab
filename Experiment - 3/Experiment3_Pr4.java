public class Experiment3_Pr4 {

    Experiment3_Pr4(){
        System.out.println("Called default constructor");
    }

    Experiment3_Pr4(String name){
        System.out.println("Called parameterized constructor with parameter: "+name);
    }

    Experiment3_Pr4(Experiment3_Pr4 obj){
        System.out.println("Called copy constructor");
    }

    public static void main(String[] args) {
        
        new Experiment3_Pr4(new Experiment3_Pr4());
        new Experiment3_Pr4("Aryan");
    }
}
