package telran.imagga.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;

@Getter
public class ColorInfoDto {
	int r;
	int g;
	int b;
	@JsonAlias({"closest_palette_color"})
	String color;
	String closest_palette_color_html_code;
	@JsonAlias({"closest_palette_color_parent"})
	String colorParent;
	@JsonAlias({"closest_palette_distance"})
	double paletteDistance;
	String html_code;
	double percent;

	@Override
	public String toString() {
		return (color + "\t\t" + colorParent + "\t\t" + percent);
	}

}
