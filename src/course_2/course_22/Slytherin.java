package course_2.course_22;

public class Slytherin extends Hogwarts {
    private final String nameFaculty = "Слизерин";
    private final String slyness = "хитрость";
    private int forceSlyness;
    private final String determination = "решительность";
    private int forceDetermination;
    private final String ambition = "амбициозность";
    private int forceAmbition;
    private final String resourcefulness = "находчивость";
    private int forceResourcefulness;
    private final String power = "жажда власти";
    private int forcePower;

    public Slytherin(String studentName, int forcePowerOfMagic, int forceTransgressionDistance, int forceSlyness, int forceDetermination, int forceAmbition, int forceResourcefulness, int forcePower) {
        super(studentName, forcePowerOfMagic, forceTransgressionDistance);
        this.forceSlyness = forceSlyness;
        this.forceDetermination = forceDetermination;
        this.forceAmbition = forceAmbition;
        this.forceResourcefulness = forceResourcefulness;
        this.forcePower = forcePower;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public String getSlyness() {
        return slyness;
    }

    public int getForceSlyness() {
        return forceSlyness;
    }

    public void setForceSlyness(int forceSlyness) {
        this.forceSlyness = forceSlyness;
    }

    public String getDetermination() {
        return determination;
    }

    public int getForceDetermination() {
        return forceDetermination;
    }

    public void setForceDetermination(int forceDetermination) {
        this.forceDetermination = forceDetermination;
    }

    public String getAmbition() {
        return ambition;
    }

    public int getForceAmbition() {
        return forceAmbition;
    }

    public void setForceAmbition(int forceAmbition) {
        this.forceAmbition = forceAmbition;
    }

    public String getResourcefulness() {
        return resourcefulness;
    }

    public int getForceResourcefulness() {
        return forceResourcefulness;
    }

    public void setForceResourcefulness(int forceResourcefulness) {
        this.forceResourcefulness = forceResourcefulness;
    }

    public String getPower() {
        return power;
    }

    public int getForcePower() {
        return forcePower;
    }

    public void setForcePower(int forcePower) {
        this.forcePower = forcePower;
    }

    @Override
    public String toString() {
        return "Студент ='" + getStudentName() + '\'' + " Факультет - " + getNameFaculty() + "/ " + getPowerOfMagic() + " = " + getForcePowerOfMagic() + "/ " + getTransgressionDistance() + " = " + getForceTransgressionDistance() + "/ " + getSlyness() + " = " + getForceSlyness() + "/ " + getDetermination() + " = " + getForceDetermination() + "/ " + getAmbition() + " = " + getForceAmbition() + "/ " + getResourcefulness() + " = " + getForceResourcefulness() + "/ " + getPower() + " = " + getForcePower();
    }

    public static void CompareStudentsFaculty(Slytherin st1, Slytherin st2) {
        String best = st2.getStudentName();
        String worst = st1.getStudentName();
        int sumPoperties1 = st1.getForceSlyness() + st1.getForceDetermination() + st1.getForceAmbition() + st1.getForceResourcefulness() + st1.getForcePower();
        int sumPoperties2 = st2.getForceSlyness() + st2.getForceDetermination() + st2.getForceAmbition() + st2.getForceResourcefulness() + st2.getForcePower();

        if (sumPoperties1 == sumPoperties2) {
            System.out.println("Студенты " + best + " и " + worst + "равные по сумме свойств Слизеринцы");
            return;
        } else if (sumPoperties1 > sumPoperties2) {
            best = st1.getStudentName();
            worst = st2.getStudentName();
        }
        System.out.println(best + " лучший Слизеринец , чем " + worst);
    }
}
