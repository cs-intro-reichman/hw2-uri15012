public class TimeCalc {
    public static void main(String[] args) {


        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt ("" + args [0].charAt(3) + args [0].charAt(4));

        int addedTime = Integer.parseInt (args[1]); // parsing the minutes to add

        int newTime = hours * 60 + minutes + addedTime; // calculating the new time in minutes 
        minutes = newTime % 60;
        hours = newTime / 60;
        hours = hours % 24;

        System.out.printf("%02d:%02d", hours, minutes);


        
       
    }
}
