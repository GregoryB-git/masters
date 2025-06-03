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
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Articles
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.services.RainService
 *  ru.tvrain.core.utils.PojoHelper
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.programs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.programs.TeleshowTabHeader;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import com.hintsolutions.raintv.views.RainFooterViewItem;
import java.util.List;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Articles;
import ru.tvrain.core.data.Program;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.utils.PojoHelper;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class TeleshowTabFragment
extends BaseFragment {
    private static final String ARG_LIST_TYPE = "listType";
    private static final String ARG_PROGRAM_ID = "programId";
    private static final String ARG_PROGRAM_INFO_IN_LIST = "infoInList";
    private static final int ITEMS_PER_PAGE = 30;
    public static final int LIST_TYPE_ALL = 1;
    public static final int LIST_TYPE_FULL = 2;
    public static final int LIST_TYPE_MOSTPOPULAR = 3;
    private SmallNewsListAdapter adapter;
    @BindView(value=2131296747)
    public RecyclerView list;
    private int listType;
    @BindView(value=2131296971)
    public TextView nothingFound;
    private int page = 1;
    private int programId;
    private boolean programInfoInList;
    private Subscription requestSubscription;
    private int totalPages = 2;

    public static /* synthetic */ void b(TeleshowTabFragment teleshowTabFragment, Articles articles) {
        teleshowTabFragment.lambda$getData$3(articles);
    }

    public static /* synthetic */ void c(TeleshowTabFragment teleshowTabFragment, Throwable throwable) {
        teleshowTabFragment.lambda$getData$4(throwable);
    }

    public static /* synthetic */ void d(TeleshowTabFragment teleshowTabFragment, Article article) {
        teleshowTabFragment.lambda$onCreateView$0(article);
    }

    public static /* synthetic */ void e(TeleshowTabFragment teleshowTabFragment) {
        teleshowTabFragment.getData();
    }

    public static /* synthetic */ void f(Throwable throwable) {
        TeleshowTabFragment.lambda$getPrograms$2(throwable);
    }

    public static /* synthetic */ void g(TeleshowTabFragment teleshowTabFragment, ResponseBody responseBody) {
        teleshowTabFragment.lambda$getPrograms$1(responseBody);
    }

    private void getData() {
        Object object = this.requestSubscription;
        if (object != null && !object.isUnsubscribed()) {
            return;
        }
        int n4 = this.page;
        if (n4 > this.totalPages) {
            return;
        }
        if (n4 == 1) {
            this.showProgressDialog();
        }
        if (this.listType == 3) {
            object = this.rainApi.programArticlesMostPopular(this.getAuthorization(), Integer.valueOf((int)1280), Integer.valueOf((int)720), null, this.getPagination(), null, this.programId);
        } else {
            RainService rainService = this.rainApi;
            String string = this.getAuthorization();
            String string2 = this.getPagination();
            object = this.listType == 2 ? "1" : null;
            object = rainService.programArticles(string, Integer.valueOf((int)1280), Integer.valueOf((int)720), null, string2, (String)object, this.programId);
        }
        this.requestSubscription = object = object.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new q4(this, 0), (Action1)new q4(this, 1));
        this.addSubscription((Subscription)object);
    }

    private String getPagination() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.page);
        stringBuilder.append("/");
        stringBuilder.append(30);
        return stringBuilder.toString();
    }

    private void getPrograms() {
        this.addSubscription(this.rainApi.programsById(this.getAuthorization(), null, null, String.valueOf((int)this.programId)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new q4(this, 4), (Action1)new v1(22)));
    }

    private /* synthetic */ void lambda$getData$3(Articles articles) {
        Object object;
        if (articles != null && (object = articles.elements) != null && !object.isEmpty()) {
            object = this.adapter;
            List list = articles.elements;
            boolean bl = this.page > 1;
            ((SmallNewsListAdapter)((Object)object)).updateInfo((List<Article>)list, bl);
            this.totalPages = articles.total_pages;
            ++this.page;
            this.hideProgressDialog();
            this.nothingFound.setVisibility(8);
            this.list.setVisibility(0);
        } else {
            this.list.setVisibility(8);
            this.nothingFound.setVisibility(0);
        }
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$getData$4(Throwable throwable) {
        this.hideProgressDialog();
    }

    private /* synthetic */ void lambda$getPrograms$1(ResponseBody responseBody) {
        responseBody = (Program)PojoHelper.objectFromResponse((ResponseBody)responseBody, (int)this.programId, Program.class);
        this.adapter.setHeader(new TeleshowTabHeader((Context)this.getActivity(), (Program)responseBody));
    }

    private static /* synthetic */ void lambda$getPrograms$2(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onCreateView$0(Article article) {
        Intent intent = new Intent(this.getContext(), NewsActivity.class);
        intent.putExtra("id", article.id);
        this.startActivity(intent);
    }

    public static TeleshowTabFragment newInstance(int n4, int n5, boolean bl) {
        TeleshowTabFragment teleshowTabFragment = new TeleshowTabFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PROGRAM_ID, n4);
        bundle.putInt(ARG_LIST_TYPE, n5);
        bundle.putBoolean(ARG_PROGRAM_INFO_IN_LIST, bl);
        teleshowTabFragment.setArguments(bundle);
        return teleshowTabFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.programId = this.getArguments().getInt(ARG_PROGRAM_ID);
            this.listType = this.getArguments().getInt(ARG_LIST_TYPE);
            this.programInfoInList = this.getArguments().getBoolean(ARG_PROGRAM_INFO_IN_LIST);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492987, (ViewGroup)object, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object = new SmallNewsListAdapter(this.getContext(), null, new q4(this, 2));
        this.adapter = object;
        ((SmallNewsListAdapter)((Object)object)).setFooter(new RainFooterViewItem((Context)this.getActivity()));
        this.list.setAdapter((RecyclerView.Adapter)this.adapter);
        this.nothingFound.setVisibility(8);
        this.list.setVisibility(8);
        this.getData();
        if (this.programInfoInList) {
            this.getPrograms();
        }
        RecyclerViewPageUtils.setPaging(this.list, 30, new q4(this, 3));
        return layoutInflater;
    }
}

