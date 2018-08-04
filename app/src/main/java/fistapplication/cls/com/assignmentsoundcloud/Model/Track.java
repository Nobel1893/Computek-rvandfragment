package fistapplication.cls.com.assignmentsoundcloud.Model;

/**
 * Created by CLS on 8/1/2018.
 */

public class Track {
    String uploader;
    String songName;
    String date;
    String imageUrl;

    public Track(String uploader, String songName, String date, String imageUrl) {
        this.uploader = uploader;
        this.songName = songName;
        this.date = date;
        this.imageUrl = imageUrl;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
