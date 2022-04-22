public class Aspirateur {

    private Point position;
    private String orientation;
    private Grille grille;

    public Aspirateur(Point position, String orientation){
        this.position = position;
        this.orientation = orientation;
    }
    // Utilisation ultérieure
    public Aspirateur(Point position, String orientation, Grille grille){
        this.position = position;
        this.orientation = orientation;
        this.grille = grille;
    }

    public void executerInstructions(String instructions){
        for(int i=0; i<instructions.length(); i++){
            String unit = String.valueOf(instructions.charAt(i));
            if(unit.equals(Commande.A)){
                avancer();
            }else{
                setOrientation(calculerOrientation(unit));
            }
        }
        yieldCoordFinales();
    }


    public String calculerOrientation(String commande){
        if(commande.equals(Commande.D)){
            switch(orientation){
                case Orientation.N:
                    return Orientation.E;
                case Orientation.E:
                    return Orientation.S;
                case Orientation.S:
                    return Orientation.W;
                case Orientation.W:
                    return Orientation.N;
            }
        }else{
            switch(orientation){
                case Orientation.N:
                    return Orientation.W;
                case Orientation.E:
                    return Orientation.N;
                case Orientation.S:
                    return Orientation.E;
                case Orientation.W:
                    return Orientation.S;
            }
        }
        return null;
    }
    public void avancer(){
        Point currentPoint = position;
        switch(orientation){
            case Orientation.N:
                setPosition(new Point(currentPoint.x, currentPoint.y + 1));
                break;
            case Orientation.E:
                setPosition(new Point(currentPoint.x + 1, currentPoint.y));
                break;
            case Orientation.S:
                setPosition(new Point(currentPoint.x, currentPoint.y - 1));
                break;
            case Orientation.W:
                setPosition(new Point(currentPoint.x - 1, currentPoint.y));
                break;
        }
    }

    public void yieldCoordFinales(){
        System.out.println(String.format("Position finale: (%d, %d, %s).", position.x, position.y, orientation));
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
