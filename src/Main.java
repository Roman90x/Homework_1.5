public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("1.7. Строки");
        System.out.println();

        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();

        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println();

        Задание_3();
    }
    public static void Задание_3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё','е'));

    }
}