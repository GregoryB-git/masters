/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.programs.adapters.AllArticlesAdapter
 *  com.hintsolutions.raintv.programs.adapters.FullArticlesAdapter
 *  java.lang.Object
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.programs.adapters;

import android.view.View;
import com.hintsolutions.raintv.adapters.RainArrayAdapter;
import com.hintsolutions.raintv.programs.adapters.AllArticlesAdapter;
import com.hintsolutions.raintv.programs.adapters.FullArticlesAdapter;
import ru.tvrain.core.data.Article;

public final class a
implements View.OnClickListener {
    public final int a;
    public final Article b;
    public final RainArrayAdapter c;
    public final Object d;

    public /* synthetic */ a(int n, RainArrayAdapter rainArrayAdapter, Object object, Article article) {
        this.a = n;
        this.c = rainArrayAdapter;
        this.b = article;
        this.d = object;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AllArticlesAdapter.a((AllArticlesAdapter)((AllArticlesAdapter)this.c), (Article)this.b, (AllArticlesAdapter.ViewHolder)((AllArticlesAdapter.ViewHolder)this.d), (View)view);
                return;
            }
        }
        FullArticlesAdapter.a((FullArticlesAdapter)((FullArticlesAdapter)this.c), (Article)this.b, (FullArticlesAdapter.ViewHolder)((FullArticlesAdapter.ViewHolder)this.d), (View)view);
    }
}

