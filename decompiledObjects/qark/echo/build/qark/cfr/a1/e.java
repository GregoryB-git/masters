/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Arrays
 */
package a1;

import F0.s;
import F0.u;
import a1.f;
import g0.a;
import g0.z;
import java.util.Arrays;

public final class e {
    public final f a = new f();
    public final z b = new z(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int n8) {
        int n9;
        int n10;
        int n11 = 0;
        this.d = 0;
        do {
            n9 = this.d;
            int[] arrn = this.a;
            n10 = n11;
            if (n8 + n9 >= arrn.g) break;
            arrn = arrn.j;
            this.d = n9 + 1;
            n9 = arrn[n9 + n8];
            n11 = n10 = n11 + n9;
        } while (n9 == 255);
        return n10;
    }

    public f b() {
        return this.a;
    }

    public z c() {
        return this.b;
    }

    public boolean d(s s8) {
        boolean bl = s8 != null;
        a.f(bl);
        if (this.e) {
            this.e = false;
            this.b.P(0);
        }
        while (!this.e) {
            int n8;
            int n9;
            Object object;
            if (this.c < 0) {
                if (this.a.c(s8)) {
                    if (!this.a.a(s8, true)) {
                        return false;
                    }
                    object = this.a;
                    n9 = object.h;
                    if ((object.b & 1) == 1 && this.b.g() == 0) {
                        n9 += this.a(0);
                        n8 = this.d;
                    } else {
                        n8 = 0;
                    }
                    if (!u.e(s8, n9)) {
                        return false;
                    }
                    this.c = n8;
                } else {
                    return false;
                }
            }
            n8 = this.a(this.c);
            n9 = this.c + this.d;
            if (n8 > 0) {
                object = this.b;
                object.c(object.g() + n8);
                if (!u.d(s8, this.b.e(), this.b.g(), n8)) {
                    return false;
                }
                object = this.b;
                object.S(object.g() + n8);
                bl = this.a.j[n9 - 1] != 255;
                this.e = bl;
            }
            n8 = n9;
            if (n9 == this.a.g) {
                n8 = -1;
            }
            this.c = n8;
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
        z z8 = this.b;
        z8.R(Arrays.copyOf((byte[])z8.e(), (int)Math.max((int)65025, (int)this.b.g())), this.b.g());
    }
}

