/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.util.Objects
 */
package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class q
extends d3.c {
    public final int a;
    public final int b;
    public final int c;
    public final c d;

    public q(int n8, int n9, int n10, c c8) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = c8;
    }

    public /* synthetic */ q(int n8, int n9, int n10, c c8,  a8) {
        this(n8, n9, n10, c8);
    }

    public static b a() {
        return new b(null);
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public c e() {
        return this.d;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof q;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (q)object;
        bl = bl2;
        if (object.c() == this.c()) {
            bl = bl2;
            if (object.b() == this.b()) {
                bl = bl2;
                if (object.d() == this.d()) {
                    bl = bl2;
                    if (object.e() == this.e()) {
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    public boolean f() {
        if (this.d != c.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AesGcm Parameters (variant: ");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("-byte IV, ");
        stringBuilder.append(this.c);
        stringBuilder.append("-byte tag, and ");
        stringBuilder.append(this.a);
        stringBuilder.append("-byte key)");
        return stringBuilder.toString();
    }

    public static final class b {
        public Integer a = null;
        public Integer b = null;
        public Integer c = null;
        public c d = c.d;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public q a() {
            Integer n8 = this.a;
            if (n8 != null) {
                if (this.d != null) {
                    if (this.b != null) {
                        if (this.c != null) {
                            return new q(n8, this.b, this.c, this.d, null);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("IV size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }

        public b b(int n8) {
            if (n8 > 0) {
                this.b = n8;
                return this;
            }
            throw new GeneralSecurityException(String.format((String)"Invalid IV size in bytes %d; IV size must be positive", (Object[])new Object[]{n8}));
        }

        public b c(int n8) {
            if (n8 != 16 && n8 != 24 && n8 != 32) {
                throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", (Object[])new Object[]{n8}));
            }
            this.a = n8;
            return this;
        }

        public b d(int n8) {
            if (n8 != 12 && n8 != 13 && n8 != 14 && n8 != 15 && n8 != 16) {
                throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", (Object[])new Object[]{n8}));
            }
            this.c = n8;
            return this;
        }

        public b e(c c8) {
            this.d = c8;
            return this;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");
        public static final c c = new c("CRUNCHY");
        public static final c d = new c("NO_PREFIX");
        public final String a;

        public c(String string2) {
            this.a = string2;
        }

        public String toString() {
            return this.a;
        }
    }

}

