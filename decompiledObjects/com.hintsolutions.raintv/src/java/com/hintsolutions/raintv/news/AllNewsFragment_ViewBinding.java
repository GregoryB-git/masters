/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.viewpager.widget.ViewPager
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  com.google.android.material.tabs.TabLayout
 *  com.hintsolutions.raintv.news.AllNewsFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.hintsolutions.raintv.news.AllNewsFragment;

public class AllNewsFragment_ViewBinding
implements Unbinder {
    private AllNewsFragment target;
    private View view7f090096;
    private View view7f090098;
    private View view7f090253;
    private View view7f090343;
    private View view7f090394;
    private View view7f0903dd;

    @UiThread
    public AllNewsFragment_ViewBinding(AllNewsFragment allNewsFragment, View view) {
        this.target = allNewsFragment;
        allNewsFragment.mTitleTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297246, (String)"field 'mTitleTextView'", TextView.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297172, (String)"field 'subscription' and method 'onSubscriptionClicked'");
        allNewsFragment.subscription = (TextView)Utils.castView((View)view2, (int)2131297172, (String)"field 'subscription'", TextView.class);
        this.view7f090394 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onSubscriptionClicked();
            }
        });
        allNewsFragment.toggleBadgeTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297243, (String)"field 'toggleBadgeTextView'", TextView.class);
        allNewsFragment.pager = (ViewPager)Utils.findRequiredViewAsType((View)view, (int)2131296990, (String)"field 'pager'", ViewPager.class);
        allNewsFragment.tabs = (TabLayout)Utils.findRequiredViewAsType((View)view, (int)2131297183, (String)"field 'tabs'", TabLayout.class);
        allNewsFragment.breakingNewsLayout = Utils.findRequiredView((View)view, (int)2131296407, (String)"field 'breakingNewsLayout'");
        view2 = Utils.findRequiredView((View)view, (int)2131296408, (String)"field 'breakingNewsText' and method 'onBreakingNewsClicked'");
        allNewsFragment.breakingNewsText = (TextView)Utils.castView((View)view2, (int)2131296408, (String)"field 'breakingNewsText'", TextView.class);
        this.view7f090098 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onBreakingNewsClicked();
            }
        });
        view2 = Utils.findRequiredView((View)view, (int)2131297245, (String)"field 'donateBtn' and method 'onClickDonate'");
        allNewsFragment.donateBtn = (Button)Utils.castView((View)view2, (int)2131297245, (String)"field 'donateBtn'", Button.class);
        this.view7f0903dd = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onClickDonate();
            }
        });
        this.view7f090096 = view2 = Utils.findRequiredView((View)view, (int)2131296406, (String)"method 'onCloseBreakingNewsClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onCloseBreakingNewsClicked();
            }
        });
        this.view7f090343 = view2 = Utils.findRequiredView((View)view, (int)2131297091, (String)"method 'onSearchClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onSearchClicked();
            }
        });
        this.view7f090253 = view = Utils.findRequiredView((View)view, (int)2131296851, (String)"method 'onMenuClicked'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, allNewsFragment){
            public final AllNewsFragment_ViewBinding this$0;
            public final AllNewsFragment val$target;
            {
                this.this$0 = allNewsFragment_ViewBinding;
                this.val$target = allNewsFragment;
            }

            public void doClick(View view) {
                this.val$target.onMenuClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        AllNewsFragment allNewsFragment = this.target;
        if (allNewsFragment != null) {
            this.target = null;
            allNewsFragment.mTitleTextView = null;
            allNewsFragment.subscription = null;
            allNewsFragment.toggleBadgeTextView = null;
            allNewsFragment.pager = null;
            allNewsFragment.tabs = null;
            allNewsFragment.breakingNewsLayout = null;
            allNewsFragment.breakingNewsText = null;
            allNewsFragment.donateBtn = null;
            this.view7f090394.setOnClickListener(null);
            this.view7f090394 = null;
            this.view7f090098.setOnClickListener(null);
            this.view7f090098 = null;
            this.view7f0903dd.setOnClickListener(null);
            this.view7f0903dd = null;
            this.view7f090096.setOnClickListener(null);
            this.view7f090096 = null;
            this.view7f090343.setOnClickListener(null);
            this.view7f090343 = null;
            this.view7f090253.setOnClickListener(null);
            this.view7f090253 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

