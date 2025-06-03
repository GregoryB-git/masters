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

import d3.I;
import d3.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class G
extends b {
    public final I a;
    public final r3.b b;
    public final a c;
    public final Integer d;

    public G(I i8, r3.b b8, a a8, Integer n8) {
        this.a = i8;
        this.b = b8;
        this.c = a8;
        this.d = n8;
    }

    public static G a(I.a object, r3.b b8, Integer n8) {
        I.a a8 = I.a.d;
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
            object = I.a((I.a)object);
            return new G((I)object, b8, G.b((I)object, n8), n8);
        }
        object = new StringBuilder();
        object.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
        object.append(b8.b());
        throw new GeneralSecurityException(object.toString());
    }

    public static a b(I i8, Integer n8) {
        if (i8.b() == I.a.d) {
            return a.a(new byte[0]);
        }
        if (i8.b() == I.a.c) {
            return a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(n8.intValue()).array());
        }
        if (i8.b() == I.a.b) {
            return a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(n8.intValue()).array());
        }
        n8 = new StringBuilder();
        n8.append("Unknown Variant: ");
        n8.append((Object)i8.b());
        throw new IllegalStateException(n8.toString());
    }
}

