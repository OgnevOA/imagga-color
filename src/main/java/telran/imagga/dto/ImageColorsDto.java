package telran.imagga.dto;

import lombok.Getter;

@Getter
public class ImageColorsDto {
	ResultDto result;
	StatusDto status;
	
	public void printImageColors() {
		System.out.println("Color Name" + "\t\t" + "Parent color name" + "\t" + "Coverage percent");
		System.out.println("Background colors:");
		result.getColors().background_colors.forEach(System.out::println);
		System.out.println("Foreground colors:");
		result.getColors().foreground_colors.forEach(System.out::println);
		System.out.println("Image colors:");
		result.getColors().image_colors.forEach(System.out::println);
	}

}