// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import u.b;
import kotlin.jvm.internal.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class s
{
    public static final a e;
    public static final AtomicReferenceFieldUpdater f;
    public static final AtomicLongFieldUpdater g;
    public static final F h;
    private volatile Object _next;
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;
    
    static {
        e = new a(null);
        f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");
        g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");
        h = new F("REMOVE_FROZEN");
    }
    
    public s(final int n, final boolean b) {
        this.a = n;
        this.b = b;
        final int c = n - 1;
        this.c = c;
        this.d = new AtomicReferenceArray(n);
        if (c > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((n & c) == 0x0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final int a(final Object newValue) {
        final AtomicLongFieldUpdater g = s.g;
        while (true) {
            final long value = g.get(this);
            if ((0x3000000000000000L & value) != 0x0L) {
                return s.e.a(value);
            }
            final int n = (int)(0x3FFFFFFFL & value);
            final int n2 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            if ((n2 + 2 & c) == (n & c)) {
                return 1;
            }
            if (!this.b && this.d.get(n2 & c) != null) {
                final int a = this.a;
                if (a < 1024 || (n2 - n & 0x3FFFFFFF) > a >> 1) {
                    return 1;
                }
                continue;
            }
            else {
                if (s.g.compareAndSet(this, value, s.e.c(value, n2 + 1 & 0x3FFFFFFF))) {
                    this.d.set(n2 & c, newValue);
                    s e = this;
                    while ((s.g.get(e) & 0x1000000000000000L) != 0x0L && (e = e.i().e(n2, newValue)) != null) {}
                    return 0;
                }
                continue;
            }
        }
    }
    
    public final s b(final long n) {
        final s s = new s(this.a * 2, this.b);
        int n2 = (int)(0x3FFFFFFFL & n);
        final int n3 = (int)((0xFFFFFFFC0000000L & n) >> 30);
        while (true) {
            final int c = this.c;
            if ((n2 & c) == (n3 & c)) {
                break;
            }
            Object value;
            if ((value = this.d.get(c & n2)) == null) {
                value = new b(n2);
            }
            s.d.set(s.c & n2, value);
            ++n2;
        }
        u6.s.g.set(s, u6.s.e.d(n, 1152921504606846976L));
        return s;
    }
    
    public final s c(final long n) {
        final AtomicReferenceFieldUpdater f = s.f;
        s s;
        while (true) {
            s = f.get(this);
            if (s != null) {
                break;
            }
            u.b.a(u6.s.f, this, null, this.b(n));
        }
        return s;
    }
    
    public final boolean d() {
        final AtomicLongFieldUpdater g = s.g;
        long value;
        do {
            value = g.get(this);
            if ((value & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & value) != 0x0L) {
                return false;
            }
        } while (!g.compareAndSet(this, value, value | 0x2000000000000000L));
        return true;
    }
    
    public final s e(final int n, final Object newValue) {
        final b value = this.d.get(this.c & n);
        if (value instanceof b && value.a == n) {
            this.d.set(n & this.c, newValue);
            return this;
        }
        return null;
    }
    
    public final int f() {
        final long value = s.g.get(this);
        return (int)((value & 0xFFFFFFFC0000000L) >> 30) - (int)(0x3FFFFFFFL & value) & 0x3FFFFFFF;
    }
    
    public final boolean g() {
        final long value = s.g.get(this);
        return (int)(0x3FFFFFFFL & value) == (int)((value & 0xFFFFFFFC0000000L) >> 30);
    }
    
    public final long h() {
        final AtomicLongFieldUpdater g = s.g;
        long value;
        long n;
        do {
            value = g.get(this);
            if ((value & 0x1000000000000000L) != 0x0L) {
                return value;
            }
            n = (value | 0x1000000000000000L);
        } while (!g.compareAndSet(this, value, n));
        return n;
    }
    
    public final s i() {
        return this.c(this.h());
    }
    
    public final Object j() {
        final AtomicLongFieldUpdater g = s.g;
        while (true) {
            final long value = g.get(this);
            if ((0x1000000000000000L & value) != 0x0L) {
                return s.h;
            }
            final int n = (int)(0x3FFFFFFFL & value);
            final int n2 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            if ((n2 & c) == (n & c)) {
                return null;
            }
            final Object value2 = this.d.get(c & n);
            if (value2 == null) {
                if (this.b) {
                    return null;
                }
                continue;
            }
            else {
                if (value2 instanceof b) {
                    return null;
                }
                final int n3 = n + 1 & 0x3FFFFFFF;
                if (s.g.compareAndSet(this, value, s.e.b(value, n3))) {
                    this.d.set(this.c & n, null);
                    return value2;
                }
                if (this.b) {
                    s k = this;
                    while ((k = k.k(n, n3)) != null) {}
                    return value2;
                }
                continue;
            }
        }
    }
    
    public final s k(int n, final int n2) {
        final AtomicLongFieldUpdater g = s.g;
        long value;
        do {
            value = g.get(this);
            n = (int)(0x3FFFFFFFL & value);
            if ((0x1000000000000000L & value) != 0x0L) {
                return this.i();
            }
        } while (!s.g.compareAndSet(this, value, s.e.b(value, n2)));
        this.d.set(this.c & n, null);
        return null;
    }
    
    public static final class a
    {
        public final int a(final long n) {
            if ((n & 0x2000000000000000L) != 0x0L) {
                return 2;
            }
            return 1;
        }
        
        public final long b(final long n, final int n2) {
            return this.d(n, 1073741823L) | (long)n2;
        }
        
        public final long c(final long n, final int n2) {
            return this.d(n, 1152921503533105152L) | (long)n2 << 30;
        }
        
        public final long d(final long n, final long n2) {
            return n & n2;
        }
    }
    
    public static final class b
    {
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
    }
}
