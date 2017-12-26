package processes;
public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {
	public SmartPhoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	protected void assembleDevice(){
		System.out.println("Assembled Smartphone");
	}
	protected void testDevice(){
		System.out.println("Tested Smartphone");
		
	}
	protected void packageDevice(){
		System.out.println("Packaged Smartphone");
		
	}
	protected void storeDevice(){
		System.out.println("Stored Smartphone");
		
	}

}
