package javaPro.lesson03.task1;

public class Test {
    public static void main(String[] args) {

    Day day = Day.MONDAY;

    switch (day) {
        case MONDAY:
            System.out.println("Сегодня понедельник");
            break;
        case TUESDAY:
            System.out.println("Сегодня вторник");
            break;
        case WEDNESDAY:
            System.out.println("Сегодня среда");
            break;
        case THURSDAY:
            System.out.println("Сегодня четверг");
            break;
        case FRIDAY:
            System.out.println("Сегодня пятница");
            break;
        case SATURDAY:
            System.out.println("Сегодня суббота");
            break;
        case SUNDAY:
            System.out.println("Сегодня воскресенье");
            break;
    }

        System.out.println(day.ordinal());
        Day day3 = day.valueOf("WEDNESDAY");
        System.out.println(day3);

        Day[] dayArr = Day.values();
        System.out.println(dayArr);
        System.out.println();

//        for (int i = 0; i < day2.length; i++) {
//            System.out.println(day2[i]);
//        }

        for (Day day5: dayArr) {
            System.out.println(day5);
        }

        showDay(day);

        Day day6 = Day.SATURDAY;
        showDay(day6);



    }

    public static void showDay(Day day) {
        if (day.ordinal() < 5) {
            System.out.println(day + " Это рабочий день");
        } else {
            System.out.println(day + " Это выходной день");
        }
    }
}
