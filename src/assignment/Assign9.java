package assignment;

class Assign9 {

	// Write a singleton class

	private static Assign9 obj;

	private Assign9() {
	}
	public static Assign9 getObj() {
		if( obj == null) {
			obj = new Assign9();
			
			
		}
		return obj;
	}
}






