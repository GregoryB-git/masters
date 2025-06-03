/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package f2;

import c2.b;
import java.util.Arrays;

public final class h {
    public final b a;
    public final byte[] b;

    public h(b b8, byte[] arrby) {
        if (b8 != null) {
            if (arrby != null) {
                this.a = b8;
                this.b = arrby;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        if (!this.a.equals(object.a)) {
            return false;
        }
        return Arrays.equals((byte[])this.b, (byte[])object.b);
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode((byte[])this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EncodedPayload{encoding=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", bytes=[...]}");
        return stringBuilder.toString();
    }
}

