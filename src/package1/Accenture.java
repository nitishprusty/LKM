package package1;

public class Accenture {
    protected String cname;
    protected int c_code;
    
    protected Accenture() {
    	System.out.println("Accenture Company");
    }
    
    protected Accenture(String cname,int c_code) {
    	this.cname = cname;
    	this.c_code = c_code;
    	System.out.println("Company Name - " + cname);
    	System.out.println("Company Code - " + c_code);
    }
}
