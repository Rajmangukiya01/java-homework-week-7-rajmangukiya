package javahomeworkweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
  any other alphabet should be invalid entry*/


public class Program9 {
    public static void main(String[] args) {
        myCity();
    }
    public static void myCity() {
        char city = 'G';
        switch (city) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bangalore");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
