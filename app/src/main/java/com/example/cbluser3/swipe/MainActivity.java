package com.example.cbluser3.swipe;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;
    ArrayList<Object>  objectArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=(TabLayout)findViewById(R.id.tbTab);

        tab.addTab(tab.newTab().setText("Tab1"));
        tab.addTab(tab.newTab().setText("Tab2"));
        tab.addTab(tab.newTab().setText("Tab3"));

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.tvMain);
        objectArrayList.add("Tab1");
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add("Tab2");
        objectArrayList.add(new Model("Batman"));
        objectArrayList.add(new Model("Superman"));
        objectArrayList.add(new Model("Krish"));
        objectArrayList.add(new Model("Batman"));
        objectArrayList.add(new Model("Superman"));
        objectArrayList.add(new Model("Krish"));
        objectArrayList.add(new Model("Batman"));
        objectArrayList.add(new Model("Superman"));
        objectArrayList.add(new Model("Krish"));
        objectArrayList.add(new Model("Batman"));
        objectArrayList.add(new Model("Superman"));
        objectArrayList.add("Tab3");
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));
        objectArrayList.add(new Model("tab1"));


        MyTabAdapter tabAdapter=new MyTabAdapter(MainActivity.this,objectArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(tabAdapter);


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        tab.getTabAt(2);

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}
