/**
 * Homework8_5 pt 2
 * 
 * @author Dhruv
 *
 */
public class AddressBook {
	public static void main(String[] args) {
		Contact avy = new Contact();
		avy.setGetFirstName("Avy ");
		avy.setGetLastName("Garothaya ");
		avy.setGetEmailId("avyg@dmail.com ");
		avy.setGetCellPhoneNumber("111-343-4256 ");
		avy.setGetHomePhoneNumber("222-543-2438 ");
		avy.setGetWorkPhoneNumber("333-536-4543 ");
		avy.setGetAddress("6482 Luxury Ave ");
		avy.setGetNotes("Has a George Mason University Masters Degree and has 5 years of work experience. ");

		Contact dhyeya = new Contact();
		dhyeya.setGetFirstName("Dhyeya ");
		dhyeya.setGetLastName("Chandi ");
		dhyeya.setGetEmailId("DChandi@dmail.com ");
		dhyeya.setGetCellPhoneNumber("111-635-6495 ");
		dhyeya.setGetHomePhoneNumber("222-357-8746 ");
		dhyeya.setGetWorkPhoneNumber("333-874-5247 ");
		dhyeya.setGetAddress("6256 Beta Dr ");
		dhyeya.setGetNotes("Has a Virginia Tech Masters Degree and has 3 years of work experience. ");

		Contact karthik = new Contact();
		karthik.setGetFirstName("Karthik ");
		karthik.setGetLastName("Vinaykumar ");
		karthik.setGetEmailId("KarthikVinaykumar@dmail.com ");
		karthik.setGetCellPhoneNumber("111-342-5314 ");
		karthik.setGetHomePhoneNumber("222-845-9132 ");
		karthik.setGetWorkPhoneNumber("333-726-1243 ");
		karthik.setGetAddress("5312 Nmd St ");
		karthik.setGetNotes("Has a James Madison College Masters Degree and it is his first job. ");

		Contact dhruv = new Contact();
		dhruv.setGetFirstName("Dhruv ");
		dhruv.setGetLastName("Pisal ");
		dhruv.setGetEmailId("dpisal@dmail.com ");
		dhruv.setGetCellPhoneNumber("111-247-7200 ");
		dhruv.setGetHomePhoneNumber("222-243-5322 ");
		dhruv.setGetWorkPhoneNumber("333-452-3552 ");
		dhruv.setGetAddress("8375 Fast Ave ");
		dhruv.setGetNotes(
				"Has a Harvard University Masters Degree and has 1 year work experience but has raised the previous company profits from more than 130% in the past year. ");

		Contact oreo = new Contact();
		oreo.setGetFirstName("Oreo ");
		oreo.setGetLastName("Garothaya ");
		oreo.setGetEmailId("oripori@dmail.com ");
		oreo.setGetCellPhoneNumber("111-257-1963 ");
		oreo.setGetHomePhoneNumber("222-436-2634 ");
		oreo.setGetWorkPhoneNumber("333-285-3742 ");
		oreo.setGetAddress("7418 Squeaky St ");
		oreo.setGetNotes("Has completed 4 years in Virginia Tech and it is his first job. ");

		Contact chetu = new Contact();
		chetu.setGetFirstName("Chaitaniya ");
		chetu.setGetLastName("Sharma ");
		chetu.setGetEmailId("chetusharma@dmail.com ");
		chetu.setGetCellPhoneNumber("111-364-8152 ");
		chetu.setGetHomePhoneNumber("222-285-8872 ");
		chetu.setGetWorkPhoneNumber("333-436-3242 ");
		chetu.setGetAddress("7418 Big Rd ");
		chetu.setGetNotes("Has completed a James Madison College Maters Degree and it is his first job. ");

		Contact akshith = new Contact();
		akshith.setGetFirstName("Akshith ");
		akshith.setGetLastName("Aambekar ");
		akshith.setGetEmailId("AkshithA@dmail.com ");
		akshith.setGetCellPhoneNumber("111-464-2581 ");
		akshith.setGetHomePhoneNumber("222-444-4634 ");
		akshith.setGetWorkPhoneNumber("333-222-3752 ");
		akshith.setGetAddress("9542 Tj Rd ");
		akshith.setGetNotes(
				"Has completed a Virginia Tech Maters Degree and it is his second job with a 4 year work experience. ");

		Contact loki = new Contact();
		loki.setGetFirstName("Loki ");
		loki.setGetLastName("Odinson ");
		loki.setGetEmailId("loki@dmail.com ");
		loki.setGetCellPhoneNumber("111-334-8452 ");
		loki.setGetHomePhoneNumber("222-385-8852 ");
		loki.setGetWorkPhoneNumber("333-466-3742 ");
		loki.setGetAddress("7418 Asgard Ave ");
		loki.setGetNotes("Has been to James Madison College and it is his first job. ");

		Contact peter = new Contact();
		peter.setGetFirstName("Peter ");
		peter.setGetLastName("Parker ");
		peter.setGetEmailId("chetusharma@dmail.com ");
		peter.setGetCellPhoneNumber("111-364-8152 ");
		peter.setGetHomePhoneNumber("222-285-8872 ");
		peter.setGetWorkPhoneNumber("333-436-3242 ");
		peter.setGetAddress("7418 Big Rd ");
		peter.setGetNotes("Has completed a Columbia University Maters Degree and it is his first job. ");

		Contact steve = new Contact();
		steve.setGetFirstName("Steve ");
		steve.setGetLastName("Jobs ");
		steve.setGetEmailId("sjobs@dmail.com ");
		steve.setGetCellPhoneNumber("111-064-6152 ");
		steve.setGetHomePhoneNumber("222-999-0642 ");
		steve.setGetWorkPhoneNumber("333-890-3071 ");
		steve.setGetAddress("8370 Apple Blvd ");
		steve.setGetNotes("Has completed a James Madison College Maters Degree and it is his first job. ");

		String employee = ReadUserInput.readUserStringInput("Enter employee name : ");
		if (employee == "Avy") {
			System.out.println("Employee name is " + avy.getGetFirstName() + avy.getGetLastName());
			System.out.println("Employee email id is " + avy.getGetEmailId());
			System.out.println("Employee phone number is " + avy.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + avy.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + avy.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + avy.getGetAddress());
			System.out.println("Employee notes are " + avy.getGetNotes());
		} else if (employee == "Dhyeya") {
			System.out.println("Employee name is " + dhyeya.getGetFirstName() + dhyeya.getGetLastName());
			System.out.println("Employee email id is " + dhyeya.getGetEmailId());
			System.out.println("Employee phone number is " + dhyeya.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + dhyeya.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + dhyeya.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + dhyeya.getGetAddress());
			System.out.println("Employee notes are " + dhyeya.getGetNotes());
		} else if (employee == "Karthik") {
			System.out.println("Employee name is " + karthik.getGetFirstName() + karthik.getGetLastName());
			System.out.println("Employee email id is " + karthik.getGetEmailId());
			System.out.println("Employee phone number is " + karthik.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + karthik.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + karthik.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + karthik.getGetAddress());
			System.out.println("Employee notes are " + karthik.getGetNotes());
		} else if (employee == "Dhruv") {
			System.out.println("Employee name is " + dhruv.getGetFirstName() + dhruv.getGetLastName());
			System.out.println("Employee email id is " + dhruv.getGetEmailId());
			System.out.println("Employee phone number is " + dhruv.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + dhruv.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + dhruv.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + dhruv.getGetAddress());
			System.out.println("Employee notes are " + dhruv.getGetNotes());
		} else if (employee == "Oreo") {
			System.out.println("Employee name is " + oreo.getGetFirstName() + oreo.getGetLastName());
			System.out.println("Employee email id is " + oreo.getGetEmailId());
			System.out.println("Employee phone number is " + oreo.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + oreo.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + oreo.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + oreo.getGetAddress());
			System.out.println("Employee notes are " + oreo.getGetNotes());
		} else if (employee == "Chetu") {
			System.out.println("Employee name is " + chetu.getGetFirstName() + chetu.getGetLastName());
			System.out.println("Employee email id is " + chetu.getGetEmailId());
			System.out.println("Employee phone number is " + chetu.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + chetu.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + chetu.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + chetu.getGetAddress());
			System.out.println("Employee notes are " + chetu.getGetNotes());
		} else if (employee == "Akshith") {
			System.out.println("Employee name is " + akshith.getGetFirstName() + akshith.getGetLastName());
			System.out.println("Employee email id is " + akshith.getGetEmailId());
			System.out.println("Employee phone number is " + akshith.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + akshith.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + akshith.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + akshith.getGetAddress());
			System.out.println("Employee notes are " + akshith.getGetNotes());
		} else if (employee == "Loki") {
			System.out.println("Employee name is " + loki.getGetFirstName() + loki.getGetLastName());
			System.out.println("Employee email id is " + loki.getGetEmailId());
			System.out.println("Employee phone number is " + loki.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + loki.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + loki.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + loki.getGetAddress());
			System.out.println("Employee notes are " + loki.getGetNotes());
		} else if (employee == "Peter") {
			System.out.println("Employee name is " + peter.getGetFirstName() + peter.getGetLastName());
			System.out.println("Employee email id is " + peter.getGetEmailId());
			System.out.println("Employee phone number is " + peter.getGetCellPhoneNumber());
			System.out.println("Employee home phone number is " + peter.getGetHomePhoneNumber());
			System.out.println("Employee work phone number is " + peter.getGetWorkPhoneNumber());
			System.out.println("Employee address is " + peter.getGetAddress());
			System.out.println("Employee notes are " + peter.getGetNotes());
		} else if (employee == "Steve") {
			System.out.println("Employee name is " + steve.getGetFirstName() + steve.getGetLastName());
		System.out.println("Employee email id is " + steve.getGetEmailId());
		System.out.println("Employee phone number is " + steve.getGetCellPhoneNumber());
		System.out.println("Employee home phone number is " + steve.getGetHomePhoneNumber());
		System.out.println("Employee work phone number is " + steve.getGetWorkPhoneNumber());
		System.out.println("Employee address is " + steve.getGetAddress());
		System.out.println("Employee notes are " + steve.getGetNotes());
		} else 
			System.out.println("Invalid Name");
		
		
}
}
