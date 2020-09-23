package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("little kids"),
    OLDER_KIDS("Older kids",7),
    TEENS("Teens", 12),
    MATURE("Mature", 16);
    private  static final int DEFAULT_AGE = 0;
    private String rating;
    private int age;

    Rating(String rating) {
        this.rating = rating;
        this.age = DEFAULT_AGE;
    }

    Rating(String rating, int age) {
        this.rating = rating;
        this.age = age;
    }

    public String getRating() {
        return rating;
    }

    public int getAge() {
        return age;
    }
}
