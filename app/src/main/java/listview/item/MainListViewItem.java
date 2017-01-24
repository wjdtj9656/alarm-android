package listview.item;

import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 2017-01-24.
 */
public class MainListViewItem {
    private boolean isRunning;
    private String timeStr;

    public MainListViewItem(String timeStr, boolean isRunning) {
        this.timeStr = timeStr;
        this.isRunning = isRunning;
    }

    public String getTimeStr() {
        return timeStr;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}
