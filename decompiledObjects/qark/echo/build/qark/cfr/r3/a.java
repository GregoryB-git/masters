/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package r3;

import java.util.Arrays;
import q3.k;

public final class a {
    public final byte[] a;

    public a(byte[] arrby, int n8, int n9) {
        byte[] arrby2 = new byte[n9];
        this.a = arrby2;
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)0, (int)n9);
    }

    public static a a(byte[] arrby) {
        if (arrby != null) {
            return a.b(arrby, 0, arrby.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] arrby, int n8, int n9) {
        if (arrby != null) {
            return new a(arrby, n8, n9);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.a.length;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        return Arrays.equals((byte[])((a)object).a, (byte[])this.a);
    }

    public int hashCode() {
        return Arrays.hashCode((byte[])this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bytes(");
        stringBuilder.append(k.b(this.a));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

