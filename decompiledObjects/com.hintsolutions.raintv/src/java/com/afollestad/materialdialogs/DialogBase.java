/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  androidx.annotation.NonNull
 *  java.lang.Deprecated
 *  java.lang.IllegalAccessError
 *  java.lang.Object
 */
package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.internal.MDRootLayout;

class DialogBase
extends Dialog
implements DialogInterface.OnShowListener {
    private DialogInterface.OnShowListener showListener;
    public MDRootLayout view;

    public DialogBase(Context context, int n) {
        super(context, n);
    }

    public View findViewById(int n) {
        return this.view.findViewById(n);
    }

    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.showListener;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Deprecated
    public void setContentView(int n) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(@NonNull View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Deprecated
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.showListener = onShowListener;
    }

    public final void setOnShowListenerInternal() {
        super.setOnShowListener((DialogInterface.OnShowListener)this);
    }

    public final void setViewInternal(View view) {
        super.setContentView(view);
    }
}

