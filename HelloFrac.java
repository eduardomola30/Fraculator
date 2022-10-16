abstract class Master{
    int version, dateofMod;
    String author;
    public Master(int version, int dateofMod, String author){
        this.version = version;
        this.dateofMod = dateofMod;
        this.author = author;
    }
    public void setVersion(int newversion){
        version = newversion;
    }
    public void setAuthor(String newauthor){
        author = newauthor;
    }
    public void setDateofMod(int newdateofMod){
        dateofMod = newdateofMod;
    }
    }


class Frac extends Master {
    private int n, d;
    private String name = "Programming in Java";

    public Frac(int version, int dateofMod, String author) {
        super(version, dateofMod, author);
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setD(int d) {
        this.d = d;
    }
    public int getD() {
        return d;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


   /* public Frac() {
        n = 0;
        d=0;
        System.out.println("Empty Constructor Called:");
    }
    // Class Frac with an argument int i
    public Frac(int i) {
        n = i;
        d = i;
        System.out.println("Int Constructor Called: " + i);
    }*/
}



public class HelloFrac {
    public static void main(String[] args) {

        // args is an array of strings -- first we need to know how many args we have
        System.out.println("Hello Args: your number of args is"+" "+args.length);

        // We can use the join method of the String class to join strings together
        System.out.println(String.join(" ","joining","text","is","as simple as abc"));

        // String join also works for arrays of strings
        System.out.println("All args: "+String.join(" ",args));

        // if user forgets to provide an arg then we create one ourselves for him
        //		otherwise we would get an array index error
        if (args.length == 0) {args = new String[1]; args[0] = new String("You forgot your Arg");}

        System.out.println(args[0]);

        Frac a = new Frac(1,121022, "richard");
        a.setN(14);
        a.setD(2);

        a.setName("fraction");



        System.out.println("Type of Class: " + a.getName());
        System.out.println("Your Frac is: " + a.getN() + " over " + a.getD());
        /* when trying direclty to access a hidden method it will give me error due to it cannot be found that's why
        // we need to create getters and setters and call the right method */



        args = null;	// we create objects with new and flag them for garbage collection by setting to null

    }
}