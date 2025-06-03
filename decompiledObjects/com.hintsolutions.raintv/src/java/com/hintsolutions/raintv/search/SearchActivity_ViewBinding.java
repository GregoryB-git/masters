/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  androidx.appcompat.widget.Toolbar
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.search;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.search.SearchActivity;

public class SearchActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private SearchActivity target;

    @UiThread
    public SearchActivity_ViewBinding(SearchActivity searchActivity) {
        this(searchActivity, searchActivity.getWindow().getDecorView());
    }

    @UiThread
    public SearchActivity_ViewBinding(SearchActivity searchActivity, View view) {
        super(searchActivity, view);
        this.target = searchActivity;
        searchActivity.toolbar = (Toolbar)Utils.findRequiredViewAsType((View)view, (int)2131297244, (String)"field 'toolbar'", Toolbar.class);
        searchActivity.searchCategoriesView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131297106, (String)"field 'searchCategoriesView'", RecyclerView.class);
        searchActivity.searchResultsView = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131297103, (String)"field 'searchResultsView'", RecyclerView.class);
        searchActivity.searchNotFound = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297100, (String)"field 'searchNotFound'", TextView.class);
    }

    @Override
    public void unbind() {
        SearchActivity searchActivity = this.target;
        if (searchActivity != null) {
            this.target = null;
            searchActivity.toolbar = null;
            searchActivity.searchCategoriesView = null;
            searchActivity.searchResultsView = null;
            searchActivity.searchNotFound = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

