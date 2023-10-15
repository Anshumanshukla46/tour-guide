package com.example.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Kirana Houses", "Place for Groceries", R.drawable.kirana_store));
        words.add(new Word("Television Shop", "TV Repairing", R.drawable.tv_shop));
        words.add(new Word("Daily Household Goods", "Everything you need for house", R.drawable.kanahiya));
        words.add(new Word("Cloth Market", "High priced shops", R.drawable.cloth));
        words.add(new Word("Bike Repairing Center", "Powered by TVS", R.drawable.bike_repair));
        words.add(new Word("Medical Store", "Mostly all medicine available", R.drawable.medical));
        words.add(new Word("Book Store", "School affiliated things available", R.drawable.books));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_shop);

        ListView listView = (ListView) rootView.findViewById(R.id.xmlWord);

        listView.setAdapter(adapter);
        return rootView;
    }
}