package course_2.course_22;

public class Hogwarts {
    private final String studentName;
    private final String powerOfMagic = "Сила магии";
    private int forcePowerOfMagic;
    private final String transgressionDistance = "Расстояние трансгрессии";
    private int forceTransgressionDistance;

    public Hogwarts(String studentName, int forcePowerOfMagic, int forceTransgressionDistance) {
        this.studentName = studentName;
        this.forcePowerOfMagic = forcePowerOfMagic;
        this.forceTransgressionDistance = forceTransgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getForcePowerOfMagic() {
        return forcePowerOfMagic;
    }

    public void setForcePowerOfMagic(int forcePowerOfMagic) {
        this.forcePowerOfMagic = forcePowerOfMagic;
    }

    public String getTransgressionDistance() {
        return transgressionDistance;
    }

    public int getForceTransgressionDistance() {
        return forceTransgressionDistance;
    }

    public void setForceTransgressionDistance(int forceTransgressionDistance) {
        this.forceTransgressionDistance = forceTransgressionDistance;
    }

    public static void CompareStudent(Hogwarts st1, Hogwarts st2) {
        int delta = st1.forcePowerOfMagic + st1.forceTransgressionDistance - st2.forcePowerOfMagic - st2.forceTransgressionDistance;
        if (delta == 0) {
            System.out.println("Мощности обоих сущностей, " + st1.studentName + " и " + st2.studentName + ", равны");
        } else if (delta > 0) {
            System.out.println(st1.studentName + " обладает бОльшей мощностью магии, чем " + st2.studentName);
        } else {
            System.out.println(st2.studentName + " обладает бОльшей мощностью магии, чем " + st1.studentName);
        }
    }
}
