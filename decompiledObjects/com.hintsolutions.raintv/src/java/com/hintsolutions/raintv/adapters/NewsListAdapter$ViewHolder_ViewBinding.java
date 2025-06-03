/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.vipulasri.timelineview.TimelineView;
import com.hintsolutions.raintv.adapters.NewsListAdapter;

public class NewsListAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private NewsListAdapter.ViewHolder target;

    @UiThread
    public NewsListAdapter$ViewHolder_ViewBinding(NewsListAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.timelineView = (TimelineView)((Object)Utils.findRequiredViewAsType((View)view, (int)2131297236, (String)"field 'timelineView'", TimelineView.class));
        viewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
        viewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        viewHolder.layout = Utils.findRequiredView((View)view, (int)2131296729, (String)"field 'layout'");
    }

    @CallSuper
    public void unbind() {
        NewsListAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.timelineView = null;
            viewHolder.date = null;
            viewHolder.name = null;
            viewHolder.layout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

