// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import F0.L;
import F0.s;
import U0.b;
import g0.z;
import d0.A;
import java.util.ArrayList;
import java.util.List;
import W2.q;

public final class p
{
    public static final q d;
    public static final q e;
    public final List a;
    public int b;
    public int c;
    
    static {
        d = q.d(':');
        e = q.d('*');
    }
    
    public p() {
        this.a = new ArrayList();
        this.b = 0;
    }
    
    public static int b(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1760745220: {
                if (!s.equals("Super_SlowMotion_BGM")) {
                    break;
                }
                n = 4;
                break;
            }
            case -830665521: {
                if (!s.equals("Super_SlowMotion_Deflickering_On")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1251387154: {
                if (!s.equals("Super_SlowMotion_Data")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1332107749: {
                if (!s.equals("Super_SlowMotion_Edit_Data")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1711564334: {
                if (!s.equals("SlowMotion_Data")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                throw A.a("Invalid SEF name", null);
            }
            case 4: {
                return 2817;
            }
            case 3: {
                return 2820;
            }
            case 2: {
                return 2816;
            }
            case 1: {
                return 2819;
            }
            case 0: {
                return 2192;
            }
        }
    }
    
    public static b f(final z z, int i) {
        final ArrayList<b.b> list = new ArrayList<b.b>();
        final List f = p.e.f(z.D(i));
        i = 0;
        while (i < f.size()) {
            final List f2 = p.d.f(f.get(i));
            if (f2.size() == 3) {
                try {
                    list.add(new b.b(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << Integer.parseInt(f2.get(2)) - 1));
                    ++i;
                    continue;
                }
                catch (NumberFormatException ex) {
                    throw A.a(null, ex);
                }
            }
            throw A.a(null, null);
        }
        return new b(list);
    }
    
    public final void a(final s s, final L l) {
        final z z = new z(8);
        s.readFully(z.e(), 0, 8);
        this.c = z.t() + 8;
        if (z.p() != 1397048916) {
            l.a = 0L;
            return;
        }
        l.a = s.p() - (this.c - 12);
        this.b = 2;
    }
    
    public int c(final s s, final L l, final List list) {
        final int b = this.b;
        final long n = 0L;
        if (b == 0) {
            final long a = s.a();
            long a2 = n;
            if (a != -1L) {
                if (a < 8L) {
                    a2 = n;
                }
                else {
                    a2 = a - 8L;
                }
            }
            l.a = a2;
            return this.b = 1;
        }
        if (b == 1) {
            this.a(s, l);
            return 1;
        }
        if (b == 2) {
            this.d(s, l);
            return 1;
        }
        if (b == 3) {
            this.e(s, list);
            l.a = 0L;
            return 1;
        }
        throw new IllegalStateException();
    }
    
    public final void d(final s s, final L l) {
        final long a = s.a();
        final int n = this.c - 20;
        final z z = new z(n);
        s.readFully(z.e(), 0, n);
        for (int i = 0; i < n / 12; ++i) {
            z.U(2);
            final short v = z.v();
            if (v != 2192 && v != 2816 && v != 2817 && v != 2819 && v != 2820) {
                z.U(8);
            }
            else {
                this.a.add(new a(v, a - this.c - z.t(), z.t()));
            }
        }
        long b;
        if (this.a.isEmpty()) {
            b = 0L;
        }
        else {
            this.b = 3;
            b = this.a.get(0).b;
        }
        l.a = b;
    }
    
    public final void e(final s s, final List list) {
        final long p2 = s.p();
        final int n = (int)(s.a() - s.p() - this.c);
        final z z = new z(n);
        final byte[] e = z.e();
        int i = 0;
        s.readFully(e, 0, n);
        while (i < this.a.size()) {
            final a a = this.a.get(i);
            z.T((int)(a.b - p2));
            z.U(4);
            final int t = z.t();
            final int b = b(z.D(t));
            final int c = a.c;
            if (b != 2192) {
                if (b != 2816 && b != 2817 && b != 2819) {
                    if (b != 2820) {
                        throw new IllegalStateException();
                    }
                }
            }
            else {
                list.add(f(z, c - (t + 8)));
            }
            ++i;
        }
    }
    
    public void g() {
        this.a.clear();
        this.b = 0;
    }
    
    public static final class a
    {
        public final int a;
        public final long b;
        public final int c;
        
        public a(final int a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
