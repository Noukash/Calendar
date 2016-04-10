package andrey.calendar;

public class ItemDetails {
	
	public String get1Name() {
		return name1;
	}
	public void set1Name(String name1) {
		this.name1 = name1;
	}


	public String get2Name() {
		return name2;
	}
	public void set2Name(String name2) {
		this.name2 = name2;
	}
	public String getItem1Description() {
		return item1Description;
	}
	public void setItem1Description(String item1Description) {
		this.item1Description = item1Description;
	}
	public String getItem2Description() {
		return item2Description;
	}
	public void setItem2Description(String item2Description) {
		this.item2Description = item2Description;
	}

	public int getImage1Number() {
		return image1Number;
	}
	public void setImage1Number(int image1Number) {
		this.image1Number = image1Number;
	}
	public int getImage2Number() {
		return image2Number;
	}
	public void setImage2Number(int image2Number) {
		this.image2Number = image2Number;
	}
	
	private String name1;
	private String name2;
	private String item1Description;
	private String item2Description;
	private int image1Number;
	private int image2Number;

	
}
