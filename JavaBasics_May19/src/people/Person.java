package people;		
public class Person 
{
    private String name;
    private String haircolor;
    private String eyecolor;
    private String skincolor;
    private double height;
    private int weight;
	

    public Person()
		{ name = "noname";
				haircolor = "nocolor";
				eyecolor = "nocolor";
				skincolor = "nocolor";
				height = 0;
				weight = 0;
		}

    public Person(String name, String haircolor, String eyecolor, String skincolor, double height, int weight)
		{ this.name = name;
				this.haircolor = haircolor;
				this.eyecolor = eyecolor;
				this.skincolor = skincolor;
				this.height = height;
				this.weight = weight;
		}

    public String title()
		{ return "Person:";
		}

    public void printData()      // no linefeed
		{ System.out.printf("name: %s, haircolor: %s, eyecolor: %s, skincolor: %s, height: %.1f, weight: %d",  
						name, haircolor, eyecolor, skincolor, height, weight);
		}

    public void print()
		{ System.out.printf("%s\n",title());
				printData();
				System.out.printf("\n");
		}
}
	
