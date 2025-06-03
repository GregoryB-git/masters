/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  com.hintsolutions.raintv.news.adapters.BestNewsAdapter
 *  com.hintsolutions.raintv.news.adapters.BestNewsAdapter$ViewHolder
 *  java.lang.Object
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import android.widget.ImageView;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;

public final class b
implements View.OnClickListener {
    public final int a;
    public final Consts b;
    public final Article c;
    public final Object d;

    public /* synthetic */ b(int n, Object object, Consts consts, Article article) {
        this.a = n;
        this.b = consts;
        this.c = article;
        this.d = object;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AllNewsSectionedAdapter.d((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (Article)this.c, (ImageView)((ImageView)this.d), (View)view);
                return;
            }
            case 0: {
                AllNewsSectionedAdapter.e((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (Article)this.c, (AllNewsSectionedAdapter.TopViewHolder)((AllNewsSectionedAdapter.TopViewHolder)this.d), (View)view);
                return;
            }
        }
        BestNewsAdapter.a((BestNewsAdapter)((BestNewsAdapter)this.b), (Article)this.c, (BestNewsAdapter.ViewHolder)((BestNewsAdapter.ViewHolder)this.d), (View)view);
    }
}

