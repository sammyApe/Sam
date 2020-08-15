

/*
This method does some thing
 */
public class AnyClass {

	//attributes

	public static void main (String[] args){
		// Java starts
		String name5 = "Osho";
		String name6 = "Ben";
		name5 = addName("Osho","Ben");

		ChoirMember choirMemberA = new ChoirMember();
		choirMemberA.setName("Doreen");
		choirMemberA.setAge("32");
		choirMemberA.setGender("Female");
		choirMemberA.setPart("Alto");


		ChoirMember choirMemberB = new ChoirMember();
		choirMemberB.setName("Abena");
		choirMemberB.setAge("32");
		choirMemberB.setGender("Female");
		choirMemberB.setPart("Soprano");


		ChoirMember choirMemberC = new ChoirMember();
		choirMemberC.setName("Ben");
		choirMemberC.setAge("32");
		choirMemberC.setGender("Male");
		choirMemberC.setPart("Tenor");

	}

	public static String addName( String name1 , String name2){
		String name5 = name1 + name1 ; // Osho + Ben
		name5 = name5 + name2 ; // Osho ben ben
		name5 = name5 + name2 ; // Osho Ben Ben
		return name5;
	}

}
