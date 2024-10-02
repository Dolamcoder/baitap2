package HOCTAP;

public class Author {
	    private String name;
	    private String email;
	    private char gender;
	    public Author(String a, String b, char c) {
	        this.name = a;
	        this.email = b;
	        this.gender = c;
	    }
	    public String toString() {
	        return "Author Name: " + this.name + ", Email: " + this.email + ", Gender: " + this.gender;
	    }
}
