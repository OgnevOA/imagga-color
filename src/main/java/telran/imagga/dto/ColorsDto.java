package telran.imagga.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ColorsDto {
	List<ColorInfoDto> background_colors;
	double color_percent_threshold;
	int color_variance;
	List<ColorInfoDto> foreground_colors;
	List<ColorInfoDto> image_colors;
	double object_percentage;
}
