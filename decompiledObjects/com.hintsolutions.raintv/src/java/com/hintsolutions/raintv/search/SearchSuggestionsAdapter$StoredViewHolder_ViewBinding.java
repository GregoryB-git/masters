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

public class SearchSuggestionsAdapter$StoredViewHolder_ViewBinding
implements Unbinder {
    private SearchSuggestionsAdapter.StoredViewHolder target;

    @UiThread
    public SearchSuggestionsAdapter$StoredViewHolder_ViewBinding(SearchSuggestionsAdapter.StoredViewHolder storedViewHolder, View view) {
        this.target = storedViewHolder;
        storedViewHolder.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296946, (String)"field 'name'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        SearchSuggestionsAdapter.StoredViewHolder storedViewHolder = this.target;
        if (storedViewHolder != null) {
            this.target = null;
            storedViewHolder.name = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

