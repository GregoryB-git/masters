/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 */
package c1;

import X2.v;
import java.util.Collection;
import java.util.List;

public class e {
    public final v a;
    public final long b;
    public final long c;
    public final long d;

    public e(List list, long l8, long l9) {
        long l10;
        this.a = v.U((Collection)list);
        this.b = l8;
        this.c = l9;
        long l11 = l10 = -9223372036854775807L;
        if (l8 != -9223372036854775807L) {
            l11 = l9 == -9223372036854775807L ? l10 : l8 + l9;
        }
        this.d = l11;
    }
}

