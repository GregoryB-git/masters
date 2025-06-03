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

public class NewsListAdapter$DayViewHolder_ViewBinding
implements Unbinder {
    private NewsListAdapter.DayViewHolder target;

    @UiThread
    public NewsListAdapter$DayViewHolder_ViewBinding(NewsListAdapter.DayViewHolder dayViewHolder, View view) {
        this.target = dayViewHolder;
        dayViewHolder.timelineView = (TimelineView)((Object)Utils.findRequiredViewAsType((View)view, (int)2131297236, (String)"field 'timelineView'", TimelineView.class));
        dayViewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        NewsListAdapter.DayViewHolder dayViewHolder = this.target;
        if (dayViewHolder != null) {
            this.target = null;
            dayViewHolder.timelineView = null;
            dayViewHolder.date = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

