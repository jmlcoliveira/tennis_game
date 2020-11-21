import java.util.Scanner;

public class Main {

    private static final String
            SAIR = "SAIR",
            AJUDA = "AJUDA",
            APJ1 = "APJ1",
            APJ2 = "APJ2";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String player1name = input.nextLine();
        String player2name = input.nextLine();

        if (player1name.equals(player2name))
            System.out.println("Nomes nao podem ser iguais");
        else {
            TennisTable tt = new TennisTable(player1name, player2name);
            String cmd;
            do {
                cmd = readCommand(input);
                processCommand(cmd, tt);
            }
            while (!cmd.equals(SAIR));
        }
    }

    private static void processCommand(String cmd, TennisTable tt) {
        switch (cmd) {
            case SAIR:
                processSair(tt);
                break;
            case AJUDA:
                processAjuda();
                break;
            case APJ1:
                processAPJ1(tt);
                break;
            case APJ2:
                processAPJ2(tt);
                break;
            default:
                System.out.println("Comando Invalido");
                break;
        }
    }

    private static void processAPJ2(TennisTable tt) {
        if (tt.isGameOver())
            System.out.println("O jogo ja terminou");
        else {
            tt.player2addPoints();
            if (tt.isGameOver())
                System.out.printf("%s ganhou com %d", tt.player2name(),
                        tt.player2points());
        }
    }

    private static void processAPJ1(TennisTable tt) {
        if (tt.isGameOver())
            System.out.println("O jogo ja terminou");
        else {
            tt.player1addPoints();
            if (tt.isGameOver())
                System.out.printf("%s ganhou com %d", tt.player1name(),
                        tt.player1points());
        }
    }

    private static void processAjuda() {
        System.out.println("Cenas de ajuda, nao me apetece fazer");
    }

    private static void processSair(TennisTable tt) {
        if (tt.isGameOver()) {
            System.out.println("Jogo terminado");
            System.out.printf("%s ganhou\n", tt.nomeVencedor());
        } else
            System.out.println("Jogo ainda nao tinha terminado");
    }

    private static String readCommand(Scanner inp) {
        return inp.nextLine().toUpperCase();
    }
}
