package arraylist;

public class test {

	public static void main(String[] args) {
		box<orange> o = new box<orange>();
		
		o.createBox(new orange());
		
		box<toy> t = new box<toy>();
		t.createBox(new toy());
		
//		b.createBox(new orange());
//		b.createBox(new toy());
//		b.createBox(new apple());
	}

}

class orange{
	public String toString() {
		return "������ �ڽ�";
	}
}
class toy{
	public String toString() {
		return "�峭�� �ڽ�";
	}
}
class apple{
	public String toString() {
		return "��� �ڽ�";
	}
}




