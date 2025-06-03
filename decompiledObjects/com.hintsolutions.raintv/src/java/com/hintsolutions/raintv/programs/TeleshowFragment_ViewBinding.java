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
 *  com.google.android.material.tabs.TabLayout
 *  com.hintsolutions.raintv.programs.TeleshowFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.programs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.hintsolutions.raintv.programs.TeleshowFragment;

public class TeleshowFragment_ViewBinding
implements Unbinder {
    private TeleshowFragment target;
    private View view7f090301;

    @UiThread
    public TeleshowFragment_ViewBinding(TeleshowFragment teleshowFragment, View view) {
        this.target = teleshowFragment;
        teleshowFragment.pager = (ViewPager)Utils.findRequiredViewAsType((View)view, (int)2131296990, (String)"field 'pager'", ViewPager.class);
        teleshowFragment.tabs = (TabLayout)Utils.findRequiredViewAsType((View)view, (int)2131297183, (String)"field 'tabs'", TabLayout.class);
        teleshowFragment.infoLayout = Utils.findRequiredView((View)view, (int)2131297026, (String)"field 'infoLayout'");
        teleshowFragment.name = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297027, (String)"field 'name'", TextView.class);
        teleshowFragment.schedule = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297081, (String)"field 'schedule'", TextView.class);
        this.view7f090301 = view = Utils.findRequiredView((View)view, (int)2131297025, (String)"method 'onClickInfo'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, teleshowFragment){
            public final TeleshowFragment_ViewBinding this$0;
            public final TeleshowFragment val$target;
            {
                this.this$0 = teleshowFragment_ViewBinding;
                this.val$target = teleshowFragment;
            }

            public void doClick(View view) {
                this.val$target.onClickInfo();
            }
        });
    }

    @CallSuper
    public void unbind() {
        TeleshowFragment teleshowFragment = this.target;
        if (teleshowFragment != null) {
            this.target = null;
            teleshowFragment.pager = null;
            teleshowFragment.tabs = null;
            teleshowFragment.infoLayout = null;
            teleshowFragment.name = null;
            teleshowFragment.schedule = null;
            this.view7f090301.setOnClickListener(null);
            this.view7f090301 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

