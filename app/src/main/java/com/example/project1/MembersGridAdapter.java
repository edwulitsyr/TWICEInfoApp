package com.example.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * GridAdapter for the TWICE members fragment's GridView
 */
public class MembersGridAdapter extends BaseAdapter {

    Context context;

    // array of names of the TWICE members
    String[] memberNames;

    // array holding the pictures associated with TWICE members
    int[] memberIcons;

    // LayoutInflater
    LayoutInflater inflater;

    /**
     * Constructor
     * @param context
     * @param memberNames array of member names
     * @param memberIcons array of ints representing member icons
     */
    public MembersGridAdapter(Context context, String[] memberNames, int[] memberIcons) {
        this.context = context;
        this.memberNames = memberNames;
        this.memberIcons = memberIcons;
    }

    @Override
    public int getCount() {
        return memberNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null; // auto generated
    }

    @Override
    public long getItemId(int i) {
        return 0; //auto generated
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null) {
            view = inflater.inflate(R.layout.images_grid_item, null);
        }

        // find the image and text label Views
        ImageView imageView = view.findViewById(R.id.member_icon);
        TextView textView = view.findViewById(R.id.member_name);

        // set the image and text
        imageView.setImageResource(memberIcons[i]);
        textView.setText(memberNames[i]);

        return view;
    }
}
