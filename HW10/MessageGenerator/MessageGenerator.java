package HW10.MessageGenerator;

public class MessageGenerator {

    // Метод для генерації інформаційного повідомлення
    public static String infoMessage(String... params) {
        return String.format("INFO: %s, %s", params[0], params[1]);
    }

    // Метод для генерації повідомлення про помилку
    public static String errorMessage(String... params) {
        return String.format("ERROR: %s, Code: %s", params[0], params[1]);
    }

    public static void main(String[] args) {
        String info = MessageGenerator.infoMessage("Запуск додатку", "Версія 60.0.11");
        System.out.println(info);

        String error = MessageGenerator.errorMessage("Файл не знайдено", "404");
        System.out.println(error);
    }
}

