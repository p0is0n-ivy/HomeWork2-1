package project1;

public class Course {
    private int[] b = new int[] {10, 20, 30, 50};
    private boolean a;

        public void doIt(Player[] players) {
            for (int j = 0; j < players.length; j++){
                a = true;
                for (int i = 0; i < this.b.length;  i++) {
                    if (players[j].getPower() < this.b[i])
                        a = false;
                    }
                if (a == true) {
                    System.out.println(players[j].getInfo());
                }
            }
        }
}
