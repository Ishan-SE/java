class Constructors {
	public Constructors(){
		System.out.println("Default Constructors");
	}
	public Constructors(String msg){
		System.out.println("Parameter Constructor : " + msg);
	}
	public static void main(String[] args){
		Constructors defaultConstructors= new Constructors();
		Constructors paraConstructors= new Constructors("Ishan");
	}
}