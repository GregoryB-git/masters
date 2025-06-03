/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Date
 *  java.util.Map
 */
package Q4;

import V2.b;
import V2.j;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Date;
import java.util.Map;

public final class h
implements b {
    public final /* synthetic */ c a;
    public final /* synthetic */ j b;
    public final /* synthetic */ j c;
    public final /* synthetic */ Date d;
    public final /* synthetic */ Map e;

    public /* synthetic */ h(c c8, j j8, j j9, Date date, Map map) {
        this.a = c8;
        this.b = j8;
        this.c = j9;
        this.d = date;
        this.e = map;
    }

    @Override
    public final Object a(j j8) {
        return c.a(this.a, this.b, this.c, this.d, this.e, j8);
    }
}

