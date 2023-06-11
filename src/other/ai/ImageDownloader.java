package other.ai;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageDownloader {

    private static final String API_URL = "https://api.pexels.com/v1/search?query=nature"; // Modify as per your need
    private static final String DIRECTORY_PATH = "imagesFromNet/";

    public static void main(String[] args) {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            boolean result = directory.mkdir();
            System.out.println("Result of directory creation : " + result);
        }

        downloadImages();
        System.out.println("Download complete!");
    }

    private static void downloadImages() {
        try {
            HttpResponse<JsonNode> response = Unirest.get(API_URL)
                    .header("Authorization", "fNxhFKaPwXQE9NVumjA6rbFjs1ubN7uZPIrZNmN76vj8Xv2jHrQxC39W")
                    .asJson();

            JsonNode jsonResponse = response.getBody();

            for (int i = 0; i < 10; i++) {
                String imageUrl = jsonResponse.getArray().getJSONObject(0).getJSONArray("photos").getJSONObject(i).getJSONObject("src").getString("large");
                String filename = DIRECTORY_PATH + "image" + (i + 1) + ".jpg";

                HttpResponse<byte[]> imageResponse = Unirest.get(imageUrl).asBytes();
                byte[] imageData = imageResponse.getBody();

                FileOutputStream fos = new FileOutputStream(filename);
                fos.write(imageData);
                fos.close();

                System.out.println("Downloaded image: " + filename);
            }
        } catch (IOException e) {
            System.out.println("Failed to download images: " + e.getMessage());
        }
    }
}
