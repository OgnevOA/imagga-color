package telran.imagga.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import telran.imagga.dto.ImageColorsDto;

public class ColorsInfoAppl {
	static RestTemplate restTemplate = new RestTemplate();
	final static String TOKEN = "";

	public static void main(String[] args) {
		String httpUrl = "https://api.imagga.com/v2/colors";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(httpUrl)
												.queryParam("image_url", "https://images8.alphacoders.com/414/414960.jpg");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", TOKEN);
		RequestEntity<String> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, builder.build().toUri());
		ResponseEntity<ImageColorsDto> responseEntity = restTemplate.exchange(requestEntity, ImageColorsDto.class);
		responseEntity.getBody().printImageColors();
	}

}
