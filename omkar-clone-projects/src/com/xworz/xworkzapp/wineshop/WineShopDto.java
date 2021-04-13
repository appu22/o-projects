package com.xworz.xworkzapp.wineshop;

public class WineShopDto implements Cloneable {

	String wineShopname;
	int noOfTables;
	int licenceNo;
	String gstNo;

	public WineShopDto(String wineShopname, int noOfTables, int licenceNo, String gstNo) {
		super();
		this.wineShopname = wineShopname;
		this.noOfTables = noOfTables;
		this.licenceNo = licenceNo;
		this.gstNo = gstNo;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof WineShopDto) {
			WineShopDto dto = (WineShopDto) obj;
			if (dto.licenceNo == this.licenceNo && dto.gstNo.equals(this.gstNo) && dto.noOfTables==this.noOfTables) {
				System.out.println(" all data matched ");
				return true;
			} else {
				System.out.println("data is not matched ");
			}
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Hii i am  toString Method";
	}

}
