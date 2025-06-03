/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package l1;

import F0.t;
import g0.E;
import g0.a;
import g0.o;
import g0.z;
import l1.K;
import l1.m;
import l1.n;

public final class y
implements K {
    public final m a;
    public final g0.y b;
    public int c;
    public int d;
    public E e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public y(m m8) {
        this.a = m8;
        this.b = new g0.y(new byte[10]);
        this.c = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, int var2_2) {
        a.h(this.e);
        var3_3 = var2_2;
        if ((var2_2 & 1) == 0) ** GOTO lbl25
        var4_4 = this.c;
        var3_3 = var2_2;
        if (var4_4 != 0) {
            var3_3 = var2_2;
            if (var4_4 != 1) {
                if (var4_4 != 2) {
                    if (var4_4 != 3) throw new IllegalStateException();
                    if (this.j != -1) {
                        var7_5 = new StringBuilder();
                        var7_5.append("Unexpected start indicator: expected ");
                        var7_5.append(this.j);
                        var7_5.append(" more bytes");
                        o.h("PesReader", var7_5.toString());
                    }
                    var6_6 = var1_1.g() == 0;
                    this.a.c(var6_6);
                    var3_3 = var2_2;
                } else {
                    o.h("PesReader", "Unexpected start indicator reading extended header");
                    var3_3 = var2_2;
                }
            }
        }
        block0 : do {
            this.h(1);
lbl25: // 9 sources:
            while (var1_1.a() > 0) {
                var2_2 = this.c;
                if (var2_2 != 0) {
                    if (var2_2 != 1) {
                        if (var2_2 != 2) {
                            if (var2_2 != 3) throw new IllegalStateException();
                            var5_7 = var1_1.a();
                            var2_2 = this.j;
                            var4_4 = var2_2 == -1 ? 0 : var5_7 - var2_2;
                            var2_2 = var5_7;
                            if (var4_4 > 0) {
                                var2_2 = var5_7 - var4_4;
                                var1_1.S(var1_1.f() + var2_2);
                            }
                            this.a.a(var1_1);
                            var4_4 = this.j;
                            if (var4_4 == -1) continue;
                            this.j = var2_2 = var4_4 - var2_2;
                            if (var2_2 != 0) continue;
                            this.a.c(false);
                            continue block0;
                        }
                        var2_2 = Math.min((int)10, (int)this.i);
                        if (!this.e(var1_1, this.b.a, var2_2) || !this.e(var1_1, null, this.i)) continue;
                        this.g();
                        var2_2 = this.k != false ? 4 : 0;
                        this.a.d(this.l, var3_3 |= var2_2);
                        this.h(3);
                        continue;
                    }
                    if (!this.e(var1_1, this.b.a, 9)) continue;
                    var2_2 = this.f() != false ? 2 : 0;
                    this.h(var2_2);
                    continue;
                }
                var1_1.U(var1_1.a());
            }
            return;
            break;
        } while (true);
    }

    @Override
    public void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override
    public void c(E e8, t t8, K.d d8) {
        this.e = e8;
        this.a.e(t8, d8);
    }

    public boolean d(boolean bl) {
        if (!(this.c != 3 || this.j != -1 || bl && this.a instanceof n)) {
            return true;
        }
        return false;
    }

    public final boolean e(z z8, byte[] arrby, int n8) {
        int n9 = Math.min((int)z8.a(), (int)(n8 - this.d));
        if (n9 <= 0) {
            return true;
        }
        if (arrby == null) {
            z8.U(n9);
        } else {
            z8.l(arrby, this.d, n9);
        }
        this.d = n9 = this.d + n9;
        if (n9 == n8) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean f() {
        int n8;
        this.b.p(0);
        int n9 = this.b.h(24);
        if (n9 != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected start code prefix: ");
            stringBuilder.append(n9);
            o.h("PesReader", stringBuilder.toString());
            this.j = -1;
            return false;
        }
        this.b.r(8);
        n9 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        this.i = n8 = this.b.h(8);
        if (n9 != 0) {
            this.j = n9 = n9 - 3 - n8;
            if (n9 >= 0) {
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found negative packet payload size: ");
            stringBuilder.append(this.j);
            o.h("PesReader", stringBuilder.toString());
        }
        this.j = -1;
        return true;
    }

    public final void g() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            long l8 = this.b.h(3);
            this.b.r(1);
            long l9 = this.b.h(15) << 15;
            this.b.r(1);
            long l10 = this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                long l11 = this.b.h(3);
                this.b.r(1);
                long l12 = this.b.h(15) << 15;
                this.b.r(1);
                long l13 = this.b.h(15);
                this.b.r(1);
                this.e.b(l11 << 30 | l12 | l13);
                this.h = true;
            }
            this.l = this.e.b(l8 << 30 | l9 | l10);
        }
    }

    public final void h(int n8) {
        this.c = n8;
        this.d = 0;
    }
}

