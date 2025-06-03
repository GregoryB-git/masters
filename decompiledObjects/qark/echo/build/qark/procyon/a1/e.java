// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import java.util.Arrays;
import F0.u;
import g0.a;
import F0.s;
import g0.z;

public final class e
{
    public final f a;
    public final z b;
    public int c;
    public int d;
    public boolean e;
    
    public e() {
        this.a = new f();
        this.b = new z(new byte[65025], 0);
        this.c = -1;
    }
    
    public final int a(final int n) {
        int n2 = 0;
        this.d = 0;
        int i;
        int n3;
        do {
            final int d = this.d;
            final f a = this.a;
            n3 = n2;
            if (n + d >= a.g) {
                break;
            }
            final int[] j = a.j;
            this.d = d + 1;
            i = j[d + n];
            n3 = (n2 += i);
        } while (i == 255);
        return n3;
    }
    
    public f b() {
        return this.a;
    }
    
    public z c() {
        return this.b;
    }
    
    public boolean d(final s s) {
        g0.a.f(s != null);
        if (this.e) {
            this.e = false;
            this.b.P(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(s)) {
                    return false;
                }
                if (!this.a.a(s, true)) {
                    return false;
                }
                final f a = this.a;
                int h = a.h;
                int d;
                if ((a.b & 0x1) == 0x1 && this.b.g() == 0) {
                    h += this.a(0);
                    d = this.d;
                }
                else {
                    d = 0;
                }
                if (!u.e(s, h)) {
                    return false;
                }
                this.c = d;
            }
            final int a2 = this.a(this.c);
            final int n = this.c + this.d;
            if (a2 > 0) {
                final z b = this.b;
                b.c(b.g() + a2);
                if (!u.d(s, this.b.e(), this.b.g(), a2)) {
                    return false;
                }
                final z b2 = this.b;
                b2.S(b2.g() + a2);
                this.e = (this.a.j[n - 1] != 255);
            }
            int c;
            if ((c = n) == this.a.g) {
                c = -1;
            }
            this.c = c;
        }
        return true;
    }
    
    public void e() {
        this.a.b();
        this.b.P(0);
        this.c = -1;
        this.e = false;
    }
    
    public void f() {
        if (this.b.e().length == 65025) {
            return;
        }
        final z b = this.b;
        b.R(Arrays.copyOf(b.e(), Math.max(65025, this.b.g())), this.b.g());
    }
}
