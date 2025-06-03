/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package Z4;

import Z4.a;

public final class b {
    public final a a;
    public final int[] b;

    public b(a arrn, int[] arrn2) {
        if (arrn2.length != 0) {
            this.a = arrn;
            int n8 = arrn2.length;
            if (n8 > 1 && arrn2[0] == 0) {
                int n9;
                for (n9 = 1; n9 < n8 && arrn2[n9] == 0; ++n9) {
                }
                if (n9 == n8) {
                    this.b = new int[]{0};
                    return;
                }
                arrn = new int[n8 - n9];
                this.b = arrn;
                System.arraycopy((Object)arrn2, (int)n9, (Object)arrn, (int)0, (int)arrn.length);
                return;
            }
            this.b = arrn2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public b a(b arrn) {
        if (this.a.equals((Object)arrn.a)) {
            if (this.f()) {
                return arrn;
            }
            if (arrn.f()) {
                return this;
            }
            int[] arrn2 = this.b;
            int[] arrn3 = arrn.b;
            if (arrn2.length > arrn3.length) {
                arrn = arrn2;
                arrn2 = arrn3;
            } else {
                arrn = arrn3;
            }
            arrn3 = new int[arrn.length];
            int n8 = arrn.length - arrn2.length;
            System.arraycopy((Object)arrn, (int)0, (Object)arrn3, (int)0, (int)n8);
            for (int i8 = n8; i8 < arrn.length; ++i8) {
                arrn3[i8] = a.a(arrn2[i8 - n8], arrn[i8]);
            }
            return new b(this.a, arrn3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public b[] b(b b8) {
        if (this.a.equals((Object)b8.a)) {
            if (!b8.f()) {
                b b9 = this.a.e();
                int n8 = b8.c(b8.e());
                n8 = this.a.f(n8);
                b b10 = this;
                while (b10.e() >= b8.e() && !b10.f()) {
                    int n9 = b10.e() - b8.e();
                    int n10 = this.a.h(b10.c(b10.e()), n8);
                    b b11 = b8.h(n9, n10);
                    b9 = b9.a(this.a.b(n9, n10));
                    b10 = b10.a(b11);
                }
                return new b[]{b9, b10};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public int c(int n8) {
        int[] arrn = this.b;
        return arrn[arrn.length - 1 - n8];
    }

    public int[] d() {
        return this.b;
    }

    public int e() {
        return this.b.length - 1;
    }

    public boolean f() {
        if (this.b[0] == 0) {
            return true;
        }
        return false;
    }

    public b g(b arrn) {
        if (this.a.equals((Object)arrn.a)) {
            if (!this.f() && !arrn.f()) {
                int[] arrn2 = this.b;
                int n8 = arrn2.length;
                arrn = arrn.b;
                int n9 = arrn.length;
                int[] arrn3 = new int[n8 + n9 - 1];
                for (int i8 = 0; i8 < n8; ++i8) {
                    int n10 = arrn2[i8];
                    for (int i9 = 0; i9 < n9; ++i9) {
                        int n11 = i8 + i9;
                        arrn3[n11] = a.a(arrn3[n11], this.a.h(n10, arrn[i9]));
                    }
                }
                return new b(this.a, arrn3);
            }
            return this.a.e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public b h(int n8, int n9) {
        if (n8 >= 0) {
            if (n9 == 0) {
                return this.a.e();
            }
            int n10 = this.b.length;
            int[] arrn = new int[n8 + n10];
            for (n8 = 0; n8 < n10; ++n8) {
                arrn[n8] = this.a.h(this.b[n8], n9);
            }
            return new b(this.a, arrn);
        }
        throw new IllegalArgumentException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        var5_1 = new StringBuilder(this.e() * 8);
        var2_2 = this.e();
        while (var2_2 >= 0) {
            block9 : {
                block10 : {
                    block11 : {
                        var4_5 = this.c(var2_2);
                        if (var4_5 == 0) break block9;
                        if (var4_5 < 0) {
                            var5_1.append(" - ");
                            var3_4 = - var4_5;
                        } else {
                            var3_4 = var4_5;
                            if (var5_1.length() > 0) {
                                var5_1.append(" + ");
                                var3_4 = var4_5;
                            }
                        }
                        if (var2_2 != 0 && var3_4 == 1) break block10;
                        if ((var3_4 = this.a.g(var3_4)) != 0) break block11;
                        var1_3 = 49;
                        ** GOTO lbl21
                    }
                    if (var3_4 == 1) {
                        var1_3 = 97;
lbl21: // 2 sources:
                        var5_1.append((char)var1_3);
                    } else {
                        var5_1.append("a^");
                        var5_1.append(var3_4);
                    }
                }
                if (var2_2 != 0) {
                    if (var2_2 == 1) {
                        var5_1.append('x');
                    } else {
                        var5_1.append("x^");
                        var5_1.append(var2_2);
                    }
                }
            }
            --var2_2;
        }
        return var5_1.toString();
    }
}

