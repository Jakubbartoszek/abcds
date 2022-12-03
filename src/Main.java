import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Integer option;
        do {
            option = chooseOption();

            switch (option) {
                case 1:
                    calculateAvarage();
                    break;
                case 2:
                    calculateProduct();
                    break;
                case 3:
                    calculateCircumferenceOfCircle();
                    break;
                case 4:
                    calculateSquareArea();
                    break;
                case 0:
                    System.out.println("Do zobaczenia ponownie! :)");
                    break;
                default:
                    System.out.println("nie ma takiej opcji w programie");
            }
        } while (option != 0);
    }

    private static void calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź długość boku kwadratu");
        System.out.println("Długość nie może być mniejsza od 0");

        Double a = scanner.nextDouble();
        Double Pole = a * a;
        System.out.println("Pole kwadratu jest równe: " + Pole);
    }

    private static void calculateCircumferenceOfCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień.");
        System.out.println("Promień nie może być mniejszy od 0");

        Double radius = scanner.nextDouble();
        Double obwód = 2 * Math.PI * radius;
        System.out.println("Obwód jest równy: " + obwód);
    }


    private static void calculateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj kolejno liczby rzeczywiste do mnożenia");
        System.out.println("podanie zera kończy obliczenie");

        Double number = scanner.nextDouble();
        Double product = 1.0;

        while (number != 0) {
            product *= number; //product = product + number
            number = scanner.nextDouble();
        }
        System.out.println("wynik iloczyny: " + product);
    }


    private static Integer chooseOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz co chcesz zrobić");
        System.out.println("1. Licz średnią");
        System.out.println("2. Licz Iloczyn");
        System.out.println("3. Licz obwód koła");
        System.out.println("4. Licz pole kwadratu");
        System.out.println("0. Koniec programu");
        return scanner.nextInt();
    }

    private static int calculateAvarage() {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        System.out.println("Podaj ile liczb chcesz wprowadzić?");

        Integer userNumber = scanner.nextInt();

        if (userNumber <= 0) {
            System.out.printf("błędna podana liczba!!!!!!");
        } else {
            System.out.println("Podaj " + userNumber + "liczby całkowite");

            for (int i = 0; i < userNumber; i++) {
                sum = sum + scanner.nextInt();
            }
            System.out.println("średnia wynosi " + (sum / userNumber));
        }
        return 0;
    }
}
