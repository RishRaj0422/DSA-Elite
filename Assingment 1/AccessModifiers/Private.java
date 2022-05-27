class Data {
    // private variable
    private String name;
}

public class Private {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz";
    }
}
//
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The field Data.name is not visible