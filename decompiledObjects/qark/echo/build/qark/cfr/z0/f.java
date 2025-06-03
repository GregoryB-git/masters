/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package z0;

import X2.B;
import X2.v;
import c1.e;
import java.util.ArrayList;
import java.util.List;
import z0.a;

public final class f
implements a {
    public final ArrayList a = new ArrayList();

    @Override
    public v a(long l8) {
        int n8 = this.f(l8);
        if (n8 == 0) {
            return v.Y();
        }
        e e8 = (e)this.a.get(n8 - 1);
        long l9 = e8.d;
        if (l9 != -9223372036854775807L && l8 >= l9) {
            return v.Y();
        }
        return e8.a;
    }

    @Override
    public long b(long l8) {
        boolean bl = this.a.isEmpty();
        long l9 = Long.MIN_VALUE;
        if (bl) {
            return Long.MIN_VALUE;
        }
        if (l8 < ((e)this.a.get((int)0)).b) {
            return ((e)this.a.get((int)0)).b;
        }
        for (int i8 = 1; i8 < this.a.size(); ++i8) {
            e e8 = (e)this.a.get(i8);
            if (l8 >= e8.b) continue;
            long l10 = ((e)this.a.get((int)(i8 - 1))).d;
            if (l10 != -9223372036854775807L && l10 > l8 && l10 < e8.b) {
                return l10;
            }
            return e8.b;
        }
        long l11 = ((e)B.d((Iterable)this.a)).d;
        long l12 = l9;
        if (l11 != -9223372036854775807L) {
            l12 = l9;
            if (l8 < l11) {
                l12 = l11;
            }
        }
        return l12;
    }

    @Override
    public boolean c(e e8, long l8) {
        long l9;
        boolean bl = e8.b != -9223372036854775807L;
        g0.a.a(bl);
        bl = e8.b <= l8 && ((l9 = e8.d) == -9223372036854775807L || l8 < l9);
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            if (e8.b >= ((e)this.a.get((int)i8)).b) {
                this.a.add(i8 + 1, (Object)e8);
                return bl;
            }
            if (((e)this.a.get((int)i8)).b > l8) continue;
            bl = false;
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
        block7 : {
            long l9;
            block9 : {
                block8 : {
                    if (this.a.isEmpty()) break block7;
                    if (l8 < ((e)this.a.get((int)0)).b) {
                        return -9223372036854775807L;
                    }
                    for (int i8 = 1; i8 < this.a.size(); ++i8) {
                        l9 = ((e)this.a.get((int)i8)).b;
                        long l10 = l8 LCMP l9;
                        if (l10 == false) {
                            return l9;
                        }
                        if (l10 >= 0) continue;
                        e e8 = (e)this.a.get(i8 - 1);
                        l9 = e8.d;
                        if (l9 != -9223372036854775807L && l9 <= l8) {
                            return l9;
                        }
                        return e8.b;
                    }
                    e e9 = (e)B.d((Iterable)this.a);
                    long l11 = e9.d;
                    if (l11 == -9223372036854775807L) break block8;
                    l9 = l11;
                    if (l8 >= l11) break block9;
                }
                l9 = e9.b;
            }
            return l9;
        }
        return -9223372036854775807L;
    }

    @Override
    public void e(long l8) {
        int n8 = this.f(l8);
        if (n8 > 0) {
            this.a.subList(0, n8).clear();
        }
    }

    public final int f(long l8) {
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            if (l8 >= ((e)this.a.get((int)i8)).b) continue;
            return i8;
        }
        return this.a.size();
    }
}

