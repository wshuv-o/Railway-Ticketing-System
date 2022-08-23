package payment;

public class CardPaymentCardList{
	private CardPayment[] cardList;
	public CardPaymentCardList(CardPayment[] cardList){
		this.cardList=cardList;

	}
	public CardPayment [] getcardList(){
		return cardList;
	}

	public void AddNewCard(CardPayment card){
		for(int i=0; i<cardList.length;i++)
			if(cardList[i]==null)
			cardList[i]=card;
	}
	public void DeleteCard(CardPayment card){
		for(int i=0; i<cardList.length;i++){
			if(cardList[i]==card){
			cardList[i]=null;
			}
			else if(cardList[i]!=card&&i!=cardList.length-1)
				continue;
		}
	}
	public void Searchcard(CardPayment card){
		for(int i=0; i<cardList.length;i++){
			if(cardList[i]==card){
				System.out.println("card Found");
			}
			else{
				System.out.println("Card not found");
			}
		}
	}
}