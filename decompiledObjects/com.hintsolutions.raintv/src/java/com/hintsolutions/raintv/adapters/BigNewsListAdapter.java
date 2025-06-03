/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Html
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;
import java.util.List;
import ru.tvrain.core.data.Article;

public class BigNewsListAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<Article> items;
    private OnItemClickListener onItemClickListener;

    public BigNewsListAdapter(Context context, List<Article> list, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.items = list;
        this.onItemClickListener = onItemClickListener;
    }

    public static /* synthetic */ void a(BigNewsListAdapter bigNewsListAdapter, Article article, View view) {
        bigNewsListAdapter.lambda$onBindViewHolder$0(article, view);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Article article, View view) {
        this.onItemClickListener.onClick(article);
    }

    public int getItemCount() {
        List<Article> list = this.items;
        int n = list == null ? 0 : list.size();
        return n;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        Article article = (Article)this.items.get(n);
        View view = viewHolder.layout;
        int n3 = 0;
        view.setOnClickListener((View.OnClickListener)new d0((Object)this, article, 0));
        if (!TextUtils.isEmpty((CharSequence)article.preview_img)) {
            Picasso.get().load(article.preview_img).into(viewHolder.image);
            viewHolder.imageLayout.setVisibility(0);
        } else {
            viewHolder.image.setImageBitmap(null);
            viewHolder.imageLayout.setVisibility(8);
        }
        if (article.hasVideoDuration()) {
            viewHolder.durationLayout.setVisibility(0);
            viewHolder.duration.setText((CharSequence)article.renderVideoDuration());
        } else {
            viewHolder.durationLayout.setVisibility(8);
        }
        viewHolder.text.setText((CharSequence)Html.fromHtml((String)article.name));
        if (!TextUtils.isEmpty((CharSequence)article.getProgramName())) {
            viewHolder.programName.setText((CharSequence)article.getProgramName());
            viewHolder.programName.setVisibility(0);
        } else {
            viewHolder.programName.setVisibility(8);
        }
        viewHolder = viewHolder.elementDivider;
        n = n < this.getItemCount() - 1 ? n3 : 8;
        viewHolder.setVisibility(n);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493112, viewGroup, false));
    }

    public void updateInfo(List<Article> list) {
        this.updateInfo(list, false);
    }

    public void updateInfo(List<Article> list, boolean bl) {
        List<Article> list2;
        if (bl && (list2 = this.items) != null) {
            list2.addAll(list);
        } else {
            this.items = list;
        }
        this.notifyDataSetChanged();
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296344)
        public ImageView addToFavorites;
        @BindView(value=2131297316)
        public TextView duration;
        @BindView(value=2131297317)
        public View durationLayout;
        @BindView(value=2131296579)
        public View elementDivider;
        @BindView(value=2131296689)
        public ImageView image;
        @BindView(value=2131296704)
        public View imageLayout;
        @BindView(value=2131296729)
        public View layout;
        @BindView(value=2131297027)
        public TextView programName;
        @BindView(value=2131297202)
        public TextView text;
        @BindView(value=2131297224)
        public View textLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

