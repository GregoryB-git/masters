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
package com.hintsolutions.raintv.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;

public class NewsSliderAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private NewsSliderAdapter.ViewHolder target;

    @UiThread
    public NewsSliderAdapter$ViewHolder_ViewBinding(NewsSliderAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'name'", TextView.class);
        viewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        viewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        viewHolder.durationLayout = Utils.findRequiredView((View)view, (int)2131297317, (String)"field 'durationLayout'");
        viewHolder.duration = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297316, (String)"field 'duration'", TextView.class);
        viewHolder.textLayout = Utils.findRequiredView((View)view, (int)2131297224, (String)"field 'textLayout'");
        viewHolder.layout = Utils.findRequiredView((View)view, (int)2131296729, (String)"field 'layout'");
        viewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        NewsSliderAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.name = null;
            viewHolder.imageLayout = null;
            viewHolder.image = null;
            viewHolder.durationLayout = null;
            viewHolder.duration = null;
            viewHolder.textLayout = null;
            viewHolder.layout = null;
            viewHolder.date = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

