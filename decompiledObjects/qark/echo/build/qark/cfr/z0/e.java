/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.List
 */
package z0;

import W2.g;
import X2.P;
import X2.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import z0.a;
import z0.c;
import z0.d;

public final class e
implements a {
    public static final P b = P.d().f(new c()).a(P.d().g().f(new d()));
    public final List a = new ArrayList();

    public static /* synthetic */ Long f(c1.e e8) {
        return e8.c;
    }

    public static /* synthetic */ Long g(c1.e e8) {
        return e8.b;
    }

    @Override
    public v a(long l8) {
        if (!this.a.isEmpty()) {
            List list = this.a;
            int n8 = 0;
            if (l8 >= ((c1.e)list.get((int)0)).b) {
                int n9;
                Object object;
                list = new ArrayList();
                for (n9 = 0; n9 < this.a.size(); ++n9) {
                    object = (c1.e)this.a.get(n9);
                    if (l8 >= object.b && l8 < object.d) {
                        list.add(object);
                    }
                    if (l8 < object.b) break;
                }
                list = v.g0(b, (Iterable)list);
                object = v.M();
                for (n9 = n8; n9 < list.size(); ++n9) {
                    object.j((Iterable)((c1.e)list.get((int)n9)).a);
                }
                return object.k();
            }
        }
        return v.Y();
    }

    @Override
    public long b(long l8) {
        long l9;
        int n8 = 0;
        long l10 = -9223372036854775807L;
        do {
            l9 = l10;
            if (n8 >= this.a.size()) break;
            l9 = ((c1.e)this.a.get((int)n8)).b;
            long l11 = ((c1.e)this.a.get((int)n8)).d;
            if (l8 < l9) {
                if (l10 == -9223372036854775807L) break;
                l9 = Math.min((long)l10, (long)l9);
                break;
            }
            l9 = l10;
            if (l8 < l11) {
                l9 = l10 == -9223372036854775807L ? l11 : Math.min((long)l10, (long)l11);
            }
            ++n8;
            l10 = l9;
        } while (true);
        if (l9 != -9223372036854775807L) {
            return l9;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean c(c1.e e8, long l8) {
        boolean bl = e8.b != -9223372036854775807L;
        g0.a.a(bl);
        bl = e8.c != -9223372036854775807L;
        g0.a.a(bl);
        bl = e8.b <= l8 && l8 < e8.d;
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            if (e8.b < ((c1.e)this.a.get((int)i8)).b) continue;
            this.a.add(i8 + 1, (Object)e8);
            return bl;
        }
        this.a.add(0, (Object)e8);
        return bl;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public long d(long l8) {
        if (!this.a.isEmpty()) {
            List list = this.a;
            if (l8 >= ((c1.e)list.get((int)0)).b) {
                long l9 = ((c1.e)this.a.get((int)0)).b;
                for (int i8 = 0; i8 < this.a.size(); ++i8) {
                    long l10 = ((c1.e)this.a.get((int)i8)).b;
                    long l11 = ((c1.e)this.a.get((int)i8)).d;
                    if (l11 <= l8) {
                        l9 = Math.max((long)l9, (long)l11);
                        continue;
                    }
                    if (l10 > l8) break;
                    l9 = Math.max((long)l9, (long)l10);
                }
                return l9;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public void e(long l8) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            long l9 = l8 LCMP ((c1.e)this.a.get((int)i8)).b;
            if (l9 > 0 && l8 > ((c1.e)this.a.get((int)i8)).d) {
                this.a.remove(i8);
                --i8;
                continue;
            }
            if (l9 >= 0) continue;
            return;
        }
    }
}

