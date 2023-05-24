package shopMall;

import java.util.ArrayList;

public class Buyer {
	Buyer() {

	}

	Buyer(String id, String name, String nickName) {
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	
//	배열
//	Product[] cart = new Product[10];
//	cart[0]=p;
// 	Collection
	ArrayList<Product> list = new ArrayList();
	//cart[i] = p, list.add(p); 객체추가
	//cart[0] , list.get(0) 읽어오기
	//cart.length, list.size : 총개수
	
	String id;
	String pw;
	String name;
	String nickName;

	int money = 10000;
	int bonusPoint = 0;
	
	void buyList() {
		System.out.print("구매목록 : ");
		for (int i = 0; i <list.size(); i++) {
			Product p = (Product) list.get(i); //Object
			if(i==0) 
				System.out.print(p.productName);
			else 
				System.out.print(","+p.productName);
		}
		System.out.println();
	}

	// Product p = new Tv(); //부모의 참조변수에 자손의 객체를 받음.
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("보유금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		
		
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println("구매 : " + p.productName);
		list.add(p);
	}
//	//Product p = new Computer();
//	void buy(Computer c) {
//		money = money - c.price; 
//		bonusPoint = bonusPoint + c.bonusPoint;
//		System.out.println("구매 : "+c.productName);
//	}
//	void buy(Speaker s) {
//		money = money - s.price; 
//		bonusPoint = bonusPoint + s.bonusPoint;
//		System.out.println("구매 : "+s.productName);
//	}
//	void buy(Washer w) {
//		money = money - w.price; 
//		bonusPoint = bonusPoint + w.bonusPoint;
//		System.out.println("구매 : "+w.productName);
//	}
}
