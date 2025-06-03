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

public class AllNewsSectionedAdapter$TopViewHolder_ViewBinding
implements Unbinder {
    private AllNewsSectionedAdapter.TopViewHolder target;

    @UiThread
    public AllNewsSectionedAdapter$TopViewHolder_ViewBinding(AllNewsSectionedAdapter.TopViewHolder topViewHolder, View view) {
        this.target = topViewHolder;
        topViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        topViewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        topViewHolder.imageLayout = Utils.findRequiredView((View)view, (int)2131296704, (String)"field 'imageLayout'");
        topViewHolder.elementDivider = Utils.findRequiredView((View)view, (int)2131296579, (String)"field 'elementDivider'");
        topViewHolder.addToFavorites = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296344, (String)"field 'addToFavorites'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        AllNewsSectionedAdapter.TopViewHolder topViewHolder = this.target;
        if (topViewHolder != null) {
            this.target = null;
            topViewHolder.name = null;
            topViewHolder.image = null;
            topViewHolder.imageLayout = null;
            topViewHolder.elementDivider = null;
            topViewHolder.addToFavorites = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

