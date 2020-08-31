public class DayOfWeekMain {

    public static void main(String[] args) {
        System.out.println(getHours(DayOfWeek.MONDAY));
        System.out.println(getHours(DayOfWeek.SUNDAY));
    }

    public static String getHours(DayOfWeek day) {
        return day.getWorkingHours();
    }
}
