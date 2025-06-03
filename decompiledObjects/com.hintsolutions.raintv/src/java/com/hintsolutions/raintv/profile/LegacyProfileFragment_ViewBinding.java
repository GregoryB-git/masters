/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  com.hintsolutions.raintv.profile.LegacyProfileFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.profile.LegacyProfileFragment;

public class LegacyProfileFragment_ViewBinding
implements Unbinder {
    private LegacyProfileFragment target;

    @UiThread
    public LegacyProfileFragment_ViewBinding(LegacyProfileFragment legacyProfileFragment, View view) {
        this.target = legacyProfileFragment;
        legacyProfileFragment.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        legacyProfileFragment.menuToggleHolder = (RelativeLayout)Utils.findRequiredViewAsType((View)view, (int)2131296851, (String)"field 'menuToggleHolder'", RelativeLayout.class);
        legacyProfileFragment.subscription = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297172, (String)"field 'subscription'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        LegacyProfileFragment legacyProfileFragment = this.target;
        if (legacyProfileFragment != null) {
            this.target = null;
            legacyProfileFragment.title = null;
            legacyProfileFragment.menuToggleHolder = null;
            legacyProfileFragment.subscription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

