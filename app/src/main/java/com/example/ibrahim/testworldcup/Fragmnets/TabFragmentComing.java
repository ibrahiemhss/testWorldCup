package com.example.ibrahim.testworldcup.Fragmnets;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ibrahim.testworldcup.Adapters.MatchesAdapter;
import com.example.ibrahim.testworldcup.R;
import com.example.ibrahim.testworldcup.data.DBHelber;
import com.example.ibrahim.testworldcup.model.Matches;

import java.util.ArrayList;
import java.util.List;


public class TabFragmentComing extends Fragment {
    private List<Matches> matches ;
    RecyclerView.LayoutManager recyclerViewlayoutManager;
    RecyclerView.Adapter  recyclerViewadapter;
    DBHelber mDbHelber;
    RecyclerView RV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_matches, container, false);

        mDbHelber=new DBHelber( getActivity () );
        matches=new ArrayList<> ();
        RV = (RecyclerView) rootView.findViewById( R.id.RV_matches);
        RV.setHasFixedSize(true);
        recyclerViewlayoutManager = new LinearLayoutManager (getActivity ());
        RV.setLayoutManager(recyclerViewlayoutManager);
        recyclerViewadapter = new MatchesAdapter (matches,getActivity ());
        RV.setAdapter(recyclerViewadapter);
        recyclerViewadapter.notifyDataSetChanged();
        displayOfline();
return rootView;

    }
    private void displayOfline(){
        matches.clear();
/*
        Cursor cursor = mDbHelber.getMatchesList( );
        while (cursor.moveToNext()) {
            Matches matches2;
            matches2 = new Matches(
                    cursor.getString( cursor.getColumnIndex( TEAM_A )),
                    cursor.getString( cursor.getColumnIndex( TEAM_B ) )
                *//*    cursor.getString( cursor.getColumnIndex( DATE ))
                    cursor.getString( cursor.getColumnIndex( IMAGE_FOR_TEAM_A ) ),
                    cursor.getString( cursor.getColumnIndex( IMAGE_FOR_TEAM_B ) ),
                    cursor.getString( cursor.getColumnIndex( STADIUM ) ),
                    cursor.getString( cursor.getColumnIndex( FINISHED ))
                  *//*
            );


            matches.add( matches2 );

        }*/
}}