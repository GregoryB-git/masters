package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f17198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17199b;

    /* renamed from: c, reason: collision with root package name */
    public final d f17200c;

    /* renamed from: d, reason: collision with root package name */
    public final c f17201d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f17202a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f17203b;

        /* renamed from: c, reason: collision with root package name */
        public c f17204c;

        /* renamed from: d, reason: collision with root package name */
        public d f17205d;

        public b() {
            this.f17202a = null;
            this.f17203b = null;
            this.f17204c = null;
            this.f17205d = d.f17215e;
        }

        public static void f(int i7, c cVar) {
            if (i7 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
            }
            if (cVar == c.f17206b) {
                if (i7 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i7)));
                }
                return;
            }
            if (cVar == c.f17207c) {
                if (i7 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i7)));
                }
                return;
            }
            if (cVar == c.f17208d) {
                if (i7 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i7)));
                }
            } else if (cVar == c.f17209e) {
                if (i7 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i7)));
                }
            } else {
                if (cVar != c.f17210f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i7 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i7)));
                }
            }
        }

        public l a() {
            Integer num = this.f17202a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f17203b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f17204c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f17205d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f17202a));
            }
            f(this.f17203b.intValue(), this.f17204c);
            return new l(this.f17202a.intValue(), this.f17203b.intValue(), this.f17205d, this.f17204c);
        }

        public b b(c cVar) {
            this.f17204c = cVar;
            return this;
        }

        public b c(int i7) {
            this.f17202a = Integer.valueOf(i7);
            return this;
        }

        public b d(int i7) {
            this.f17203b = Integer.valueOf(i7);
            return this;
        }

        public b e(d dVar) {
            this.f17205d = dVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f17206b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f17207c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f17208d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f17209e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f17210f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f17211a;

        public c(String str) {
            this.f17211a = str;
        }

        public String toString() {
            return this.f17211a;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f17212b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f17213c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f17214d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f17215e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f17216a;

        public d(String str) {
            this.f17216a = str;
        }

        public String toString() {
            return this.f17216a;
        }
    }

    public l(int i7, int i8, d dVar, c cVar) {
        this.f17198a = i7;
        this.f17199b = i8;
        this.f17200c = dVar;
        this.f17201d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f17199b;
    }

    public c c() {
        return this.f17201d;
    }

    public int d() {
        return this.f17198a;
    }

    public int e() {
        d dVar = this.f17200c;
        if (dVar == d.f17215e) {
            return b();
        }
        if (dVar == d.f17212b || dVar == d.f17213c || dVar == d.f17214d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f17200c;
    }

    public boolean g() {
        return this.f17200c != d.f17215e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17198a), Integer.valueOf(this.f17199b), this.f17200c, this.f17201d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f17200c + ", hashType: " + this.f17201d + ", " + this.f17199b + "-byte tags, and " + this.f17198a + "-byte key)";
    }
}
