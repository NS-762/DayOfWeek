public enum DayOfWeek {
    MONDAY ("Осталось 45 часов"), TUESDAY ("Осталось 36 часов"),
    WEDNESDAY ("Осталось 27 часов"), THURSDAY ("Осталось 18 часов"),
    FRIDAY ("Осталось 9 часов"),
    SATURDAY ("Сегодня выходной"), SUNDAY ("Сегодня выходной");

    private String workingHours;

    DayOfWeek(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}
