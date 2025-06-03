package j6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class l extends x0.h {

    /* renamed from: w, reason: collision with root package name */
    public Dialog f8507w;

    /* renamed from: x, reason: collision with root package name */
    public DialogInterface.OnCancelListener f8508x;

    /* renamed from: y, reason: collision with root package name */
    public AlertDialog f8509y;

    @Override // x0.h
    public final Dialog e() {
        Dialog dialog = this.f8507w;
        if (dialog != null) {
            return dialog;
        }
        this.f = false;
        if (this.f8509y == null) {
            Context context = getContext();
            m6.j.i(context);
            this.f8509y = new AlertDialog.Builder(context).create();
        }
        return this.f8509y;
    }

    @Override // x0.h, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8508x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
