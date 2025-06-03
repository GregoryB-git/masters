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
import l3.l;
import l3.p;
import l3.q;
import r3.a;

public final class i
extends p {
    public final l a;
    public final r3.b b;
    public final a c;
    public final Integer d;

    public i(l l8, r3.b b8, a a8, Integer n8) {
        this.a = l8;
        this.b = b8;
        this.c = a8;
        this.d = n8;
    }

    public /* synthetic */ i(l l8, r3.b b8, a a8, Integer n8,  a9) {
        this(l8, b8, a8, n8);
    }

    public static b c() {
        return new b(null);
    }

    @Override
    public a a() {
        return this.c;
    }

    public l d() {
        return this.a;
    }

    public static class b {
        public l a = null;
        public r3.b b = null;
        public Integer c = null;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public i a() {
            Object object = this.a;
            if (object != null && this.b != null) {
                if (object.d() == this.b.b()) {
                    if (this.a.g() && this.c == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.a.g() && this.c != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    object = this.b();
                    return new i(this.a, this.b, (a)object, this.c, null);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }

        public final a b() {
            if (this.a.f() == l.d.e) {
                return a.a(new byte[0]);
            }
            if (this.a.f() != l.d.d && this.a.f() != l.d.c) {
                if (this.a.f() == l.d.b) {
                    return a.a(ByteBuffer.allocate((int)5).put((byte)1).putInt(this.c.intValue()).array());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown HmacParameters.Variant: ");
                stringBuilder.append((Object)this.a.f());
                throw new IllegalStateException(stringBuilder.toString());
            }
            return a.a(ByteBuffer.allocate((int)5).put((byte)0).putInt(this.c.intValue()).array());
        }

        public b c(Integer n8) {
            this.c = n8;
            return this;
        }

        public b d(r3.b b8) {
            this.b = b8;
            return this;
        }

        public b e(l l8) {
            this.a = l8;
            return this;
        }
    }

}

