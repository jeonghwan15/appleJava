package study122201;

public class mart {
	String product_name; // 제품명
	int price; // 제품가격
	String category; // 제품 분류
	int quan; // 수량
	
	mart(){}
	mart(String name,mart int price, String category, int quan){
		this.product_name=name;
		this.price=price;
		this.category=category;
		this.quan=quan;
	}
	
	@Override
	public String to String() {
		String price_ = Integar.toString( price).repalceAll("\\B(?=(\\d{3})+(?!\\d))","," );
		DecimalFormat df = new DecimalFormat("###,###");
		String quan = df.format(quan);
		
		return product_name+" - "+price+"원 ("+quan+"개)";
	}
}