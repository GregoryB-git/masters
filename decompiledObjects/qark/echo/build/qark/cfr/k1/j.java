/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package k1;

import c1.k;
import f0.a;
import g0.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k1.d;
import k1.i;

public final class j
implements k {
    public final List o;
    public final long[] p;
    public final long[] q;

    public j(List arrl) {
        this.o = Collections.unmodifiableList((List)new ArrayList((Collection)arrl));
        this.p = new long[arrl.size() * 2];
        for (int i8 = 0; i8 < arrl.size(); ++i8) {
            d d8 = (d)arrl.get(i8);
            int n8 = i8 * 2;
            long[] arrl2 = this.p;
            arrl2[n8] = d8.b;
            arrl2[n8 + 1] = d8.c;
        }
        arrl = this.p;
        arrl = Arrays.copyOf((long[])arrl, (int)arrl.length);
        this.q = arrl;
        Arrays.sort((long[])arrl);
    }

    public static /* synthetic */ int a(d d8, d d9) {
        return j.b(d8, d9);
    }

    public static /* synthetic */ int b(d d8, d d9) {
        return Long.compare((long)d8.b, (long)d9.b);
    }

    @Override
    public int c(long l8) {
        int n8 = M.d(this.q, l8, false, false);
        if (n8 < this.q.length) {
            return n8;
        }
        return -1;
    }

    @Override
    public long e(int n8) {
        boolean bl = false;
        boolean bl2 = n8 >= 0;
        g0.a.a(bl2);
        bl2 = bl;
        if (n8 < this.q.length) {
            bl2 = true;
        }
        g0.a.a(bl2);
        return this.q[n8];
    }

    @Override
    public List h(long l8) {
        int n8;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int n9 = 0;
        for (n8 = 0; n8 < this.o.size(); ++n8) {
            long[] arrl = this.p;
            int n10 = n8 * 2;
            if (arrl[n10] > l8 || l8 >= arrl[n10 + 1]) continue;
            arrl = (d)this.o.get(n8);
            a a8 = arrl.a;
            if (a8.e == -3.4028235E38f) {
                arrayList2.add((Object)arrl);
                continue;
            }
            arrayList.add((Object)a8);
        }
        Collections.sort((List)arrayList2, (Comparator)new i());
        for (n8 = n9; n8 < arrayList2.size(); ++n8) {
            arrayList.add((Object)((d)arrayList2.get((int)n8)).a.a().h(-1 - n8, 1).a());
        }
        return arrayList;
    }

    @Override
    public int j() {
        return this.q.length;
    }
}

