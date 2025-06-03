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
package com.hintsolutions.raintv.news.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public class AllNewsSectionedAdapter$MainNewsViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.MainNewsViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$MainNewsViewHolder_ViewBinding(AllNewsSectionedAdapter.MainNewsViewHolder mainNewsViewHolder, View view) {
        this.target = mainNewsViewHolder;
        mainNewsViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        mainNewsViewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
        mainNewsViewHolder.allNewsLink = Utils.findRequiredView((View)view, (int)2131296354, (String)"field 'allNewsLink'");
        mainNewsViewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.MainNewsViewHolder mainNewsViewHolder = this.target;
        if (mainNewsViewHolder != null) {
            this.target = null;
            mainNewsViewHolder.name = null;
            mainNewsViewHolder.elementDivider = null;
            mainNewsViewHolder.allNewsLink = null;
            mainNewsViewHolder.date = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

