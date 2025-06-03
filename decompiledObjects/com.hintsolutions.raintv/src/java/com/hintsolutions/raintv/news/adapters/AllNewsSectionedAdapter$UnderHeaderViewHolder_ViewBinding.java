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

public class AllNewsSectionedAdapter$UnderHeaderViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.UnderHeaderViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$UnderHeaderViewHolder_ViewBinding(AllNewsSectionedAdapter.UnderHeaderViewHolder underHeaderViewHolder, View view) {
        this.target = underHeaderViewHolder;
        underHeaderViewHolder.text = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297302, (String)"field 'text'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.UnderHeaderViewHolder underHeaderViewHolder = this.target;
        if (underHeaderViewHolder != null) {
            this.target = null;
            underHeaderViewHolder.text = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

