/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package o0;

import Q0.a;

public final class f {
    public final a[] a;
    public final long[] b;
    public final String c;
    public final String d;
    public final long e;

    public f(String string2, String string3, long l8, long[] arrl, a[] arra) {
        this.c = string2;
        this.d = string3;
        this.e = l8;
        this.b = arrl;
        this.a = arra;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("/");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}

