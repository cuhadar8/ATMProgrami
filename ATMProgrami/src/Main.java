import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kullanıcı adı: ");
		String userName = scanner.nextLine();
		
		System.out.print("Parola: ");
		String password = scanner.nextLine();
		
		int right = 3;
		int totalMoney = 1500;
		
		if(userName.equals("patika")&&password.equals("1234")) {
			
			System.out.println("Hoşgeldiniz. :)");
			String info = "Banka işlemleri\n"+
							"1. Para Çekme\n"+
							"2. Para Yatırma\n"+
							"3. Bakiye Görüntüler\n"+
							"4. Çıkış Yap";
			
			System.out.println(info);
			System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
			int select = scanner.nextInt();
			
			
			switch(select) {
			
			case 1:
				System.out.print("Çekmek istediğiniz tutar: " );
				int price = scanner.nextInt();
				if(totalMoney>=price) {
					totalMoney -= price;
					System.out.println("Para çekme işlemi başarılı. Kalan bakiye: " + totalMoney);
				}
				else {
					System.out.println("Bakiye yetersiz.");
				}
				break;
				
			case 2:
				System.out.print("Yatırmak istediğiniz tutar: ");
				int price1 = scanner.nextInt();
				if(price1>=0) {
					totalMoney += price1;
					System.out.println("Para yatırma işlemi başarılı. Bakiyeniz: " + totalMoney);
				}
				else {
					System.out.println("Geçersiz miktar girişi.");
				}
				break;
				
			case 3:
				System.out.println("Bakiyeniz: " + totalMoney);
				break;
				
			case 4:
				System.out.println("Çıkış yapılıyor.");
				break;
			}
			
		}
		
		else {
			right--;
			System.out.println("Kullancı adı veya parola hatalı.");
			if(right==0) {
				System.out.println("Kartınız bloke edilmiştir");
			}
			else {
				System.out.println("Kalan giriş hakkı: " + right);
			}
		}
		
		
		
	}

}
