
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public Author(){
		this.name = "";
		this.email = "";
		this.gender = ' ';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		return ((gender == 'm'||gender=='M'?"Male":
			gender == 'f'||gender=='F'?"Female":""));
	}
	public String ToString() {
		return "Author name: "+name+" ("+email+";"+getGenderName()+")";
	}
}
