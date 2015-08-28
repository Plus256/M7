package com.plus256.www.voteme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Collins on 7/29/15.
 */
public class FeedAdapter extends ArrayAdapter<Feed> {

    ArrayList<Feed> feed_list;
    LayoutInflater view_inflater;
    int Resource;
    ViewHolder holder;

    public FeedAdapter(Context context, int resource, ArrayList<Feed> objects){
        super(context, resource, objects);
        feed_list=objects;
        Resource=resource;
        view_inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convert_view, ViewGroup parent){
        View v=convert_view;

        if(v==null){
            holder=new ViewHolder();
            v=view_inflater.inflate(Resource, null);
            holder.image_view=(ImageView)v.findViewById(R.id.feed_image);
            holder.date_view=(TextView)v.findViewById(R.id.feed_date);
            holder.text_view=(TextView)v.findViewById(R.id.feed_text);
            holder.likes_view=(TextView)v.findViewById(R.id.feed_likes);
            holder.comments_view=(TextView)v.findViewById(R.id.feed_comments);
            holder.shares_view=(TextView)v.findViewById(R.id.feed_shares);
            v.setTag(holder);
        }else{
            holder=(ViewHolder)v.getTag();
        }

        holder.date_view.setText(feed_list.get(position).getDate());
        holder.text_view.setText(feed_list.get(position).getText());
        holder.likes_view.setText(feed_list.get(position).getLikes());
        holder.comments_view.setText(feed_list.get(position).getComments());
        holder.shares_view.setText(feed_list.get(position).getShares());

        return v;
    }

    static class ViewHolder{//TO OPTIMIZE THE ListView
        public ImageView image_view;
        public TextView date_view;
        public TextView text_view;
        public TextView likes_view;
        public TextView comments_view;
        public TextView shares_view;
    }

}
