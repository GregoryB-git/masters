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
 *  com.hintsolutions.raintv.profile.AuthorizationFragment
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.profile.AuthorizationFragment;

public class AuthorizationFragment_ViewBinding
implements Unbinder {
    private AuthorizationFragment target;
    private View view7f090077;
    private View view7f090253;
    private View view7f09031d;

    @UiThread
    public AuthorizationFragment_ViewBinding(AuthorizationFragment authorizationFragment, View view) {
        View view2;
        this.target = authorizationFragment;
        authorizationFragment.versionView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131296364, (String)"field 'versionView'", TextView.class);
        authorizationFragment.title = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297237, (String)"field 'title'", TextView.class);
        authorizationFragment.toggleBadgeTextView = (TextView)Utils.findRequiredViewAsType((View)view, (int)2131297243, (String)"field 'toggleBadgeTextView'", TextView.class);
        this.view7f090253 = view2 = Utils.findRequiredView((View)view, (int)2131296851, (String)"method 'onMenuClicked'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, authorizationFragment){
            public final AuthorizationFragment_ViewBinding this$0;
            public final AuthorizationFragment val$target;
            {
                this.this$0 = authorizationFragment_ViewBinding;
                this.val$target = authorizationFragment;
            }

            public void doClick(View view) {
                this.val$target.onMenuClicked();
            }
        });
        this.view7f090077 = view2 = Utils.findRequiredView((View)view, (int)2131296375, (String)"method 'startAuthorization'");
        view2.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, authorizationFragment){
            public final AuthorizationFragment_ViewBinding this$0;
            public final AuthorizationFragment val$target;
            {
                this.this$0 = authorizationFragment_ViewBinding;
                this.val$target = authorizationFragment;
            }

            public void doClick(View view) {
                this.val$target.startAuthorization();
            }
        });
        this.view7f09031d = view = Utils.findRequiredView((View)view, (int)2131297053, (String)"method 'startRegistration'");
        view.setOnClickListener((View.OnClickListener)new DebouncingOnClickListener(this, authorizationFragment){
            public final AuthorizationFragment_ViewBinding this$0;
            public final AuthorizationFragment val$target;
            {
                this.this$0 = authorizationFragment_ViewBinding;
                this.val$target = authorizationFragment;
            }

            public void doClick(View view) {
                this.val$target.startRegistration();
            }
        });
    }

    @CallSuper
    public void unbind() {
        AuthorizationFragment authorizationFragment = this.target;
        if (authorizationFragment != null) {
            this.target = null;
            authorizationFragment.versionView = null;
            authorizationFragment.title = null;
            authorizationFragment.toggleBadgeTextView = null;
            this.view7f090253.setOnClickListener(null);
            this.view7f090253 = null;
            this.view7f090077.setOnClickListener(null);
            this.view7f090077 = null;
            this.view7f09031d.setOnClickListener(null);
            this.view7f09031d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

