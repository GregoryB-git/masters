// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l0;

import g0.M;
import java.util.Iterator;
import g0.a;
import x0.x;
import android.util.Base64;
import java.util.HashMap;
import d0.I;
import java.util.Random;
import W2.s;

public final class u0 implements x1
{
    public static final s i;
    public static final Random j;
    public final I.c a;
    public final I.b b;
    public final HashMap c;
    public final s d;
    public x1.a e;
    public I f;
    public String g;
    public long h;
    
    static {
        i = new t0();
        j = new Random();
    }
    
    public u0() {
        this(u0.i);
    }
    
    public u0(final s d) {
        this.d = d;
        this.a = new I.c();
        this.b = new I.b();
        this.c = new HashMap();
        this.f = I.a;
        this.h = -1L;
    }
    
    public static /* synthetic */ I.c j(final u0 u0) {
        return u0.a;
    }
    
    public static /* synthetic */ I.b k(final u0 u0) {
        return u0.b;
    }
    
    public static String m() {
        final byte[] bytes = new byte[12];
        u0.j.nextBytes(bytes);
        return Base64.encodeToString(bytes, 10);
    }
    
    @Override
    public void a(final x1.a e) {
        this.e = e;
    }
    
    @Override
    public String b(final I i, final x.b b) {
        synchronized (this) {
            return u0.a.a(this.o(i.h(b.a, this.b).c, b));
        }
    }
    
