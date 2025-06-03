/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
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
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public class AllNewsSectionedAdapter$NewsSmallViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.NewsSmallViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$NewsSmallViewHolder_ViewBinding(AllNewsSectionedAdapter.NewsSmallViewHolder newsSmallViewHolder, View view) {
        this.target = newsSmallViewHolder;
        newsSmallViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'name'", TextView.class);
        newsSmallViewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        newsSmallViewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        newsSmallViewHolder.durationLayout = Utils.findRequiredView((View)view, (int)2131297317, (String)"field 'durationLayout'");
        newsSmallViewHolder.duration = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297316, (String)"field 'duration'", TextView.class);
        newsSmallViewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
        newsSmallViewHolder.textLayout = Utils.findRequiredView((View)view, (int)2131297224, (String)"field 'textLayout'");
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.NewsSmallViewHolder newsSmallViewHolder = this.target;
        if (newsSmallViewHolder != null) {
            this.target = null;
            newsSmallViewHolder.name = null;
            newsSmallViewHolder.imageLayout = null;
            newsSmallViewHolder.image = null;
            newsSmallViewHolder.durationLayout = null;
            newsSmallViewHolder.duration = null;
            newsSmallViewHolder.elementDivider = null;
            newsSmallViewHolder.textLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

