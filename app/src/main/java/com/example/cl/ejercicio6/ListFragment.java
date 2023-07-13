package com.example.cl.ejercicio6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cl.ejercicio6.databinding.FragmentListBinding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentListBinding binding;

    ArrayList<Image> imagenes = new ArrayList<Image>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(getLayoutInflater());

        Image item01 = new Image("Zhuo Cheng you","https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        imagenes.add(item01);
        Image item02 = new Image("billow926","https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        imagenes.add(item02);
        Image item03 = new Image("Philipp Deiß","https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640");
        imagenes.add(item03);
        Image item04 = new Image("Huper by Joshua Earle","https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640");
        imagenes.add(item04);
        Image item05 = new Image("Melnychuk Nataliya","https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        imagenes.add(item05);
        Image item06 = new Image("Teagan Maddux","https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        imagenes.add(item06);
        Image item07 = new Image("Chen Liu","https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        imagenes.add(item07);
        Image item08 = new Image("John Fornander","https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        imagenes.add(item08);
        Image item09 = new Image("Parker Coffman","https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        imagenes.add(item09);
        Image item10 = new Image("XPS","https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        imagenes.add(item10);
        Image item11 = new Image("Daniel J.Schwarz","https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        imagenes.add(item11);
        Image item12 = new Image("Wesley Armstrong","https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640");
        imagenes.add(item12);

        Adapter adapter = new Adapter();
        adapter.setImages(imagenes);
        binding.RecyclerView.setAdapter(adapter);


        return binding.getRoot();
    }



}