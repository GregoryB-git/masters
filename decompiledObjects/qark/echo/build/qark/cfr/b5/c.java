/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.g;
import b5.h;
import b5.j;
import b5.k;

public class c
implements g {
    public static String d(CharSequence charSequence, int n8) {
        n8 = charSequence.charAt(n8) * 1600 + charSequence.charAt(n8 + 1) * 40 + charSequence.charAt(n8 + 2) + 1;
        return new String(new char[]{(char)(n8 / 256), (char)(n8 % 256)});
    }

    public static void g(h h8, StringBuilder stringBuilder) {
        h8.s(c.d((CharSequence)stringBuilder, 0));
        stringBuilder.delete(0, 3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(h var1_1) {
        var7_2 = new StringBuilder();
        block0 : while (var1_1.i()) {
            block4 : {
                block3 : {
                    var2_3 = var1_1.c();
                    ++var1_1.d;
                    var4_5 = this.c(var2_3, var7_2);
                    var3_4 = var7_2.length() / 3;
                    var3_4 = var1_1.a() + (var3_4 << 1);
                    var1_1.q(var3_4);
                    var6_6 = var1_1.g().a() - var3_4;
                    if (var1_1.i()) break block3;
                    var8_7 = new StringBuilder();
                    var3_4 = var4_5;
                    if (var7_2.length() % 3 != 2) ** GOTO lbl27
                    var5_8 = var4_5;
                    if (var6_6 < 2) break block4;
                    var3_4 = var4_5;
                    if (var6_6 <= 2) ** GOTO lbl27
                    var5_8 = var4_5;
                    break block4;
                }
                if (var7_2.length() % 3 != 0 || j.n(var1_1.d(), var1_1.d, this.e()) == this.e()) continue;
                var1_1.o(0);
                break;
            }
            do {
                var3_4 = this.b(var1_1, var7_2, var8_7, var5_8);
lbl27: // 3 sources:
                if (var7_2.length() % 3 != 1) break block0;
                if (var3_4 <= 3) {
                    var5_8 = var3_4;
                    if (var6_6 != 1) continue;
                }
                if (var3_4 <= 3) break block0;
                var5_8 = var3_4;
            } while (true);
        }
        this.f(var1_1, var7_2);
    }

    public final int b(h h8, StringBuilder stringBuilder, StringBuilder stringBuilder2, int n8) {
        int n9 = stringBuilder.length();
        stringBuilder.delete(n9 - n8, n9);
        --h8.d;
        n8 = this.c(h8.c(), stringBuilder2);
        h8.k();
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int c(char c8, StringBuilder stringBuilder) {
        block15 : {
            block10 : {
                int n8;
                block12 : {
                    block14 : {
                        block13 : {
                            block11 : {
                                block9 : {
                                    block8 : {
                                        block5 : {
                                            int n9;
                                            block7 : {
                                                block6 : {
                                                    block4 : {
                                                        if (c8 != ' ') break block4;
                                                        c8 = (char)3;
                                                        break block5;
                                                    }
                                                    if (c8 < '0' || c8 > '9') break block6;
                                                    n9 = c8 - 44;
                                                    break block7;
                                                }
                                                if (c8 < 'A' || c8 > 'Z') break block8;
                                                n9 = c8 - 51;
                                            }
                                            c8 = (char)n9;
                                        }
                                        stringBuilder.append(c8);
                                        return 1;
                                    }
                                    if (c8 >= ' ') break block9;
                                    stringBuilder.append('\u0000');
                                    break block10;
                                }
                                if (c8 < '!' || c8 > '/') break block11;
                                stringBuilder.append('\u0001');
                                n8 = c8 - 33;
                                break block12;
                            }
                            if (c8 < ':' || c8 > '@') break block13;
                            stringBuilder.append('\u0001');
                            n8 = c8 - 43;
                            break block12;
                        }
                        if (c8 < '[' || c8 > '_') break block14;
                        stringBuilder.append('\u0001');
                        n8 = c8 - 69;
                        break block12;
                    }
                    if (c8 < '`' || c8 > '') break block15;
                    stringBuilder.append('\u0002');
                    n8 = c8 - 96;
                }
                c8 = (char)n8;
            }
            stringBuilder.append(c8);
            return 2;
        }
        stringBuilder.append("\u0001\u001e");
        return this.c((char)(c8 - 128), stringBuilder) + 2;
    }

    public int e() {
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(h h8, StringBuilder stringBuilder) {
        block9 : {
            block10 : {
                int n8;
                int n9;
                block11 : {
                    block8 : {
                        n8 = stringBuilder.length() / 3;
                        n9 = stringBuilder.length() % 3;
                        n8 = h8.a() + (n8 << 1);
                        h8.q(n8);
                        n8 = h8.g().a() - n8;
                        if (n9 != 2) break block8;
                        stringBuilder.append('\u0000');
                        while (stringBuilder.length() >= 3) {
                            c.g(h8, stringBuilder);
                        }
                        if (!h8.i()) break block9;
                        break block10;
                    }
                    if (n8 != 1 || n9 != 1) break block11;
                    while (stringBuilder.length() >= 3) {
                        c.g(h8, stringBuilder);
                    }
                    if (h8.i()) {
                        h8.r('\u00fe');
                    }
                    --h8.d;
                    break block9;
                }
                if (n9 != 0) {
                    throw new IllegalStateException("Unexpected case. Please report!");
                }
                while (stringBuilder.length() >= 3) {
                    c.g(h8, stringBuilder);
                }
                if (n8 <= 0 && !h8.i()) break block9;
            }
            h8.r('\u00fe');
        }
        h8.o(0);
    }
}

