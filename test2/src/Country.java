public class Country {

    private String name;
    private int population;
    public static String continent = "America";

        // Declaring empty constructor
    public Country () {}

        // Constructor declaration with arguments 
    public Country (String name, int population) {
        this.name = name;
        this.population = population;
    }

        // Getters and Setters -> Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

        // Getters and Setters -> Population
    public void setPopulation (int population){
        this.population = population;
    }
    public int getPopulation() {
        return population;
    }
    
    public String testString  (String word, int index){
        String answer = "";
    
        if (word.contains("gun")) {
            answer =  "999";
        } else {
            answer =  "000";
        }
        
        
    
        System.out.println(word.indexOf("ing"));
        System.out.println(word.toLowerCase());
    
        if (index %2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("Is odd");
        }
        
        return answer;
    }

}