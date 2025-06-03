/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.UUID
 */
package p0;

import g0.M;
import j0.b;
import java.util.UUID;

public final class G
implements b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        String string2;
        boolean bl = "Amazon".equals((Object)M.c) && ("AFTM".equals((Object)(string2 = M.d)) || "AFTB".equals((Object)string2));
        d = bl;
    }

    public G(UUID uUID, byte[] arrby, boolean bl) {
        this.a = uUID;
        this.b = arrby;
        this.c = bl;
    }
}

