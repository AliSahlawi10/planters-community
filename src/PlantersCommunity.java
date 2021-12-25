import java.util.Scanner;

public class PlantersCommunity {
    static UserManager userManager = new UserManager();
    static PlantManager plantManager = new PlantManager();
    static Scanner kbd = new Scanner(System.in);

    private static void initData(){
        userManager.registerUser("Ghfranh","1234");
        userManager.registerUser("Jalal","5678");
        userManager.registerUser("Jenan","0000");
        userManager.registerUser("Rajaa","0123");
        userManager.registerUser("Ali","15975");
        plantManager.addPlant("Lilies","Flowers","So much each day", "10 minutes medium rare","good soil");
        plantManager.addPlant("sunflower","Flowers","a lot each day", "it's literally called sunflowers.","medium soil");
        plantManager.addPlant("carrot","vegetables","not much", "keep it away.","sweet soil");
        plantManager.addPlant("potato","thicc vegetables","plenty", "they like it","deep fried soil");
    }
    private static void welcomePage(){

        System.out.println("\n\nWelcome to our project. \nThis project is about a sub-system to manage plants and users. \n");
        System.out.println("Select one of the options:");

        int option;

        //entering a process info
        System.out.println("1. Login. ");
        System.out.println("2. Register. ");
        System.out.println("3. Exit. ");
        System.out.println();

        //Priority
        do {
            System.out.print("Option: ");
            while (!kbd.hasNextInt()) {
                System.out.println("Please enter a number.");
                kbd.next();
            }
            option = kbd.nextInt();

            if (option <= 0 || option > 3) System.out.println("Select one of the available options.");

        } while (option <= 0 || option > 3);

        System.out.println();

        if(option == 1) getLoginInfo();
        else if (option == 2) getRegistrationInfo();
        else if (option == 3) System.exit(0);



    }
    private static void plantsPage() {

        System.out.println("\n\nWelcome to Plants Community!\n");
        System.out.println("You can choose one of the available options:");

        int option;

        System.out.println("1. View Plant by ID. ");
        System.out.println("2. Add Plant. ");
        System.out.println("3. Remove Plant. ");
        System.out.println("4. View All Plants. ");
        System.out.println("5. Log out. ");
        System.out.println();

        do {
            System.out.print("Option: ");
            while (!kbd.hasNextInt()) {
                System.out.println("Please enter a number.");
                kbd.next();
            }
            option = kbd.nextInt();
            kbd.nextLine();

            if (option <= 0 || option > 5) System.out.println("Select one of the available options.");

        } while (option <= 0 || option > 5);


        if(option == 1) viewPlant();
        else if (option == 2) addPlant();
        else if (option == 3) removePlant();
        else if (option == 4) viewAllPlants();
        else if (option == 5)
        {
            System.out.println("Successful logout. \n");
            welcomePage();}

    }
    private static void getRegistrationInfo() {
        boolean input = true;
        String username;
        String password;

        while (input){
            System.out.print("Username: ");
            username = kbd.next();
            System.out.print("\nPassword: ");
            password = kbd.next();

            userManager.registerUser(username,password);
                input = false;
                plantsPage();
        }
    }
    private static void getLoginInfo() {
        boolean input = true;
        String username;
        String password;

        while (input){
            System.out.print("Username: ");
            username = kbd.next();
            System.out.print("\nPassword: ");
            password = kbd.next();

            if(userManager.loginUser(username,password)){
                input = false;
                plantsPage();
            }else{
                System.out.println("\nUsername or Password is wrong. Try again.\n");
            }
        }
    }
    private static void removePlant() {
        int id = getPlantID();
        System.out.println(plantManager.removePlant(id));
        plantsPage();
    }
    private static void viewAllPlants() {
        System.out.println(plantManager.toString());
        plantsPage();
    }
    private static void viewPlant() {
        int id = getPlantID();
        System.out.println(plantManager.getPlant(id));
        plantsPage();
    }
    private static void addPlant() {
        String name;
        String family;
        String neededWater;
        String neededSun;
        String soilType;

        System.out.print("Enter Plant Information:\n \n");
        System.out.print("Name: ");
        name = kbd.nextLine();
        System.out.print("\nFamily: ");
        family = kbd.nextLine();
        System.out.print("\nNeeded Water: ");
        neededWater = kbd.nextLine();
        System.out.print("\nNeeded Sun: ");
        neededSun = kbd.nextLine();
        System.out.print("\nSoil Type: ");
        soilType = kbd.nextLine();

        int id = plantManager.addPlant(name,family,neededWater,neededSun,soilType);
        System.out.println("Plant Successfully added! Plant ID is " + id);

        plantsPage();
    }
    private static int getPlantID() {
        boolean input = true;
        int id;

        do {
                System.out.println("Plant ID:");
                while (!kbd.hasNextInt()) {
                    System.out.println("That's not a number.");
                    kbd.next();
                }
                id = kbd.nextInt();
                if (id < 0) System.out.println("Enter a positive number.");

            } while (id < 0);
        return id;
    }

    public static void main(String [] args) {
        initData();
        welcomePage();
    }
}
