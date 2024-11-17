public class Bedroom {
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Bed bed, Celling celling, Wall wall4, Wall wall2, Wall wall3, Wall wall1, Lamp lamp) {

        this.name = name;
        this.bed = bed;
        this.celling = celling;
        this.wall4 = wall4;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall1 = wall1;
        this.lamp = lamp;
    }
    public Lamp getLamp() {
         return this.lamp;

    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

}
