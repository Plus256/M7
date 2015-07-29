package com.plus256.www.voteme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView nDrawerList;
    private ArrayAdapter<String> nAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising the drawer list
        String[] navItemsArray={"News", "Polls", "Events", "About", "Volunteer", "Gallery"};
        List<String> navItemsList=new ArrayList<String>(Arrays.asList(navItemsArray));
        nAdapter=new ArrayAdapter<String>(this, R.layout.drawer_list_item, R.id.drawer_list_item, navItemsList);
        nDrawerList=(ListView)findViewById(R.id.left_drawer);
        nDrawerList.setAdapter(nAdapter);

        //JSON FEEDS
        List<Feed>feed_JSON_data=new ArrayList<Feed>();
        String feeds=getString(R.string.Feeds);
        try{
            JSONObject feed_objects=new JSONObject(feeds);
            for(int i=0; i<feed_objects.length(); i++){
                JSONObject feed=feed_objects.getJSONObject(String.valueOf(i));
                String feed_image=feed.getString("image");
                String feed_date=feed.getString("date");
                String feed_text=feed.getString("text");
                String feed_likes=feed.getString("likes");
                String feed_comments=feed.getString("comments");
                String feed_shares=feed.getString("shares");

                feed_JSON_data.add(new Feed(feed_image, feed_date, feed_text, feed_likes, feed_comments, feed_shares));
            }
        }
        catch(JSONException e){
            e.printStackTrace();
        }

        ListView body_wrapper=(ListView)findViewById(R.id.body_wrapper);
        FeedAdapter feeds_adapter=new FeedAdapter(this, R.layout.main_feed, feed_JSON_data);
        body_wrapper.setAdapter(feeds_adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
