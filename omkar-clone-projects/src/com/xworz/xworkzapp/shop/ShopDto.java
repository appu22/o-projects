package com.xworz.xworkzapp.shop;

public class ShopDto implements Cloneable {

	String shopType;
	String shopName;
	String shopLocation;
	String ownerName;

	public ShopDto(String shopType, String shopName, String shopLocation, String ownerName) {
		super();
		this.shopType = shopType;
		this.shopName = shopName;
		this.shopLocation = shopLocation;
		this.ownerName = ownerName;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof ShopDto) {
			ShopDto dto = (ShopDto) obj;
			
			if (dto.ownerName.equals(this.ownerName)) {
				System.out.println("Owner name is same ");
				return true;
			} else 
				System.out.println("Owner name is not same  ");
				return false;
			}

		return false;
	}

}
