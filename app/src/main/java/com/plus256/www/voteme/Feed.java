package com.plus256.www.voteme;

/**
 * Created by Collins on 7/29/15.
 */
public class Feed {

    private String feed_image;
    private String feed_date;
    private String feed_text;
    private String feed_likes;
    private String feed_comments;
    private String feed_shares;

    public Feed(String feed_image, String feed_date, String feed_text, String feed_likes, String feed_comments, String feed_shares){
        this.feed_image=feed_image;
        this.feed_date=feed_date;
        this.feed_text=feed_text;
        this.feed_likes=feed_likes;
        this.feed_comments=feed_comments;
        this.feed_shares=feed_shares;
    }

    public String getFeedImage(){
        return this.feed_image;
    }

    public String getFeedDate(){
        return this.feed_date;
    }

    public String getFeedText(){
        return this.feed_text;
    }

    public String getFeedLikes(){
        return this.feed_likes;
    }

    public String getFeedComments(){
        return this.feed_comments;
    }

    public String getFeedShares(){
        return this.feed_shares;
    }


}
