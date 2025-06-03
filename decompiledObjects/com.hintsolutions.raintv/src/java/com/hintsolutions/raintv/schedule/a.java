/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 *  ru.tvrain.core.data.ScheduleProgram
 */
package com.hintsolutions.raintv.schedule;

import android.view.View;
import com.hintsolutions.raintv.schedule.RainExpandableListAdapter;
import ru.tvrain.core.data.ScheduleProgram;

public final class a
implements View.OnClickListener {
    public final RainExpandableListAdapter a;
    public final ScheduleProgram b;

    public /* synthetic */ a(RainExpandableListAdapter rainExpandableListAdapter, ScheduleProgram scheduleProgram) {
        this.a = rainExpandableListAdapter;
        this.b = scheduleProgram;
    }

    public final void onClick(View view) {
        RainExpandableListAdapter.a(this.a, this.b, view);
    }
}

