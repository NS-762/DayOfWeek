public enum DayOfWeek {
    MONDAY (), TUESDAY (),
    WEDNESDAY (), THURSDAY (7),
    FRIDAY (),
    SATURDAY (0), SUNDAY (0);

    private int workingHours = 9;

    DayOfWeek() {
    }

    DayOfWeek(int workingHours) {
        this.workingHours = workingHours;
    }


    public String getWorkingHours() {
        int remainingHours = 0;

        for (DayOfWeek day : DayOfWeek.values()) { //считает все рабочие часы за неделю
            remainingHours += day.workingHours;
        }

        if (workingHours == 0) {
            return "Сегодня выходной";
        } else {
            for (DayOfWeek day : DayOfWeek.values()) { //считает, сколько осталось часов
                if (day != this) {
                    remainingHours -= day.workingHours;
                } else {
                    break;
                }
            }
//            return "Осталось + "Integer.toString(remainingHours);
            return "Осталось часов: " + remainingHours;
        }

    }
}
