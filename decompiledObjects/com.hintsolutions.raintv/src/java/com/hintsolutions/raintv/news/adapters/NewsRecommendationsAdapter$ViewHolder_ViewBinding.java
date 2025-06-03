/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.NewsRecommendationsAdapter;

public class NewsRecommendationsAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private NewsRecommendationsAdapter.ViewHolder target;

    @UiThread
    public NewsRecommendationsAdapter$ViewHolder_ViewBinding(NewsRecommendationsAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.nameTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296947, (String)"field 'nameTextView'", TextView.class);
        viewHolder.rootLayout = (LinearLayout)Utils.findRequiredViewAsType((View)view, (int)2131297073, (String)"field 'rootLayout'", LinearLayout.class);
    }

    @CallSuper
    public void unbind() {
        NewsRecommendationsAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.nameTextView = null;
            viewHolder.rootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

