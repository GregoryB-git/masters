/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  java.lang.Object
 */
package O1;

import O1.V;
import android.content.DialogInterface;

public final class T
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ V o;

    public /* synthetic */ T(V v8) {
        this.o = v8;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        V.a(this.o, dialogInterface);
    }
}

