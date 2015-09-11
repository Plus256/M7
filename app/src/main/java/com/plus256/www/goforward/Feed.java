package com.plus256.www.goforward;

/**
 * Created by Collins on 7/29/15.
 */
public class Feed {

    private String image;
    private String date;
    private String text;
    private String likes;
    private String comments;
    private String shares;

    public Feed(){

    }

    public Feed(String image, String date, String text, String likes, String comments, String shares){
        super();
        this.image=image;
        this.date=date;
        this.text=text;
        this.likes=likes;
        this.comments=comments;
        this.shares=shares;
    }

    //getters and setters

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }

    public String getLikes(){
        return likes;
    }
    public void setLikes(String likes){
        this.likes=likes;
    }

    public String getComments(){
        return comments;
    }
    public void setComments(String comments){
        this.comments=comments;
    }

    public String getShares(){
        return shares;
    }
    public void setShares(String shares){
        this.shares=shares;
    }


}
