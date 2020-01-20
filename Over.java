class Over{
	void x(int i){
		System.out.println("one");
	}

	void x(String s){
		System.out.println("two");
	}

	void x(double d){
		System.out.println("three");
	}










	public static void main(String[] args) {
		Over r = new Over();					//1st style of making new object
		r.x("BOO");

		Over r2 = new Over();					//1st style of making new object
		r2.x(2);

		new Over().x(4.3);					// this is known as OBJECT ON THE FLY
	}								// 2nd style of making a new object( used to call object once then the function dies)
}									// need to create new for every object