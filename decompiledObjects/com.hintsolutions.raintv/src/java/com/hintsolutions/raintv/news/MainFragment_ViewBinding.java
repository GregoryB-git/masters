/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.news.MainFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
 */
package com.hintsolutions.raintv.news;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.news.MainFragment;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public class MainFragment_ViewBinding
implements Unbinder {
    private MainFragment target;

    @UiThread
    public MainFragment_ViewBinding(MainFragment mainFragment, View view) {
        this.target = mainFragment;
        mainFragment.mPinnedHeaderListView = (PinnedHeaderListView)Utils.findRequiredViewAsType((View)view, (int)2131296747, (String)"field 'mPinnedHeaderListView'", PinnedHeaderListView.class);
        mainFragment.swipeRefreshLayout = (SwipeRefreshLayout)Utils.findRequiredViewAsType((View)view, (int)2131297179, (String)"field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    }

    @CallSuper
    public void unbind() {
        MainFragment mainFragment = this.target;
        if (mainFragment != null) {
            this.target = null;
            mainFragment.mPinnedHeaderListView = null;
            mainFragment.swipeRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

