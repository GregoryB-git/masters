/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ExpandableListView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.schedule.ScheduleDayFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.schedule;

import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.schedule.ScheduleDayFragment;

public class ScheduleDayFragment_ViewBinding
implements Unbinder {
    private ScheduleDayFragment target;

    @UiThread
    public ScheduleDayFragment_ViewBinding(ScheduleDayFragment scheduleDayFragment, View view) {
        this.target = scheduleDayFragment;
        scheduleDayFragment.scheduleExpandableListView = (ExpandableListView)Utils.findRequiredViewAsType((View)view, (int)2131297081, (String)"field 'scheduleExpandableListView'", ExpandableListView.class);
    }

    @CallSuper
    public void unbind() {
        ScheduleDayFragment scheduleDayFragment = this.target;
        if (scheduleDayFragment != null) {
            this.target = null;
            scheduleDayFragment.scheduleExpandableListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

