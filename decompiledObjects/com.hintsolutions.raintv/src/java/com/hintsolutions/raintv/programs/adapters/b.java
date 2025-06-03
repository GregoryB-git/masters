/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.programs.adapters.AllArticlesAdapter
 *  com.hintsolutions.raintv.programs.adapters.FullArticlesAdapter
 *  java.lang.Object
 *  java.lang.Runnable
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.programs.adapters;

import com.hintsolutions.raintv.adapters.RainArrayAdapter;
import com.hintsolutions.raintv.programs.adapters.AllArticlesAdapter;
import com.hintsolutions.raintv.programs.adapters.FullArticlesAdapter;
import ru.tvrain.core.data.Article;

public final class b
implements Runnable {
    public final int a;
    public final Article b;
    public final RainArrayAdapter c;
    public final Object d;

    public /* synthetic */ b(int n, RainArrayAdapter rainArrayAdapter, Object object, Article article) {
        this.a = n;
        this.c = rainArrayAdapter;
        this.d = object;
        this.b = article;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AllArticlesAdapter.b((AllArticlesAdapter)((AllArticlesAdapter)this.c), (AllArticlesAdapter.ViewHolder)((AllArticlesAdapter.ViewHolder)this.d), (Article)this.b);
                return;
            }
        }
        FullArticlesAdapter.b((FullArticlesAdapter)((FullArticlesAdapter)this.c), (FullArticlesAdapter.ViewHolder)((FullArticlesAdapter.ViewHolder)this.d), (Article)this.b);
    }
}

