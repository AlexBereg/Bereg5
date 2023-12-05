package course_2.course_22;

//Гриффиндор
public class Faculty1 extends Hogwarts{
//    private static final String forceProperty1 = ;
    private final String name1 = "Гриффиндор";
    private final String property1_1 = "благородство";
    private int property1Force_1;
    private final String property2_1 = "честь";
    private int property2Force_1;
    private final String property3_1 = "храбрость";
    private int property3Force_1;

    public Faculty1(int property1Force, int property2Force, int property1Force_1, int property2Force_1, int property3Force_1) {
        super(property1Force, property2Force);
        this.property1Force_1 = property1Force_1;
        this.property2Force_1 = property2Force_1;
        this.property3Force_1 = property3Force_1;
    }

    public String getName1() {
        return name1;
    }

    public String getProperty1_1() {
        return property1_1;
    }

    public int getProperty1Force_1() {
        return property1Force_1;
    }

    public void setProperty1Force_1(int property1Force_1) {
        this.property1Force_1 = property1Force_1;
    }

    public String getProperty2_1() {
        return property2_1;
    }

    public int getProperty2Force_1() {
        return property2Force_1;
    }

    public void setProperty2Force_1(int property2Force_1) {
        this.property2Force_1 = property2Force_1;
    }

    public String getProperty3_1() {
        return property3_1;
    }

    public int getProperty3Force_1() {
        return property3Force_1;
    }

    public void setProperty3Force_1(int property3Force_1) {
        this.property3Force_1 = property3Force_1;
    }
}
