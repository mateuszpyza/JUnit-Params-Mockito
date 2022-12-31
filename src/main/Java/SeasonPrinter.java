import java.time.Month;

public class SeasonPrinter {
    public static Seasons getSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Seasons.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.AUTUMN;
            default:
                throw new RuntimeException("Problems with input data!");
        }

    }
}
