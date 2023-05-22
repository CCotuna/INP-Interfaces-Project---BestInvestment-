
public class OpenSourceProject extends Project{

	private String mailingList;
	
	public OpenSourceProject(String title, String objective, long fund, Manager manager, String mailingList) {
		super(title, objective, fund, manager);
		this.mailingList = mailingList;
	}

	public String getMailingList() {
		return mailingList;
	}

	@Override
	public double getRisk() {
		return getMembers().size()/ getFund();	
	}
}
