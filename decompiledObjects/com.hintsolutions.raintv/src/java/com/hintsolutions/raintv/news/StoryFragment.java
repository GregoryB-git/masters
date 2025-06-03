/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Story
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.news.NewsActivity;
import java.util.List;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Story;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class StoryFragment
extends BaseFragment {
    public static final String ARG_ID = "id";
    private static final int ITEMS_PER_PAGE = 30;
    private BigNewsListAdapter adapter;
    private int id;
    @BindView(value=2131296747)
    public RecyclerView list;
    private int page = 1;
    private Subscription requestSubscription;
    private int totalPages = 2;

    public static /* synthetic */ void b(StoryFragment storyFragment, Article article) {
        storyFragment.lambda$onCreateView$0(article);
    }

    public static /* synthetic */ void c(Throwable throwable) {
        StoryFragment.lambda$getData$2(throwable);
    }

    public static /* synthetic */ void d(StoryFragment storyFragment, Story story) {
        storyFragment.lambda$getData$1(story);
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
        this.requestSubscription = subscription = this.rainApi.story(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), this.id, this.getPagination()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new m4(this), (Action1)new v1(16));
        this.addSubscription(subscription);
    }

    private String getPagination() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.page);
        stringBuilder.append("/");
        stringBuilder.append(30);
        return stringBuilder.toString();
    }

    private /* synthetic */ void lambda$getData$1(Story story) {
        BigNewsListAdapter bigNewsListAdapter = this.adapter;
        List list = story.toArticles();
        boolean bl = this.page > 1;
        bigNewsListAdapter.updateInfo((List<Article>)list, bl);
        this.totalPages = story.data.total_pages;
        ++this.page;
        this.hideProgressDialog();
    }

    private static /* synthetic */ void lambda$getData$2(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onCreateView$0(Article article) {
        Intent intent = new Intent(this.getContext(), NewsActivity.class);
        intent.putExtra(ARG_ID, article.id);
        this.startActivity(intent);
    }

    public static StoryFragment newInstance(int n2) {
        StoryFragment storyFragment = new StoryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_ID, n2);
        storyFragment.setArguments(bundle);
        return storyFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.id = this.getArguments().getInt(ARG_ID);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492984, object, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object = new BigNewsListAdapter(this.getContext(), null, new m4(this));
        this.adapter = object;
        this.list.setAdapter((RecyclerView.Adapter)object);
        this.getData();
        return layoutInflater;
    }
}

