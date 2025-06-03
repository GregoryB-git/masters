/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package i1;

import c1.k;
import g0.M;
import i1.c;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class h
implements k {
    public final c o;
    public final long[] p;
    public final Map q;
    public final Map r;
    public final Map s;

    public h(c c8, Map map, Map map2, Map map3) {
        this.o = c8;
        this.r = map2;
        this.s = map3;
        map = map != null ? Collections.unmodifiableMap((Map)map) : Collections.emptyMap();
        this.q = map;
        this.p = c8.j();
    }

    @Override
    public int c(long l8) {
        int n8 = M.d(this.p, l8, false, false);
        if (n8 < this.p.length) {
            return n8;
        }
        return -1;
    }

    @Override
    public long e(int n8) {
        return this.p[n8];
    }

    @Override
    public List h(long l8) {
        return this.o.h(l8, this.q, this.r, this.s);
    }

    @Override
    public int j() {
        return this.p.length;
    }
}

