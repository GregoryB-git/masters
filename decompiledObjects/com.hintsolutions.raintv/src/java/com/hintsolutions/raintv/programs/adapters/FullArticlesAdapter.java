/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.squareup.picasso.Picasso
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Date
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.utils.DateHelper
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.programs.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.adapters.RainArrayAdapter;
import com.hintsolutions.raintv.interfaces.AddToFavoritesClickListener;
import com.hintsolutions.raintv.programs.adapters.a;
import com.hintsolutions.raintv.programs.adapters.b;
import com.squareup.picasso.Picasso;
import java.util.Collection;
import java.util.Date;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.utils.DateHelper;
import tvrain.managers.UserManager;

public class FullArticlesAdapter
extends RainArrayAdapter<Article> {
    private AddToFavoritesClickListener mOnFavClickListener;

    public FullArticlesAdapter(Context context, UserManager userManager, boolean bl, AddToFavoritesClickListener addToFavoritesClickListener) {
        super(context, 2131492918);
        this.mOnFavClickListener = addToFavoritesClickListener;
    }

    public static /* synthetic */ void a(FullArticlesAdapter fullArticlesAdapter, Article article, ViewHolder viewHolder, View view) {
        fullArticlesAdapter.lambda$getView$1(article, viewHolder, view);
    }

    public static /* synthetic */ void b(FullArticlesAdapter fullArticlesAdapter, ViewHolder viewHolder, Article article) {
        fullArticlesAdapter.lambda$getView$0(viewHolder, article);
    }

    private /* synthetic */ void lambda$getView$0(ViewHolder viewHolder, Article article) {
        this.updateFavImage(viewHolder.addToFavorites, article);
    }

    private /* synthetic */ void lambda$getView$1(Article article, ViewHolder viewHolder, View view) {
        this.mOnFavClickListener.onItemClicked(article, new b(1, this, viewHolder, article));
    }

    private void updateFavImage(ImageView imageView, Article article) {
        Resources resources = this.getContext().getResources();
        int n = article.isFavorite() ? 2131230807 : 2131230806;
        imageView.setImageDrawable(resources.getDrawable(n));
    }

    public void addAll(@NonNull Collection<? extends Article> collection) {
        super.addAll(collection);
    }

    public View getView(int n, View view, ViewGroup object) {
        Article article = (Article)this.getItem(n);
        if (view != null) {
            object = view.getTag();
        } else {
            view = LayoutInflater.from((Context)this.getContext()).inflate(2131492918, object, false);
            object = new Object(view){
                @BindView(value=2131296344)
                public ImageView addToFavorites;
                @BindView(value=2131296527)
                public TextView date;
                @BindView(value=2131296689)
                public ImageView image;
                @BindView(value=2131296946)
                public TextView name;
                {
                    ButterKnife.bind((Object)this, (View)view);
                }
            };
            view.setTag(object);
        }
        if (!article.preview_img.isEmpty()) {
            Picasso.get().load(article.preview_img).into(object.image);
            if (this.mOnFavClickListener != null) {
                this.updateFavImage(object.addToFavorites, article);
                object.addToFavorites.setVisibility(0);
                object.addToFavorites.setOnClickListener((View.OnClickListener)new a(1, this, object, article));
            } else {
                object.addToFavorites.setVisibility(8);
            }
        } else {
            object.addToFavorites.setVisibility(8);
        }
        object.name.setText((CharSequence)article.name);
        object.date.setText((CharSequence)DateHelper.formatScheduleTitle((Date)article.getDate()));
        return view;
    }
}

