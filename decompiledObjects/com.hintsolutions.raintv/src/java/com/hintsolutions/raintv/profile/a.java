/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  rx.functions.Action1
 */
package com.hintsolutions.raintv.profile;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import rx.functions.Action1;

public final class a
implements TaskCallback,
Action1,
MaterialDialog.SingleButtonCallback {
    public final int a;
    public final AuthorizationActivity b;

    public /* synthetic */ a(AuthorizationActivity authorizationActivity, int n4) {
        this.a = n4;
        this.b = authorizationActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AuthorizationActivity.F(this.b, (Throwable)object);
                return;
            }
        }
        AuthorizationActivity.I(this.b, (Throwable)object);
    }

    @Override
    public final void onActionCompleted() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AuthorizationActivity.emailPasswordAuth.1.a(this.b);
                return;
            }
        }
        AuthorizationActivity.C(this.b);
    }

    @Override
    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        AuthorizationActivity.H(this.b, materialDialog, dialogAction);
    }
}

