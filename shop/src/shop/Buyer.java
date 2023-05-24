package shop;

import java.util.ArrayList;

public class Buyer {
	Buyer(){
		
	}
	Buyer(String id, String name, String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	
	ArrayList<Product> list = new ArrayList();
	
	String id;
	String pw;
	String name;
	String nickName;
	
	int money = 10000;
	int bonusPoint = 0;
	
	void buyList() {
		System.out.println("구매목록 : ");
		for(int i = 0; i <list.size(); i++) {
			Product p = (Product) list.get(i);
			if(i==0)
				System.out.print(p.productName);
			else
				System.out.print(","+p.productName);
			
		}
		System.out.println();
	}
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("보유금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println("구매 : "+p.productName);
		list.add(p);
		
	}
}
