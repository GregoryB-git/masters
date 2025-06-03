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
 *  java.lang.Throwable
 *  java.util.List
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.ContentBlock
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
import ru.tvrain.core.data.ContentBlock;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ContentBlockFragment
extends BaseFragment {
    public static final String ARG_CODE = "code";
    private BigNewsListAdapter adapter;
    private String code;
    @BindView(value=2131296747)
    public RecyclerView list;

    public static /* synthetic */ void b(ContentBlockFragment contentBlockFragment, Article article) {
        contentBlockFragment.lambda$onCreateView$0(article);
    }

    public static /* synthetic */ void c(ContentBlockFragment contentBlockFragment, ContentBlock contentBlock) {
        contentBlockFragment.lambda$getData$1(contentBlock);
    }

    public static /* synthetic */ void d(Throwable throwable) {
        ContentBlockFragment.lambda$getData$2(throwable);
    }

    private void getData() {
        this.showProgressDialog();
        this.addSubscription(this.rainApi.contentBlock(this.getAuthorization(), this.code, Integer.valueOf((int)1280), Integer.valueOf((int)720)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new o0(this), (Action1)new v1(9)));
    }

    private /* synthetic */ void lambda$getData$1(ContentBlock contentBlock) {
        List list;
        if (contentBlock != null && (list = contentBlock.items) != null && !list.isEmpty()) {
            this.adapter.updateInfo((List<Article>)contentBlock.items);
            this.hideProgressDialog();
        }
    }

    private static /* synthetic */ void lambda$getData$2(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onCreateView$0(Article article) {
        Intent intent = new Intent(this.getContext(), NewsActivity.class);
        intent.putExtra("id", article.id);
        this.startActivity(intent);
    }

    public static ContentBlockFragment newInstance(String string) {
        ContentBlockFragment contentBlockFragment = new ContentBlockFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_CODE, string);
        contentBlockFragment.setArguments(bundle);
        return contentBlockFragment;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.code = this.getArguments().getString(ARG_CODE);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492969, object, false);
        try {
            this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        object = new BigNewsListAdapter(this.getContext(), null, new o0(this));
        this.adapter = object;
        this.list.setAdapter((RecyclerView.Adapter)object);
        this.getData();
        return layoutInflater;
    }
}

