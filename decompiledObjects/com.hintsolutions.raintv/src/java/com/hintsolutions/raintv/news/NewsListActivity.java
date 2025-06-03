/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  butterknife.BindView
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.services.bus.BusProvider
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.hintsolutions.raintv.adapters.NewsListAdapter;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import com.hintsolutions.raintv.views.RainFooterViewItem;
import java.util.List;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.services.bus.BusProvider;

public class NewsListActivity
extends BaseActivity {
    private static final int ITEMS_PER_PAGE = 20;
    private NewsListAdapter adapter;
    @BindView(value=2131296747)
    public RecyclerView list;
    private int page = 1;
    private Subscription requestSubscription;
    @BindView(value=2131297172)
    public TextView subscriptionBar;
    private int totalPages = 2;

    public static /* synthetic */ void A(NewsListActivity newsListActivity, Articles articles) {
        newsListActivity.lambda$getData$1(articles);
    }

    public static /* synthetic */ void B(NewsListActivity newsListActivity) {
        newsListActivity.getData();
    }

    public static /* synthetic */ void C(NewsListActivity newsListActivity, Throwable throwable) {
        newsListActivity.lambda$getData$2(throwable);
    }

    private void getData() {
        Subscription subscription = this.requestSubscription;
        if (subscription != null && !subscription.isUnsubscribed()) {
            return;
        }
        int n2 = this.page;
        if (n2 > this.totalPages) {
            return;
        }
        if (n2 == 1) {
            this.showProgressDialog();
        }
        this.requestSubscription = subscription = this.rainApi.newsList(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), this.getPagination()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new n3(this, 2), (Action1)new n3(this, 3));
        this.addSubscription(subscription);
    }

    private String getPagination() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.page);
        stringBuilder.append("/");
        stringBuilder.append(20);
        return stringBuilder.toString();
    }

    private /* synthetic */ void lambda$getData$1(Articles articles) {
        NewsListAdapter newsListAdapter = this.adapter;
        List list = articles.elements;
        boolean bl = this.page > 1;
        newsListAdapter.updateInfo((List<Article>)list, bl);
        this.adapter.setFooter(new RainFooterViewItem((Context)this));
        this.totalPages = articles.total_pages;
        ++this.page;
        this.list.setVisibility(0);
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$getData$2(Throwable throwable) {
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$onCreate$0(Article article) {
        Intent intent = new Intent((Context)this, NewsActivity.class);
        intent.putExtra("id", article.id);
        this.startActivity(intent);
    }

    public static /* synthetic */ void z(NewsListActivity newsListActivity, Article article) {
        newsListActivity.lambda$onCreate$0(article);
    }

    @Override
    public int getLayoutResource() {
        return 2131492902;
    }

    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object = new NewsListAdapter((Context)this, null, new n3(this, 0));
        this.adapter = object;
        this.list.setAdapter((RecyclerView.Adapter)object);
        this.list.setVisibility(8);
        RecyclerViewPageUtils.setPaging(this.list, 20, new n3(this, 1));
        this.getData();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}

