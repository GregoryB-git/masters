/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.programs.ProgramsFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView
 */
package com.hintsolutions.raintv.programs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.programs.ProgramsFragment;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public class ProgramsFragment_ViewBinding
implements Unbinder {
    private ProgramsFragment target;
    private View view7f090253;
    private View view7f090394;

    @UiThread
    public ProgramsFragment_ViewBinding(ProgramsFragment programsFragment, View view) {
        this.target = programsFragment;
        programsFragment.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        programsFragment.mPinnedHeaderListView = (PinnedHeaderListView)Utils.findRequiredViewAsType((View)view, (int)2131296747, (String)"field 'mPinnedHeaderListView'", PinnedHeaderListView.class);
        View view2 = Utils.findRequiredView((View)view, (int)2131297172, (String)"field 'subscription' and method 'onSubscriptionClicked'");
        programsFragment.subscription = (TextView)Utils.castView((View)view2, (int)2131297172, (String)"field 'subscription'", TextView.class);
        this.view7f090394 = view2;
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, programsFragment){
            public final ProgramsFragment_ViewBinding this$0;
            public final ProgramsFragment val$target;
            {
                this.this$0 = programsFragment_ViewBinding;
                this.val$target = programsFragment;
            }

            public void doClick(View view) {
                this.val$target.onSubscriptionClicked();
            }
        });
        programsFragment.toggleBadgeTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297243, (String)"field 'toggleBadgeTextView'", TextView.class);
        this.view7f090253 = view = Utils.findRequiredView((View)view, (int)2131296851, (String)"method 'onMenuClicked'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, programsFragment){
            public final ProgramsFragment_ViewBinding this$0;
            public final ProgramsFragment val$target;
            {
                this.this$0 = programsFragment_ViewBinding;
                this.val$target = programsFragment;
            }

            public void doClick(View view) {
                this.val$target.onMenuClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ProgramsFragment programsFragment = this.target;
        if (programsFragment != null) {
            this.target = null;
            programsFragment.title = null;
            programsFragment.mPinnedHeaderListView = null;
            programsFragment.subscription = null;
            programsFragment.toggleBadgeTextView = null;
            this.view7f090394.setOnClickListener(null);
            this.view7f090394 = null;
            this.view7f090253.setOnClickListener(null);
            this.view7f090253 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

