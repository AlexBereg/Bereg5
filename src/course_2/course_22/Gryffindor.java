package course_2.course_22;

public class Gryffindor extends Hogwarts {
    private final String nameFaculty = "Гриффиндор";
    private final String nobility = "благородство";
    private int forceNobility;
    private final String honor = "честь";
    private int forceHonor;
    private final String bravery = "храбрость";
    private int forceBravery;

    public Gryffindor(String studentName, int forcePowerOfMagic, int forceTransgressionDistance, int forceNobility, int forceHonor, int forceBravery) {
        super(studentName, forcePowerOfMagic, forceTransgressionDistance);
        this.forceNobility = forceNobility;
        this.forceHonor = forceHonor;
        this.forceBravery = forceBravery;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public String getNobility() {
        return nobility;
    }

    public int getForceNobility() {
        return forceNobility;
    }

    public void setForceNobility(int forceNobility) {
        this.forceNobility = forceNobility;
    }

    public String getHonor() {
        return honor;
    }

    public int getForceHonor() {
        return forceHonor;
    }

    public void setForceHonor(int forceHonor) {
        this.forceHonor = forceHonor;
    }

    public String getBravery() {
        return bravery;
    }

    public int getForceBravery() {
        return forceBravery;
    }

    public void setForceBravery(int forceBravery) {
        this.forceBravery = forceBravery;
    }

    @Override
    public String toString() {
        return "Студент ='" + getStudentName() + '\'' + " Факультет - " + getNameFaculty()
                + "/ " + getPowerOfMagic() + " = " + getForcePowerOfMagic()
                + "/ " + getTransgressionDistance() + " = " + getForceTransgressionDistance()
                + "/ " + getNobility() + " = " + getForceNobility()
                + "/ " + getHonor() + " = " + getForceHonor()
                + "/ " + getBravery() + " = " + getForceBravery();
    }

    public static void CompareStudentsFaculty(Gryffindor st1, Gryffindor st2) {
        String best = st2.getStudentName();
        String worst = st1.getStudentName();
        int sumPoperties1 = st1.getForceNobility() + st1.getForceHonor() + st1.getForceBravery();
        int sumPoperties2 = st2.getForceNobility() + st2.getForceHonor() + st2.getForceBravery();

        if (sumPoperties1 == sumPoperties2) {
            System.out.println("Студенты " + best + " и " + worst + "равные по сумме свойств Гриффиндорцы");
            return;
        } else if (sumPoperties1 > sumPoperties2) {
            best = st1.getStudentName();
            worst = st2.getStudentName();
        }
        System.out.println(best + " лучший Гриффиндорец , чем " + worst);
    }

    // Метод 2 от Алексея. Не статик!!
    public void Compare(Gryffindor other) {
        String best = getStudentName();
        String worst = other.getStudentName();
        int sumPoperties1 = getForceNobility() + getForceHonor() + getForceBravery();
        int sumPoperties2 = other.getForceNobility() + other.getForceHonor() + other.getForceBravery();

        if (sumPoperties1 == sumPoperties2) {
            System.out.println("Студенты " + best + " и " + worst + "равные по сумме свойств Гриффиндорцы");
            return;
        } else if (sumPoperties1 > sumPoperties2) {
            best = other.getStudentName();
            worst = getStudentName();
        }
        System.out.println(best + " лучший Гриффиндорец , чем " + worst);
    }
}