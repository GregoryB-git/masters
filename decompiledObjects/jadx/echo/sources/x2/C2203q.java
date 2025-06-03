package x2;

import A2.AbstractC0328n;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d;

/* renamed from: x2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2203q extends DialogInterfaceOnCancelListenerC0782d {

    /* renamed from: E0, reason: collision with root package name */
    public Dialog f21195E0;

    /* renamed from: F0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21196F0;

    /* renamed from: G0, reason: collision with root package name */
    public Dialog f21197G0;

    public static C2203q U1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2203q c2203q = new C2203q();
        Dialog dialog2 = (Dialog) AbstractC0328n.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c2203q.f21195E0 = dialog2;
        if (onCancelListener != null) {
            c2203q.f21196F0 = onCancelListener;
        }
        return c2203q;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d
    public Dialog N1(Bundle bundle) {
        Dialog dialog = this.f21195E0;
        if (dialog != null) {
            return dialog;
        }
        R1(false);
        if (this.f21197G0 == null) {
            this.f21197G0 = new AlertDialog.Builder((Context) AbstractC0328n.i(t())).create();
        }
        return this.f21197G0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d
    public void T1(androidx.fragment.app.n nVar, String str) {
        super.T1(nVar, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0782d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21196F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
