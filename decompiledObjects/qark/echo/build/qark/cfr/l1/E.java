/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package l1;

import F0.t;
import g0.M;
import g0.z;
import l1.D;
import l1.K;

public final class E
implements K {
    public final D a;
    public final z b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public E(D d8) {
        this.a = d8;
        this.b = new z(32);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, int var2_2) {
        var2_2 = (var2_2 & 1) != 0 ? 1 : 0;
        if (var2_2 != 0) {
            var3_3 = var1_1.G();
            var3_3 = var1_1.f() + var3_3;
        } else {
            var3_3 = -1;
        }
        if (!this.f) ** GOTO lbl14
        if (var2_2 == 0) {
            return;
        }
        this.f = false;
        var1_1.T(var3_3);
        do {
            block12 : {
                this.d = 0;
lbl14: // 6 sources:
                while (var1_1.a() > 0) {
                    var2_2 = this.d;
                    if (var2_2 < 3) {
                        if (var2_2 == 0) {
                            var2_2 = var1_1.G();
                            var1_1.T(var1_1.f() - 1);
                            if (var2_2 == 255) {
                                this.f = true;
                                return;
                            }
                        }
                        var2_2 = Math.min((int)var1_1.a(), (int)(3 - this.d));
                        var1_1.l(this.b.e(), this.d, var2_2);
                        this.d = var2_2 = this.d + var2_2;
                        if (var2_2 != 3) continue;
                        this.b.T(0);
                        this.b.S(3);
                        this.b.U(1);
                        var2_2 = this.b.G();
                        var3_3 = this.b.G();
                        var4_4 = (var2_2 & 128) != 0;
                        this.e = var4_4;
                        this.c = ((var2_2 & 15) << 8 | var3_3) + 3;
                        var2_2 = this.b.b();
                        if (var2_2 >= (var3_3 = this.c)) continue;
                        var2_2 = Math.min((int)4098, (int)Math.max((int)var3_3, (int)(this.b.b() * 2)));
                        this.b.c(var2_2);
                        continue;
                    }
                    var2_2 = Math.min((int)var1_1.a(), (int)(this.c - this.d));
                    var1_1.l(this.b.e(), this.d, var2_2);
                    this.d = var2_2 = this.d + var2_2;
                    var3_3 = this.c;
                    if (var2_2 != var3_3) {
                        continue;
                    }
                    break block12;
                }
                return;
            }
            if (this.e) {
                if (M.x(this.b.e(), 0, this.c, -1) != 0) {
                    this.f = true;
                    return;
                }
                this.b.S(this.c - 4);
            } else {
                this.b.S(var3_3);
            }
            this.b.T(0);
            this.a.a(this.b);
        } while (true);
    }

    @Override
    public void b() {
        this.f = true;
    }

    @Override
    public void c(g0.E e8, t t8, K.d d8) {
        this.a.c(e8, t8, d8);
        this.f = true;
    }
}

