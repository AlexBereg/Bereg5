package course_2.course_22;

public class Hogwarts {
//    private String name;
    private final String property1 = "Сила магии";
    private int property1Force;
    private final String property2 = "Расстояние трансгрессии";
    private int property2Force;

    public Hogwarts(int property1Force, int property2Force) {
        this.property1Force = property1Force;
        this.property2Force = property2Force;
    }

    public String getProperty1() {
        return property1;
    }

    public int getProperty1Force() {
        return property1Force;
    }

    public void setProperty1Force(int property1Force) {
        this.property1Force = property1Force;
    }

    public String getProperty2() {
        return property2;
    }

    public int getProperty2Force() {
        return property2Force;
    }

    public void setProperty2Force(int property2Force) {
        this.property2Force = property2Force;
    }
}
