package submit2;

import java.util.ArrayList;
import java.util.Collections;

public class Submit02 {

	public static void main(String[] args) {
		
		Product product1 = new Product("냉장고", 2000000);
		Product product2 = new Product("TV", 1000000);
		Product product3 = new Product("에어컨", 800000);
		Product product4 = new Product("컴퓨터", 1300000);
		Product product5 = new Product("선풍기", 100000);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productList.add(product5);
		// 2백만, 백만, 팔십만, 백삽십만, 십만
		// 십만 , 백만 , 팔십만 ,백삽십만, 2백만
		
		for(int i=0; i < productList.size(); i++){
			int MaxPrice = productList.get(0).getPrice();
			int MaxIndex = 0;
			for(int j=0; j < productList.size()-i; j++) {
				if(MaxPrice < productList.get(j).getPrice()) {
				MaxPrice = productList.get(j).getPrice();
				MaxIndex = j;
			}
		}	Collections.swap(productList, MaxIndex, productList.size()-1-i);
	}	System.out.println(productList);
		
		for(int i=0; i<productList.size();i++) {
			if(productList.get(i).getName().equals("TV")) {
				System.out.println(productList.indexOf(productList.get(i)));
			}
		}
	

	
	}	
			
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
		
	}

}
