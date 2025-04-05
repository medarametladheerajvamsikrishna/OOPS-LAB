class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature");
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}

public class Main17 {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.setCelsius(25);
        System.out.println("Celsius: " + t.getCelsius());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}
