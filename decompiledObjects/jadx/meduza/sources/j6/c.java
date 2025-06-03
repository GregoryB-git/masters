package j6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f8477a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f8478b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f8479c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8478b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f8477a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f8479c == null) {
            Activity activity = getActivity();
            m6.j.i(activity);
            this.f8479c = new AlertDialog.Builder(activity).create();
        }
        return this.f8479c;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
