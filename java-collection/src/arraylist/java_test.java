package arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class java_test {

	public static void main(String[] args) {
	
		ArrayList<book> list = Load();

	}
	
	public static ArrayList<book> load() {// book.txt ���� �ҷ�����
	
	ArrayList<book> list = new ArrayList<book>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt")) )
		{
			
			while(true) {
				String line = bf.readLine();
				if(line == null) break;
				String[] tmp = line.split(",");
				book data = new book(tmp[0], tmp[1], Integer.parseInt(tmp[2]) );
				list.add( data );
			}
			
		}catch(Exception e) {
			System.out.println("���� �ε� �� ��ȯ ����");
			e.printStackTrace();
		}
		
		return list;
	}

}




// book[] temp = new book[]