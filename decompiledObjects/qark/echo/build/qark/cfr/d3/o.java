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

import d3.q;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class o
extends d3.b {
    public final q a;
    public final r3.b b;
    public final a c;
    public final Integer d;

    public o(q q8, r3.b b8, a a8, Integer n8) {
        this.a = q8;
        this.b = b8;
        this.c = a8;
        this.d = n8;
    }

    public /* synthetic */ o(q q8, r3.b b8, a a8, Integer n8,  a9) {
        this(q8, b8, a8, n8);
    }

    public static b a() {
        return new b(null);
    }

    public static class b {
        public q a = null;
        public r3.b b = null;
        public Integer c = null;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public o a() {
            Object object = this.a;
            if (object != null && this.b != null) {
                if (object.c() == this.b.b()) {
                    if (this.a.f() && this.c == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.a.f() && this.c != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    object = this.b();
                    return new o(this.a, this.b, (a)object, this.c, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        public final a b() {
            if (this.a.e() == q.c.d) {
                return a.a(new byte[0]);
            }
            if (this.a.e() == q.c.c) {
                return a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
            }
            if (this.a.e() == q.c.b) {
                return a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown AesGcmParameters.Variant: ");
            stringBuilder.append((Object)this.a.e());
            throw new IllegalStateException(stringBuilder.toString());
        }

        public b c(Integer n8) {
            this.c = n8;
            return this;
        }

        public b d(r3.b b8) {
            this.b = b8;
            return this;
        }

        public b e(q q8) {
            this.a = q8;
            return this;
        }
    }

}

