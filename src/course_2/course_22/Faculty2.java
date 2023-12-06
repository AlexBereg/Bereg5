package course_2.course_22;
//Пуффендуй
public class Faculty2 extends Hogwarts{
    private final String name2 = "Пуффендуй";
    private final String property1_2 = "трудолюбивость";
    private int property1Force_2;
    private final String property2_2 = "верность";
    private int property2Force_2;
    private final String property3_2 = "честность";
    private int property3Force_2;

    public Faculty2(int property1Force, int property2Force, int property1Force_2, int property2Force_2, int property3Force_2) {
        super(property1Force, property2Force);
        this.property1Force_2 = property1Force_2;
        this.property2Force_2 = property2Force_2;
        this.property3Force_2 = property3Force_2;
    }

    public String getName2() {
        return name2;
    }

    public String getProperty1_2() {
        return property1_2;
    }

    public int getProperty1Force_2() {
        return property1Force_2;
    }

    public void setProperty1Force_2(int property1Force_2) {
        this.property1Force_2 = property1Force_2;
    }

    public String getProperty2_2() {
        return property2_2;
    }

    public int getProperty2Force_2() {
        return property2Force_2;
    }

    public void setProperty2Force_2(int property2Force_2) {
        this.property2Force_2 = property2Force_2;
    }

    public String getProperty3_2() {
        return property3_2;
    }

    public int getProperty3Force_2() {
        return property3Force_2;
    }

    public void setProperty3Force_2(int property3Force_2) {
        this.property3Force_2 = property3Force_2;
    }
}
