
public class BillTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillingFactory billingFactory = new BillingFactory();
		BillStore billStore = new BillStore(billingFactory);
		
		Bill bill = billStore.billStatus("Utility");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
		
		bill = billStore.billStatus("Subscription");
		System.out.println("Bill Type is: "+ bill.getBillType()+"\n");
	}

}
