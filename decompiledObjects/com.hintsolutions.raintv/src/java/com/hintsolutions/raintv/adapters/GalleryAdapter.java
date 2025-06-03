/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.List
 *  ru.tvrain.core.data.GalleryItem
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;
import java.util.List;
import ru.tvrain.core.data.GalleryItem;

public class GalleryAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<GalleryItem> galleryItems;
    private OnItemClickListener onItemClickListener;

    public GalleryAdapter(Context context, List<GalleryItem> list, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.galleryItems = list;
        this.onItemClickListener = onItemClickListener;
    }

    public static /* synthetic */ void a(GalleryAdapter galleryAdapter, GalleryItem galleryItem, int n, View view) {
        galleryAdapter.lambda$onBindViewHolder$0(galleryItem, n, view);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(GalleryItem galleryItem, int n, View view) {
        this.onItemClickListener.onClick(galleryItem, n);
    }

    public int getItemCount() {
        return this.galleryItems.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        GalleryItem galleryItem = (GalleryItem)this.galleryItems.get(n);
        Picasso.get().load(galleryItem.getImage()).fit().into(viewHolder.image);
        viewHolder.image.setOnClickListener((View.OnClickListener)new b2(this, galleryItem, n));
        if (galleryItem.getAuthor() != null && !galleryItem.getAuthor().isEmpty()) {
            viewHolder.author.setText((CharSequence)galleryItem.getAuthor());
        } else {
            viewHolder.author.setText((CharSequence)"");
        }
        galleryItem = (LinearLayout)viewHolder.itemView;
        n = n == 0 ? galleryItem.getPaddingRight() : 0;
        viewHolder.itemView.setPadding(n, galleryItem.getPaddingTop(), galleryItem.getPaddingRight(), galleryItem.getPaddingBottom());
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131492989, viewGroup, false));
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296374)
        public TextView author;
        @BindView(value=2131296689)
        public ImageView image;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

