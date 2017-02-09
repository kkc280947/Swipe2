package com.example.cbluser3.swipe;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cbluser3 on 9/2/17.
 */
public class MyTabAdapter extends RecyclerView.Adapter<MyTabAdapter.RecyclerViewHolder> {

    Activity activity;
    ArrayList<Object> objectArrayList = new ArrayList<>();
    int lastPosition = 0;
    int itemOnePosition = 0;
    int itemTwoPosition = 1;
    int itemThreePosition = 2;
    Model model;

    public MyTabAdapter(Activity activity, ArrayList<Object> objectArrayList) {
        this.activity = activity;
        this.objectArrayList = objectArrayList;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_title, parent, false));
            case 12:
                return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_title, parent, false));
            case 24:
                return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_title, parent, false));

            default:
                return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_child, parent, false));
        }

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case 0: {
                String titleOne = (String) objectArrayList.get(position);
                holder.tvText.setText(titleOne);
                break;
            }
            case 12: {
                String titleTwo = (String) objectArrayList.get(position);
                holder.tvText.setText(titleTwo);
                break;
            }

            case 24: {
                String titleThree = (String) objectArrayList.get(position);
                holder.tvText.setText(titleThree);
                break;
            }

            default: {

                Model model = (Model) objectArrayList.get(position);
                holder.tvText2.setText(model.name);
                break;
            }

        }


    }

    @Override
    public int getItemViewType(int position) {

        switch (position) {

            case 0:
                return 0;

            case 12:
                return 12;

            case 24:
                return 24;

            default:
                return position;
        }

    }

    @Override
    public int getItemCount() {
        return objectArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView tvText, tvText2;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvText = (TextView) itemView.findViewById(R.id.tvTextTitle);
            tvText2 = (TextView) itemView.findViewById(R.id.tvTextChild);
        }
    }

    private class ChildRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvTextChild;

        public ChildRecyclerViewHolder(View view) {
            super(view);
            tvTextChild = (TextView) view.findViewById(R.id.tvTextChild);
        }
    }
}
