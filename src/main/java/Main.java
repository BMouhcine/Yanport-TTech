public class Main {


    public static void main(String[] args) {
        String instructions = "DADADADAA";
        Grille grille = new Grille(10, 10);
        Aspirateur aspirateur = new Aspirateur(new Point(5, 5), Orientation.N);


        aspirateur.executerInstructions(instructions);

    }
}
