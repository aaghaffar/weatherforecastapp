package thealigproject.dexcomchallenge;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ali on 1/11/18.
 */

public class ListAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] imageArray;

    private final String[] dayArray;

    private final String[] tempArray;

    public ListAdapter (Activity context, String[] dayArrayParam, String[] tempArrayParam,
                              Integer [] imageArrayParam) {

        super(context, R.layout.listview_row, dayArrayParam);

        this.context = context;
        this.imageArray = imageArrayParam;
        this.dayArray = dayArrayParam;
        this.tempArray = tempArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //references objects in listview
        TextView dayTextField = (TextView) rowView.findViewById(R.id.dayTV);
        TextView tempTextField = (TextView) rowView.findViewById(R.id.tempTV);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.weatherSymbolIV);

        //this code sets the values of the objects to values from the arrays
        dayTextField.setText(dayArray[position]);
        tempTextField.setText(tempArray[position]);
        imageView.setImageResource(imageArray[position]);

        return rowView;

    };
}
