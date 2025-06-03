/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Date
 */
package Q4;

import V2.b;
import V2.j;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Date;

public final class i
implements b {
    public final /* synthetic */ c a;
    public final /* synthetic */ Date b;

    public /* synthetic */ i(c c8, Date date) {
        this.a = c8;
        this.b = date;
    }

    @Override
    public final Object a(j j8) {
        return c.c(this.a, this.b, j8);
    }
}

