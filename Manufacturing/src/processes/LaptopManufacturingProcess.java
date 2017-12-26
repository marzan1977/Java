package processes;
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

	public LaptopManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("Assembled Laptop");
	}

	@Override
	protected void testDevice() {
		System.out.println("Tested Laptop");
		
	}

	@Override
	protected void packageDevice() {
		System.out.println("Packaged Laptop");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("Stored Laptop");
		
	}
	
	

}
