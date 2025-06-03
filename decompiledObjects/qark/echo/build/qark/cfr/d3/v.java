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

public final class v
extends d3.c {
    public final int a;
    public final c b;

    public v(int n8, c c8) {
        this.a = n8;
        this.b = c8;
    }

    public /* synthetic */ v(int n8, c c8,  a8) {
        this(n8, c8);
    }

    public static b a() {
        return new b(null);
    }

    public int b() {
        return this.a;
    }

    public c c() {
        return this.b;
    }

    public boolean d() {
        if (this.b != c.d) {
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof v;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (v)object;
        bl = bl2;
        if (object.b() == this.b()) {
            bl = bl2;
            if (object.c() == this.c()) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AesGcmSiv Parameters (variant: ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.a);
        stringBuilder.append("-byte key)");
        return stringBuilder.toString();
    }

    public static final class b {
        public Integer a = null;
        public c b = c.d;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public v a() {
            Integer n8 = this.a;
            if (n8 != null) {
                if (this.b != null) {
                    return new v(n8, this.b, null);
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }

        public b b(int n8) {
            if (n8 != 16 && n8 != 32) {
                throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size %d; only 16-byte and 32-byte AES keys are supported", (Object[])new Object[]{n8}));
            }
            this.a = n8;
            return this;
        }

        public b c(c c8) {
            this.b = c8;
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

