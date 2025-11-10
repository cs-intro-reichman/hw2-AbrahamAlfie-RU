public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        hours = (hours > 12) ? (hours - 12) : hours;

        String leadingZeroHours = (newHours < 10) ? "0" : "";
        String leadingZeroMinutes = (newMinutes < 10) ? "0" : "";

        System.out.println(leadingZeroHours + newHours + ":" + leadingZeroMinutes + newMinutes);
    }
}
