/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  androidx.viewpager.widget.ViewPager
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.schedule.ScheduleFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.schedule;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.schedule.ScheduleFragment;

public class ScheduleFragment_ViewBinding
implements Unbinder {
    private ScheduleFragment target;
    private View view7f09010f;
    private View view7f090253;
    private View view7f0902c3;
    private View view7f0902fc;
    private View view7f090394;

    @UiThread
    public ScheduleFragment_ViewBinding(ScheduleFragment scheduleFragment, View view) {
        this.target = scheduleFragment;
        View view2 = Utils.findRequiredView((View)view, (int)2131296527, (String)"field 'dateTextView' and method 'onDateClicked'");
        scheduleFragment.dateTextView = (TextView)Utils.castView((View)view2, (int)2131296527, (String)"field 'dateTextView'", TextView.class);
        this.view7f09010f = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, scheduleFragment){
            public final ScheduleFragment_ViewBinding this$0;
            public final ScheduleFragment val$target;
            {
                this.this$0 = scheduleFragment_ViewBinding;
                this.val$target = scheduleFragment;
            }

            public void doClick(View view) {
                this.val$target.onDateClicked();
            }
        });
        scheduleFragment.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        view2 = Utils.findRequiredView((View)view, (int)2131297172, (String)"field 'subscription' and method 'onSubscriptionClicked'");
        scheduleFragment.subscription = (TextView)Utils.castView((View)view2, (int)2131297172, (String)"field 'subscription'", TextView.class);
        this.view7f090394 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, scheduleFragment){
            public final ScheduleFragment_ViewBinding this$0;
            public final ScheduleFragment val$target;
            {
                this.this$0 = scheduleFragment_ViewBinding;
                this.val$target = scheduleFragment;
            }

            public void doClick(View view) {
                this.val$target.onSubscriptionClicked();
            }
        });
        scheduleFragment.toggleBadgeTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297243, (String)"field 'toggleBadgeTextView'", TextView.class);
        scheduleFragment.pager = (ViewPager)Utils.findRequiredViewAsType((View)view, (int)2131296990, (String)"field 'pager'", ViewPager.class);
        this.view7f090253 = view2 = Utils.findRequiredView((View)view, (int)2131296851, (String)"method 'onMenuClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, scheduleFragment){
            public final ScheduleFragment_ViewBinding this$0;
            public final ScheduleFragment val$target;
            {
                this.this$0 = scheduleFragment_ViewBinding;
                this.val$target = scheduleFragment;
            }

            public void doClick(View view) {
                this.val$target.onMenuClicked();
            }
        });
        this.view7f0902fc = view2 = Utils.findRequiredView((View)view, (int)2131297020, (String)"method 'prevDate'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, scheduleFragment){
            public final ScheduleFragment_ViewBinding this$0;
            public final ScheduleFragment val$target;
            {
                this.this$0 = scheduleFragment_ViewBinding;
                this.val$target = scheduleFragment;
            }

            public void doClick(View view) {
                this.val$target.prevDate();
            }
        });
        this.view7f0902c3 = view = Utils.findRequiredView((View)view, (int)2131296963, (String)"method 'nextDate'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, scheduleFragment){
            public final ScheduleFragment_ViewBinding this$0;
            public final ScheduleFragment val$target;
            {
                this.this$0 = scheduleFragment_ViewBinding;
                this.val$target = scheduleFragment;
            }

            public void doClick(View view) {
                this.val$target.nextDate();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ScheduleFragment scheduleFragment = this.target;
        if (scheduleFragment != null) {
            this.target = null;
            scheduleFragment.dateTextView = null;
            scheduleFragment.title = null;
            scheduleFragment.subscription = null;
            scheduleFragment.toggleBadgeTextView = null;
            scheduleFragment.pager = null;
            this.view7f09010f.setOnClickListener(null);
            this.view7f09010f = null;
            this.view7f090394.setOnClickListener(null);
            this.view7f090394 = null;
            this.view7f090253.setOnClickListener(null);
            this.view7f090253 = null;
            this.view7f0902fc.setOnClickListener(null);
            this.view7f0902fc = null;
            this.view7f0902c3.setOnClickListener(null);
            this.view7f0902c3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

