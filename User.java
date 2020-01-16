package mall;

public class User {
	private String uName;
	private String payType;
	
	public User(String uName, String payType) {
		this.uName = uName;
		this.payType = payType;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	
}
