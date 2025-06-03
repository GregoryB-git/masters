/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Random
 */
package l0;

import W2.s;
import android.util.Base64;
import d0.I;
import g0.M;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import l0.c;
import l0.t0;
import l0.x1;
import x0.x;

public final class u0
implements x1 {
    public static final s i = new t0();
    public static final Random j = new Random();
    public final I.c a;
    public final I.b b;
    public final HashMap c;
    public final s d;
    public x1.a e;
    public I f;
    public String g;
    public long h;

    public u0() {
        this(i);
    }

    public u0(s s8) {
        this.d = s8;
        this.a = new I.c();
        this.b = new I.b();
        this.c = new HashMap();
        this.f = I.a;
        this.h = -1L;
    }

    public static /* synthetic */ String h() {
        return u0.m();
    }

    public static /* synthetic */ I.b k(u0 u02) {
        return u02.b;
    }

    public static String m() {
        byte[] arrby = new byte[12];
        j.nextBytes(arrby);
        return Base64.encodeToString((byte[])arrby, (int)10);
    }

    @Override
    public void a(x1.a a8) {
        this.e = a8;
    }

    @Override
    public String b(I object, x.b b8) {
        synchronized (this) {
            object = this.o(object.h((Object)b8.a, (I.b)this.b).c, b8).a;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(c.a a8) {
        synchronized (this) {
            try {
                g0.a.e(this.e);
                I i8 = this.f;
                this.f = a8.b;
                Iterator iterator = this.c.values().iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.p(a8);
                        return;
                    }
                    a a9 = (a)iterator.next();
                    if (a9.m(i8, this.f) && !a9.j(a8)) continue;
                    iterator.remove();
                    if (!a9.e) continue;
                    if (a9.a.equals((Object)this.g)) {
                        this.l(a9);
                    }
                    this.e.f(a8, a9.a, false);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public String d() {
        synchronized (this) {
            String string2 = this.g;
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e(c.a a8, int n8) {
        synchronized (this) {
            try {
                g0.a.e(this.e);
                n8 = n8 == 0 ? 1 : 0;
                Iterator iterator = this.c.values().iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.p(a8);
                        return;
                    }
                    a a9 = (a)iterator.next();
                    if (!a9.j(a8)) continue;
                    iterator.remove();
                    if (!a9.e) continue;
                    boolean bl = a9.a.equals((Object)this.g);
                    boolean bl2 = n8 != 0 && bl && a9.f;
                    if (bl) {
                        this.l(a9);
                    }
                    this.e.f(a8, a9.a, bl2);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(c.a a8) {
        synchronized (this) {
            Object object;
            Object object2;
            long l8;
            Throwable throwable2;
            block12 : {
                int n8;
                int n9;
                block13 : {
                    block11 : {
                        try {
                            g0.a.e(this.e);
                            boolean bl = a8.b.q();
                            if (!bl) break block11;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    object2 = a8.d;
                    if (object2 == null) break block12;
                    l8 = object2.d;
                    long l9 = this.n();
                    if (l8 >= l9) break block13;
                    return;
                }
                object2 = (a)this.c.get((Object)this.g);
                if (object2 == null || ((a)object2).c != -1L || (n9 = ((a)object2).b) == (n8 = a8.c)) break block12;
                return;
            }
            object2 = this.o(a8.c, a8.d);
            if (this.g == null) {
                this.g = ((a)object2).a;
            }
            if ((object = a8.d) != null && object.b()) {
                object = a8.d;
                Object object3 = new x.b(object.a, object.d, object.b);
                object = this.o(a8.c, (x.b)object3);
                if (!((a)object).e) {
                    ((a)object).e = true;
                    a8.b.h(a8.d.a, this.b);
                    l8 = Math.max((long)0L, (long)(M.i1(this.b.f(a8.d.b)) + this.b.m()));
                    object3 = new c.a(a8.a, a8.b, a8.c, (x.b)object3, l8, a8.f, a8.g, a8.h, a8.i, a8.j);
                    this.e.p0((c.a)object3, ((a)object).a);
                }
            }
            if (!((a)object2).e) {
                object = object2;
                ((a)object).e = true;
                this.e.p0(a8, ((a)object).a);
            }
            if (((a)object2).a.equals((Object)this.g) && !((a)object2).f) {
                ((a)object2).f = true;
                this.e.b0(a8, ((a)object2).a);
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void g(c.a a8) {
        synchronized (this) {
            try {
                String string2 = this.g;
                if (string2 != null) {
                    this.l((a)g0.a.e((a)this.c.get((Object)string2)));
                }
                string2 = this.c.values().iterator();
                do {
                    x1.a a9;
                    if (!string2.hasNext()) {
                        return;
                    }
                    a a10 = (a)string2.next();
                    string2.remove();
                    if (!a10.e || (a9 = this.e) == null) continue;
                    a9.f(a8, a10.a, false);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void l(a a8) {
        if (a8.c != -1L) {
            this.h = a8.c;
        }
        this.g = null;
    }

    public final long n() {
        a a8 = (a)this.c.get((Object)this.g);
        if (a8 != null && a8.c != -1L) {
            return a8.c;
        }
        return this.h + 1L;
    }

    public final a o(int n8, x.b b8) {
        a a8;
        Iterator iterator = this.c.values().iterator();
        Object object = null;
        long l8 = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            long l9;
            a8 = (a)iterator.next();
            a8.k(n8, b8);
            if (!a8.i(n8, b8)) continue;
            long l10 = a8.c;
            if (l10 != -1L && (l9 = (l10 LCMP l8)) >= 0) {
                if (l9 != false || ((a)M.i(object)).d == null || a8.d == null) continue;
                object = a8;
                continue;
            }
            object = a8;
            l8 = l10;
        }
        a8 = object;
        if (object == null) {
            object = (String)this.d.get();
            a8 = new a((String)object, n8, b8);
            this.c.put(object, (Object)a8);
        }
        return a8;
    }

    public final void p(c.a object) {
        if (object.b.q()) {
            object = this.g;
            if (object != null) {
                this.l((a)g0.a.e((a)this.c.get(object)));
            }
            return;
        }
        Object object2 = (a)this.c.get((Object)this.g);
        a a8 = this.o(object.c, object.d);
        this.g = a8.a;
        this.f((c.a)object);
        x.b b8 = object.d;
        if (b8 != null && b8.b() && (object2 == null || ((a)object2).c != object.d.d || ((a)object2).d == null || a.h((a)object2).b != object.d.b || a.h((a)object2).c != object.d.c)) {
            object2 = object.d;
            object2 = new x.b(object2.a, object2.d);
            object2 = this.o(object.c, (x.b)object2);
            this.e.U((c.a)object, ((a)object2).a, a8.a);
        }
    }

    public final class a {
        public final String a;
        public int b;
        public long c;
        public x.b d;
        public boolean e;
        public boolean f;

        public a(String string2, int n8, x.b b8) {
            this.a = string2;
            this.b = n8;
            long l8 = b8 == null ? -1L : b8.d;
            this.c = l8;
            if (b8 != null && b8.b()) {
                this.d = b8;
            }
        }

        public boolean i(int n8, x.b b8) {
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            if (b8 == null) {
                if (n8 == this.b) {
                    bl3 = true;
                }
                return bl3;
            }
            x.b b9 = this.d;
            if (b9 == null) {
                bl3 = bl;
                if (!b8.b()) {
                    bl3 = bl;
                    if (b8.d == this.c) {
                        bl3 = true;
                    }
                }
                return bl3;
            }
            bl3 = bl2;
            if (b8.d == b9.d) {
                bl3 = bl2;
                if (b8.b == b9.b) {
                    bl3 = bl2;
                    if (b8.c == b9.c) {
                        bl3 = true;
                    }
                }
            }
            return bl3;
        }

        public boolean j(c.a object) {
            x.b b8 = object.d;
            boolean bl = true;
            boolean bl2 = true;
            if (b8 == null) {
                if (this.b != object.c) {
                    return true;
                }
                return false;
            }
            long l8 = this.c;
            if (l8 == -1L) {
                return false;
            }
            if (b8.d > l8) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int n8 = object.b.b(b8.a);
            int n9 = object.b.b(this.d.a);
            b8 = object.d;
            if (b8.d >= this.d.d) {
                if (n8 < n9) {
                    return false;
                }
                if (n8 > n9) {
                    return true;
                }
                boolean bl3 = b8.b();
                object = object.d;
                if (bl3) {
                    n8 = object.b;
                    n9 = object.c;
                    object = this.d;
                    int n10 = object.b;
                    if (n8 <= n10) {
                        if (n8 == n10 && n9 > object.c) {
                            return true;
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                n8 = object.e;
                bl2 = bl;
                if (n8 != -1) {
                    if (n8 > this.d.b) {
                        return true;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public void k(int n8, x.b b8) {
            if (this.c == -1L && n8 == this.b && b8 != null && b8.d >= u0.this.n()) {
                this.c = b8.d;
            }
        }

        public final int l(I i8, I i9, int n8) {
            if (n8 >= i8.p()) {
                if (n8 < i9.p()) {
                    return n8;
                }
                return -1;
            }
            i8.n(n8, u0.this.a);
            for (n8 = u0.j((u0)u0.this).n; n8 <= u0.j((u0)u0.this).o; ++n8) {
                int n9 = i9.b(i8.m(n8));
                if (n9 == -1) continue;
                return i9.f((int)n9, (I.b)u0.k((u0)u0.this)).c;
            }
            return -1;
        }

        public boolean m(I object, I i8) {
            int n8;
            this.b = n8 = this.l((I)object, i8, this.b);
            boolean bl = false;
            if (n8 == -1) {
                return false;
            }
            object = this.d;
            if (object == null) {
                return true;
            }
            if (i8.b(object.a) != -1) {
                bl = true;
            }
            return bl;
        }
    }

}

