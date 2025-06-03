/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.news.NewsListActivity;

public class NewsListActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private NewsListActivity target;

    @UiThread
    public NewsListActivity_ViewBinding(NewsListActivity newsListActivity) {
        this(newsListActivity, newsListActivity.getWindow().getDecorView());
    }

    @UiThread
    public NewsListActivity_ViewBinding(NewsListActivity newsListActivity, View view) {
        super(newsListActivity, view);
        this.target = newsListActivity;
        newsListActivity.subscriptionBar = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297172, (String)"field 'subscriptionBar'", TextView.class);
        newsListActivity.list = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296747, (String)"field 'list'", RecyclerView.class);
    }

    @Override
    public void unbind() {
        NewsListActivity newsListActivity = this.target;
        if (newsListActivity != null) {
            this.target = null;
            newsListActivity.subscriptionBar = null;
            newsListActivity.list = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

