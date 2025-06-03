/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 */
package Q4;

import V2.b;
import V2.j;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Map;

public final class f
implements b {
    public final /* synthetic */ c a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Map c;

    public /* synthetic */ f(c c8, long l8, Map map) {
        this.a = c8;
        this.b = l8;
        this.c = map;
    }

    @Override
    public final Object a(j j8) {
        return c.e(this.a, this.b, this.c, j8);
    }
}

