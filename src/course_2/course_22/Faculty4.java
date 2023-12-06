package course_2.course_22;
//Слизерин
public class Faculty4 extends Hogwarts{
    private final String name4 = "Слизерин";
    private final String property1_4 = "хитрость";
    private int property1Force_4;
    private final String property2_4 = "решительность";
    private int property2Force_4;
    private final String property3_4 = "амбициозность";
    private int property3Force_4;
    private final String property4_4 = "находчивость";
    private int property4Force_4;
    private final String property5_4 = "жажда власти";
    private int property5Force_4;

    public Faculty4(int property1Force, int property2Force, int property1Force_4, int property2Force_4, int property3Force_4, int property4Force_4, int property5Force_4) {
        super(property1Force, property2Force);
        this.property1Force_4 = property1Force_4;
        this.property2Force_4 = property2Force_4;
        this.property3Force_4 = property3Force_4;
        this.property4Force_4 = property4Force_4;
        this.property5Force_4 = property5Force_4;
    }

    public String getName4() {
        return name4;
    }

    public String getProperty1_4() {
        return property1_4;
    }

    public int getProperty1Force_4() {
        return property1Force_4;
    }

    public void setProperty1Force_4(int property1Force_4) {
        this.property1Force_4 = property1Force_4;
    }

    public String getProperty2_4() {
        return property2_4;
    }

    public int getProperty2Force_4() {
        return property2Force_4;
    }

    public void setProperty2Force_4(int property2Force_4) {
        this.property2Force_4 = property2Force_4;
    }

    public String getProperty3_4() {
        return property3_4;
    }

    public int getProperty3Force_4() {
        return property3Force_4;
    }

    public void setProperty3Force_4(int property3Force_4) {
        this.property3Force_4 = property3Force_4;
    }

    public String getProperty4_4() {
        return property4_4;
    }

    public int getProperty4Force_4() {
        return property4Force_4;
    }

    public void setProperty4Force_4(int property4Force_4) {
        this.property4Force_4 = property4Force_4;
    }

    public String getProperty5_4() {
        return property5_4;
    }

    public int getProperty5Force_4() {
        return property5Force_4;
    }

    public void setProperty5Force_4(int property5Force_4) {
        this.property5Force_4 = property5Force_4;
    }
}
