import java.util.ArrayList;

public abstract class Project implements Risky{
	
	private ArrayList<Member> members;
	private String title, objective;
	private long fund;
	private Manager manager;
	
	public Project(String title, String objective, long fund, Manager manager) {
		this.title = title;
		this.objective = objective;
		this.fund = fund;
		this.manager = manager;
		this.members = new ArrayList<Member>();
	}

	public void addMember(Member m) {
		members.add(m);
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public long getFund() {
		return fund;
	}

	public void setFund(long fund) {
		this.fund = fund;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public Manager getManager() {
		return manager;
	}
	
	
	
}
