import org.junit.Test;

public class Test1 {
    protected String instructions = "DADADADAA";
    @Test
    public void testAspirateur(){
        Grille grille = new Grille(10, 10);
        Aspirateur aspirateur = new Aspirateur(new Point(5, 5), Orientation.N);
        aspirateur.executerInstructions(instructions);
    }
}
