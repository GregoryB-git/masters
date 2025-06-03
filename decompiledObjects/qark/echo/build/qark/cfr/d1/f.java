/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package d1;

import c1.k;
import g0.a;
import java.util.Collections;
import java.util.List;

public final class f
implements k {
    public final List o;

    public f(List list) {
        this.o = list;
    }

    @Override
    public int c(long l8) {
        if (l8 < 0L) {
            return 0;
        }
        return -1;
    }

    @Override
    public long e(int n8) {
        boolean bl = n8 == 0;
        a.a(bl);
        return 0L;
    }

    @Override
    public List h(long l8) {
        if (l8 >= 0L) {
            return this.o;
        }
        return Collections.emptyList();
    }

    @Override
    public int j() {
        return 1;
    }
}