    @Override
    public void c(final c.a a) {
        // monitorenter(this)
        while (true) {
            try {
                a.e(this.e);
                final I f = this.f;
                this.f = a.b;
                final Iterator<a> iterator = this.c.values().iterator();
                while (iterator.hasNext()) {
                    final a a2 = iterator.next();
                    if (!a2.m(f, this.f) || a2.j(a)) {
                        iterator.remove();
                        if (!u0.a.d(a2)) {
                            continue;
                        }
                        if (u0.a.a(a2).equals(this.g)) {
                            this.l(a2);
                        }
                        this.e.f(a, u0.a.a(a2), false);
                    }
                }
                this.p(a);
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public String d() {
        synchronized (this) {
            return this.g;
        }
    }
    
    @Override
    public void e(c.a a, int n) {
    Label_0115_Outer:
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0166: {
                    while (true) {
                        try {
                            a.e(this.e);
                            if (n == 0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            final Iterator<a> iterator = this.c.values().iterator();
                            while (iterator.hasNext()) {
                                final a a2 = iterator.next();
                                if (a2.j(a)) {
                                    iterator.remove();
                                    if (!u0.a.d(a2)) {
                                        continue Label_0115_Outer;
                                    }
                                    final boolean equals = u0.a.a(a2).equals(this.g);
                                    if (n == 0 || !equals || !u0.a.f(a2)) {
                                        break Label_0166;
                                    }
                                    final boolean b = true;
                                    if (equals) {
                                        this.l(a2);
                                    }
                                    this.e.f(a, u0.a.a(a2), b);
                                }
                            }
                            this.p(a);
                            // monitorexit(this)
                            return;
                        }
                        // monitorexit(this)
                        finally {}
                        final c.a a3;
                        a = a3;
                        continue;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    @Override
    public void f(final c.a a) {
        // monitorenter(this)
        // monitorexit(this)
        final c.a a3;
        Label_0423: {
            try {
                a.e(this.e);
                if (a.b.q()) {
                    // monitorexit(this)
                    return;
                }
                final x.b d = a.d;
                if (d != null) {
                    if (d.d < this.n()) {
                        // monitorexit(this)
                        return;
                    }
                    final a a2 = this.c.get(this.g);
                    if (a2 != null && u0.a.b(a2) == -1L && u0.a.c(a2) != a.c) {
                        // monitorexit(this)
                        return;
                    }
                }
            }
            finally {
                break Label_0423;
            }
            final a o = this.o(a3.c, a3.d);
            if (this.g == null) {
                this.g = u0.a.a(o);
            }
            final x.b d2 = a3.d;
            if (d2 != null && d2.b()) {
                final x.b d3 = a3.d;
                final x.b b = new x.b(d3.a, d3.d, d3.b);
                final a o2 = this.o(a3.c, b);
                if (!u0.a.d(o2)) {
                    u0.a.e(o2, true);
                    a3.b.h(a3.d.a, this.b);
                    this.e.p0(new c.a(a3.a, a3.b, a3.c, b, Math.max(0L, M.i1(this.b.f(a3.d.b)) + this.b.m()), a3.f, a3.g, a3.h, a3.i, a3.j), u0.a.a(o2));
                }
            }
            while (true) {
                if (!u0.a.d(o)) {
                    final a a4 = o;
                    u0.a.e(a4, true);
                    this.e.p0(a3, u0.a.a(a4));
                }
                if (u0.a.a(o).equals(this.g) && !u0.a.f(o)) {
                    u0.a.g(o, true);
                    this.e.b0(a3, u0.a.a(o));
                }
                return;
                continue;
            }
        }
        // monitorexit(this)
        throw a3;
    }
    
    @Override
    public void g(final c.a a) {
        // monitorenter(this)
        while (true) {
            try {
                final String g = this.g;
                if (g != null) {
                    this.l((a)a.e(this.c.get(g)));
                }
                final Iterator<a> iterator = this.c.values().iterator();
                while (iterator.hasNext()) {
                    final a a2 = iterator.next();
                    iterator.remove();
                    if (u0.a.d(a2)) {
                        final x1.a e = this.e;
                        if (e == null) {
                            continue;
                        }
                        e.f(a, u0.a.a(a2), false);
                    }
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void l(final a a) {
        if (u0.a.b(a) != -1L) {
            this.h = u0.a.b(a);
        }
        this.g = null;
    }
    
    public final long n() {
        final a a = this.c.get(this.g);
        if (a != null && u0.a.b(a) != -1L) {
            return u0.a.b(a);
        }
        return this.h + 1L;
    }
    
    public final a o(final int n, final x.b b) {
        final Iterator<a> iterator = this.c.values().iterator();
        a a = null;
        long n2 = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            final a a2 = iterator.next();
            a2.k(n, b);
            if (a2.i(n, b)) {
                final long b2 = u0.a.b(a2);
                if (b2 != -1L) {
                    final long n3 = lcmp(b2, n2);
                    if (n3 >= 0) {
                        if (n3 == 0 && u0.a.h((a)M.i(a)) != null && u0.a.h(a2) != null) {
                            a = a2;
                            continue;
                        }
                        continue;
                    }
                }
                a = a2;
                n2 = b2;
            }
        }
        a value;
        if ((value = a) == null) {
            final String key = (String)this.d.get();
            value = new a(key, n, b);
            this.c.put(key, value);
        }
        return value;
    }
    
    public final void p(final c.a a) {
        if (a.b.q()) {
            final String g = this.g;
            if (g != null) {
                this.l((a)a.e(this.c.get(g)));
            }
            return;
        }
        final a a2 = this.c.get(this.g);
        final a o = this.o(a.c, a.d);
        this.g = u0.a.a(o);
        this.f(a);
        final x.b d = a.d;
        if (d != null && d.b() && (a2 == null || u0.a.b(a2) != a.d.d || u0.a.h(a2) == null || u0.a.h(a2).b != a.d.b || u0.a.h(a2).c != a.d.c)) {
            final x.b d2 = a.d;
            this.e.U(a, u0.a.a(this.o(a.c, new x.b(d2.a, d2.d))), u0.a.a(o));
        }
    }
    
    public final class a
    {
        public final String a;
        public int b;
        public long c;
        public x.b d;
        public boolean e;
        public boolean f;
        
        public a(final String a, final int b, final x.b d) {
            this.a = a;
            this.b = b;
            long d2;
            if (d == null) {
                d2 = -1L;
            }
            else {
                d2 = d.d;
            }
            this.c = d2;
            if (d != null && d.b()) {
                this.d = d;
            }
        }
        
        public static /* synthetic */ String a(final a a) {
            return a.a;
        }
        
        public static /* synthetic */ long b(final a a) {
            return a.c;
        }
        
        public static /* synthetic */ int c(final a a) {
            return a.b;
        }
        
        public static /* synthetic */ boolean d(final a a) {
            return a.e;
        }
        
        public static /* synthetic */ boolean e(final a a, final boolean e) {
            return a.e = e;
        }
        
        public static /* synthetic */ boolean f(final a a) {
            return a.f;
        }
        
        public static /* synthetic */ boolean g(final a a, final boolean f) {
            return a.f = f;
        }
        
        public static /* synthetic */ x.b h(final a a) {
            return a.d;
        }
        
        public boolean i(final int n, final x.b b) {
            final boolean b2 = false;
            final boolean b3 = false;
            boolean b4 = false;
            if (b == null) {
                if (n == this.b) {
                    b4 = true;
                }
                return b4;
            }
            final x.b d = this.d;
            if (d == null) {
                boolean b5 = b2;
                if (!b.b()) {
                    b5 = b2;
                    if (b.d == this.c) {
                        b5 = true;
                    }
                }
                return b5;
            }
            boolean b6 = b3;
            if (b.d == d.d) {
                b6 = b3;
                if (b.b == d.b) {
                    b6 = b3;
                    if (b.c == d.c) {
                        b6 = true;
                    }
                }
            }
            return b6;
        }
        
        public boolean j(final c.a a) {
            final x.b d = a.d;
            final boolean b = true;
            boolean b2 = true;
            if (d == null) {
                return this.b != a.c;
            }
            final long c = this.c;
            if (c == -1L) {
                return false;
            }
            if (d.d > c) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            final int b3 = a.b.b(d.a);
            final int b4 = a.b.b(this.d.a);
            final x.b d2 = a.d;
            if (d2.d < this.d.d) {
                return false;
            }
            if (b3 < b4) {
                return false;
            }
            if (b3 > b4) {
                return true;
            }
            final boolean b5 = d2.b();
            final x.b d3 = a.d;
            if (b5) {
                final int b6 = d3.b;
                final int c2 = d3.c;
                final x.b d4 = this.d;
                final int b7 = d4.b;
                if (b6 <= b7) {
                    if (b6 == b7 && c2 > d4.c) {
                        return true;
                    }
                    b2 = false;
                }
                return b2;
            }
            final int e = d3.e;
            boolean b8 = b;
            if (e != -1) {
                if (e > this.d.b) {
                    return true;
                }
                b8 = false;
            }
            return b8;
        }
        
        public void k(final int n, final x.b b) {
            if (this.c == -1L && n == this.b && b != null && b.d >= u0.this.n()) {
                this.c = b.d;
            }
        }
        
        public final int l(final I i, final I j, int k) {
            if (k < i.p()) {
                i.n(k, u0.j(u0.this));
                int b;
                for (k = u0.j(u0.this).n; k <= u0.j(u0.this).o; ++k) {
                    b = j.b(i.m(k));
                    if (b != -1) {
                        return j.f(b, u0.k(u0.this)).c;
                    }
                }
                return -1;
            }
            if (k < j.p()) {
                return k;
            }
            return -1;
        }
        
        public boolean m(final I i, final I j) {
            final int l = this.l(i, j, this.b);
            this.b = l;
            boolean b = false;
            if (l == -1) {
                return false;
            }
            final x.b d = this.d;
            if (d == null) {
                return true;
            }
            if (j.b(d.a) != -1) {
                b = true;
            }
            return b;
        }
    }
}
