/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.news;

import android.os.Bundle;
import com.hintsolutions.raintv.news.BaseArticlesListFragment;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class PopularArticlesInProgramFragment
extends BaseArticlesListFragment {
    public static final String ARG_HEADER = "header";
    public static final String ARG_PROGRAM_ID = "programId";
    public static final String ARG_SKIP_ID = "skipId";
    public static final String ARG_VIEW_TYPE = "viewType";
    public static final String ARG_WITH_DATE = "withDate";
    private int programId;
    private int skipId;

    public static /* synthetic */ void c(PopularArticlesInProgramFragment popularArticlesInProgramFragment, Throwable throwable) {
        popularArticlesInProgramFragment.lambda$sendRequest$1(throwable);
    }

    public static /* synthetic */ void d(PopularArticlesInProgramFragment popularArticlesInProgramFragment, Articles articles) {
        popularArticlesInProgramFragment.lambda$sendRequest$0(articles);
    }

    private /* synthetic */ void lambda$sendRequest$0(Articles articles) {
        int n2;
        List list;
        ArrayList arrayList = new ArrayList();
        if (articles != null && (list = articles.elements) != null) {
            for (Article article : list) {
                n2 = this.skipId;
                if (n2 != 0 && article.id == n2) continue;
                arrayList.add((Object)article);
            }
        }
        n2 = articles != null ? articles.total_pages : 0;
        this.onArticlesReceived((List<Article>)arrayList, n2);
    }

    private /* synthetic */ void lambda$sendRequest$1(Throwable throwable) {
        this.onError();
    }

    public static PopularArticlesInProgramFragment newInstance(int n2, int n4, String string, int n5, boolean bl) {
        PopularArticlesInProgramFragment popularArticlesInProgramFragment = new PopularArticlesInProgramFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PROGRAM_ID, n2);
        bundle.putString(ARG_HEADER, string);
        bundle.putInt(ARG_VIEW_TYPE, n4);
        bundle.putInt(ARG_SKIP_ID, n5);
        bundle.putBoolean(ARG_WITH_DATE, bl);
        popularArticlesInProgramFragment.setArguments(bundle);
        return popularArticlesInProgramFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.programId = this.getArguments().getInt(ARG_PROGRAM_ID);
            this.header = this.getArguments().getString(ARG_HEADER);
            this.viewType = this.getArguments().getInt(ARG_VIEW_TYPE);
            this.skipId = this.getArguments().getInt(ARG_SKIP_ID);
            this.sliderWithDate = this.getArguments().getBoolean(ARG_WITH_DATE);
        }
    }

    @Override
    public Subscription sendRequest() {
        return this.rainApi.programArticlesMostPopular(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), null, this.getPagination(), "1", this.programId).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new t3(this, 0), (Action1)new t3(this, 1));
    }
}

