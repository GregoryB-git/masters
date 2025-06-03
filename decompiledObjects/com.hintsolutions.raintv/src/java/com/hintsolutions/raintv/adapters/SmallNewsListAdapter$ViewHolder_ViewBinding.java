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
import com.hintsolutions.raintv.adapters.SmallNewsListAdapter;

public class SmallNewsListAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private SmallNewsListAdapter.ViewHolder target;

    @UiThread
    public SmallNewsListAdapter$ViewHolder_ViewBinding(SmallNewsListAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.layout = Utils.findRequiredView((View)view, (int)2131296729, (String)"field 'layout'");
        viewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        viewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        viewHolder.text = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'text'", TextView.class);
        viewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
        viewHolder.videoDuration = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297316, (String)"field 'videoDuration'", TextView.class);
        viewHolder.videoDurationLayout = Utils.findRequiredView((View)view, (int)2131297317, (String)"field 'videoDurationLayout'");
        viewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
    }

    @CallSuper
    public void unbind() {
        SmallNewsListAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.layout = null;
            viewHolder.image = null;
            viewHolder.imageLayout = null;
            viewHolder.text = null;
            viewHolder.date = null;
            viewHolder.videoDuration = null;
            viewHolder.videoDurationLayout = null;
            viewHolder.elementDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

