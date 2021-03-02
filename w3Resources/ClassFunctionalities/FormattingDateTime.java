package w3Resources.ClassFunctionalities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}

// The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:

// Value	        Example	

// yyyy-MM-dd	    "1988-09-29"	
// dd/MM/yyyy	    "29/09/1988"	
// dd-MMM-yyyy	    "29-Sep-1988"	
// E, MMM dd yyyy	"Thu, Sep 29 1988"