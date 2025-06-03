// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.content.DialogInterface;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.os.Bundle;
import android.content.DialogInterface$OnDismissListener;
import A2.n;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import androidx.fragment.app.d;

public class q extends d
{
    public Dialog E0;
    public DialogInterface$OnCancelListener F0;
    public Dialog G0;
    
    public static q U1(Dialog e0, final DialogInterface$OnCancelListener f0) {
        final q q = new q();
        e0 = (Dialog)n.j(e0, "Cannot display null dialog");
        e0.setOnCancelListener((DialogInterface$OnCancelListener)null);
        e0.setOnDismissListener((DialogInterface$OnDismissListener)null);
        q.E0 = e0;
        if (f0 != null) {
            q.F0 = f0;
        }
        return q;
    }
    
    @Override
    public Dialog N1(final Bundle bundle) {
        Dialog dialog;
        if ((dialog = this.E0) == null) {
            this.R1(false);
            if (this.G0 == null) {
                this.G0 = (Dialog)new AlertDialog$Builder((Context)n.i(this.t())).create();
            }
            dialog = this.G0;
        }
        return dialog;
    }
    
    @Override
    public void T1(final androidx.fragment.app.n n, final String s) {
        super.T1(n, s);
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener f0 = this.F0;
        if (f0 != null) {
            f0.onCancel(dialogInterface);
        }
    }
}
