package Things;

import java.lang.Exception;

public class ObjectOne extends Exception {

	UserData userdata;
	
	ObjectOne(){}

	private String name;
	private int alter;

	public ObjectOne(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}

	public String fromBack() {

		String neuesWort = "";
		int wortSize = name.length() - 1;

		char[] buch = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			buch[i] = name.charAt(i);

		}

		for (int k = 0; k < buch.length; k++) {

			neuesWort += buch[wortSize--];

		}
		return neuesWort;
	}

	public UserData fixName(String name, String oldPass, String newPass) {

		
			if (userdata.getUsername().equals(name) && userdata.getPass().equals(oldPass)) {
				userdata.setPass(newPass);
				return userdata;
			}
			else {
				return null;
				
			}
		

		
}
}
