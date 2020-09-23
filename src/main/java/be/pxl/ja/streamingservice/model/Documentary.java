package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Documentary(String title, Rating maturityRating, String topic) {
        super(title, maturityRating);
        this.topic = topic;
        this.setGenre(Genre.DOCUMENTARY);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("topic " + getTopic());
    }

    @Override
    public void pause() {
        super.pause();
        System.out.println("topic " + getTopic());
    }
}
