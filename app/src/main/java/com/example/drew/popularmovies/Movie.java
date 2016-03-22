package com.example.drew.popularmovies;

/**
I use this class to store the information for each movie as a movie object. As part of the first Android project
I developed, I though this a good solution. As I progressed, I learned a better way to store and retrieve information,
using content loaders in later projects. 
*/

public class Movie {
    private String image;
    private String title;
    private String desc;
    private String year;
    private String rating;

    public Movie() {super();}

    public String getImage(){return image;}

    public void setImage(String image) {this.image=image;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title=title;}

    public String getDesc(){return desc;}

    public void setDesc(String desc){this.desc=desc;}

    public String getYear(){return year;}

    public void setYear(String year){this.year=year;}

    public String getRating(){return rating;}

    public void setRating (String rating){this.rating=rating;}

}
