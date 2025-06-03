/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.recyclerview.widget.RecyclerView
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.programs.TeleshowTabFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.programs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.programs.TeleshowTabFragment;

public class TeleshowTabFragment_ViewBinding
implements Unbinder {
    private TeleshowTabFragment target;

    @UiThread
    public TeleshowTabFragment_ViewBinding(TeleshowTabFragment teleshowTabFragment, View view) {
        this.target = teleshowTabFragment;
        teleshowTabFragment.nothingFound = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296971, (String)"field 'nothingFound'", TextView.class);
        teleshowTabFragment.list = (RecyclerView)Utils.findRequiredViewAsType((View)view, (int)2131296747, (String)"field 'list'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        TeleshowTabFragment teleshowTabFragment = this.target;
        if (teleshowTabFragment != null) {
            this.target = null;
            teleshowTabFragment.nothingFound = null;
            teleshowTabFragment.list = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

