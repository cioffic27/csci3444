package csci3444.inheritance;



public abstract class PersonBaseImpl implements Person {
	protected String  name;
	
	
	public PersonBaseImpl(String _name) {
		name = _name;
		
	}
	
	public PersonBaseImpl() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String getName() {
		return name;
	}

	
	

}
