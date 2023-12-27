import java.util.HashSet;
import java.util.Set;

public class FilterUtils {
    
    public static Set<Laptop> filterByRAM(Set<Laptop> laptop,int minRam) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop notebook : laptop) {
            if (notebook.getram() >= minRam) {
                filteredLaptops.add(notebook);
            }
        }
        return filteredLaptops;
    }
   
    public static Set<Laptop> filterByHDD(Set<Laptop> laptop,int minHdd) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop notebook : laptop) {
            if (notebook.gethdd() >= minHdd) {
                filteredLaptops.add(notebook);
            }
        }
        return filteredLaptops;
    }
   
    public static Set<Laptop> filterByOSystem(Set<Laptop> laptop, String oSystem) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop notebook : laptop) {
            if
            (notebook.getOSystem().equalsIgnoreCase(oSystem)) {
                filteredLaptops.add(notebook);
            }
        }
        return filteredLaptops;
    }
    
    public static Set<Laptop> filterByColor(Set<Laptop> laptop,
                                              String color) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop notebook : laptop) {
            if (notebook.getcolor().equalsIgnoreCase(color)) {
                filteredLaptops.add(notebook);
            }
        }
        return filteredLaptops;
    }
}


