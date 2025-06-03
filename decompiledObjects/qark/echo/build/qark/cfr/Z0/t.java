/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Z0;

import F0.T;
import g0.a;
import g0.o;

public final class t {
    public final boolean a;
    public final String b;
    public final T.a c;
    public final int d;
    public final byte[] e;

    public t(boolean bl, String string2, int n8, byte[] arrby, int n9, int n10, byte[] arrby2) {
        boolean bl2 = true;
        boolean bl3 = n8 == 0;
        if (arrby2 != null) {
            bl2 = false;
        }
        a.a(bl2 ^ bl3);
        this.a = bl;
        this.b = string2;
        this.d = n8;
        this.e = arrby2;
        this.c = new T.a(t.a(string2), arrby, n9, n10);
    }

    public static int a(String string2) {
        if (string2 == null) {
            return 1;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 3049895: {
                if (!string2.equals((Object)"cens")) break;
                n9 = 3;
                break;
            }
            case 3049879: {
                if (!string2.equals((Object)"cenc")) break;
                n9 = 2;
                break;
            }
            case 3046671: {
                if (!string2.equals((Object)"cbcs")) break;
                n9 = 1;
                break;
            }
            case 3046605: {
                if (!string2.equals((Object)"cbc1")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported protection scheme type '");
                stringBuilder.append(string2);
                stringBuilder.append("'. Assuming AES-CTR crypto mode.");
                o.h("TrackEncryptionBox", stringBuilder.toString());
            }
            case 2: 
            case 3: {
                return 1;
            }
            case 0: 
            case 1: 
        }
        return 2;
    }
}

