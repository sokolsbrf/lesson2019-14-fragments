package ru.dimasokol.school.testfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class SelfIdFragment extends Fragment {

    private int random;

    public static SelfIdFragment newInstance() {
        SelfIdFragment fragment = new SelfIdFragment();
        fragment.setRetainInstance(true);
        Random random = new Random();
        fragment.random = random.nextInt();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView root = (TextView) inflater.inflate(R.layout.fragment_text, container, false);
        root.setText(Integer.toHexString(System.identityHashCode(this)) + " - " + random);
        return root;
    }
}
