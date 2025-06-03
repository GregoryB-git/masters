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
package com.hintsolutions.raintv.programs.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.programs.adapters.AllArticlesAdapter;

public class AllArticlesAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private AllArticlesAdapter.ViewHolder target;

    @UiThread
    public AllArticlesAdapter$ViewHolder_ViewBinding(AllArticlesAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        viewHolder.image = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296689, (String)"field 'image'", ImageView.class);
        viewHolder.date = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296527, (String)"field 'date'", TextView.class);
        viewHolder.addToFavorites = (ImageView)Utils.findRequiredViewAsType((View)view, (int)2131296344, (String)"field 'addToFavorites'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        AllArticlesAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.name = null;
            viewHolder.image = null;
            viewHolder.date = null;
            viewHolder.addToFavorites = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

