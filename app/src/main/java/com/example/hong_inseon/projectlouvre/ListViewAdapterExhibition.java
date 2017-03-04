package com.example.hong_inseon.projectlouvre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapterExhibition extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<Exhibition> worldexhibitionlist = null;
    private ArrayList<Exhibition> arraylist2;

    public ListViewAdapterExhibition(Context context, List<Exhibition> worldexhibitionlist) {
        mContext = context;
        this.worldexhibitionlist = worldexhibitionlist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist2 = new ArrayList<Exhibition>();
        this.arraylist2.addAll(worldexhibitionlist);
    }

    public class ViewHolder {
        public TextView name1, name2, name3;
        public ImageView p;
    }

    @Override
    public int getCount() {
        return worldexhibitionlist.size();
    }

    @Override
    public Exhibition getItem(int position) {
        return worldexhibitionlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.exhibitionviewholder, null);
            holder.name1 = (TextView) view.findViewById(R.id.textMname);
            holder.name2 = (TextView) view.findViewById(R.id.textWname);
            holder.name3 = (TextView) view.findViewById(R.id.textPname);
            holder.p = (ImageView) view.findViewById(R.id.imageExhibition);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.name1.setText(worldexhibitionlist.get(position).getNameM());
        holder.name2.setText(worldexhibitionlist.get(position).getNameW());
        holder.name3.setText(worldexhibitionlist.get(position).getNameP());
        holder.p.setImageResource(worldexhibitionlist.get(position).getImage());

       /*view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(mContext, SingleItemView.class);
                intent.putExtra("nameM",(heartlist.get(position).getNameM()));
                intent.putExtra("nameW",(heartlist.get(position).getNameW()));
                intent.putExtra("nameP",(heartlist.get(position).getNameP()));
                intent.putExtra("Image",(heartlist.get(position).getImage()));
                mContext.startActivity(intent);
            }
        });*/

        return view;
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        worldexhibitionlist.clear();
        if (charText.length() == 0) {
            worldexhibitionlist.addAll(arraylist2);
        }
        else
        {
            for (Exhibition wp : arraylist2)
            {
                if (wp.getNameM().toLowerCase(Locale.getDefault()).contains(charText))
                {
                    worldexhibitionlist.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}