/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.materialdrawer.R;

public class BaseViewHolder
extends RecyclerView.ViewHolder {
    public TextView description;
    public ImageView icon;
    public TextView name;
    public View view;

    public BaseViewHolder(View view) {
        super(view);
        this.view = view;
        this.icon = (ImageView)view.findViewById(R.id.material_drawer_icon);
        this.name = (TextView)view.findViewById(R.id.material_drawer_name);
        this.description = (TextView)view.findViewById(R.id.material_drawer_description);
    }
}

