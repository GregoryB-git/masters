/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Random
 *  java.util.concurrent.TimeUnit
 */
package L4;

import M4.c;
import M4.i;
import M4.o;
import N4.h;
import N4.k;
import N4.l;
import N4.m;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class d {
    public final C4.a a;
    public final double b;
    public final double c;
    public a d = null;
    public a e = null;
    public boolean f;

    public d(i i8, long l8, M4.a a8, double d8, double d9, C4.a a9) {
        boolean bl = false;
        this.f = false;
        boolean bl2 = 0.0 <= d8 && d8 < 1.0;
        o.a(bl2, "Sampling bucket ID should be in range [0.0, 1.0).");
        bl2 = bl;
        if (0.0 <= d9) {
            bl2 = bl;
            if (d9 < 1.0) {
                bl2 = true;
            }
        }
        o.a(bl2, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.b = d8;
        this.c = d9;
        this.a = a9;
        this.d = new a(i8, l8, a8, a9, "Trace", this.f);
        this.e = new a(i8, l8, a8, a9, "Network", this.f);
    }

    public d(Context context, i i8, long l8) {
        this(i8, l8, new M4.a(), d.b(), d.b(), C4.a.g());
        this.f = o.b(context);
    }

    public static double b() {
        return new Random().nextDouble();
    }

    public void a(boolean bl) {
        this.d.a(bl);
        this.e.a(bl);
    }

    public final boolean c(List list) {
        boolean bl;
        int n8 = list.size();
        boolean bl2 = bl = false;
        if (n8 > 0) {
            bl2 = bl;
            if (((k)list.get(0)).Z() > 0) {
                bl2 = bl;
                if (((k)list.get(0)).Y(0) == l.q) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final boolean d() {
        double d8 = this.a.f();
        if (this.c < d8) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        double d8 = this.a.s();
        if (this.b < d8) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        double d8 = this.a.G();
        if (this.b < d8) {
            return true;
        }
        return false;
    }

    public boolean g(N4.i i8) {
        if (!this.j(i8)) {
            return false;
        }
        if (i8.o()) {
            return this.e.b(i8) ^ true;
        }
        if (i8.l()) {
            return this.d.b(i8) ^ true;
        }
        return true;
    }

    public boolean h(N4.i i8) {
        if (i8.l() && !this.f() && !this.c(i8.n().s0())) {
            return false;
        }
        if (this.i(i8) && !this.d() && !this.c(i8.n().s0())) {
            return false;
        }
        if (i8.o() && !this.e() && !this.c(i8.p().q0())) {
            return false;
        }
        return true;
    }

    public boolean i(N4.i i8) {
        if (i8.l() && i8.n().r0().startsWith("_st_") && i8.n().h0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    public boolean j(N4.i i8) {
        if (i8.l() && (i8.n().r0().equals((Object)c.t.toString()) || i8.n().r0().equals((Object)c.u.toString())) && i8.n().k0() > 0) {
            return false;
        }
        if (i8.f()) {
            return false;
        }
        return true;
    }

    public static class a {
        public static final F4.a k = F4.a.e();
        public static final long l = TimeUnit.SECONDS.toMicros(1L);
        public final M4.a a;
        public final boolean b;
        public M4.l c;
        public i d;
        public long e;
        public double f;
        public i g;
        public i h;
        public long i;
        public long j;

        public a(i i8, long l8, M4.a a8, C4.a a9, String string2, boolean bl) {
            this.a = a8;
            this.e = l8;
            this.d = i8;
            this.f = l8;
            this.c = a8.a();
            this.g(a9, string2, bl);
            this.b = bl;
        }

        public static long c(C4.a a8, String string2) {
            if (string2 == "Trace") {
                return a8.E();
            }
            return a8.q();
        }

        public static long d(C4.a a8, String string2) {
            if (string2 == "Trace") {
                return a8.t();
            }
            return a8.t();
        }

        public static long e(C4.a a8, String string2) {
            if (string2 == "Trace") {
                return a8.F();
            }
            return a8.r();
        }

        public static long f(C4.a a8, String string2) {
            if (string2 == "Trace") {
                return a8.t();
            }
            return a8.t();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void a(boolean var1_1) {
            block3 : {
                // MONITORENTER : this
                if (!var1_1) ** GOTO lbl6
                var4_2 = this.g;
                break block3;
lbl6: // 1 sources:
                var4_2 = this.h;
            }
            this.d = var4_2;
            var2_4 = var1_1 != false ? this.i : this.j;
            this.e = var2_4;
            // MONITOREXIT : this
            return;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean b(N4.i object) {
            synchronized (this) {
                try {
                    object = this.a.a();
                    double d8 = (double)this.c.d((M4.l)object) * this.d.a() / (double)l;
                    if (d8 > 0.0) {
                        this.f = Math.min((double)(this.f + d8), (double)this.e);
                        this.c = object;
                    }
                    if ((d8 = this.f) >= 1.0) {
                        this.f = d8 - 1.0;
                        return true;
                    }
                    if (this.b) {
                        k.j("Exceeded log rate limit, dropping the log.");
                    }
                    return false;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public final void g(C4.a object, String string2, boolean bl) {
            i i8;
            long l8 = a.f((C4.a)object, string2);
            long l9 = a.e((C4.a)object, string2);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.g = i8 = new i(l9, l8, timeUnit);
            this.i = l9;
            if (bl) {
                k.b("Foreground %s logging rate:%f, burst capacity:%d", string2, i8, l9);
            }
            l8 = a.d((C4.a)object, string2);
            l9 = a.c((C4.a)object, string2);
            this.h = object = new i(l9, l8, timeUnit);
            this.j = l9;
            if (bl) {
                k.b("Background %s logging rate:%f, capacity:%d", string2, object, l9);
            }
        }
    }

}

