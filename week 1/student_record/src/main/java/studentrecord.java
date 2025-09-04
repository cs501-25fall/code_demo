// class should be PascalCase
public class studentrecord {
    private String StudentName; // variables should be camelCase
    private int AGE; // like above
    public static final int maxValue = 100; // only constant should be all CAPS

    public void Print_Report(){ // method should be camelCase too
        System.out.println(StudentName + "is" + AGE + "years old");
    }
}
