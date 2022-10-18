package javahomeworkweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
  any other alphabet should be invalid entry*/

public class Program8 {
    public static void main(String[] args) {
        myCity();
    }

    public static void myCity() {
        char city = 'C';
        if (city == 'A') {
            System.out.println("Ahmedabad");
        } else if (city == 'B') {
            System.out.println("Bangalore");
        } else if (city == 'C') {
            System.out.println("Chennai");
        } else if (city == 'D') {
            System.out.println("Delhi");
        } else if (city == 'E') {
            System.out.println("Edinburgh");
        } else if (city == 'F') {
            System.out.println("Fatehpur");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
