public class Post {
    private int imageResource;
    private String title;
    private String hashtag;
    private String location;

    public Post(int imageResource, String title, String hashtag, String location) {
        this.imageResource = imageResource;
        this.title = title;
        this.hashtag = hashtag;
        this.location = location;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getHashtag() {
        return hashtag;
    }

    public String getLocation() {
        return location;
    }
}
