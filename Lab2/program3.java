package Lab2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class program3 {
    public static void main(String args[]) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);
    }
}