import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = scanner.nextInt();
        int distance = scanner.nextInt();
        int exhaustionFactor = scanner.nextInt();
        int pokeCount = 0;
        double halfPower = pokePower * 0.5;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokeCount++;

            if (pokePower == halfPower && exhaustionFactor > 0) {
                pokePower /= exhaustionFactor;
            }

        }
        System.out.println(pokePower);
        System.out.println(pokeCount);
    }
}
