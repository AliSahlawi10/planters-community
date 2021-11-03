import java.util.ArrayList;

public class PlantManager {
    private static int globalID = 0;
    ArrayList<Plant> plants = new ArrayList<>();

    public int addPlant(String name, String family, String neededWater, String neededSun, String soilType){
        plants.add(new Plant(globalID, name, family, neededWater, neededSun, soilType));
        globalID++;
        return globalID-1;
    }

    public String removePlant(int id){
        for (Plant plant : plants) {
            if(plant.getId() == id){
                plants.remove(plant);
                return "Plant Successfully Removed.";
            }
        }
        return "No Plant Found.";
    }
    
    
    public String getPlant(int pid){
        for (Plant plant : plants) {
            if(plant.getId() == pid){
                return plant.viewPlant();
            }
        }
        return "No Plant Found";
    }

    public String toString() {
        String out = "";
        for (Plant plant : plants) {
                out += "\n" + plant.viewPlant();
        }
        return  "plants: " + out +
                '}';
    }
}
