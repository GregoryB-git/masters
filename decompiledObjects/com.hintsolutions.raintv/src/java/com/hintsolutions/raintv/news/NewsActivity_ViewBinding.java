/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebView
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.news.NewsActivity;

public class NewsActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private NewsActivity target;
    private View view7f0900a5;
    private View view7f090188;
    private View view7f0902f2;
    private View view7f090300;
    private View view7f090394;

    @UiThread
    public NewsActivity_ViewBinding(NewsActivity newsActivity) {
        this(newsActivity, newsActivity.getWindow().getDecorView());
    }

    @UiThread
    public NewsActivity_ViewBinding(NewsActivity newsActivity, View view) {
        super(newsActivity, view);
        this.target = newsActivity;
        newsActivity.newsTitle = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296962, (String)"field 'newsTitle'", TextView.class);
        newsActivity.mProgram = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297022, (String)"field 'mProgram'", TextView.class);
        newsActivity.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
        newsActivity.mDetailImg = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296543, (String)"field 'mDetailImg'", ImageView.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297010, (String)"field 'playVideoImageView' and method 'onPlayVideoClicked'");
        newsActivity.playVideoImageView = (ImageView)Utils.castView((View)view2, (int)2131297010, (String)"field 'playVideoImageView'", ImageView.class);
        this.view7f0902f2 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, newsActivity){
            public final NewsActivity_ViewBinding this$0;
            public final NewsActivity val$target;
            {
                this.this$0 = newsActivity_ViewBinding;
                this.val$target = newsActivity;
            }

            public void doClick(View view) {
                this.val$target.onPlayVideoClicked();
            }
        });
        newsActivity.mPaymentIcon = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131297003, (String)"field 'mPaymentIcon'", ImageView.class);
        newsActivity.mPartLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131296996, (String)"field 'mPartLayout'", LinearLayout.class);
        newsActivity.webView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131297346, (String)"field 'webView'", WebView.class);
        newsActivity.predetailWebView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131297018, (String)"field 'predetailWebView'", WebView.class);
        newsActivity.timeCodesWebView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131297234, (String)"field 'timeCodesWebView'", WebView.class);
        newsActivity.fullTextForSubscribersLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131296649, (String)"field 'fullTextForSubscribersLayout'", LinearLayout.class);
        view2 = Utils.findRequiredView((View)view, (int)2131297172, (String)"field 'subscription' and method 'onSubscriptionClicked'");
        newsActivity.subscription = (TextView)Utils.castView((View)view2, (int)2131297172, (String)"field 'subscription'", TextView.class);
        this.view7f090394 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, newsActivity){
            public final NewsActivity_ViewBinding this$0;
            public final NewsActivity val$target;
            {
                this.this$0 = newsActivity_ViewBinding;
                this.val$target = newsActivity;
            }

            public void doClick(View view) {
                this.val$target.onSubscriptionClicked();
            }
        });
        newsActivity.recommendationsRecyclerView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131297046, (String)"field 'recommendationsRecyclerView'", RecyclerView.class);
        newsActivity.recommendationsLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131297045, (String)"field 'recommendationsLayout'", LinearLayout.class);
        newsActivity.galleryFragment = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131296652, (String)"field 'galleryFragment'", RelativeLayout.class);
        newsActivity.fullTextLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131296650, (String)"field 'fullTextLayout'", LinearLayout.class);
        newsActivity.viewsCount = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297337, (String)"field 'viewsCount'", TextView.class);
        newsActivity.viewsCountContainer = Utils.findRequiredView((View)view, (int)2131297338, (String)"field 'viewsCountContainer'");
        newsActivity.authors = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296960, (String)"field 'authors'", TextView.class);
        newsActivity.bestRecyclerView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296394, (String)"field 'bestRecyclerView'", RecyclerView.class);
        this.view7f090188 = view2 = Utils.findRequiredView((View)view, (int)2131296648, (String)"method 'onFullTextClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, newsActivity){
            public final NewsActivity_ViewBinding this$0;
            public final NewsActivity val$target;
            {
                this.this$0 = newsActivity_ViewBinding;
                this.val$target = newsActivity;
            }

            public void doClick(View view) {
                this.val$target.onFullTextClicked();
            }
        });
        this.view7f090300 = view2 = Utils.findRequiredView((View)view, (int)2131297024, (String)"method 'onProgramContainerClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, newsActivity){
            public final NewsActivity_ViewBinding this$0;
            public final NewsActivity val$target;
            {
                this.this$0 = newsActivity_ViewBinding;
                this.val$target = newsActivity;
            }

            public void doClick(View view) {
                this.val$target.onProgramContainerClicked();
            }
        });
        this.view7f0900a5 = view = Utils.findRequiredView((View)view, (int)2131296421, (String)"method 'buySubscription'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, newsActivity){
            public final NewsActivity_ViewBinding this$0;
            public final NewsActivity val$target;
            {
                this.this$0 = newsActivity_ViewBinding;
                this.val$target = newsActivity;
            }

            public void doClick(View view) {
                this.val$target.buySubscription();
            }
        });
    }

    @Override
    public void unbind() {
        NewsActivity newsActivity = this.target;
        if (newsActivity != null) {
            this.target = null;
            newsActivity.newsTitle = null;
            newsActivity.mProgram = null;
            newsActivity.date = null;
            newsActivity.mDetailImg = null;
            newsActivity.playVideoImageView = null;
            newsActivity.mPaymentIcon = null;
            newsActivity.mPartLayout = null;
            newsActivity.webView = null;
            newsActivity.predetailWebView = null;
            newsActivity.timeCodesWebView = null;
            newsActivity.fullTextForSubscribersLayout = null;
            newsActivity.subscription = null;
            newsActivity.recommendationsRecyclerView = null;
            newsActivity.recommendationsLayout = null;
            newsActivity.galleryFragment = null;
            newsActivity.fullTextLayout = null;
            newsActivity.viewsCount = null;
            newsActivity.viewsCountContainer = null;
            newsActivity.authors = null;
            newsActivity.bestRecyclerView = null;
            this.view7f0902f2.setOnClickListener(null);
            this.view7f0902f2 = null;
            this.view7f090394.setOnClickListener(null);
            this.view7f090394 = null;
            this.view7f090188.setOnClickListener(null);
            this.view7f090188 = null;
            this.view7f090300.setOnClickListener(null);
            this.view7f090300 = null;
            this.view7f0900a5.setOnClickListener(null);
            this.view7f0900a5 = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

