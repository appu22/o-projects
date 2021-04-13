package com.xworkz.photo.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PhotoDTO {
	@NonNull
	private PhotoType type;
	@NonNull
	private float size;
	@NonNull
	private String date;
	@NonNull
	private PhotoQualityEnum quality;
	@NonNull
	private String fileName;

	@Override
	public String toString() {
		return "PhotoDTO [type=" + type + ", size=" + size + ", date=" + date + ", quality=" + quality + ", fileName="
				+ fileName + "]";
	}

}
