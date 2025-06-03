/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  com.hintsolutions.raintv.news.adapters.BestNewsAdapter
 *  com.hintsolutions.raintv.news.adapters.BestNewsAdapter$ViewHolder
 *  java.lang.Object
 *  java.lang.Runnable
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.news.adapters;

import android.widget.ImageView;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.hintsolutions.raintv.news.adapters.BestNewsAdapter;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.Article;

public final class a
implements Runnable {
    public final int a;
    public final Consts b;
    public final Article c;
    public final Object d;

    public /* synthetic */ a(int n, Object object, Consts consts, Article article) {
        this.a = n;
        this.b = consts;
        this.d = object;
        this.c = article;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AllNewsSectionedAdapter.h((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (ImageView)((ImageView)this.d), (Article)this.c);
                return;
            }
            case 0: {
                AllNewsSectionedAdapter.i((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (AllNewsSectionedAdapter.TopViewHolder)((AllNewsSectionedAdapter.TopViewHolder)this.d), (Article)this.c);
                return;
            }
        }
        BestNewsAdapter.b((BestNewsAdapter)((BestNewsAdapter)this.b), (BestNewsAdapter.ViewHolder)((BestNewsAdapter.ViewHolder)this.d), (Article)this.c);
    }
}

