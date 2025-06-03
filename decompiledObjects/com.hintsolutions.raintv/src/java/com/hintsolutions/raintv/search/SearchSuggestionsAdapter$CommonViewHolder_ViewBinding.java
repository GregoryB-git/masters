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
package com.hintsolutions.raintv.search;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.search.SearchSuggestionsAdapter;

public class SearchSuggestionsAdapter$CommonViewHolder_ViewBinding
implements Unbinder {
    private SearchSuggestionsAdapter.CommonViewHolder target;

    @UiThread
    public SearchSuggestionsAdapter$CommonViewHolder_ViewBinding(SearchSuggestionsAdapter.CommonViewHolder commonViewHolder, View view) {
        this.target = commonViewHolder;
        commonViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
        commonViewHolder.header = Utils.findRequiredView((View)view, (int)2131296667, (String)"field 'header'");
    }

    @CallSuper
    public void unbind() {
        SearchSuggestionsAdapter.CommonViewHolder commonViewHolder = this.target;
        if (commonViewHolder != null) {
            this.target = null;
            commonViewHolder.name = null;
            commonViewHolder.header = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

