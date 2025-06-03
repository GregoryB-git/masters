/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  com.google.android.material.appbar.AppBarLayout
 *  com.hintsolutions.raintv.profile.SavedVideosFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.hintsolutions.raintv.profile.SavedVideosFragment;

public class SavedVideosFragment_ViewBinding
implements Unbinder {
    private SavedVideosFragment target;
    private View view7f090253;
    private View view7f09031e;
    private View view7f090394;

    @UiThread
    public SavedVideosFragment_ViewBinding(SavedVideosFragment savedVideosFragment, View view) {
        this.target = savedVideosFragment;
        savedVideosFragment.mRecyclerView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131297051, (String)"field 'mRecyclerView'", RecyclerView.class);
        savedVideosFragment.emptyView = Utils.findRequiredView((View)view, (int)2131296582, (String)"field 'emptyView'");
        savedVideosFragment.emptyLabel = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296581, (String)"field 'emptyLabel'", TextView.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297054, (String)"field 'retryButton' and method 'onRetryClicked'");
        savedVideosFragment.retryButton = (TextView)Utils.castView((View)view2, (int)2131297054, (String)"field 'retryButton'", TextView.class);
        this.view7f09031e = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, savedVideosFragment){
            public final SavedVideosFragment_ViewBinding this$0;
            public final SavedVideosFragment val$target;
            {
                this.this$0 = savedVideosFragment_ViewBinding;
                this.val$target = savedVideosFragment;
            }

            public void doClick(View view) {
                this.val$target.onRetryClicked();
            }
        });
        savedVideosFragment.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        savedVideosFragment.appBar = (AppBarLayout)Utils.findRequiredViewAsType((View)view, (int)2131296360, (String)"field 'appBar'", AppBarLayout.class);
        view2 = Utils.findRequiredView((View)view, (int)2131297172, (String)"field 'subscription' and method 'onSubscriptionClicked'");
        savedVideosFragment.subscription = (TextView)Utils.castView((View)view2, (int)2131297172, (String)"field 'subscription'", TextView.class);
        this.view7f090394 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, savedVideosFragment){
            public final SavedVideosFragment_ViewBinding this$0;
            public final SavedVideosFragment val$target;
            {
                this.this$0 = savedVideosFragment_ViewBinding;
                this.val$target = savedVideosFragment;
            }

            public void doClick(View view) {
                this.val$target.onSubscriptionClicked();
            }
        });
        savedVideosFragment.toggleBadgeTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297243, (String)"field 'toggleBadgeTextView'", TextView.class);
        this.view7f090253 = view = Utils.findRequiredView((View)view, (int)2131296851, (String)"method 'onMenuClicked'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, savedVideosFragment){
            public final SavedVideosFragment_ViewBinding this$0;
            public final SavedVideosFragment val$target;
            {
                this.this$0 = savedVideosFragment_ViewBinding;
                this.val$target = savedVideosFragment;
            }

            public void doClick(View view) {
                this.val$target.onMenuClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        SavedVideosFragment savedVideosFragment = this.target;
        if (savedVideosFragment != null) {
            this.target = null;
            savedVideosFragment.mRecyclerView = null;
            savedVideosFragment.emptyView = null;
            savedVideosFragment.emptyLabel = null;
            savedVideosFragment.retryButton = null;
            savedVideosFragment.title = null;
            savedVideosFragment.appBar = null;
            savedVideosFragment.subscription = null;
            savedVideosFragment.toggleBadgeTextView = null;
            this.view7f09031e.setOnClickListener(null);
            this.view7f09031e = null;
            this.view7f090394.setOnClickListener(null);
            this.view7f090394 = null;
            this.view7f090253.setOnClickListener(null);
            this.view7f090253 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

