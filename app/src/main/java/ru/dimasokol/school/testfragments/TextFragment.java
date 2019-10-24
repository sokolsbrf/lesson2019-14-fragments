package ru.dimasokol.school.testfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TextFragment extends Fragment {

    private static final String ARG_TEXT = "displayedText";

    public static TextFragment newInstance(String text) {
        Bundle args = new Bundle();

        args.putString(ARG_TEXT, text);

        TextFragment fragment = new TextFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView root = (TextView) inflater.inflate(R.layout.fragment_text, container, false);
        root.setText(getArguments().getString(ARG_TEXT));
        return root;
    }
}
