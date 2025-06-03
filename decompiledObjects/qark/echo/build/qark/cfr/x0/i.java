/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.List
 */
package x0;

import X2.v;
import java.util.Collection;
import java.util.List;
import k0.y0;
import x0.S;

public final class i
implements S {
    public final v o;
    public long p;

    public i(List list, List list2) {
        v.a a8 = v.M();
        int n8 = list.size();
        int n9 = list2.size();
        boolean bl = n8 == n9;
        g0.a.a(bl);
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a8.h(new a((S)list.get(i8), (List)list2.get(i8)));
        }
        this.o = a8.k();
        this.p = -9223372036854775807L;
    }

    @Override
    public boolean b() {
        for (int i8 = 0; i8 < this.o.size(); ++i8) {
            if (!((a)this.o.get(i8)).b()) continue;
            return true;
        }
        return false;
    }

    @Override
    public long c() {
        long l8;
        long l9 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.o.size(); ++i8) {
            long l10 = ((a)this.o.get(i8)).c();
            l8 = l9;
            if (l10 != Long.MIN_VALUE) {
                l8 = Math.min((long)l9, (long)l10);
            }
            l9 = l8;
        }
        l8 = l9;
        if (l9 == Long.MAX_VALUE) {
            l8 = Long.MIN_VALUE;
        }
        return l8;
    }

    @Override
    public long f() {
        long l8;
        long l9;
        long l10 = l8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.o.size(); ++i8) {
            long l11;
            block10 : {
                block9 : {
                    a a8 = (a)this.o.get(i8);
                    l11 = a8.f();
                    if (a8.a().contains(1) || a8.a().contains(2)) break block9;
                    l9 = l8;
                    if (!a8.a().contains(4)) break block10;
                }
                l9 = l8;
                if (l11 != Long.MIN_VALUE) {
                    l9 = Math.min((long)l8, (long)l11);
                }
            }
            long l12 = l10;
            if (l11 != Long.MIN_VALUE) {
                l12 = Math.min((long)l10, (long)l11);
            }
            l8 = l9;
            l10 = l12;
        }
        if (l8 != Long.MAX_VALUE) {
            this.p = l8;
            return l8;
        }
        if (l10 != Long.MAX_VALUE) {
            l9 = this.p;
            if (l9 != -9223372036854775807L) {
                l10 = l9;
            }
            return l10;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean g(y0 y02) {
        boolean bl;
        int n8;
        int n9 = 0;
        do {
            int n10;
            long l8;
            if ((l8 = this.c()) == Long.MIN_VALUE) {
                return (boolean)n9;
            }
            n8 = n10 = 0;
            while (n10 < this.o.size()) {
                int n11;
                block7 : {
                    block6 : {
                        long l9 = ((a)this.o.get(n10)).c();
                        boolean bl2 = l9 != Long.MIN_VALUE && l9 <= y02.a;
                        if (l9 == l8) break block6;
                        n11 = n8;
                        if (!bl2) break block7;
                    }
                    n11 = n8 | ((a)this.o.get(n10)).g(y02);
                }
                ++n10;
                n8 = n11;
            }
            bl = n9 | n8;
            n9 = bl;
        } while (n8 != 0);
        return bl;
    }

    @Override
    public void h(long l8) {
        for (int i8 = 0; i8 < this.o.size(); ++i8) {
            ((a)this.o.get(i8)).h(l8);
        }
    }

    public static final class a
    implements S {
        public final S o;
        public final v p;

        public a(S s8, List list) {
            this.o = s8;
            this.p = v.U((Collection)list);
        }

        public v a() {
            return this.p;
        }

        @Override
        public boolean b() {
            return this.o.b();
        }

        @Override
        public long c() {
            return this.o.c();
        }

        @Override
        public long f() {
            return this.o.f();
        }

        @Override
        public boolean g(y0 y02) {
            return this.o.g(y02);
        }

        @Override
        public void h(long l8) {
            this.o.h(l8);
        }
    }

}

