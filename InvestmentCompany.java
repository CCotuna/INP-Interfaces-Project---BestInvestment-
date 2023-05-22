import java.util.ArrayList;

public class InvestmentCompany {

	private ArrayList<Project> projects;
	
	
	public InvestmentCompany() {
		this.projects = new ArrayList<Project>();
	}

	public void addProject(Project p) {
		projects.add(p);
	}
	
	public Project getBestInvestment() {
		Project bestInvestment = null;
		double minRisk = Double.MAX_VALUE;
		for(Project p : projects) {
			double risk = p.getRisk();
			if(risk < minRisk) {
				risk = minRisk;
				bestInvestment = p;
			}
		}
		return bestInvestment;
		
	}
	
	public static void main(String[] args) {
		InvestmentCompany company = new InvestmentCompany();
		
		Manager manag1 = new Manager("John", 50);
		Manager manag2 = new Manager("Bob", 40);
		
		Project p1 = new CommercialProject("Project1", "Objective: Prosperity", 1000000, manag1, 1, "5 ani");
		Member m1 = new Member("Member1", 20);
		Member m2 = new Member("Member2", 30);
		p1.addMember(m1);
		p1.addMember(m2);
		company.addProject(p1);

		
		Project p2 = new MilitaryProject("Project2", "Objective: war", 2000000, manag2, "20.10.2080", "mangoVerde");
		p2.addMember((new Member("Member3", 40)));
		p2.addMember((new Member("Member4", 50)));
		company.addProject(p2);

		Project p3 = new OpenSourceProject("Project3", "Objective: mailing", 500000, manag1, "mailingList@gmail.com");
		p3.addMember(m1);
		p3.addMember(m2);

		
		Project bestProject = company.getBestInvestment();
		if(bestProject == null) {
			System.out.println("There are no projects right now.");
		}
		else {
			System.out.println("Best investment project is: "+ bestProject.getTitle());
		}
		
		
	}
}
