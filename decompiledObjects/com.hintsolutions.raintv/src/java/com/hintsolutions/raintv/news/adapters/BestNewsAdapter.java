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
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.List
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.news.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.interfaces.ArticleListItemClickListener;
import com.hintsolutions.raintv.news.adapters.a;
import com.hintsolutions.raintv.news.adapters.b;
import com.squareup.picasso.Picasso;
import java.util.List;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;

public class BestNewsAdapter
extends RecyclerView.Adapter<ViewHolder>
implements Consts {
    private boolean inFavorites;
    private Context mContext;
    private List<Article> mDataSet;
    private ArticleListItemClickListener mOnClickListener;
    private AddToFavoritesClickListener mOnFavClickListener;

    public BestNewsAdapter(Context context, List<Article> list, boolean bl, ArticleListItemClickListener articleListItemClickListener, AddToFavoritesClickListener addToFavoritesClickListener) {
        this.mContext = context;
        this.mDataSet = list;
        this.mOnClickListener = articleListItemClickListener;
        this.mOnFavClickListener = addToFavoritesClickListener;
        this.inFavorites = bl;
    }

    public static /* synthetic */ void a(BestNewsAdapter bestNewsAdapter, Article article, ViewHolder viewHolder, View view) {
        bestNewsAdapter.lambda$onBindViewHolder$2(article, viewHolder, view);
    }

    public static /* synthetic */ void b(BestNewsAdapter bestNewsAdapter, ViewHolder viewHolder, Article article) {
        bestNewsAdapter.lambda$onBindViewHolder$1(viewHolder, article);
    }

    public static /* synthetic */ void c(BestNewsAdapter bestNewsAdapter, Article article, View view) {
        bestNewsAdapter.lambda$onBindViewHolder$0(article, view);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Article article, View view) {
        this.mOnClickListener.onItemClicked(article);
    }

    private /* synthetic */ void lambda$onBindViewHolder$1(ViewHolder viewHolder, Article article) {
        this.updateFavImage(viewHolder.addToFavorites, article);
    }

    private /* synthetic */ void lambda$onBindViewHolder$2(Article article, ViewHolder viewHolder, View view) {
        this.mOnFavClickListener.onItemClicked(article, new a(2, (Object)viewHolder, this, article));
    }

    private void updateFavImage(ImageView imageView, Article article) {
        int n = article.isFavorite() ? (this.inFavorites ? 2131230808 : 2131230807) : 2131230806;
        imageView.setImageDrawable(this.mContext.getResources().getDrawable(n));
    }

    public int getItemCount() {
        return this.mDataSet.size();
    }

    public boolean isEmpty() {
        boolean bl = this.mDataSet.size() == 0;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onBindViewHolder(ViewHolder viewHolder, int n) {
        LinearLayout linearLayout;
        Article article = (Article)this.mDataSet.get(n);
        if (article == null) {
            return;
        }
        try {
            linearLayout = viewHolder.rootLayout;
            d0 d02 = new d0((Object)this, article, 7);
            linearLayout.setOnClickListener((View.OnClickListener)d02);
        }
        catch (Exception exception) {}
        try {
            if (!this.inFavorites && TextUtils.isEmpty((CharSequence)article.preview_img)) {
                viewHolder.addToFavorites.setVisibility(8);
            } else {
                viewHolder.addToFavorites.setVisibility(0);
                if (this.mOnFavClickListener != null) {
                    this.updateFavImage(viewHolder.addToFavorites, article);
                    linearLayout = viewHolder.addToFavorites;
                    b b2 = new b(2, (Object)viewHolder, this, article);
                    linearLayout.setOnClickListener((View.OnClickListener)b2);
                } else if (!this.inFavorites) {
                    viewHolder.addToFavorites.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty((CharSequence)article.preview_img)) {
                Picasso.get().load(article.preview_img).into(viewHolder.newsImageView);
                viewHolder.newsImageView.setVisibility(0);
            } else {
                viewHolder.newsImageView.setImageBitmap(null);
                viewHolder.newsImageView.setVisibility(8);
            }
            if (this.inFavorites) {
                viewHolder.delimiter.setVisibility(0);
            }
            if (this.inFavorites && !TextUtils.isEmpty((CharSequence)article.getProgramName())) {
                viewHolder.programTextView.setText((CharSequence)article.getProgramName());
                viewHolder.programTextView.setVisibility(0);
            } else {
                viewHolder.programTextView.setVisibility(8);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            viewHolder.nameTextView.setText((CharSequence)article.name);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new ViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131493194, viewGroup, false));
    }

    public void release() {
        this.mOnClickListener = null;
        this.mContext = null;
    }

    public void remove(Article article) {
        this.mDataSet.remove((Object)article);
        this.notifyDataSetChanged();
    }

    public static class ViewHolder
    extends RecyclerView.ViewHolder {
        @BindView(value=2131296344)
        public ImageView addToFavorites;
        @BindView(value=2131296579)
        public View delimiter;
        @BindView(value=2131296947)
        public TextView nameTextView;
        @BindView(value=2131296961)
        public ImageView newsImageView;
        @BindView(value=2131297023)
        public TextView programTextView;
        @BindView(value=2131297073)
        public LinearLayout rootLayout;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object)((Object)this), (View)view);
        }
    }
}

