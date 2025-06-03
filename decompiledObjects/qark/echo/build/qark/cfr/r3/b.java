/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package r3;

import c3.y;
import r3.a;

public final class b {
    public final a a;

    public b(a a8) {
        this.a = a8;
    }

    public static b a(byte[] arrby, y y8) {
        if (y8 != null) {
            return new b(a.a(arrby));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.a.c();
    }
}

