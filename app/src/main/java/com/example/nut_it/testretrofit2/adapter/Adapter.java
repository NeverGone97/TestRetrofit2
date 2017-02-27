package com.example.nut_it.testretrofit2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nut_it.testretrofit2.R;
import com.example.nut_it.testretrofit2.apiGitHub.model.GitHubRepo;

import java.util.List;

/**
 * Created by Nut_IT on 2/27/2017.
 */

public class Adapter extends ArrayAdapter<GitHubRepo> {
    private Context context;
    private List<GitHubRepo> values;

    public Adapter(Context context, List<GitHubRepo> values) {
        super(context, R.layout.list_item, values);
        this.values = values;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item, parent, false);
        }
        TextView text = (TextView) row.findViewById(R.id.list_item_pagination_text);
        GitHubRepo item = values.get(position);
        String message = item.getLatitude();
        text.setText(message);
        return row;
    }
}
