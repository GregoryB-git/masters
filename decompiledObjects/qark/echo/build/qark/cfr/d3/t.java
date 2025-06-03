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

import d3.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class t
extends d3.b {
    public final v a;
    public final r3.b b;
    public final a c;
    public final Integer d;

    public t(v v8, r3.b b8, a a8, Integer n8) {
        this.a = v8;
        this.b = b8;
        this.c = a8;
        this.d = n8;
    }

    public /* synthetic */ t(v v8, r3.b b8, a a8, Integer n8,  a9) {
        this(v8, b8, a8, n8);
    }

    public static b a() {
        return new b(null);
    }

    public static class b {
        public v a = null;
        public r3.b b = null;
        public Integer c = null;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public t a() {
            Object object = this.a;
            if (object != null && this.b != null) {
                if (object.b() == this.b.b()) {
                    if (this.a.d() && this.c == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.a.d() && this.c != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    object = this.b();
                    return new t(this.a, this.b, (a)object, this.c, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        public final a b() {
            if (this.a.c() == v.c.d) {
                return a.a(new byte[0]);
            }
            if (this.a.c() == v.c.c) {
                return a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
            }
            if (this.a.c() == v.c.b) {
                return a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown AesGcmSivParameters.Variant: ");
            stringBuilder.append((Object)this.a.c());
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

        public b e(v v8) {
            this.a = v8;
            return this;
        }
    }

}

