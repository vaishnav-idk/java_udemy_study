public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(int gills, int fins) {
        this.gills = gills;
        this.fins = fins;
    }

    public Fish(String type,  double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscle()
    {
        System.out.println("Muscle moving");
    }

    private void moveBackfin()
    {
        System.out.println("Backfin moving");
    }
    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscle();
        if(speed.equals("fast")){
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                '}';
    }
}
