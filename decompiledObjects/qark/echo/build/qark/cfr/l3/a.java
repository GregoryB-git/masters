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
package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import l3.d;
import l3.p;
import l3.q;

public final class a
extends p {
    public final d a;
    public final r3.b b;
    public final r3.a c;
    public final Integer d;

    public a(d d8, r3.b b8, r3.a a8, Integer n8) {
        this.a = d8;
        this.b = b8;
        this.c = a8;
        this.d = n8;
    }

    public /* synthetic */ a(d d8, r3.b b8, r3.a a8, Integer n8,  a9) {
        this(d8, b8, a8, n8);
    }

    public static b c() {
        return new b(null);
    }

    @Override
    public r3.a a() {
        return this.c;
    }

    public d d() {
        return this.a;
    }

    public static class b {
        public d a = null;
        public r3.b b = null;
        public Integer c = null;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public a a() {
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
                    return new a(this.a, this.b, (r3.a)object, this.c, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        public final r3.a b() {
            if (this.a.e() == d.c.e) {
                return r3.a.a(new byte[0]);
            }
            if (this.a.e() != d.c.d && this.a.e() != d.c.c) {
                if (this.a.e() == d.c.b) {
                    return r3.a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown AesCmacParametersParameters.Variant: ");
                stringBuilder.append((Object)this.a.e());
                throw new IllegalStateException(stringBuilder.toString());
            }
            return r3.a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
        }

        public b c(r3.b b8) {
            this.b = b8;
            return this;
        }

        public b d(Integer n8) {
            this.c = n8;
            return this;
        }

        public b e(d d8) {
            this.a = d8;
            return this;
        }
    }

}

