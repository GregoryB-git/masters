/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  androidx.annotation.UiThread
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.programs;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.programs.TeleshowInfoActivity;

public class TeleshowInfoActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private TeleshowInfoActivity target;

    @UiThread
    public TeleshowInfoActivity_ViewBinding(TeleshowInfoActivity teleshowInfoActivity) {
        this(teleshowInfoActivity, teleshowInfoActivity.getWindow().getDecorView());
    }

    @UiThread
    public TeleshowInfoActivity_ViewBinding(TeleshowInfoActivity teleshowInfoActivity, View view) {
        super(teleshowInfoActivity, view);
        this.target = teleshowInfoActivity;
        teleshowInfoActivity.text = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297202, (String)"field 'text'", TextView.class);
    }

    @Override
    public void unbind() {
        TeleshowInfoActivity teleshowInfoActivity = this.target;
        if (teleshowInfoActivity != null) {
            this.target = null;
            teleshowInfoActivity.text = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

