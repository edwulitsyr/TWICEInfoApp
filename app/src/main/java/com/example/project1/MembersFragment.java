package com.example.project1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Fragment holding GridView for TWICE member's profiles
 */
public class MembersFragment extends Fragment {

    // array of the names of TWICE members
    public static String[] memberNames = { "Nayeon", "Jihyo", "Mina",
            "Jeongyeon", "Momo", "Sana",
            "Chaeyoung", "Dahyun", "Tzuyu" };

    // array of drawables associated with TWICE members
    public static int[] memberIcons = { R.drawable.nayeon, R.drawable.jihyo, R.drawable.mina,
            R.drawable.jeongyeon, R.drawable.momo, R.drawable.sana,
            R.drawable.chaeyoung, R.drawable.dahyun, R.drawable.tzuyu };

    /**
     * Empty constructor
     */
    public MembersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_members, container, false);

        // set the titlebar
        getActivity().setTitle(R.string.frag_title_members);

        // setup the gridview
        GridView gridView = rootView.findViewById(R.id.members_grid_view);
        gridView.setAdapter(new MembersGridAdapter(getActivity(), memberNames, memberIcons));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                // When a member icon picture is clicked, send the MoreInfo activity info on which member icon was selected
                Intent intent = new Intent(getActivity(), MoreInfoActivity.class);
                int memberClicked = memberIcons[i];
                switch (memberClicked) {
                    case R.drawable.nayeon:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.NAYEON);
                        break;
                    case R.drawable.jihyo:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.JIHYO);
                        break;
                    case R.drawable.mina:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.MINA);
                        break;
                    case R.drawable.jeongyeon:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.JEONGYEON);
                        break;
                    case R.drawable.momo:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.MOMO);
                        break;
                    case R.drawable.sana:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.SANA);
                        break;
                    case R.drawable.chaeyoung:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.CHAEYOUNG);
                        break;
                    case R.drawable.dahyun:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.DAHYUN);
                        break;
                    case R.drawable.tzuyu:
                        intent.putExtra(MainActivity.ORIGIN_EXTRA_TAG, Origin.TZUYU);
                        break;
                }
                startActivity(intent); // start the MoreInfo activity
            }
        });

        return rootView;
    }
}