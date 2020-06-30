public class Main {

    public static void main(String[] args) {
        functionUsoDelIf(1);
        functionUsoDelIfElse(2);
        functionUsoDelSwitch(3);
    }

    public static void functionUsoDelIf(int variable){
        System.out.println("---functionUsoDelIf---\nLa variable vale: " + variable);
        if (variable == 1){
            System.out.println("Esta línea se ejecuta si la variable vale 1");
        }
        System.out.println("Esta línea se ejecuta siempre");
    }

    public static void functionUsoDelIfElse(int variable){
        System.out.println("---functionUsoDelIfElse---\nLa variable vale: " + variable);
        if (variable == 1){
            System.out.println("Esta línea se ejecuta si la variable vale 1");
        } else {
            System.out.println("Esta línea se ejecuta si la variable no vale 1");
        }
        System.out.println("Esta línea se ejecuta siempre");
    }

    public static void functionUsoDelSwitch(int variable){
        System.out.println("---functionUsoDelSwitch---\nLa variable vale: " + variable);
        switch (variable){
            case 1: {
                System.out.println("Esta línea se ejecuta si la variable vale 1");
                break;
            }
            case 2: {
                System.out.println("Esta línea se ejecuta si la variable vale 2");
                break;
            }
            case 3: {
                System.out.println("Esta línea se ejecuta si la variable vale 3");
                break;
            }
            default: {
                System.out.println("Esta línea se ejecuta si la variable no vale ni 1 ni 2 ni 3");
                break;
            }
        }
        System.out.println("Esta línea se ejecuta siempre");
    }

}

