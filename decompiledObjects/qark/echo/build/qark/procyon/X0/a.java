// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X0;

import d0.A;
import F0.s;
import java.util.ArrayDeque;

public final class a implements c
{
    public final byte[] a;
    public final ArrayDeque b;
    public final g c;
    public X0.b d;
    public int e;
    public int f;
    public long g;
    
    public a() {
        this.a = new byte[8];
        this.b = new ArrayDeque();
        this.c = new g();
    }
    
    public static String g(final s s, int length) {
        if (length == 0) {
            return "";
        }
        final byte[] bytes = new byte[length];
        s.readFully(bytes, 0, length);
        while (length > 0 && bytes[length - 1] == 0) {
            --length;
        }
        return new String(bytes, 0, length);
    }
    
    public final long a(final s s) {
        s.h();
        int c;
        int n;
        while (true) {
            s.n(this.a, 0, 4);
            c = X0.g.c(this.a[0]);
            if (c != -1 && c <= 4) {
                n = (int)X0.g.a(this.a, c, false);
                if (this.d.d(n)) {
                    break;
                }
            }
            s.i(1);
        }
        s.i(c);
        return n;
    }
    
    @Override
    public void b() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
    
    @Override
    public boolean c(final s s) {
        g0.a.h(this.d);
        while (true) {
            final b b = this.b.peek();
            if (b != null && s.p() >= X0.a.b.a(b)) {
                this.d.a(X0.a.b.b(this.b.pop()));
                return true;
            }
            if (this.e == 0) {
                long n;
                if ((n = this.c.d(s, true, false, 4)) == -2L) {
                    n = this.a(s);
                }
                if (n == -1L) {
                    return false;
                }
                this.f = (int)n;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(s, false, true, 8);
                this.e = 2;
            }
            final int b2 = this.d.b(this.f);
            if (b2 != 0) {
                if (b2 == 1) {
                    final long p = s.p();
                    this.b.push(new b(this.f, this.g + p, null));
                    this.d.g(this.f, p, this.g);
                    this.e = 0;
                    return true;
                }
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 == 4) {
                            this.d.e(this.f, (int)this.g, s);
                            this.e = 0;
                            return true;
                        }
                        if (b2 != 5) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Invalid element type ");
                            sb.append(b2);
                            throw A.a(sb.toString(), null);
                        }
                        final long g = this.g;
                        if (g != 4L && g != 8L) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid float size: ");
                            sb2.append(this.g);
                            throw A.a(sb2.toString(), null);
                        }
                        this.d.c(this.f, this.e(s, (int)g));
                        this.e = 0;
                        return true;
                    }
                    else {
                        final long g2 = this.g;
                        if (g2 <= 2147483647L) {
                            this.d.f(this.f, g(s, (int)g2));
                            this.e = 0;
                            return true;
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("String element size: ");
                        sb3.append(this.g);
                        throw A.a(sb3.toString(), null);
                    }
                }
                else {
                    final long g3 = this.g;
                    if (g3 <= 8L) {
                        this.d.h(this.f, this.f(s, (int)g3));
                        this.e = 0;
                        return true;
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid integer size: ");
                    sb4.append(this.g);
                    throw A.a(sb4.toString(), null);
                }
            }
            else {
                s.i((int)this.g);
                this.e = 0;
            }
        }
    }
    
    @Override
    public void d(final X0.b d) {
        this.d = d;
    }
    
    public final double e(final s s, final int n) {
        final long f = this.f(s, n);
        if (n == 4) {
            return Float.intBitsToFloat((int)f);
        }
        return Double.longBitsToDouble(f);
    }
    
    public final long f(final s s, final int n) {
        final byte[] a = this.a;
        int i = 0;
        s.readFully(a, 0, n);
        long n2 = 0L;
        while (i < n) {
            n2 = (n2 << 8 | (long)(this.a[i] & 0xFF));
            ++i;
        }
        return n2;
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static /* synthetic */ long a(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ int b(final b b) {
            return b.a;
        }
    }
}
