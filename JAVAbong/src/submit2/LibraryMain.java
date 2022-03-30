package submit2;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Book book1 = new Book(1, "삼국지");
		Book book2 = new Book(2, "해리포터와 마법사의 돌");
		Book book3 = new Book(3, "해리포터와 비밀의 방");
		Book book4 = new Book(4, "해리포터와 아즈카반의 죄수");
		Book book5 = new Book(5, "해리포터와 불사조 기사단");
		Book book6 = new Book(6, "해리포터와 혼혈왕자");
		Book book7 = new Book(7, "해리포터와 죽음의 성물");
		Book book8 = new Book(8, "어린왕자");
		Book book9 = new Book(9, "나의 라임 오렌지나무");
		Book book10 = new Book(10, "이것이 자바다");
		Book book11 = new Book(11, "좋은생각");
		Book book12 = new Book(12, "반지의 제왕: 반지 원정대");
		Book book13 = new Book(13, "반지의 제왕: 두 개의 탑");
		Book book14 = new Book(14, "반지의 제왕: 왕의 귀환");
		Book book15 = new Book(15, "토익보카");
		Book book16 = new Book(16, "개미");

		Library bookList = Library.getInstance();

		bookList.bookList.add(book1);
		bookList.bookList.add(book2);
		bookList.bookList.add(book3);
		bookList.bookList.add(book4);
		bookList.bookList.add(book5);
		bookList.bookList.add(book6);
		bookList.bookList.add(book7);
		bookList.bookList.add(book8);
		bookList.bookList.add(book9);
		bookList.bookList.add(book10);
		bookList.bookList.add(book11);
		bookList.bookList.add(book12);
		bookList.bookList.add(book13);
		bookList.bookList.add(book14);
		bookList.bookList.add(book15);
		bookList.bookList.add(book16);

		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.println(">>> ");
			int select = sc.nextInt();
			if (select == 2) {
				System.out.println("책 이름을 입력해주세요: ");
				String bookNM = sc.nextLine();
				for (int i = 0; i < bookList.bookList.size(); i++) {
					if (bookList.bookList.get(i).bookName.contains(bookNM)) {
						System.out.println(bookList.bookList.get(i));
					}
				}
				System.out.print("도서 번호를 입력해주세요: ");
				int rent = sc.nextInt();
				for (int i = 0; i < bookList.bookList.size(); i++) {
					if (bookList.bookList.get(i).bookNumber == rent) {
						System.out.println(bookList.bookList.get(i).bookName + "을(를) 대여하셨습니다.");
						bookList.bookList.get(i).setRent(true);
					}
					
				}
			} else if (select == 1) {
				System.out.print("책 번호를 입력해주세요: ");
				int rent = sc.nextInt();
				for (int i = 0; i < bookList.bookList.size(); i++) {
					if (bookList.bookList.get(i).bookNumber == rent) {
						System.out.println(bookList.bookList.get(i).bookName + "이(가) 입고되었습니다.");
						bookList.bookList.get(i).setRent(false);
					}
					
				}

			} else if (select == 3) {
				showBookList();
			} else if (select == 5) {
				System.out.println("종료하겠습니다");
				break;
			} else if (select == 4) {
				System.out.print("책 번호를 입력해주세요: ");
				int rent = sc.nextInt();
				for (int i = 0; i < bookList.bookList.size(); i++) {
					if (bookList.bookList.get(i).bookNumber == rent) {
						System.out.println(bookList.bookList.get(i));
					}
				}
			}
		}
	}

	public static void showBookList() {
		Library bookList = Library.getInstance();

		for (int i = 0; i < bookList.bookList.size(); i++) {
			bookList.bookList.get(i);
			System.out.println(bookList.bookList.get(i));
		}
	}
}
