import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;
    ArrayList<Building> libraries;
    ArrayList<Building> houses;
    ArrayList<Building> cafes;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
        houses = new ArrayList<Building>();
        libraries = new ArrayList<Building>();
        cafes = new ArrayList <Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }
    /**
     * Adds a House to the map
     * @param b the House to add
     */
    public void addHouse(House h) {
        System.out.println("Adding house...");
        buildings.add(h);
        System.out.println("-->Successfully added " + h.getName() + " to the map.");
    }
    
    /**
     * Adds a Library to the map
     * @param b the Library to add
     */
    public void addLibrary(Library l) {
        System.out.println("Adding library...");
        buildings.add(l);
        System.out.println("-->Successfully added " + l.getName() + " to the map.");
    }
    /**
     * Adds a Cafe to the map
     * @param b the Cafe to add
     */
    public void addCafe(Cafe c) {
        System.out.println("Adding cafe...");
        buildings.add(c);
        System.out.println("-->Successfully added " + c.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }
    /**
     * Sets the map string
     */
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        // Add some buildings
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addHouse(new House("Hubbard House", "3 Green Street Northampton, MA 01063", 3, true));
        myMap.addHouse(new House("Chapin House", "1 Chapin Drive Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Building("Ainsworth Gymnasium", "102 Lower College Ln Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Lyman Conservatory", "16 College Ln Northampton, MA 01063", 2));
        myMap.addBuilding(new Building("Smith College Museum of Art", "20 Elm Street Northampton, MA 01063", 2));
        myMap.addBuilding(new Building("Smith College Campus Center", "1 College Ln Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Helen Hills Hills Chapel", "123 Elm St Northampton, MA 01063", 2));
        myMap.addLibrary(new Library("Young Library", "7 Neilson Drive Northampton, MA 01063", 4, 5000));
        myMap.addCafe(new Cafe("Campus Cafe", "1 College Ln Northampton, MA 01063", 100, 200, 300, 400, 800));
        myMap.addBuilding(new Building("McConnell Hall", "2 Tyler Ct Northampton, MA 01063", 4));
        myMap.addHouse(new House("Wilson House", "1 Kensington Ave Northampton, MA 01063", 4, false));
        myMap.addHouse(new House("Chase House", "5 Elm St Northampton, MA 01063", 4, true));
        System.out.println(myMap);
    }
    
}
