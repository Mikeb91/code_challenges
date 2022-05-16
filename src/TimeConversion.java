public class TimeConversion {

  public static void main(String[] args) {
    String time = "04:59:59AM";
    timeConversion(time);
  }

  public static void timeConversion(String s){
    String[] timeArray = s.split(":");
    String militaryHours = "";
    int hours = Integer.parseInt(timeArray[0]);
    if (timeArray[2].contains("AM")){
        militaryHours = hours == 12 ? "00" : String.format("%02d", hours);
    } else {
      militaryHours = hours == 12 ? "12" : String.format("%02d", (hours + 12));
    }
    System.out.println(militaryHours + ":" + timeArray[1] + ":" + timeArray[2].substring(0,2));
  }

}
