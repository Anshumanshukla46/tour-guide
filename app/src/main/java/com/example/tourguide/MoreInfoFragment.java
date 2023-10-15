package com.example.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MoreInfoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Village page available on Wikipedia", "About it's location, near by villages"));
        words.add(new Word("Center of all Village and even some Towns", "Like as Niyat kuwar kheda, Bachhrawan etc..."));
        words.add(new Word("Famous Shiv Temple : Bhaureshwar Baba", "In Niyat kuwar kheda"));
        words.add(new Word("Famous Bus Station", "Connectivity to all major Cities and Towns"));
        words.add(new Word("Emerging Business Hub", "Local Business are growing"));
        words.add(new Word("Voting Center", "Available in the same village"));
        words.add(new Word("District : Raebareli", "Tehsil : Maharajgunj"));
        words.add(new Word("Developer :", "Anshuman Shukla"));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_moreinfo);

        ListView listView = (ListView) rootView.findViewById(R.id.xmlWord);

        listView.setAdapter(adapter);
        return rootView;
    }
}