/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.c;
import b5.h;
import b5.j;
import b5.k;

public final class n
extends c {
    @Override
    public void a(h h8) {
        StringBuilder stringBuilder = new StringBuilder();
        while (h8.i()) {
            char c8 = h8.c();
            ++h8.d;
            this.c(c8, stringBuilder);
            if (stringBuilder.length() % 3 != 0) continue;
            c.g(h8, stringBuilder);
            if (j.n(h8.d(), h8.d, this.e()) == this.e()) continue;
            h8.o(0);
            break;
        }
        this.f(h8, stringBuilder);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int c(char var1_1, StringBuilder var2_2) {
        block6 : {
            block3 : {
                block4 : {
                    block5 : {
                        if (var1_1 == '\r') break block3;
                        if (var1_1 == ' ') break block4;
                        if (var1_1 == '*') {
                            var2_2.append('\u0001');
                            return 1;
                        }
                        if (var1_1 == '>') ** GOTO lbl17
                        if (var1_1 < '0' || var1_1 > '9') break block5;
                        var3_3 = var1_1 - 44;
                        ** GOTO lbl13
                    }
                    if (var1_1 >= 'A' && var1_1 <= 'Z') {
                        var3_3 = var1_1 - 51;
lbl13: // 2 sources:
                        var1_1 = (char)var3_3;
                    } else {
                        j.e(var1_1);
                        return 1;
lbl17: // 1 sources:
                        var1_1 = (char)2;
                    }
                    break block6;
                }
                var1_1 = (char)3;
                break block6;
            }
            var1_1 = '\u0000';
        }
        var2_2.append(var1_1);
        return 1;
    }

    @Override
    public int e() {
        return 3;
    }

    @Override
    public void f(h h8, StringBuilder stringBuilder) {
        h8.p();
        int n8 = h8.g().a() - h8.a();
        int n9 = stringBuilder.length();
        h8.d -= n9;
        if (h8.f() > 1 || n8 > 1 || h8.f() != n8) {
            h8.r('\u00fe');
        }
        if (h8.e() < 0) {
            h8.o(0);
        }
    }
}

