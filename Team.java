public class Team implements BasketBallTeam, FootBallTeam {
    String name;

    public Team(String name) {
        this.name = name;
    }

    public void BasketBallName() {
        System.out.print("Basket Ball Team"+name);
        System.out.println();
    }

    public void FootBallName() {
        System.out.println("Foot Ball team"+name);
    }

    public static void main(String args[]) {
        Team t = new Team("name");
        t.BasketBallName();
        t.FootBallName();
    }
}
