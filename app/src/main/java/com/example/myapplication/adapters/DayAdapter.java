package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.models.DayForecast;

import java.util.Collection;

public class DayAdapter extends ArrayAdapter<DayForecast> {

    private int dayForecastLayout;
    private Context mContext;

    public DayAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.dayForecastLayout = resource;
        this.mContext = context;
    }


    @Override
    public void addAll(@NonNull Collection<? extends DayForecast> collection) {
        super.addAll(collection);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);

            v = vi.inflate(dayForecastLayout, parent, false);
        }

        DayForecast p = getItem(position);

        if (p != null) {
            TextView day_of_the_week = (TextView) v.findViewById(R.id.day_of_the_week);
            TextView tem_min = (TextView) v.findViewById(R.id.temp_min);
            TextView tem_max = (TextView) v.findViewById(R.id.temp_max);
            TextView status = (TextView) v.findViewById(R.id.desc);
            TextView wind = (TextView) v.findViewById(R.id.wind);

            day_of_the_week.setText(p.day);
            tem_min.setText(p.tempMin);
            tem_max.setText(p.tempMax);
            status.setText(p.status);
            wind.setText(p.wind);
        }

        return v;
    }
}
