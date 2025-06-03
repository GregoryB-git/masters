/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  androidx.annotation.UiThread
 *  butterknife.internal.DebouncingOnClickListener
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.profile.RecoveryActivity;

public class RecoveryActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private RecoveryActivity target;
    private View view7f090319;

    @UiThread
    public RecoveryActivity_ViewBinding(RecoveryActivity recoveryActivity) {
        this(recoveryActivity, recoveryActivity.getWindow().getDecorView());
    }

    @UiThread
    public RecoveryActivity_ViewBinding(RecoveryActivity recoveryActivity, View view) {
        super(recoveryActivity, view);
        this.target = recoveryActivity;
        recoveryActivity.emailEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296580, (String)"field 'emailEditText'", EditText.class);
        this.view7f090319 = view = Utils.findRequiredView((View)view, (int)2131297049, (String)"method 'emailPasswAuth'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, recoveryActivity){
            public final RecoveryActivity_ViewBinding this$0;
            public final RecoveryActivity val$target;
            {
                this.this$0 = recoveryActivity_ViewBinding;
                this.val$target = recoveryActivity;
            }

            public void doClick(View view) {
                this.val$target.emailPasswAuth();
            }
        });
    }

    @Override
    public void unbind() {
        RecoveryActivity recoveryActivity = this.target;
        if (recoveryActivity != null) {
            this.target = null;
            recoveryActivity.emailEditText = null;
            this.view7f090319.setOnClickListener(null);
            this.view7f090319 = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

