public class Animal {
    private String type;
    private String size;
    private String weight;
    public Animal(String type, String size, String weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String toString(){
        return "Animal :"+" "+type + " " + size + " " + weight + " " + type;
    }
    public void move(String speed)
    {
        System.out.println("This animal moves at "+speed);
    }
    public void makeNoise()
    {
        System.out.println("This animal makes noise");
    }

}


