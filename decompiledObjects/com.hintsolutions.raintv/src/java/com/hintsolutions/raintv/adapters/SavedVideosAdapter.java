/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PorterDuff$Mode
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.appcompat.widget.Toolbar
 *  androidx.appcompat.widget.Toolbar$OnMenuItemClickListener
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.interfaces.OnSavedVideosListItemClickListener;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.squareup.picasso.Picasso;
import java.util.List;

public class SavedVideosAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private Context mContext;
    private List<SavedVideoHolder> mDataSet;
    private OnSavedVideosListItemClickListener mListener;

    public SavedVideosAdapter(Context context, List<SavedVideoHolder> list, OnSavedVideosListItemClickListener onSavedVideosListItemClickListener) {
        this.mContext = context;
        this.mDataSet = list;
        this.mListener = onSavedVideosListItemClickListener;
    }

    public static /* synthetic */ boolean a(SavedVideosAdapter savedVideosAdapter, SavedVideoHolder savedVideoHolder, MenuItem menuItem) {
        return savedVideosAdapter.lambda$onBindViewHolder$1(savedVideoHolder, menuItem);
    }

    public static /* synthetic */ void b(SavedVideosAdapter savedVideosAdapter, SavedVideoHolder savedVideoHolder, View view) {
        savedVideosAdapter.lambda$onBindViewHolder$0(savedVideoHolder, view);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(SavedVideoHolder savedVideoHolder, View view) {
        this.mListener.onClicked(savedVideoHolder);
    }

    private /* synthetic */ boolean lambda$onBindViewHolder$1(SavedVideoHolder savedVideoHolder, MenuItem object) {
        if (object.getItemId() == 2131296309 && (object = this.mListener) != null) {
            object.onRemoveClicked(savedVideoHolder);
        }
        return true;
    }

    public void finalize() throws Throwable {
        try {
            this.mContext = null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        super.finalize();
    }

    public int getItemCount() {
        return this.mDataSet.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        Object object;
        SavedVideoHolder savedVideoHolder = (SavedVideoHolder)this.mDataSet.get(n);
        if (savedVideoHolder == null) {
            return;
        }
        try {
            if (this.mListener != null) {
                RelativeLayout relativeLayout = viewHolder.rootLayout;
                object = new d0((Object)this, savedVideoHolder, 3);
                relativeLayout.setOnClickListener((View.OnClickListener)object);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = savedVideoHolder.preview;
            if (!TextUtils.isEmpty((CharSequence)object)) {
                viewHolder.thumbnailImageView.setVisibility(0);
                Picasso.get().load((String)object).into(viewHolder.thumbnailImageView);
            } else {
                viewHolder.thumbnailImageView.setVisibility(8);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            viewHolder.title.setText((CharSequence)savedVideoHolder.name);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (savedVideoHolder.hasPosition() && savedVideoHolder.hasDuration()) {
            viewHolder.position.setVisibility(0);
            viewHolder.position.setMax(100);
            viewHolder.position.setProgress((int)(savedVideoHolder.getPosition() / (savedVideoHolder.getDuration() * 10L)));
            viewHolder.position.getProgressDrawable().setColorFilter(this.mContext.getResources().getColor(2131100669), PorterDuff.Mode.SRC_IN);
        } else {
            viewHolder.position.setVisibility(8);
        }
        try {
            viewHolder.cardToolbar.getMenu().clear();
            viewHolder.cardToolbar.inflateMenu(2131558403);
            viewHolder = viewHolder.cardToolbar;
            object = new y4((Object)this, savedVideoHolder, 2);
            viewHolder.setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493197, viewGroup, false));
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296430)
        public Toolbar cardToolbar;
        @BindView(value=2131297014)
        public ProgressBar position;
        @BindView(value=2131297073)
        public RelativeLayout rootLayout;
        @BindView(value=2131297232)
        public ImageView thumbnailImageView;
        @BindView(value=2131297237)
        public TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

