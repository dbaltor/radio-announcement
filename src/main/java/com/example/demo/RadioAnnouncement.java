package com.example.demo;

public class RadioAnnouncement {

    private static String[] HOURS = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three"
    };

   private boolean hoursTexted = false;
  
   RadioAnnouncement() {
       super();
   }

    RadioAnnouncement(boolean hoursTexted) {
       super();
       this.hoursTexted = hoursTexted;
    }

    public String announce(int hour, int min) {
        // past cases
        if (min == 0) {
            return formatHour(hour) + attachOClockIfNeeded(hour);
        }
        else if( min < 30) {
            var hourAnnounced = formatHour(hour);
            var minAnnounced = formatMin(min);
            return minAnnounced + " past " + hourAnnounced;
        }
        else if(min > 30) { // to cases
            var hourAnnounced = formatHour(hour + 1);    
            var minAnnounced = formatMin(60 - min);
            return  minAnnounced + " to " + hourAnnounced;
        }
        else {
            return "half past " + hour;
        }
    }

    private String attachOClockIfNeeded(int hour) {
       var result = "";
        if (hour != 0 && hour != 12) result += " o'clock";
        return result;
    }

    private String formatHour(int hour) {
        if(hour == 12) {
            return "noon";
        }
        else if (hour == 24 || hour == 0) {
            return "midnight";
        }
        return this.hoursTexted ? HOURS[hour] : String.valueOf(hour);
    }

    private String formatMin(int min) {
        if (min == 15) {
            return "quarter"; 
        }
        return String.valueOf(min);
    }
    
}
