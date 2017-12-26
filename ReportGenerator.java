
public class ReportGenerator {
	
	private Reporting transactionObject;
	public ReportGenerator(Reporting aTransaction){
		transactionObject = aTransaction;
	}
	public void generateReport(){
		
		System.out.println(transactionObject.getName()+" "+transactionObject.getProductBreakdown()+ 
				" "+transactionObject.getDate());
				
		
	}

}
