class Marks {
    private int math;
    private int science;

    public void setMarks(int math, int science) {
        this.math = math;
        this.science = science;
    }

    public int getTotal() {
        return math + science;
    }

    public double getAverage() {
        return (math + science) / 2.0;
    }
}

public class Main18 {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.setMarks(80, 90);
        System.out.println("Total: " + m.getTotal());
        System.out.println("Average: " + m.getAverage());
    }
}
