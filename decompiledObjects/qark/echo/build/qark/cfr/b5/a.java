/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.g;
import b5.h;
import b5.j;

public final class a
implements g {
    public static char b(char c8, char c9) {
        if (j.f(c8) && j.f(c9)) {
            return (char)((c8 - 48) * 10 + (c9 - 48) + 130);
        }
        StringBuilder stringBuilder = new StringBuilder("not digits: ");
        stringBuilder.append(c8);
        stringBuilder.append(c9);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public void a(h h8) {
        if (j.a(h8.d(), h8.d) >= 2) {
            h8.r(a.b(h8.d().charAt(h8.d), h8.d().charAt(h8.d + 1)));
            h8.d += 2;
            return;
        }
        char c8 = h8.c();
        int n8 = j.n(h8.d(), h8.d, this.c());
        if (n8 != this.c()) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                h8.r('\u00e7');
                                h8.o(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf((int)n8)));
                        }
                        h8.r('\u00f0');
                        h8.o(4);
                        return;
                    }
                    h8.r('\u00ee');
                    h8.o(3);
                    return;
                }
                h8.r('\u00ef');
                h8.o(2);
                return;
            }
            h8.r('\u00e6');
            h8.o(1);
            return;
        }
        if (j.g(c8)) {
            h8.r('\u00eb');
            h8.r((char)(c8 - 127));
            ++h8.d;
            return;
        }
        h8.r((char)(c8 + '\u0001'));
        ++h8.d;
    }

    public int c() {
        return 0;
    }
}

