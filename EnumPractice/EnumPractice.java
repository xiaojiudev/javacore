package ly.dai.phat.EnumPractice;

public class EnumPractice {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myLevel = Level.HIGH;

        switch (myLevel) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            default:
                System.out.println("Unknown Level");
        }

        for (Level myElement : Level.values()) {
            System.out.println(myElement);
        }
    }
}
