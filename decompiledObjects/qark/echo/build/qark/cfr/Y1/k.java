/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package Y1;

import Y1.m;
import android.content.DialogInterface;
import java.util.Date;

public final class k
implements DialogInterface.OnClickListener {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;
    public final /* synthetic */ m.b c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ Date f;

    public /* synthetic */ k(m m8, String string2, m.b b8, String string3, Date date, Date date2) {
        this.a = m8;
        this.b = string2;
        this.c = b8;
        this.d = string3;
        this.e = date;
        this.f = date2;
    }

    public final void onClick(DialogInterface dialogInterface, int n8) {
        m.V1(this.a, this.b, this.c, this.d, this.e, this.f, dialogInterface, n8);
    }
}

