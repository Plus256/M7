package com.plus256.www.voteme;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Collins on 7/29/15.
 */
public class FeedAdapter extends ArrayAdapter<Feed> {

    private List<Feed> feed_list;

    public FeedAdapter(Context context, int resource, List<Feed> objects){
        super(context, resource, objects);
        this.feed_list=objects;
    }

}
