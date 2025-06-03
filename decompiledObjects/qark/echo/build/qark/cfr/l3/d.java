/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.util.Objects
 */
package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import l3.q;

public final class d
extends q {
    public final int a;
    public final int b;
    public final c c;

    public d(int n8, int n9, c c8) {
        this.a = n8;
        this.b = n9;
        this.c = c8;
    }

    public /* synthetic */ d(int n8, int n9, c c8,  a8) {
        this(n8, n9, c8);
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

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        c c8 = this.c;
        if (c8 == c.e) {
            return this.b();
        }
        if (c8 == c.b) {
            return this.b() + 5;
        }
        if (c8 == c.c) {
            return this.b() + 5;
        }
        if (c8 != c.d) throw new IllegalStateException("Unknown variant");
        return this.b() + 5;
    }

    public c e() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof d;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (d)object;
        bl = bl2;
        if (object.c() == this.c()) {
            bl = bl2;
            if (object.d() == this.d()) {
                bl = bl2;
                if (object.e() == this.e()) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public boolean f() {
        if (this.c != c.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AES-CMAC Parameters (variant: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append("-byte tags, and ");
        stringBuilder.append(this.a);
        stringBuilder.append("-byte key)");
        return stringBuilder.toString();
    }

    public static final class b {
        public Integer a = null;
        public Integer b = null;
        public c c = c.e;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public d a() {
            Integer n8 = this.a;
            if (n8 != null) {
                if (this.b != null) {
                    if (this.c != null) {
                        return new d(n8, this.b, this.c, null);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }

        public b b(int n8) {
            if (n8 != 16 && n8 != 32) {
                throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size %d; only 128-bit and 256-bit AES keys are supported", (Object[])new Object[]{n8 * 8}));
            }
            this.a = n8;
            return this;
        }

        public b c(int n8) {
            if (n8 >= 10 && 16 >= n8) {
                this.b = n8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid tag size for AesCmacParameters: ");
            stringBuilder.append(n8);
            throw new GeneralSecurityException(stringBuilder.toString());
        }

        public b d(c c8) {
            this.c = c8;
            return this;
        }
    }

    public static final class c {
        public static final c b = new c("TINK");
        public static final c c = new c("CRUNCHY");
        public static final c d = new c("LEGACY");
        public static final c e = new c("NO_PREFIX");
        public final String a;

        public c(String string2) {
            this.a = string2;
        }

        public String toString() {
            return this.a;
        }
    }

}

