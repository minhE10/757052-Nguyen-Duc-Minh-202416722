import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Monthandday {
    public static void main(String args[]) throws  IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        String time=br.readLine();
        
        String [] parts=time.split(" ");
    
       
        
        Map <String, Integer> month_day =new HashMap<>();
        month_day.put("Jan", 31);
        month_day.put("Feb", 28);          
        month_day.put("Mar", 31);
        month_day.put("Apr", 30);
        month_day.put("May", 31);
        month_day.put("Jun", 30);
        month_day.put("Jul", 31);
        month_day.put("Aug", 31);
        month_day.put("Sep", 30);
        month_day.put("Oct", 31);           
        month_day.put("Nov", 30);
        month_day.put("Dec", 31);
        month_day.put("1", 31);
        month_day.put("2", 28);
        month_day.put("3", 31); 
        month_day.put("4", 30);
        month_day.put("5", 31);
        month_day.put("6", 30);
        month_day.put("7", 31);
        month_day.put("8", 31);
        month_day.put("9", 30);
        month_day.put("10", 31);
        month_day.put("11", 30);
        month_day.put("12", 31);
        try {
            int year = Integer.parseInt(parts[1]);
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                month_day.put("Feb", 29);
                month_day.put("2", 29);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing year input");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Invalid year format");
            return;
        }

        if (parts[0].length()>2) {
            
            String sub= parts[0].substring(0,3);
            if (!month_day.containsKey(sub)) {
                System.out.println("Invalid month");
            }
            else {
                System.out.println(month_day.get(sub));
            }
        }
        else {
            if (!month_day.containsKey(parts[0])) {
                System.out.println("Invalid month");
            }
            else {
                System.out.println(month_day.get(parts[0]));
            }
        }
    }
}
