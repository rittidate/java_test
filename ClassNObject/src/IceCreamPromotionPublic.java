
public class IceCreamPromotionPublic {
	public static void main(String [] args){
		int myMonth;
		String myPromotion;
		
		PromotionPublic promotionPublic = new PromotionPublic();
		
		myMonth = promotionPublic.month;
		System.out.println("Promotion in this month [ " + promotionPublic.monthString(myMonth) + " ]");
		System.out.println("\t" + promotionPublic.promotion);
		
		promotionPublic.month = 13;
		myMonth = promotionPublic.month;
		promotionPublic.promotion = "Buy 1 cup of Banana Split, Free Ice Tea";
		
		System.out.println("Promotion in this month [ " + promotionPublic.monthString(myMonth) + " ]");
		System.out.println("\t" + promotionPublic.promotion);
	}
}
