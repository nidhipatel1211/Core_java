package corejava;

public class innerclsexe {
	public fruit m;
	
	public innerclsexe() {
	m=new fruit("kiwi");	
	System.out.println(m.name);
	}

	public class fruit
	{
		public String name;

		public fruit(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}



	public String getName(String name) {
		return name;
	}



	public String setName(String name) {
		
		return name;
	}


}
