/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package F0;

import g0.z;

public final class o {
    public final int a;
    public final int b;
    public final String c;

    public o(int n8, int n9, String string2) {
        this.a = n8;
        this.b = n9;
        this.c = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static o a(z object) {
        object.U(2);
        int n8 = object.G();
        int n9 = n8 >> 1;
        n8 = object.G() >> 3 & 31 | (n8 & 1) << 5;
        if (n9 != 4 && n9 != 5 && n9 != 7) {
            if (n9 == 8) {
                object = "hev1";
            } else {
                if (n9 != 9) return null;
                object = "avc3";
            }
        } else {
            object = "dvhe";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        object = ".0";
        stringBuilder.append(".0");
        stringBuilder.append(n9);
        if (n8 >= 10) {
            object = ".";
        }
        stringBuilder.append((String)object);
        stringBuilder.append(n8);
        return new o(n9, n8, stringBuilder.toString());
    }
}

