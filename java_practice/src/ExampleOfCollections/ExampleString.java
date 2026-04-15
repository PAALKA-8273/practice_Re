package ExampleOfCollections;

public class ExampleString {
	
	public static void main(String[] args) {
		String s1 = "My name is Alka Pal";
		String s2 = new String(" Pal ");
		String s3 = "Alka";
		String s4 = new String("alka");
		String s5= "anant is noida";
		String s6 = "king is alwayas a king";
				
		/*
		 * System.out.println(s1==s3); System.out.println(s1==s4); //memory address
		 * check krta hai System.out.println(s1.equals(s4)); // will check content only
		 * System.out.println(s1.equalsIgnoreCase(s4)); // will check content only -
		 * ignore case as upper and lower System.out.println(s1.concat(s2));
		 * s1.concat("Z"); System.out.println(s1); StringBuffer sb=new
		 * StringBuffer("Abhi"); sb.append("Alka"); System.out.println(sb);
		 * 
		 * System.out.println(s2.indexOf('l')); //System.out.println(s1.charAt(4));
		 */		
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(3, 15));
		System.out.println(s2.trim());
		System.out.println(s1.length());
		System.out.println(s5.replace('n', 'a'));
		System.out.println(s6.replaceAll("king", "queen"));
		
		

	}

}
