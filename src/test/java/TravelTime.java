public class TravelTime {
    public static void main(String[] args) {
        final int a = 60;
        double b = 51.35;
        double c = a / b;
        double scale = Math.pow(10, 1);
        double result = Math.ceil(c * scale) / scale;
        double d = 0.6;
        double e = c * d;
        double scale_two = Math.pow(10, 1);
        double result_two = Math.ceil(e * scale_two) / scale_two;
        String s = "расстояние в километрах от дома до офиса";
        String f = "средняя скорость такси";
        String h = "время за которое тестировщик добирается от дома до офиса";
        String j = "расстояние в километрах от дома до офиса";
        System.out.println("расстояние в километрах от дома до офиса: " + a);
        System.out.println("средняя скорость такси: " + b);
        System.out.println("время за которое тестировщик добирается от дома до офиса: " + (result));
        System.out.println("коеффициент замедления транспорта: " + d);
        System.out.println("время, за которое тестировщик добирается на такси с работы: " +
                "домой: " + (result_two));
    }
}
