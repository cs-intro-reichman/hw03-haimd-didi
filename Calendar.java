public class Calendar {

    static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31;
    public static void main(String args[]) {
            int theYear = Integer.parseInt(args[0]);

		 
	 	while (theYear>year) {
	 		advance();
	 		
        }
        while (theYear==year){
            System.out.println(dayOfMonth+"/"+month+"/"+year+(dayOfWeek==1? " Sunday":""));
            advance();
        }
	 }
	

	 private static void advance() {
			dayOfWeek++;
			dayOfWeek%=7;
		if(dayOfMonth>=nDaysInMonth(month,year)){
			dayOfMonth=1;
			month++;
			
			if(month>12){
				month%=12;
				year++;

			}
		} else dayOfMonth++;
	 } 
		 
	private static boolean isLeapYear(int year) {
		if(year%4==0&&(year%100!=0||year%400==0)){
			return true;
		}
		else return false;
	}
	 

	private static int nDaysInMonth(int month, int year) {
		int daysOfMonth;

		switch (month) {

    case 2:  daysOfMonth = isLeapYear(year)? 29 : 28;
             break;

    case 4:  daysOfMonth = 30;
             break;

    case 6:  daysOfMonth = 30;
             break;

    case 9:  daysOfMonth = 30;
             break;

    case 11: daysOfMonth = 30;
             break;

	default: daysOfMonth = 31;
             break;		 

}
		return daysOfMonth;
	}
}
