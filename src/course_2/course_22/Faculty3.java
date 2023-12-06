package course_2.course_22;
//Когтевран
public class Faculty3 extends Hogwarts{
    private final String name3 = "Когтевран";
    private final String property1_3 = "ум";
    private int property1Force_3;
    private final String property2_3 = "мудрость";
    private int property2Force_3;
    private final String property3_3 = "остроумность";
    private int property3Force_3;
    private final String property4_3 = "творчество";
    private int property4Force_3;

    public Faculty3(int property1Force, int property2Force, int property1Force_3, int property2Force_3, int property3Force_3, int property4Force_3) {
        super(property1Force, property2Force);
        this.property1Force_3 = property1Force_3;
        this.property2Force_3 = property2Force_3;
        this.property3Force_3 = property3Force_3;
        this.property4Force_3 = property4Force_3;
    }

    public String getName3() {
        return name3;
    }

    public String getProperty1_3() {
        return property1_3;
    }

    public int getProperty1Force_3() {
        return property1Force_3;
    }

    public void setProperty1Force_3(int property1Force_3) {
        this.property1Force_3 = property1Force_3;
    }

    public String getProperty2_3() {
        return property2_3;
    }

    public int getProperty2Force_3() {
        return property2Force_3;
    }

    public void setProperty2Force_3(int property2Force_3) {
        this.property2Force_3 = property2Force_3;
    }

    public String getProperty3_3() {
        return property3_3;
    }

    public int getProperty3Force_3() {
        return property3Force_3;
    }

    public void setProperty3Force_3(int property3Force_3) {
        this.property3Force_3 = property3Force_3;
    }

    public String getProperty4_3() {
        return property4_3;
    }

    public int getProperty4Force_3() {
        return property4Force_3;
    }

    public void setProperty4Force_3(int property4Force_3) {
        this.property4Force_3 = property4Force_3;
    }
}
