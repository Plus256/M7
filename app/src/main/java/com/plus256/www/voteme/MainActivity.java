package com.plus256.www.voteme;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
