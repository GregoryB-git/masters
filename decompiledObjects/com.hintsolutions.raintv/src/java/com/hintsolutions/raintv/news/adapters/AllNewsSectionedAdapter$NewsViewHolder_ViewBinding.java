/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public class AllNewsSectionedAdapter$NewsViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.NewsViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$NewsViewHolder_ViewBinding(AllNewsSectionedAdapter.NewsViewHolder newsViewHolder, View view) {
        this.target = newsViewHolder;
        newsViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        newsViewHolder.time = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297233, (String)"field 'time'", TextView.class);
        newsViewHolder.imageLayout = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131296704, (String)"field 'imageLayout'", RelativeLayout.class);
        newsViewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        newsViewHolder.videoIcon = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131297318, (String)"field 'videoIcon'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.NewsViewHolder newsViewHolder = this.target;
        if (newsViewHolder != null) {
            this.target = null;
            newsViewHolder.name = null;
            newsViewHolder.time = null;
            newsViewHolder.imageLayout = null;
            newsViewHolder.image = null;
            newsViewHolder.videoIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

