package com.plus256.www.voteme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.json.JSONArray;
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
        /*ArrayList<Feed>feed_list=new ArrayList<Feed>();
        String feeds=getString(R.string.Feeds);//JSON SOURCE-FILE
        try{
            JSONArray feed_array=new JSONArray(feeds);
            for(int i=0; i<feed_array.length(); i++){
                JSONObject feed=feed_array.getJSONObject(i);

                Feed this_feed=new Feed();

                this_feed.setImage(feed.getString("image"));
                this_feed.setDate(feed.getString("date"));
                this_feed.setText(feed.getString("text"));
                this_feed.setLikes(feed.getString("likes"));
                this_feed.setComments(feed.getString("comments"));
                this_feed.setShares(feed.getString("shares"));

                feed_list.add(this_feed);
            }
        }
        catch(JSONException e){
            e.printStackTrace();
        }

        ListView body_wrapper=(ListView)findViewById(R.id.body_wrapper);
        FeedAdapter feed_adapter=new FeedAdapter(getApplicationContext(), R.layout.main_feed, feed_list);
        body_wrapper.setAdapter(feed_adapter);*/
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
