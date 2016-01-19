package com.mwt.android.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by Malcolm on 19/01/2016.
 */
public class BasicDialogFragment extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {



        return new AlertDialog.Builder(getContext())
                .setTitle("Dialog Title")
                .setView(R.layout.fragment_basic_dialog)
                .setPositiveButton("OK", null)
                .create();
    }
}
