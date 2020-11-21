public class TennisTable {
    private final Player PLAYER_1, PLAYER_2;

    public TennisTable(String player1name, String player2name) {
        this.PLAYER_1 = new Player(player1name);
        this.PLAYER_2 = new Player(player2name);
    }

    public String player1name() {
        return PLAYER_1.getNome();
    }

    public int player1points() {
        return PLAYER_1.getPoints();
    }

    public String player2name() {
        return PLAYER_2.getNome();
    }

    public int player2points() {
        return PLAYER_2.getPoints();
    }

    public void player1addPoints(){
        this.PLAYER_1.addPoints();
    }

    public void player2addPoints(){
        this.PLAYER_2.addPoints();
    }

    //ve se diferenca e maior que 2 e se o numero de jogadas > 11
    public boolean isGameOver() {
        int pontosP1 = PLAYER_1.getPoints();
        int pontosP2 = PLAYER_2.getPoints();
        return (pontosP1 - pontosP2 >= 2 || pontosP2 - pontosP1 >= 2)
                && (pontosP1 > 11 || pontosP2 > 11);
    }

    //@pre jogo ja terminou
    public String nomeVencedor() {
        if(PLAYER_1.getPoints() > PLAYER_2.getPoints())
            return  PLAYER_1.getNome();
        return PLAYER_2.getNome();
    }
}
