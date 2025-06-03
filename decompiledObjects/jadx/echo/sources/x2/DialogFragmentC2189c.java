package x2;

import A2.AbstractC0328n;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC2189c extends DialogFragment {

    /* renamed from: o, reason: collision with root package name */
    public Dialog f21172o;

    /* renamed from: p, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21173p;

    /* renamed from: q, reason: collision with root package name */
    public Dialog f21174q;

    public static DialogFragmentC2189c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2189c dialogFragmentC2189c = new DialogFragmentC2189c();
        Dialog dialog2 = (Dialog) AbstractC0328n.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2189c.f21172o = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2189c.f21173p = onCancelListener;
        }
        return dialogFragmentC2189c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21173p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21172o;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f21174q == null) {
            this.f21174q = new AlertDialog.Builder((Context) AbstractC0328n.i(getActivity())).create();
        }
        return this.f21174q;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
