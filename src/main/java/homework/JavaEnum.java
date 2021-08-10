package homework;

public class JavaEnum {

	public static void main(String[] args) {
	//	printThought(Day FRIDAY);
	}	
	
	enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
		
	}

	public static void printThought(Day theDay) {
		
		switch(theDay) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Working day for the man");
			break;
			
		case FRIDAY:
			System.out.println("Happy day");
			break;
			
		case SATURDAY:
		case SUNDAY:
			System.out.println("Ahh, the weekend...");
			break;
			
			default:
				System.out.println("Day not found");
				
				
				;
		}
	}
			}	

				
				
				
		

	


