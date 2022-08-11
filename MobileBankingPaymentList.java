public class MobileBankingPaymentList{

	private MobileBankingPayment[] mobilePaymentList;
    
	public MobileBankingPaymentList(MobileBankingPayment[] mobilePaymentList){
		this.mobilePaymentList=mobilePaymentList;

	}
	public MobileBankingPayment [] getmobilePaymentList(){
		return mobilePaymentList;
	}

	// public void AddNewPaymentNumber(MobilePayment MobileBank){
	// 	for(int i=0; i<mobilePaymentList.length;i++)
	// 		if(mobilePaymentList[i]==null)
	// 		mobilePaymentList[i]=MobileBank;
	// }
	// public void DeleteCard(MobilePayment MobileBank){
	// 	for(int i=0; i<mobilePaymentList.length;i++){
	// 		if(mobilePaymentList[i]==MobileBank){
    //             mobilePaymentList[i]=null;
	// 		}
	// 		else if(mobilePaymentList[i]!=MobileBank&&i!=mobilePaymentList.length-1)
	// 			continue;
	// 	}
	// }
	public void SearchMobilePaymentNumber(MobileBankingPayment MobileNumber){
		for(int i=0; i<mobilePaymentList.length;i++){
			if(mobilePaymentList[i]==MobileNumber){
				System.out.println("Mobile Bank Found");
			}
			else{
				System.out.println("Mobile Bank not found");
			}
		}
	}
}