package l3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f17169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17170b;

    /* renamed from: c, reason: collision with root package name */
    public final c f17171c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f17172a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f17173b;

        /* renamed from: c, reason: collision with root package name */
        public c f17174c;

        public b() {
            this.f17172a = null;
            this.f17173b = null;
            this.f17174c = c.f17178e;
        }

        public d a() {
            Integer num = this.f17172a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f17173b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f17174c != null) {
                return new d(num.intValue(), this.f17173b.intValue(), this.f17174c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i7) {
            if (i7 != 16 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
            }
            this.f17172a = Integer.valueOf(i7);
            return this;
        }

        public b c(int i7) {
            if (i7 >= 10 && 16 >= i7) {
                this.f17173b = Integer.valueOf(i7);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i7);
        }

        public b d(c cVar) {
            this.f17174c = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f17175b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f17176c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f17177d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f17178e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f17179a;

        public c(String str) {
            this.f17179a = str;
        }

        public String toString() {
            return this.f17179a;
        }
    }

    public d(int i7, int i8, c cVar) {
        this.f17169a = i7;
        this.f17170b = i8;
        this.f17171c = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f17170b;
    }

    public int c() {
        return this.f17169a;
    }

    public int d() {
        c cVar = this.f17171c;
        if (cVar == c.f17178e) {
            return b();
        }
        if (cVar == c.f17175b || cVar == c.f17176c || cVar == c.f17177d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public c e() {
        return this.f17171c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f17171c != c.f17178e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17169a), Integer.valueOf(this.f17170b), this.f17171c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f17171c + ", " + this.f17170b + "-byte tags, and " + this.f17169a + "-byte key)";
    }
}
