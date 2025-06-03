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
import com.hintsolutions.raintv.adapters.BigNewsListAdapter;

public class BigNewsListAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private BigNewsListAdapter.ViewHolder target;

    @UiThread
    public BigNewsListAdapter$ViewHolder_ViewBinding(BigNewsListAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.layout = Utils.findRequiredView((View)view, (int)2131296729, (String)"field 'layout'");
        viewHolder.text = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'text'", TextView.class);
        viewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        viewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        viewHolder.programName = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297027, (String)"field 'programName'", TextView.class);
        viewHolder.addToFavorites = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296344, (String)"field 'addToFavorites'", ImageView.class);
        viewHolder.durationLayout = Utils.findRequiredView((View)view, (int)2131297317, (String)"field 'durationLayout'");
        viewHolder.duration = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297316, (String)"field 'duration'", TextView.class);
        viewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
        viewHolder.textLayout = Utils.findRequiredView((View)view, (int)2131297224, (String)"field 'textLayout'");
    }

    @CallSuper
    public void unbind() {
        BigNewsListAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.layout = null;
            viewHolder.text = null;
            viewHolder.imageLayout = null;
            viewHolder.image = null;
            viewHolder.programName = null;
            viewHolder.addToFavorites = null;
            viewHolder.durationLayout = null;
            viewHolder.duration = null;
            viewHolder.elementDivider = null;
            viewHolder.textLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

