package project2;

public class Person {
	private String name;
	private String tel;
	private String address;	
	/**
	 * Personクラスのコンストラクタ
	 * @param name　氏名
	 * @param tel　電話番号
	 * @param address　住所
	 */
	public Person(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel セットする tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

