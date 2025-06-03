/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Video
 *  ru.tvrain.core.utils.DateHelper
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.utils.DateHelper;

public class NewsSliderAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<Article> items;
    private OnItemClickListener onItemClickListener;
    private boolean withDate;

    public NewsSliderAdapter(Context context, List<Article> list, boolean bl, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.onItemClickListener = onItemClickListener;
        this.items = list;
        this.withDate = bl;
    }

    public static /* synthetic */ void a(NewsSliderAdapter newsSliderAdapter, Article article, View view) {
        newsSliderAdapter.lambda$addOnNewsClickEvent$0(article, view);
    }

    private void addOnNewsClickEvent(View view, Article article) {
        view.setOnClickListener((View.OnClickListener)new d0((Object)this, article, 2));
    }

    private /* synthetic */ void lambda$addOnNewsClickEvent$0(Article article, View view) {
        this.onItemClickListener.onClick(article);
    }

    private void showDuration(Article article, View view, TextView textView) {
        ArrayList arrayList;
        if (article != null && (arrayList = article.video) != null && arrayList.size() > 0 && !TextUtils.isEmpty((CharSequence)((Video)article.video.get((int)0)).duration)) {
            view.setVisibility(0);
            textView.setText((CharSequence)((Video)article.video.get(0)).renderVideoDuration());
        } else {
            view.setVisibility(8);
        }
    }

    private void showImage(Context context, Article article, ImageView imageView, View view) {
        Picasso.get().load(article.preview_img).placeholder(2131231367).fit().centerCrop().into(imageView);
        view.setVisibility(0);
    }

    private void showText(Article article, View view, TextView textView, String string2) {
        if (string2 != null) {
            textView.setText((CharSequence)string2);
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public int getItemCount() {
        List<Article> list = this.items;
        int n = list == null ? 0 : list.size();
        return n;
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int n) {
        Article article = (Article)this.items.get(n);
        this.showText(article, viewHolder.textLayout, viewHolder.name, article.name);
        if (article.hasPreviewImage()) {
            this.showImage(this.context, article, viewHolder.image, viewHolder.imageLayout);
            this.showDuration(article, viewHolder.durationLayout, viewHolder.duration);
        }
        if (!this.withDate) {
            viewHolder.date.setVisibility(8);
        } else {
            viewHolder.date.setText((CharSequence)DateHelper.getRelativeDateString((Context)this.context, (Date)article.getDate()));
        }
        this.addOnNewsClickEvent(viewHolder.layout, article);
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493115, viewGroup, false));
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
        @BindView(value=2131296527)
        public TextView date;
        @BindView(value=2131297316)
        public TextView duration;
        @BindView(value=2131297317)
        public View durationLayout;
        @BindView(value=2131296689)
        public ImageView image;
        @BindView(value=2131296704)
        public View imageLayout;
        @BindView(value=2131296729)
        public View layout;
        @BindView(value=2131297202)
        public TextView name;
        @BindView(value=2131297224)
        public View textLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

