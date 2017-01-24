package www.devetude.net.stopwatch.acitivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import listview.item.MainListViewItem;
import listview.item.listview.adapter.MainListViewAdapter;
import www.devetude.net.stopwatch.R;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MainListViewItem> mainArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainArrayList = new ArrayList<>();
        mainArrayList.add(new MainListViewItem("11:11", false));

        MainListViewAdapter mainListViewAdapter = new MainListViewAdapter(mainArrayList);

        ListView listViewMain = (ListView) findViewById(R.id.listview_main);
        listViewMain.setAdapter(mainListViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add:
                Intent addIntent = new Intent(MainActivity.this, AddActivity.class);
                MainActivity.this.startActivity(addIntent);
                break;
            case R.id.action_setting:
                Intent settingIntent = new Intent(MainActivity.this, SettingActivity.class);
                MainActivity.this.startActivity(settingIntent);
                break;

        }
        return true;
    }
}
