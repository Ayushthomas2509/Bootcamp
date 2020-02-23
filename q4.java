public class q4 {
    private static q4 single_instance=null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private q4()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static q4 Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null)
        {
            single_instance = new q4();
        }
        return single_instance;
    }
}
