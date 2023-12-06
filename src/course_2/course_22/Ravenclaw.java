package course_2.course_22;

public class Ravenclaw extends Hogwarts {
    private final String nameFaculty = "Когтевран";
    private final String mind = "ум";
    private int forceMind;
    private final String wisdom = "мудрость";
    private int forceWisdom;
    private final String wit = "остроумность";
    private int forceWit;
    private final String creativity = "творчество";
    private int forceCreativity;

    public Ravenclaw(String studentName, int forcePowerOfMagic, int forceTransgressionDistance, int forceMind, int forceWisdom, int forceWit, int forceCreativity) {
        super(studentName, forcePowerOfMagic, forceTransgressionDistance);
        this.forceMind = forceMind;
        this.forceWisdom = forceWisdom;
        this.forceWit = forceWit;
        this.forceCreativity = forceCreativity;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public String getMind() {
        return mind;
    }

    public int getForceMind() {
        return forceMind;
    }

    public void setForceMind(int forceMind) {
        this.forceMind = forceMind;
    }

    public String getWisdom() {
        return wisdom;
    }

    public int getForceWisdom() {
        return forceWisdom;
    }

    public void setForceWisdom(int forceWisdom) {
        this.forceWisdom = forceWisdom;
    }

    public String getWit() {
        return wit;
    }

    public int getForceWit() {
        return forceWit;
    }

    public void setForceWit(int forceWit) {
        this.forceWit = forceWit;
    }

    public String getCreativity() {
        return creativity;
    }

    public int getForceCreativity() {
        return forceCreativity;
    }

    public void setForceCreativity(int forceCreativity) {
        this.forceCreativity = forceCreativity;
    }

    @Override
    public String toString() {
        return "Студент ='" + getStudentName() + '\'' + " Факультет - " + getNameFaculty()
                + "/ " + getPowerOfMagic() + " = " + getForcePowerOfMagic()
                + "/ " + getTransgressionDistance() + " = " + getForceTransgressionDistance()
                + "/ " + getMind() + " = " + getForceMind()
                + "/ " + getWisdom() + " = " + getForceWisdom()
                + "/ " + getWit() + " = " + getForceWit()
                + "/ " + getCreativity() + " = " + getForceCreativity();
    }

    public static void CompareStudentsFaculty(Ravenclaw st1, Ravenclaw st2) {
        String best = st2.getStudentName();
        String worst = st1.getStudentName();
        int sumPoperties1 = st1.getForceMind() + st1.getForceWisdom() + st1.getForceWit() + st1.getForceCreativity();
        int sumPoperties2 = st2.getForceMind() + st2.getForceWisdom() + st2.getForceWit() + st2.getForceCreativity();

        if (sumPoperties1 == sumPoperties2) {
            System.out.println("Студенты " + best + " и " + worst + "равные по сумме свойств Когтевранцы");
            return;
        } else if (sumPoperties1 > sumPoperties2) {
            best = st1.getStudentName();
            worst = st2.getStudentName();
        }
        System.out.println(best + " лучший Когтевранец , чем " + worst);
    }
}