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
import com.hintsolutions.raintv.programs.ProgramActivity;

public class ProgramActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private ProgramActivity target;

    @UiThread
    public ProgramActivity_ViewBinding(ProgramActivity programActivity) {
        this(programActivity, programActivity.getWindow().getDecorView());
    }

    @UiThread
    public ProgramActivity_ViewBinding(ProgramActivity programActivity, View view) {
        super(programActivity, view);
        this.target = programActivity;
        programActivity.subscriptionBar = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297172, (String)"field 'subscriptionBar'", TextView.class);
    }

    @Override
    public void unbind() {
        ProgramActivity programActivity = this.target;
        if (programActivity != null) {
            this.target = null;
            programActivity.subscriptionBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

