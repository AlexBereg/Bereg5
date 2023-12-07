package course_2.course_22;

public class Puffeduy extends Hogwarts {
    private final String nameFaculty = "Пуффендуй";
    private final String industriousness = "трудолюбиe";
    private int forceIndustriousness;
    private final String fidelity = "верность";
    private int forceFidelity;
    private final String honesty = "честность";
    private int forceHonesty;

    public String getNameFaculty() {
        return nameFaculty;
    }

    public String getIndustriousness() {
        return industriousness;
    }

    public int getForceIndustriousness() {
        return forceIndustriousness;
    }

    public void setForceIndustriousness(int forceIndustriousness) {
        this.forceIndustriousness = forceIndustriousness;
    }

    public String getFidelity() {
        return fidelity;
    }

    public int getForceFidelity() {
        return forceFidelity;
    }

    public void setForceFidelity(int forceFidelity) {
        this.forceFidelity = forceFidelity;
    }

    public String getHonesty() {
        return honesty;
    }

    public int getForceHonesty() {
        return forceHonesty;
    }

    public void setForceHonesty(int forceHonesty) {
        this.forceHonesty = forceHonesty;
    }

    public Puffeduy(String studentName, int forcePowerOfMagic, int forceTransgressionDistance, int forceIndustriousness, int forceFidelity, int forceHonesty) {
        super(studentName, forcePowerOfMagic, forceTransgressionDistance);
        this.forceIndustriousness = forceIndustriousness;
        this.forceFidelity = forceFidelity;
        this.forceHonesty = forceHonesty;
    }

    @Override
    public String toString() {
        return "Студент ='" + getStudentName() + '\'' + " Факультет - " + getNameFaculty()
                + "/ " + getPowerOfMagic() + " = " + getForcePowerOfMagic()
                + "/ " + getTransgressionDistance() + " = " + getForceTransgressionDistance()
                + "/ " + getIndustriousness() + " = " + getForceIndustriousness()
                + "/ " + getFidelity() + " = " + getForceFidelity()
                + "/ " + getHonesty() + " = " + getForceHonesty();
    }

    public static void CompareStudentsFaculty(Puffeduy st1, Puffeduy st2) {
        String best = st2.getStudentName();
        String worst = st1.getStudentName();
        int sumPoperties1 = st1.getForceIndustriousness() + st1.getForceFidelity() + st1.getForceHonesty();
        int sumPoperties2 = st2.getForceIndustriousness() + st2.getForceFidelity() + st2.getForceHonesty();

        if (sumPoperties1 == sumPoperties2) {
            System.out.println("Студенты " + best + " и " + worst + "равные по сумме свойств Пуффендуйцы");
            return;
        } else if (sumPoperties1 > sumPoperties2) {
            best = st1.getStudentName();
            worst = st2.getStudentName();
        }
        System.out.println(best + " лучший Пуффендуец , чем " + worst);
    }
}
