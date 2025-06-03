/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package r6;

import V5.t;
import kotlin.jvm.internal.v;
import p6.P0;
import r6.a;
import r6.b;
import r6.c;
import r6.g;
import r6.i;
import u6.C;
import u6.F;
import u6.x;

public class l
extends b {
    public final int n;
    public final a o;

    public l(int n8, a a8, g6.l l8) {
        super(n8, l8);
        this.n = n8;
        this.o = a8;
        if (a8 != a.o) {
            if (n8 >= 1) {
                return;
            }
            a8 = new StringBuilder();
            a8.append("Buffered channel capacity must be at least 1, but ");
            a8.append(n8);
            a8.append(" was specified");
            throw new IllegalArgumentException(a8.toString().toString());
        }
        a8 = new StringBuilder();
        a8.append("This implementation does not support suspension for senders, use ");
        a8.append(v.b(b.class).a());
        a8.append(" instead");
        throw new IllegalArgumentException(a8.toString().toString());
    }

    public final Object A0(Object object, boolean bl) {
        if (this.o == a.q) {
            return this.y0(object, bl);
        }
        return this.z0(object);
    }

    @Override
    public boolean T() {
        if (this.o == a.p) {
            return true;
        }
        return false;
    }

    @Override
    public Object d(Object object) {
        return this.A0(object, false);
    }

    public final Object y0(Object object, boolean bl) {
        Object object2 = super.d(object);
        if (!g.f(object2)) {
            if (g.e(object2)) {
                return object2;
            }
            if (bl && (object2 = this.c) != null && (object = x.d((g6.l)object2, object, null, 2, null)) != null) {
                throw object;
            }
            return g.a.c(t.a);
        }
        return object2;
    }

    public final Object z0(Object object) {
        i i8;
        block6 : {
            block7 : {
                int n8;
                int n9;
                F f8;
                boolean bl;
                block8 : {
                    block9 : {
                        long l8;
                        f8 = c.d;
                        i8 = (i)b.j().get((Object)this);
                        do {
                            int n10;
                            long l9 = b.k().getAndIncrement((Object)this);
                            l8 = l9 & 0xFFFFFFFFFFFFFFFL;
                            bl = b.l(this, l9);
                            n8 = c.b;
                            l9 = l8 / (long)n8;
                            n9 = (int)(l8 % (long)n8);
                            if (i8.q != l9) {
                                i i9 = b.f(this, l9, i8);
                                if (i9 == null) {
                                    if (!bl) continue;
                                    return g.a.a(this.H());
                                }
                                i8 = i9;
                            }
                            if ((n10 = b.q(this, i8, n9, object, l8, f8, bl)) == 0) break block6;
                            if (n10 == 1) break block7;
                            if (n10 == 2) break block8;
                            if (n10 == 3) break block9;
                            if (n10 == 4) break;
                            if (n10 != 5) continue;
                            i8.b();
                        } while (true);
                        if (l8 < this.G()) {
                            i8.b();
                        }
                        return g.a.a(this.H());
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
                if (bl) {
                    i8.p();
                    return g.a.a(this.H());
                }
                object = f8 instanceof P0 ? (P0)((Object)f8) : null;
                if (object != null) {
                    b.o(this, (P0)object, i8, n9);
                }
                this.y(i8.q * (long)n8 + (long)n9);
                return g.a.c(t.a);
            }
            return g.a.c(t.a);
        }
        i8.b();
        return g.a.c(t.a);
    }
}

