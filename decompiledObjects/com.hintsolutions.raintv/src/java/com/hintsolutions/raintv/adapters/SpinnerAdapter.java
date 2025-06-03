/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class SpinnerAdapter
extends ArrayAdapter<String> {
    public SpinnerAdapter(Context context, int n, List<String> list) {
        super(context, n, list);
        list.add((Object)context.getString(2131755139));
    }

    public int getCount() {
        return super.getCount() - 1;
    }

    public View getView(int n, View view, ViewGroup viewGroup) {
        view = super.getView(n, view, viewGroup);
        if (n == this.getCount()) {
            ((TextView)view.findViewById(16908308)).setText((CharSequence)"");
            ((TextView)view.findViewById(16908308)).setHint((CharSequence)this.getItem(this.getCount()));
        }
        return view;
    }
}

