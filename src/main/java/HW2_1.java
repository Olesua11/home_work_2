
import java.util.Random;



public class HW2_1 {

    public static void main (String[] args) {
        int randomAge = generateRandomAge();
        test(23, 10);
        test(randomAge, 10);
    }
    public static void test(int age, int temperature) {
        String result = checkGoingOut(age, temperature);
        System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + result);
    }
    public static int generateRandomAge() {
        Random random = new Random();
        // Генерируем случайный возраст от 0 до 100
        return random.nextInt(101);
    }

    public static String checkGoingOut(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}


