/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicLongFieldUpdater
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g;
import u6.F;

public final class s {
    public static final a e = new a(null);
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, (String)"_next");
    public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(s.class, (String)"_state");
    public static final F h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    public s(int n8, boolean bl) {
        int n9;
        this.a = n8;
        this.b = bl;
        this.c = n9 = n8 - 1;
        this.d = new AtomicReferenceArray(n8);
        if (n9 <= 1073741823) {
            if ((n8 & n9) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(Object var1_1) {
        var7_2 = s.g;
        do lbl-1000: // 3 sources:
        {
            if ((0x3000000000000000L & (var5_6 = var7_2.get((Object)this))) != 0L) {
                return s.e.a(var5_6);
            }
            var3_4 = (int)((1152921503533105152L & var5_6) >> 30);
            var4_5 = this.c;
            var2_3 = (int)(0x3FFFFFFFL & var5_6);
            if ((var3_4 + 2 & var4_5) == (var2_3 & var4_5)) {
                return 1;
            }
            if (this.b || this.d.get(var3_4 & var4_5) == null) continue;
            var4_5 = this.a;
            if (var4_5 < 1024) return 1;
            if ((var3_4 - var2_3 & 1073741823) <= var4_5 >> 1) ** GOTO lbl-1000
            return 1;
        } while (!s.g.compareAndSet((Object)this, var5_6, s.e.c(var5_6, var3_4 + 1 & 1073741823)));
        this.d.set(var3_4 & var4_5, var1_1);
        var7_2 = this;
        do {
            if ((s.g.get(var7_2) & 0x1000000000000000L) == 0L) return 0;
            var8_7 = var7_2.i().e(var3_4, var1_1);
            var7_2 = var8_7;
        } while (var8_7 != null);
        return 0;
    }

    public final s b(long l8) {
        int n8;
        s s8 = new s(this.a * 2, this.b);
        int n9 = (int)(0x3FFFFFFFL & l8);
        int n10 = (int)((1152921503533105152L & l8) >> 30);
        while ((n9 & (n8 = this.c)) != (n10 & n8)) {
            Object object;
            Object object2 = object = this.d.get(n8 & n9);
            if (object == null) {
                object2 = new b(n9);
            }
            s8.d.set(s8.c & n9, object2);
            ++n9;
        }
        g.set((Object)s8, e.d(l8, 0x1000000000000000L));
        return s8;
    }

    public final s c(long l8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        s s8;
        while ((s8 = (s)atomicReferenceFieldUpdater.get((Object)this)) == null) {
            u.b.a(f, this, null, this.b(l8));
        }
        return s8;
    }

    public final boolean d() {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            if (((l8 = atomicLongFieldUpdater.get((Object)this)) & 0x2000000000000000L) != 0L) {
                return true;
            }
            if ((0x1000000000000000L & l8) == 0L) continue;
            return false;
        } while (!atomicLongFieldUpdater.compareAndSet((Object)this, l8, l8 | 0x2000000000000000L));
        return true;
    }

    public final s e(int n8, Object object) {
        Object object2 = this.d.get(this.c & n8);
        if (object2 instanceof b && ((b)object2).a == n8) {
            this.d.set(n8 & this.c, object);
            return this;
        }
        return null;
    }

    public final int f() {
        long l8 = g.get((Object)this);
        int n8 = (int)(0x3FFFFFFFL & l8);
        return (int)((l8 & 1152921503533105152L) >> 30) - n8 & 1073741823;
    }

    public final boolean g() {
        long l8 = g.get((Object)this);
        if ((int)(0x3FFFFFFFL & l8) == (int)((l8 & 1152921503533105152L) >> 30)) {
            return true;
        }
        return false;
    }

    public final long h() {
        long l8;
        long l9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            if (((l9 = atomicLongFieldUpdater.get((Object)this)) & 0x1000000000000000L) == 0L) continue;
            return l9;
        } while (!atomicLongFieldUpdater.compareAndSet((Object)this, l9, l8 = l9 | 0x1000000000000000L));
        return l8;
    }

    public final s i() {
        return this.c(this.h());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object j() {
        var6_1 = s.g;
        do lbl-1000: // 3 sources:
        {
            block5 : {
                if ((0x1000000000000000L & (var4_5 = var6_1.get((Object)this))) != 0L) {
                    return s.h;
                }
                var2_3 = (int)((1152921503533105152L & var4_5) >> 30);
                var3_4 = this.c;
                var1_2 = (int)(0x3FFFFFFFL & var4_5);
                if ((var2_3 & var3_4) == (var1_2 & var3_4)) {
                    return null;
                }
                var8_6 = this.d.get(var3_4 & var1_2);
                if (var8_6 != null) break block5;
                if (!this.b) ** GOTO lbl-1000
                return null;
            }
            if (var8_6 instanceof b) {
                return null;
            }
            var2_3 = var1_2 + 1 & 1073741823;
            if (!s.g.compareAndSet((Object)this, var4_5, s.e.b(var4_5, var2_3))) continue;
            this.d.set(this.c & var1_2, (Object)null);
            return var8_6;
        } while (!this.b);
        var6_1 = this;
        do {
            var7_7 = var6_1.k(var1_2, var2_3);
            var6_1 = var7_7;
        } while (var7_7 != null);
        return var8_6;
    }

    public final s k(int n8, int n9) {
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            l8 = atomicLongFieldUpdater.get((Object)this);
            n8 = (int)(0x3FFFFFFFL & l8);
            if ((0x1000000000000000L & l8) == 0L) continue;
            return this.i();
        } while (!g.compareAndSet((Object)this, l8, e.b(l8, n9)));
        this.d.set(this.c & n8, (Object)null);
        return null;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final int a(long l8) {
            if ((l8 & 0x2000000000000000L) != 0L) {
                return 2;
            }
            return 1;
        }

        public final long b(long l8, int n8) {
            return this.d(l8, 0x3FFFFFFFL) | (long)n8;
        }

        public final long c(long l8, int n8) {
            return this.d(l8, 1152921503533105152L) | (long)n8 << 30;
        }

        public final long d(long l8, long l9) {
            return l8 & l9;
        }
    }

    public static final class b {
        public final int a;

        public b(int n8) {
            this.a = n8;
        }
    }

}

