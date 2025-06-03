/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.Arrays
 */
package b5;

import java.util.Arrays;

public class e {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte[] d;

    public e(CharSequence arrby, int n8, int n9) {
        this.a = arrby;
        this.c = n8;
        this.b = n9;
        arrby = new byte[n8 * n9];
        this.d = arrby;
        Arrays.fill((byte[])arrby, (byte)-1);
    }

    public final void a(int n8) {
        this.g(this.b - 1, 0, n8, 1);
        this.g(this.b - 1, 1, n8, 2);
        this.g(this.b - 1, 2, n8, 3);
        this.g(0, this.c - 2, n8, 4);
        this.g(0, this.c - 1, n8, 5);
        this.g(1, this.c - 1, n8, 6);
        this.g(2, this.c - 1, n8, 7);
        this.g(3, this.c - 1, n8, 8);
    }

    public final void b(int n8) {
        this.g(this.b - 3, 0, n8, 1);
        this.g(this.b - 2, 0, n8, 2);
        this.g(this.b - 1, 0, n8, 3);
        this.g(0, this.c - 4, n8, 4);
        this.g(0, this.c - 3, n8, 5);
        this.g(0, this.c - 2, n8, 6);
        this.g(0, this.c - 1, n8, 7);
        this.g(1, this.c - 1, n8, 8);
    }

    public final void c(int n8) {
        this.g(this.b - 3, 0, n8, 1);
        this.g(this.b - 2, 0, n8, 2);
        this.g(this.b - 1, 0, n8, 3);
        this.g(0, this.c - 2, n8, 4);
        this.g(0, this.c - 1, n8, 5);
        this.g(1, this.c - 1, n8, 6);
        this.g(2, this.c - 1, n8, 7);
        this.g(3, this.c - 1, n8, 8);
    }

    public final void d(int n8) {
        this.g(this.b - 1, 0, n8, 1);
        this.g(this.b - 1, this.c - 1, n8, 2);
        this.g(0, this.c - 3, n8, 3);
        this.g(0, this.c - 2, n8, 4);
        this.g(0, this.c - 1, n8, 5);
        this.g(1, this.c - 3, n8, 6);
        this.g(1, this.c - 2, n8, 7);
        this.g(1, this.c - 1, n8, 8);
    }

    public final boolean e(int n8, int n9) {
        if (this.d[n9 * this.c + n8] == 1) {
            return true;
        }
        return false;
    }

    public final boolean f(int n8, int n9) {
        if (this.d[n9 * this.c + n8] >= 0) {
            return true;
        }
        return false;
    }

    public final void g(int n8, int n9, int n10, int n11) {
        int n12 = n8;
        int n13 = n9;
        if (n8 < 0) {
            n13 = this.b;
            n12 = n8 + n13;
            n13 = n9 + (4 - (n13 + 4) % 8);
        }
        n9 = n12;
        n8 = n13;
        if (n13 < 0) {
            n9 = this.c;
            n8 = n13 + n9;
            n9 = n12 + (4 - (n9 + 4) % 8);
        }
        n10 = this.a.charAt(n10);
        boolean bl = true;
        if ((n10 & 1 << 8 - n11) == 0) {
            bl = false;
        }
        this.i(n8, n9, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void h() {
        var2_1 = 0;
        var4_2 = 0;
        var1_3 = 4;
        do lbl-1000: // 3 sources:
        {
            var3_4 = var4_2;
            if (var1_3 == this.b) {
                var3_4 = var4_2;
                if (var2_1 == 0) {
                    this.a(var4_2);
                    var3_4 = var4_2 + 1;
                }
            }
            var5_5 = var3_4;
            if (var1_3 == this.b - 2) {
                var5_5 = var3_4;
                if (var2_1 == 0) {
                    var5_5 = var3_4;
                    if (this.c % 4 != 0) {
                        this.b(var3_4);
                        var5_5 = var3_4 + 1;
                    }
                }
            }
            var4_2 = var5_5;
            if (var1_3 == this.b - 2) {
                var4_2 = var5_5;
                if (var2_1 == 0) {
                    var4_2 = var5_5;
                    if (this.c % 8 == 4) {
                        this.c(var5_5);
                        var4_2 = var5_5 + 1;
                    }
                }
            }
            var5_5 = var2_1;
            var3_4 = var4_2;
            var6_6 = var1_3;
            if (var1_3 == this.b + 4) {
                var5_5 = var2_1;
                var3_4 = var4_2;
                var6_6 = var1_3;
                if (var2_1 == 2) {
                    var5_5 = var2_1;
                    var3_4 = var4_2;
                    var6_6 = var1_3;
                    if (this.c % 8 == 0) {
                        this.d(var4_2);
                        var3_4 = var4_2 + 1;
                        var6_6 = var1_3;
                        var5_5 = var2_1;
                    }
                }
            }
            do {
                var1_3 = var3_4;
                if (var6_6 < this.b) {
                    var1_3 = var3_4;
                    if (var5_5 >= 0) {
                        var1_3 = var3_4;
                        if (!this.f(var5_5, var6_6)) {
                            this.j(var6_6, var5_5, var3_4);
                            var1_3 = var3_4 + 1;
                        }
                    }
                }
                var3_4 = var6_6 - 2;
                var2_1 = var5_5 + 2;
                if (var3_4 < 0 || var2_1 >= this.c) break;
                var6_6 = var3_4;
                var5_5 = var2_1;
                var3_4 = var1_3;
            } while (true);
            var2_1 = var6_6 - 1;
            var3_4 = var5_5 + 5;
            var4_2 = var1_3;
            var1_3 = var3_4;
            do {
                var3_4 = var4_2;
                if (var2_1 >= 0) {
                    var3_4 = var4_2;
                    if (var1_3 < this.c) {
                        var3_4 = var4_2;
                        if (!this.f(var1_3, var2_1)) {
                            this.j(var2_1, var1_3, var4_2);
                            var3_4 = var4_2 + 1;
                        }
                    }
                }
                var5_5 = var2_1 + 2;
                var4_2 = var1_3 - 2;
                var7_7 = this.b;
                if (var5_5 >= var7_7 || var4_2 < 0) break;
                var2_1 = var5_5;
                var1_3 = var4_2;
                var4_2 = var3_4;
            } while (true);
            var5_5 = var2_1 + 5;
            var2_1 = var6_6 = var1_3 - 1;
            var4_2 = var3_4;
            var1_3 = var5_5;
            if (var5_5 < var7_7) ** GOTO lbl-1000
            var8_8 = this.c;
            var2_1 = var6_6;
            var4_2 = var3_4;
            var1_3 = var5_5;
        } while (var6_6 < var8_8);
        if (this.f(var8_8 - 1, var7_7 - 1) != false) return;
        this.i(this.c - 1, this.b - 1, true);
        this.i(this.c - 2, this.b - 2, true);
    }

    public final void i(int n8, int n9, boolean bl) {
        this.d[n9 * this.c + n8] = (byte)(bl ? 1 : 0);
    }

    public final void j(int n8, int n9, int n10) {
        int n11 = n8 - 2;
        int n12 = n9 - 2;
        this.g(n11, n12, n10, 1);
        int n13 = n9 - 1;
        this.g(n11, n13, n10, 2);
        n11 = n8 - 1;
        this.g(n11, n12, n10, 3);
        this.g(n11, n13, n10, 4);
        this.g(n11, n9, n10, 5);
        this.g(n8, n12, n10, 6);
        this.g(n8, n13, n10, 7);
        this.g(n8, n9, n10, 8);
    }
}

