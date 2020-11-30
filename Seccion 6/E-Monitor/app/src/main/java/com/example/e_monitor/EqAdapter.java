package com.example.e_monitor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EqAdapter extends ArrayAdapter<EarhQuake> {

    private ArrayList<EarhQuake> eqList;
    private Context context;
    private int layoutId = R.layout.eq_list_item;

    public EqAdapter(Context context, List<EarhQuake> earthQuakeList) {
        super(context, R.layout.eq_list_item, earthQuakeList);

        this.context = context;
        this.eqList = new ArrayList<EarhQuake>(earthQuakeList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rootView = inflater.inflate(this.layoutId, null);

        TextView magnitudeTextView = rootView.findViewById(R.id.magnitude);
        TextView place = rootView.findViewById(R.id.place);

        EarhQuake eq = eqList.get(position);
        magnitudeTextView.setText(eq.getMagnitude());
        place.setText(eq.getPlace());

        return rootView;
    }
}
