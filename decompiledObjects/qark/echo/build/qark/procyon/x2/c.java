// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import A2.n;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

public class c extends DialogFragment
{
    public Dialog o;
    public DialogInterface$OnCancelListener p;
    public Dialog q;
    
    public static c a(Dialog o, final DialogInterface$OnCancelListener p2) {
        final c c = new c();
        o = (Dialog)n.j(o, "Cannot display null dialog");
        o.setOnCancelListener((DialogInterface$OnCancelListener)null);
        o.setOnDismissListener((DialogInterface$OnDismissListener)null);
        c.o = o;
        if (p2 != null) {
            c.p = p2;
        }
        return c;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener p = this.p;
        if (p != null) {
            p.onCancel(dialogInterface);
        }
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        Dialog dialog;
        if ((dialog = this.o) == null) {
            this.setShowsDialog(false);
            if (this.q == null) {
                this.q = (Dialog)new AlertDialog$Builder((Context)n.i(((Fragment)this).getActivity())).create();
            }
            dialog = this.q;
        }
        return dialog;
    }
    
    public void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
