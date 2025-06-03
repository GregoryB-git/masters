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
import com.hintsolutions.raintv.adapters.SearchCategoryAdapter;

public class SearchCategoryAdapter$ViewHolder_ViewBinding
implements Unbinder {
    private SearchCategoryAdapter.ViewHolder target;

    @UiThread
    public SearchCategoryAdapter$ViewHolder_ViewBinding(SearchCategoryAdapter.ViewHolder viewHolder, View view) {
        this.target = viewHolder;
        viewHolder.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297105, (String)"field 'title'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SearchCategoryAdapter.ViewHolder viewHolder = this.target;
        if (viewHolder != null) {
            this.target = null;
            viewHolder.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

