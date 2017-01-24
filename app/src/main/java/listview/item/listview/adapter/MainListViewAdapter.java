package listview.item.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import listview.item.MainListViewItem;
import www.devetude.net.stopwatch.R;

/**
 * Created by user on 2017-01-24.
 */
public class MainListViewAdapter extends BaseAdapter {

    private ArrayList<MainListViewItem> mainArrayList;

    public MainListViewAdapter(ArrayList<MainListViewItem> mainArrayList) {
        this.mainArrayList = mainArrayList;
    }

    @Override
    public int getCount() {
        return mainArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mainArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService((context.LAYOUT_INFLATER_SERVICE));
            convertView = layoutInflater.inflate(R.layout.listview_item_main, parent, false);

        }

        final MainListViewItem mainListViewItem = mainArrayList.get(position);

        TextView tvTime = (TextView) convertView.findViewById(R.id.tv_list_view_item);
        tvTime.setText(mainArrayList.get(position).getTimeStr());

        final Button btnControl = (Button) convertView.findViewById(R.id.btn_Listview_item_control);

        if (mainListViewItem.getIsRunning()) {
            btnControl.setText("중지");


        } else {
            btnControl.setText("시작");

        }

        btnControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainListViewItem.getIsRunning()) {
                    btnControl.setText("시작");
                    mainListViewItem.setIsRunning(false);
                } else {
                    btnControl.setText("중지");
                    mainListViewItem.setIsRunning(true);
                }
            }
        });

        Button btnDelete = (Button) convertView.findViewById(R.id.btn_Listview_item_delete);


        return convertView;
    }
}
