package home1227;

public class car {

	public static void main(String[] args) {
		Private String cartype;
		public car() {}
		public car(String cartype) {
			this.cartype=cartype;
		}
		public String getName() {
			return this.cartype;
		}
	}

}


class sedan implements car{
	
}
class suv implements car{
	
}
class supercar implements car{
	
}
class truck implements car{
	
}