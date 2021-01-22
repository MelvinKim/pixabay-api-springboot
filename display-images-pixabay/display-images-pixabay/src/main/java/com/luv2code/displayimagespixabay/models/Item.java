package com.luv2code.displayimagespixabay.models;

public class Item {

    //declare the variables
    private String url;
    private String desc;
    private int likes;
    private int comments;

    //getters and setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    //toString

    @Override
    public String toString() {
        return "Item{" +
                "url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
