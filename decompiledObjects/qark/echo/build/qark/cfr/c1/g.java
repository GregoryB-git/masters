/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 */
package c1;

import X2.B;
import X2.P;
import X2.v;
import c1.e;
import c1.f;
import c1.k;
import g0.M;
import g0.a;
import g0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class g
implements k {
    public static final P q = P.d().f(new f());
    public final v o;
    public final long[] p;

    /*
     * Enabled aggressive block sorting
     */
    public g(List object) {
        int n8 = 0;
        if (object.size() == 1) {
            object = (e)B.g((Iterable)object);
            long l8 = g.f(object.b);
            if (object.c == -9223372036854775807L) {
                this.o = v.Z((Object)object.a);
                this.p = new long[]{l8};
                return;
            }
            this.o = v.a0((Object)object.a, (Object)v.Y());
            this.p = new long[]{l8, object.c + l8};
            return;
        }
        ArrayList arrayList = new long[object.size() * 2];
        this.p = arrayList;
        Arrays.fill((long[])arrayList, (long)Long.MAX_VALUE);
        arrayList = new ArrayList();
        object = v.g0(q, (Iterable)object);
        int n9 = 0;
        do {
            int n10;
            long l9;
            long[] arrl;
            if (n8 >= object.size()) {
                this.o = v.U((Collection)arrayList);
                return;
            }
            e e8 = (e)object.get(n8);
            long l10 = g.f(e8.b);
            long l11 = e8.c;
            if (n9 != 0 && (l9 = (arrl = this.p)[n10 = n9 - 1]) >= l10) {
                if (l9 != l10 || !((v)((Object)arrayList.get(n10))).isEmpty()) {
                    o.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.p[n10] = l10;
                }
                arrayList.set(n10, (Object)e8.a);
                n10 = n9;
            } else {
                this.p[n9] = l10;
                arrayList.add((Object)e8.a);
                n10 = n9 + 1;
            }
            n9 = n10;
            if (e8.c != -9223372036854775807L) {
                this.p[n10] = l11 + l10;
                arrayList.add((Object)v.Y());
                n9 = n10 + 1;
            }
            ++n8;
        } while (true);
    }

    public static /* synthetic */ Comparable a(e e8) {
        return g.d(e8);
    }

    public static /* synthetic */ Comparable d(e e8) {
        return Long.valueOf((long)g.f(e8.b));
    }

    public static long f(long l8) {
        long l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        return l9;
    }

    public v b(long l8) {
        int n8 = M.h(this.p, l8, true, false);
        if (n8 == -1) {
            return v.Y();
        }
        return (v)((Object)this.o.get(n8));
    }

    @Override
    public int c(long l8) {
        int n8 = M.d(this.p, l8, false, false);
        if (n8 < this.o.size()) {
            return n8;
        }
        return -1;
    }

    @Override
    public long e(int n8) {
        boolean bl = n8 < this.o.size();
        a.a(bl);
        return this.p[n8];
    }

    @Override
    public int j() {
        return this.o.size();
    }
}

