package com.example.martin.mergetagexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.martin.mergetagexample.databinding.ExampleViewBinding;

/**
 * Created by martin on 4/3/17.
 */

class ExampleView extends LinearLayout {
    public ExampleView(Context context) {
        super(context);
        ExampleViewBinding.inflate(LayoutInflater.from(getContext()), this, true);

        setOrientation(VERTICAL);

    }

}
