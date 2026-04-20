import java.lang.Math;

 public class GeometryCalculator
{
    int precision;


    // double base;
    // double height;
    // double areaRetangle;
    //
    double side1;
    double side2;
    double side3;
    double areaTriangle;

    public double calculateArea(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double calculateArea(double base, double height)
    {
        double area = base * height;
        return area;
    }

      public double calculateArea(double... sides)
    {
        double soma = 0;
        for(double i : sides){
            soma += i;
        }
        return  soma;
    }


    public double calculateAreaHeron(double soma, double side1, double side2, double side3)
    {
        soma /= 2;
        System.out.println(soma);
        return  Math.sqrt(soma * (soma - side1) * (soma - side2) * (soma - side3));
    }


    public GeometryCalculator() {
        this.precision = 2;
    }

    public GeometryCalculator(int precision) {
        this.precision = precision;
    }

    public GeometryCalculator(double precision) {
        this(2);
    }

   public static void main(String[] args)
    {
        GeometryCalculator c1 = new GeometryCalculator();

        System.out.printf("%." + c1.precision + "f\n", c1.calculateArea(6));
        System.out.printf("%." + c1.precision + "f\n", c1.calculateArea(6, 4));
        double soma = c1.calculateArea(2, 2, 2);
        System.out.printf("%." + c1.precision + "f\n", c1.calculateAreaHeron(soma, 2, 2, 2));
    }
}
