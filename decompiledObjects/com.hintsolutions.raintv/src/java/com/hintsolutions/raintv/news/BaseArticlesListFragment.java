/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  rx.Subscription
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import com.hintsolutions.raintv.views.HorizontalSpaceItemDecoration;
import java.util.List;
import ru.tvrain.core.data.Article;
import rx.Subscription;

public abstract class BaseArticlesListFragment
extends BaseFragment {
    public static final int VIEW_TYPE_BIG = 0;
    public static final int VIEW_TYPE_SLIDER = 2;
    public static final int VIEW_TYPE_SMALL = 1;
    public RecyclerView.Adapter adapter;
    public String header;
    public TextView headerView;
    public boolean hideOnEmpty = true;
    public int itemsPerPage = 10;
    public View layout;
    public RecyclerView list;
    public TextView nothingFound;
    private int page = 1;
    private Subscription requestSubscription;
    public boolean sliderWithDate = false;
    private int totalPages = 2;
    public int viewType = 0;

    public static /* synthetic */ void b(BaseArticlesListFragment baseArticlesListFragment) {
        baseArticlesListFragment.getData();
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
        this.requestSubscription = subscription = this.sendRequest();
        if (subscription != null) {
            this.addSubscription(subscription);
        }
    }

    private void initView() {
        RecyclerView.Adapter adapter;
        RecyclerViewPageUtils.setPaging(this.list, this.itemsPerPage, new b0(this, 0));
        this.adapter = adapter = this.createAdapter();
        this.list.setAdapter(adapter);
        adapter = this.nothingFound;
        if (adapter != null) {
            adapter.setVisibility(8);
        }
        if (this.hideOnEmpty && (adapter = this.layout) != null) {
            adapter.setVisibility(8);
        }
        if (this.viewType == 2) {
            int n2 = (int)this.getContext().getResources().getDimension(2131165339);
            if (this.list.getItemDecorationCount() == 0) {
                this.list.addItemDecoration((RecyclerView.ItemDecoration)new HorizontalSpaceItemDecoration(CommonUtils.dpToPx(this.getContext(), 18), n2, n2));
            }
        }
        if ((adapter = this.headerView) != null) {
            adapter.setText((CharSequence)this.header);
        }
    }

    public RecyclerView.Adapter createAdapter() {
        int n2 = this.viewType;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return null;
                }
                return new NewsSliderAdapter((Context)this.getActivity(), null, this.sliderWithDate, new b0(this, 2));
            }
            return new SmallNewsListAdapter((Context)this.getActivity(), null, new b0(this, 3));
        }
        return new BigNewsListAdapter((Context)this.getActivity(), null, new b0(this, 1));
    }

    public String getPagination() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.page);
        stringBuilder.append("/");
        stringBuilder.append(this.itemsPerPage);
        return stringBuilder.toString();
    }

    public int getViewId() {
        int n2 = this.viewType;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return 0;
                }
                return 2131493114;
            }
            return 2131493116;
        }
        return 2131493111;
    }

    public void onArticlesReceived(List<Article> textView, int n2) {
        if (textView != null && !textView.isEmpty()) {
            boolean bl = this.page > 1;
            this.updateAdapter((List<Article>)textView, bl);
            this.totalPages = n2;
            ++this.page;
            this.hideProgressDialog();
            textView = this.nothingFound;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.list.setVisibility(0);
            textView = this.layout;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            this.list.setVisibility(8);
            textView = this.nothingFound;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.hideOnEmpty && (textView = this.layout) != null) {
                textView.setVisibility(8);
            }
        }
        this.hideProgressDialog();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(this.getViewId(), viewGroup, false);
        this.list = (RecyclerView)layoutInflater.findViewById(2131296747);
        this.nothingFound = (TextView)layoutInflater.findViewById(2131296971);
        this.headerView = (TextView)layoutInflater.findViewById(2131296667);
        this.layout = layoutInflater.findViewById(2131296729);
        this.initView();
        this.getData();
        return layoutInflater;
    }

    public void onError() {
        this.hideProgressDialog();
    }

    public void onItemClick(Article article) {
        Intent intent = new Intent(this.getContext(), NewsActivity.class);
        intent.putExtra("id", article.id);
        this.startActivity(intent);
    }

    public abstract Subscription sendRequest();

    public void updateAdapter(List<Article> list, boolean bl) {
        int n2 = this.viewType;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    ((NewsSliderAdapter)this.adapter).updateInfo(list, bl);
                }
            } else {
                ((SmallNewsListAdapter)this.adapter).updateInfo(list, bl);
            }
        } else {
            ((BigNewsListAdapter)this.adapter).updateInfo(list, bl);
        }
    }
}

