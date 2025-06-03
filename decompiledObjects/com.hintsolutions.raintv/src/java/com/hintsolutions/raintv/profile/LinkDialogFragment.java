/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.fragment.app.DialogFragment
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package com.hintsolutions.raintv.profile;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class LinkDialogFragment
extends DialogFragment {
    public LinkDialogListener mListener;

    public static /* synthetic */ void a(LinkDialogFragment linkDialogFragment, DialogInterface dialogInterface, int n4) {
        linkDialogFragment.lambda$onCreateDialog$1(dialogInterface, n4);
    }

    public static /* synthetic */ void b(LinkDialogFragment linkDialogFragment, DialogInterface dialogInterface, int n4) {
        linkDialogFragment.lambda$onCreateDialog$0(dialogInterface, n4);
    }

    private /* synthetic */ void lambda$onCreateDialog$0(DialogInterface object, int n4) {
        object = this.mListener;
        if (object != null) {
            object.onDialogPositiveClick(this);
        }
    }

    private /* synthetic */ void lambda$onCreateDialog$1(DialogInterface object, int n4) {
        object = this.mListener;
        if (object != null) {
            object.onDialogNegativeClick(this);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        bundle = new AlertDialog.Builder((Context)this.getActivity());
        bundle.setTitle((CharSequence)"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043a\u043e\u0434 \u043d\u0430 \u0441\u0430\u0439\u0442\u0435").setMessage((CharSequence)this.getArguments().getString("code")).setPositiveButton(17039370, (DialogInterface.OnClickListener)new q2(this, 0)).setNegativeButton(0x1040000, (DialogInterface.OnClickListener)new q2(this, 1));
        return bundle.create();
    }

    public void setListener(LinkDialogListener linkDialogListener) {
        this.mListener = linkDialogListener;
    }
}

