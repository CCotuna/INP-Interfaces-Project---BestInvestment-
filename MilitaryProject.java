
public class MilitaryProject extends CommercialndMilitary {

	private String password;
	
	public MilitaryProject(String title, String objective, long fund, Manager manager, String deadline, String password) {
		super(title, objective, fund, manager, deadline);
		this.password = password;
	}
	@Override
	public double getRisk() {
		return getMembers().size() / (password.length() * getFund());
	}	
	
}
