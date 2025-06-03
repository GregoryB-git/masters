/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u6;

import kotlin.text.i;
import u6.G;

public abstract class I {
    public static final int a(String string2, int n8, int n9, int n10) {
        return (int)G.c(string2, n8, n9, n10);
    }

    public static final long b(String string2, long l8, long l9, long l10) {
        String string3 = G.d(string2);
        if (string3 == null) {
            return l8;
        }
        Long l11 = i.h(string3);
        if (l11 != null) {
            l8 = l11;
            if (l9 <= l8 && l8 <= l10) {
                return l8;
            }
            string3 = new StringBuilder();
            string3.append("System property '");
            string3.append(string2);
            string3.append("' should be in range ");
            string3.append(l9);
            string3.append("..");
            string3.append(l10);
            string3.append(", but is '");
            string3.append(l8);
            string3.append('\'');
            throw new IllegalStateException(string3.toString().toString());
        }
        l11 = new StringBuilder();
        l11.append("System property '");
        l11.append(string2);
        l11.append("' has unrecognized value '");
        l11.append(string3);
        l11.append('\'');
        throw new IllegalStateException(l11.toString().toString());
    }

    public static final String c(String string2, String string3) {
        if ((string2 = G.d(string2)) == null) {
            return string3;
        }
        return string2;
    }

    public static final boolean d(String string2, boolean bl) {
        if ((string2 = G.d(string2)) != null) {
            bl = Boolean.parseBoolean((String)string2);
        }
        return bl;
    }

    public static /* synthetic */ int e(String string2, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 4) != 0) {
            n9 = 1;
        }
        if ((n11 & 8) != 0) {
            n10 = Integer.MAX_VALUE;
        }
        return G.b(string2, n8, n9, n10);
    }

    public static /* synthetic */ long f(String string2, long l8, long l9, long l10, int n8, Object object) {
        if ((n8 & 4) != 0) {
            l9 = 1L;
        }
        if ((n8 & 8) != 0) {
            l10 = Long.MAX_VALUE;
        }
        return G.c(string2, l8, l9, l10);
    }
}

