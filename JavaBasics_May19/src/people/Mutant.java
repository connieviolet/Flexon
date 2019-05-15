package people;
public class Mutant extends Person
{ private String superpower;
		public Mutant(String name, String haircolor, String eyecolor, String skincolor, double height, int weight, String superpower)
		{ super(name, haircolor, eyecolor, skincolor, height, weight);
				this.superpower = superpower;
		}
		public String title()
		{ return "Mutant:";
		}
		public void printData()
		{ super.printData();
				System.out.printf(", superpower: %s", superpower);
		}
}