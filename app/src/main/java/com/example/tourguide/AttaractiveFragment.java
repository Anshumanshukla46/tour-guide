package com.example.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttaractiveFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Raja Kothi", "Movie Shooting", R.drawable.raja_kothi));
        words.add(new Word("Kendriya Vidhayala", "School of Central Government", R.drawable.kvs));
        words.add(new Word("Cricket Ground", "Play Station of Physical Gamers", R.drawable.cricket_ground));
        words.add(new Word("Shiv Mandir", "Shiv Bhakti", R.drawable.shiv_temple));
        words.add(new Word("Barkhandi Mahavidhyala", "College famous for B.Sc Agriculure", R.drawable.barkhandi));
        words.add(new Word("ITI College", "College for empowering", R.drawable.iti));
        words.add(new Word("Government Hospital ", "Open 24 X 7", R.drawable.hospital));



        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_attaractive);

        ListView listView = (ListView) rootView.findViewById(R.id.xmlWord);

        listView.setAdapter(adapter);
        return rootView;
    }
}