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
import com.hintsolutions.raintv.profile.RegistrationActivity;

public class RegistrationActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private RegistrationActivity target;
    private View view7f09031d;

    @UiThread
    public RegistrationActivity_ViewBinding(RegistrationActivity registrationActivity) {
        this(registrationActivity, registrationActivity.getWindow().getDecorView());
    }

    @UiThread
    public RegistrationActivity_ViewBinding(RegistrationActivity registrationActivity, View view) {
        super(registrationActivity, view);
        this.target = registrationActivity;
        registrationActivity.firstnameEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296629, (String)"field 'firstnameEditText'", EditText.class);
        registrationActivity.emailEditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296580, (String)"field 'emailEditText'", EditText.class);
        registrationActivity.password1EditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296998, (String)"field 'password1EditText'", EditText.class);
        registrationActivity.password2EditText = (EditText)Utils.findRequiredViewAsType((View)view, (int)2131296999, (String)"field 'password2EditText'", EditText.class);
        this.view7f09031d = view = Utils.findRequiredView((View)view, (int)2131297053, (String)"method 'registration'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, registrationActivity){
            public final RegistrationActivity_ViewBinding this$0;
            public final RegistrationActivity val$target;
            {
                this.this$0 = registrationActivity_ViewBinding;
                this.val$target = registrationActivity;
            }

            public void doClick(View view) {
                this.val$target.registration();
            }
        });
    }

    @Override
    public void unbind() {
        RegistrationActivity registrationActivity = this.target;
        if (registrationActivity != null) {
            this.target = null;
            registrationActivity.firstnameEditText = null;
            registrationActivity.emailEditText = null;
            registrationActivity.password1EditText = null;
            registrationActivity.password2EditText = null;
            this.view7f09031d.setOnClickListener(null);
            this.view7f09031d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

