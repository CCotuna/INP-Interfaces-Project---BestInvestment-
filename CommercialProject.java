
public class CommercialProject extends CommercialndMilitary {
	
	private long marketingFunds;
	private int noTeams;
	
	public CommercialProject(String title, String objective, long fund, Manager manager, int noTeams, String deadline) {
		super(title, objective, fund, manager, deadline);
		this.marketingFunds = fund/2;
		this.noTeams = noTeams;
	}


	public double getRisk() {
		return noTeams * 3 / getMembers().size() / getFund() - marketingFunds;
	}

}
