public class Laptop {

    private String name;
    private int ram;
    private int hdd;
    private String OSystem;
    private String color;

    public Laptop( String name, int ram, int hdd, String OSystem, String color){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.OSystem = OSystem;
        this.color = color;
    }

    public String getname(){
        return name;
    }

    public int getram() {
        return ram;
    }

    public int gethdd() {
        return hdd;
    }

    public String getOSystem() {
    return OSystem;
    }

    public String getcolor() {
        return color;
    }

    @Override
    public String toString(){
        return "Laptop: " + name +
                "; RAM - " + ram + "GB" +
                "; HDD - " + hdd + "GB" +
                "; OS - " + OSystem +
                "; COLOR - " + color;
    }
}
