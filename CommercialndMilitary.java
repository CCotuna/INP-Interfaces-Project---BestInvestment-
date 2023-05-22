
public abstract class CommercialndMilitary extends Project{

	private String deadline;
	private static final int maxMembers = 15;
	
	public CommercialndMilitary(String title, String objective, long fund, Manager manager, String deadline) {
		super(title, objective, fund, manager);
		this.deadline = deadline;
	}

	public String getDeadline() {
		return deadline;
	}

	@Override
	public void addMember(Member m) {
		if(getMembers().size() >= maxMembers) {
			System.out.println("This project has reached the maximum number of members.");
			return;
		}
		super.addMember(m);
	}
	
	
	
}
