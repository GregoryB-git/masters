/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
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

public final class b
implements g {
    public static char c(char c8, int n8) {
        if ((c8 = (char)(c8 + (n8 * 149 % 255 + 1))) <= '\u00ff') {
            return c8;
        }
        return (char)(c8 - 256);
    }

    @Override
    public void a(h h8) {
        int n8;
        block6 : {
            StringBuilder stringBuilder;
            int n9;
            block4 : {
                block5 : {
                    stringBuilder = new StringBuilder();
                    int n10 = 0;
                    stringBuilder.append('\u0000');
                    while (h8.i()) {
                        stringBuilder.append(h8.c());
                        ++h8.d;
                        if (j.n(h8.d(), h8.d, this.b()) == this.b()) continue;
                        h8.o(0);
                        break;
                    }
                    n8 = stringBuilder.length() - 1;
                    n9 = h8.a() + n8 + 1;
                    h8.q(n9);
                    n9 = h8.g().a() - n9 > 0 ? 1 : 0;
                    if (!h8.i() && n9 == 0) break block4;
                    if (n8 > 249) break block5;
                    stringBuilder.setCharAt(0, (char)n8);
                    break block4;
                }
                if (n8 > 1555) break block6;
                stringBuilder.setCharAt(0, (char)(n8 / 250 + 249));
                stringBuilder.insert(1, (char)(n8 % 250));
            }
            n8 = stringBuilder.length();
            for (n9 = n10; n9 < n8; ++n9) {
                h8.r(b.c(stringBuilder.charAt(n9), h8.a() + 1));
            }
            return;
        }
        throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf((int)n8)));
    }

    public int b() {
        return 5;
    }
}

