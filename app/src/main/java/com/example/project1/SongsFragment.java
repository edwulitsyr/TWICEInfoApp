package com.example.project1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment used to hold a scrollable list of songs and provide lyrics
 */
public class SongsFragment extends Fragment {

    // song names
    public static final String SONG_LIKE_OOH_AHH = "Like OOH-AHH";
    public static final String SONG_CHEER_UP = "CHEER UP";
    public static final String SONG_FEEL_SPECIAL = "Feel Special";
    public static final String SONG_TT = "TT";
    public static final String SONG_DTNA = "Dance the Night Away";
    public static final String SONG_YES_OR_YES = "YES or YES";
    public static final String SONG_SAY_YOU_LOVE_ME = "SAY YOU LOVE ME";
    public static final String SONG_HEART_SHAKER = "Heart Shaker";
    public static final String SONG_ICSM = "I CAN'T STOP ME";
    public static final String SONG_THE_FEELS = "The Feels";
    public static final String SONG_SCIENTIST = "SCIENTIST";
    public static final String SONG_BETTER = "BETTER";
    public static final String SONG_WHAT_IS_LOVE = "WHAT IS LOVE";
    public static final String SONG_SIGNAL = "Signal";
    public static final String SONG_KURA_KURA = "Kura Kura";

    // arraylist used to hold list of songs
    public ArrayList<String> songsArrlist = new ArrayList<>();

    /**
     * Empty constructor
     */
    public SongsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // populate arraylist with songs
        populateSongsArrList();
    }

    /**
     * Populate arraylist with songs
     */
    private void populateSongsArrList() {
        songsArrlist.add(SONG_LIKE_OOH_AHH);
        songsArrlist.add(SONG_CHEER_UP);
        songsArrlist.add(SONG_FEEL_SPECIAL);
        songsArrlist.add(SONG_TT);
        songsArrlist.add(SONG_DTNA);
        songsArrlist.add(SONG_YES_OR_YES);
        songsArrlist.add(SONG_SAY_YOU_LOVE_ME);
        songsArrlist.add(SONG_HEART_SHAKER);
        songsArrlist.add(SONG_ICSM);
        songsArrlist.add(SONG_THE_FEELS);
        songsArrlist.add(SONG_SCIENTIST);
        songsArrlist.add(SONG_BETTER);
        songsArrlist.add(SONG_WHAT_IS_LOVE);
        songsArrlist.add(SONG_SIGNAL);
        songsArrlist.add(SONG_KURA_KURA);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_songs, container, false);

        // setup the titlebar of the fragment
        getActivity().setTitle(R.string.frag_title_lyrics);

        // setup the listview
        ListView listView = rootView.findViewById(R.id.songs_list_view);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, songsArrlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // When a song name is clicked, send the MoreInfo activity info on which song was selected
                Intent intent = new Intent(getActivity(), MoreInfoActivity.class);
                String songClicked = songsArrlist.get(i);
                switch (songClicked) {
                    case SONG_LIKE_OOH_AHH:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.LIKE_OOH_AHH);
                        break;
                    case SONG_CHEER_UP:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.CHEER_UP);
                        break;
                    case SONG_FEEL_SPECIAL:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.FEEL_SPECIAL);
                        break;
                    case SONG_TT:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.TT);
                        break;
                    case SONG_DTNA:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.DTNA);
                        break;
                    case SONG_YES_OR_YES:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.YES_OR_YES);
                        break;
                    case SONG_SAY_YOU_LOVE_ME:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.SAY_YOU_LOVE_ME);
                        break;
                    case SONG_HEART_SHAKER:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.HEART_SHAKER);
                        break;
                    case SONG_ICSM:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.ICSM);
                        break;
                    case SONG_THE_FEELS:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.THE_FEELS);
                        break;
                    case SONG_SCIENTIST:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.SCIENTIST);
                        break;
                    case SONG_BETTER:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.BETTER);
                        break;
                    case SONG_WHAT_IS_LOVE:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.WHAT_IS_LOVE);
                        break;
                    case SONG_SIGNAL:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.SIGNAL);
                        break;
                    case SONG_KURA_KURA:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.KURA_KURA);
                        break;
                }
                startActivity(intent); // start the activity
            }
        });

        return rootView;
    }
}