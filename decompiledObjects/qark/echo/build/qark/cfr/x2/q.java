/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
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
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;

public class q
extends d {
    public Dialog E0;
    public DialogInterface.OnCancelListener F0;
    public Dialog G0;

    public static q U1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        q q8 = new q();
        dialog = (Dialog)n.j((Object)dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        q8.E0 = dialog;
        if (onCancelListener != null) {
            q8.F0 = onCancelListener;
        }
        return q8;
    }

    @Override
    public Dialog N1(Bundle bundle) {
        Dialog dialog = this.E0;
        bundle = dialog;
        if (dialog == null) {
            this.R1(false);
            if (this.G0 == null) {
                this.G0 = new AlertDialog.Builder((Context)n.i((Object)this.t())).create();
            }
            bundle = this.G0;
        }
        return bundle;
    }

    @Override
    public void T1(androidx.fragment.app.n n8, String string2) {
        super.T1(n8, string2);
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

