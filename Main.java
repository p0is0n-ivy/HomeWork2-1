package project1;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Boris", 33, "Russia", 89);
        Player player2 = new Player("Mario", 25, "Italy", 52);
        Player player3 = new Player("Pedro", 22, "Brazil", 20);
        Player player4 = new Player("Djon", 20, "Great Britain",59);
        Player[] players = new Player[4];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;
        //getInfoAboutEveryone(players);
        Course c = new Course();
        c.doIt(players);
    }

    private static void getInfoAboutEveryone (Player[] players) {
        for (int i = 0; i < players.length; i++)
            System.out.println(players[i].getInfo());
    }


}






