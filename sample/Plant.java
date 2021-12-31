public class Plant {
    private int id;
    private String name;
    private String family;
    private String neededWater;
    private String neededSun;
    private String soilType;

    public Plant(int id, String name, String family, String neededWater, String neededSun, String soilType) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.neededWater = neededWater;
        this.neededSun = neededSun;
        this.soilType = soilType;
    }

    public int getId() {
        return id;
    }

    public String viewPlant() {
        return "Plant{" +
                "\n id: " + id +
                "\n name: " + name +
                "\n family: " + family +
                "\n neededWater: " + neededWater +
                "\n neededSun: " + neededSun +
                "\n soilType: " + soilType +
                "\n }";
    }
}
