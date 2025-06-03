/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.app.FragmentManager
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package x2;

import A2.n;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class c
extends DialogFragment {
    public Dialog o;
    public DialogInterface.OnCancelListener p;
    public Dialog q;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c c8 = new c();
        dialog = (Dialog)n.j((Object)dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        c8.o = dialog;
        if (onCancelListener != null) {
            c8.p = onCancelListener;
        }
        return c8;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.o;
        bundle = dialog;
        if (dialog == null) {
            this.setShowsDialog(false);
            if (this.q == null) {
                this.q = new AlertDialog.Builder((Context)n.i((Object)this.getActivity())).create();
            }
            bundle = this.q;
        }
        return bundle;
    }

    public void show(FragmentManager fragmentManager, String string2) {
        super.show(fragmentManager, string2);
    }
}

