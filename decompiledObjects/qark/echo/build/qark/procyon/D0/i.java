// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import java.util.Arrays;

public final class i
{
    public a a;
    public a b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    
    public i() {
        this.a = new a();
        this.b = new a();
        this.e = -9223372036854775807L;
    }
    
    public long a() {
        if (this.e()) {
            return this.a.a();
        }
        return -9223372036854775807L;
    }
    
    public float b() {
        if (this.e()) {
            return (float)(1.0E9 / this.a.a());
        }
        return -1.0f;
    }
    
    public int c() {
        return this.f;
    }
    
    public long d() {
        if (this.e()) {
            return this.a.b();
        }
        return -9223372036854775807L;
    }
    
    public boolean e() {
        return this.a.e();
    }
    
    public void f(final long e) {
        this.a.f(e);
        final boolean e2 = this.a.e();
        int f = 0;
        if (e2 && !this.d) {
            this.c = false;
        }
        else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(e);
        }
        if (this.c && this.b.e()) {
            final a a = this.a;
            this.a = this.b;
            this.b = a;
            this.c = false;
            this.d = false;
        }
        this.e = e;
        if (!this.a.e()) {
            f = this.f + 1;
        }
        this.f = f;
    }
    
    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }
    
    public static final class a
    {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g;
        public int h;
        
        public a() {
            this.g = new boolean[15];
        }
        
        public static int c(final long n) {
            return (int)(n % 15L);
        }
        
        public long a() {
            final long e = this.e;
            if (e == 0L) {
                return 0L;
            }
            return this.f / e;
        }
        
        public long b() {
            return this.f;
        }
        
        public boolean d() {
            final long d = this.d;
            return d != 0L && this.g[c(d - 1L)];
        }
        
        public boolean e() {
            return this.d > 15L && this.h == 0;
        }
        
        public void f(final long n) {
            final long d = this.d;
            Label_0169: {
                if (d == 0L) {
                    this.a = n;
                }
                else if (d == 1L) {
                    final long n2 = n - this.a;
                    this.b = n2;
                    this.f = n2;
                    this.e = 1L;
                }
                else {
                    final long n3 = n - this.c;
                    final int c = c(d);
                    int h;
                    if (Math.abs(n3 - this.b) <= 1000000L) {
                        ++this.e;
                        this.f += n3;
                        final boolean[] g = this.g;
                        if (!g[c]) {
                            break Label_0169;
                        }
                        g[c] = false;
                        h = this.h - 1;
                    }
                    else {
                        final boolean[] g2 = this.g;
                        if (g2[c]) {
                            break Label_0169;
                        }
                        g2[c] = true;
                        h = this.h + 1;
                    }
                    this.h = h;
                }
            }
            ++this.d;
            this.c = n;
        }
        
        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }
}
