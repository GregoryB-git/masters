/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 */
package d3;

import d3.A;
import d3.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class y
extends b {
    public final A a;
    public final r3.b b;
    public final a c;
    public final Integer d;

    public y(A a8, r3.b b8, a a9, Integer n8) {
        this.a = a8;
        this.b = b8;
        this.c = a9;
        this.d = n8;
    }

    public static y a(A.a object, r3.b b8, Integer n8) {
        A.a a8 = A.a.d;
        if (object != a8 && n8 == null) {
            b8 = new StringBuilder();
            b8.append("For given Variant ");
            b8.append(object);
            b8.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(b8.toString());
        }
        if (object == a8 && n8 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (b8.b() == 32) {
            object = A.a((A.a)object);
            return new y((A)object, b8, y.b((A)object, n8), n8);
        }
        object = new StringBuilder();
        object.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
        object.append(b8.b());
        throw new GeneralSecurityException(object.toString());
    }

    public static a b(A a8, Integer n8) {
        if (a8.b() == A.a.d) {
            return a.a(new byte[0]);
        }
        if (a8.b() == A.a.c) {
            return a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(n8.intValue()).array());
        }
        if (a8.b() == A.a.b) {
            return a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(n8.intValue()).array());
        }
        n8 = new StringBuilder();
        n8.append("Unknown Variant: ");
        n8.append((Object)a8.b());
        throw new IllegalStateException(n8.toString());
    }
}

