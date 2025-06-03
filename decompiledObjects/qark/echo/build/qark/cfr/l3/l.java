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

public final class l
extends q {
    public final int a;
    public final int b;
    public final d c;
    public final c d;

    public l(int n8, int n9, d d8, c c8) {
        this.a = n8;
        this.b = n9;
        this.c = d8;
        this.d = c8;
    }

    public /* synthetic */ l(int n8, int n9, d d8, c c8,  a8) {
        this(n8, n9, d8, c8);
    }

    public static b a() {
        return new b(null);
    }

    public int b() {
        return this.b;
    }

    public c c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int e() {
        d d8 = this.c;
        if (d8 == d.e) {
            return this.b();
        }
        if (d8 == d.b) {
            return this.b() + 5;
        }
        if (d8 == d.c) {
            return this.b() + 5;
        }
        if (d8 != d.d) throw new IllegalStateException("Unknown variant");
        return this.b() + 5;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof l;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (l)object;
        bl = bl2;
        if (object.d() == this.d()) {
            bl = bl2;
            if (object.e() == this.e()) {
                bl = bl2;
                if (object.f() == this.f()) {
                    bl = bl2;
                    if (object.c() == this.c()) {
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    public d f() {
        return this.c;
    }

    public boolean g() {
        if (this.c != d.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HMAC Parameters (variant: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", hashType: ");
        stringBuilder.append((Object)this.d);
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
        public c c = null;
        public d d = d.e;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public static void f(int n8, c c8) {
            if (n8 >= 10) {
                if (c8 == c.b) {
                    if (n8 <= 20) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", (Object[])new Object[]{n8}));
                }
                if (c8 == c.c) {
                    if (n8 <= 28) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", (Object[])new Object[]{n8}));
                }
                if (c8 == c.d) {
                    if (n8 <= 32) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", (Object[])new Object[]{n8}));
                }
                if (c8 == c.e) {
                    if (n8 <= 48) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", (Object[])new Object[]{n8}));
                }
                if (c8 == c.f) {
                    if (n8 <= 64) {
                        return;
                    }
                    throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", (Object[])new Object[]{n8}));
                }
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            throw new GeneralSecurityException(String.format((String)"Invalid tag size in bytes %d; must be at least 10 bytes", (Object[])new Object[]{n8}));
        }

        public l a() {
            Integer n8 = this.a;
            if (n8 != null) {
                if (this.b != null) {
                    if (this.c != null) {
                        if (this.d != null) {
                            if (n8 >= 16) {
                                b.f(this.b, this.c);
                                return new l(this.a, this.b, this.d, this.c, null);
                            }
                            throw new InvalidAlgorithmParameterException(String.format((String)"Invalid key size in bytes %d; must be at least 16 bytes", (Object[])new Object[]{this.a}));
                        }
                        throw new GeneralSecurityException("variant is not set");
                    }
                    throw new GeneralSecurityException("hash type is not set");
                }
                throw new GeneralSecurityException("tag size is not set");
            }
            throw new GeneralSecurityException("key size is not set");
        }

        public b b(c c8) {
            this.c = c8;
            return this;
        }

        public b c(int n8) {
            this.a = n8;
            return this;
        }

        public b d(int n8) {
            this.b = n8;
            return this;
        }

        public b e(d d8) {
            this.d = d8;
            return this;
        }
    }

    public static final class c {
        public static final c b = new c("SHA1");
        public static final c c = new c("SHA224");
        public static final c d = new c("SHA256");
        public static final c e = new c("SHA384");
        public static final c f = new c("SHA512");
        public final String a;

        public c(String string2) {
            this.a = string2;
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class d {
        public static final d b = new d("TINK");
        public static final d c = new d("CRUNCHY");
        public static final d d = new d("LEGACY");
        public static final d e = new d("NO_PREFIX");
        public final String a;

        public d(String string2) {
            this.a = string2;
        }

        public String toString() {
            return this.a;
        }
    }

}

