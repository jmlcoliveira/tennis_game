public class Player {
    private final String NOME;
    private int points;

    public Player(String nome){
        this.NOME = nome;
        this.points = 0;
    }

    public String getNome() {
        return NOME;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(){
        points++;
    }
}
