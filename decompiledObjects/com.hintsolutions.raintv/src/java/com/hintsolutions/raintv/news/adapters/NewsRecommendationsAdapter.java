/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.news.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.interfaces.ArticleListItemClickListener;
import java.util.List;
import ru.tvrain.core.data.Article;

public class NewsRecommendationsAdapter
extends RecyclerView.Adapter<ViewHolder> {
    private List<Article> mDataSet;
    private ArticleListItemClickListener mOnClickListener;

    public NewsRecommendationsAdapter(List<Article> list, ArticleListItemClickListener articleListItemClickListener) {
        this.mDataSet = list;
        this.mOnClickListener = articleListItemClickListener;
    }

    public static /* synthetic */ void a(NewsRecommendationsAdapter newsRecommendationsAdapter, Article article, View view) {
        newsRecommendationsAdapter.lambda$onBindViewHolder$0(article, view);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Article article, View object) {
        object = this.mOnClickListener;
        if (object != null) {
            object.onItemClicked(article);
        }
    }

    public int getItemCount() {
        return this.mDataSet.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        Article article = (Article)this.mDataSet.get(n);
        if (article == null) {
            return;
        }
        try {
            LinearLayout linearLayout = viewHolder.rootLayout;
            d0 d02 = new d0((Object)this, article, 8);
            linearLayout.setOnClickListener((View.OnClickListener)d02);
        }
        catch (Exception exception) {}
        try {
            viewHolder.nameTextView.setText((CharSequence)article.name);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493195, viewGroup, false));
    }

    public void setOnClickListener(ArticleListItemClickListener articleListItemClickListener) {
        this.mOnClickListener = articleListItemClickListener;
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296947)
        public TextView nameTextView;
        @BindView(value=2131297073)
        public LinearLayout rootLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

