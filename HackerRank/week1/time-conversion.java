public static String timeConversion(String s) {
    // Write your code here
    
    String period = s.substring(s.length() -2);
    
    String hours = s.substring(0 ,2);
    String minutes = s.substring(3 ,5);
    String seconds = s.substring(6 ,8);
    
    int hour = Integer.parseInt(hours);
    
    if(period.equals("AM"))
    {
        if(hour == 12)
        {
            hour = 00;
        }
    }
    else{
        if(hour != 12)
        {
            hour += 12;
        }
        
    }
    
    String newHourPart = String.format("%02d" ,hour);
    
    return newHourPart + ":" + minutes +":"+seconds;
}