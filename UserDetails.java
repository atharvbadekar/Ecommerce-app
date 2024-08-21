package EcommerceApplication;

public class UserDetails{
	String userName;
	String password;
	String address;
	double phoneNo;
	
	public UserDetails(String userName, String password, String address, double phoneNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Username : "+userName+"Address : "+address+" Phone No : "+phoneNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
