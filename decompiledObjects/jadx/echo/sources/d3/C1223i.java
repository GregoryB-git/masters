package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: d3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223i extends AbstractC1217c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13199c;

    /* renamed from: d, reason: collision with root package name */
    public final c f13200d;

    /* renamed from: d3.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f13201a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13202b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13203c;

        /* renamed from: d, reason: collision with root package name */
        public c f13204d;

        public b() {
            this.f13201a = null;
            this.f13202b = null;
            this.f13203c = null;
            this.f13204d = c.f13207d;
        }

        public C1223i a() {
            Integer num = this.f13201a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f13202b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f13204d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f13203c != null) {
                return new C1223i(num.intValue(), this.f13202b.intValue(), this.f13203c.intValue(), this.f13204d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i7) {
            if (i7 != 12 && i7 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i7)));
            }
            this.f13202b = Integer.valueOf(i7);
            return this;
        }

        public b c(int i7) {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.f13201a = Integer.valueOf(i7);
            return this;
        }

        public b d(int i7) {
            if (i7 < 0 || i7 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i7)));
            }
            this.f13203c = Integer.valueOf(i7);
            return this;
        }

        public b e(c cVar) {
            this.f13204d = cVar;
            return this;
        }
    }

    /* renamed from: d3.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13205b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f13206c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f13207d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f13208a;

        public c(String str) {
            this.f13208a = str;
        }

        public String toString() {
            return this.f13208a;
        }
    }

    public C1223i(int i7, int i8, int i9, c cVar) {
        this.f13197a = i7;
        this.f13198b = i8;
        this.f13199c = i9;
        this.f13200d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f13198b;
    }

    public int c() {
        return this.f13197a;
    }

    public int d() {
        return this.f13199c;
    }

    public c e() {
        return this.f13200d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1223i)) {
            return false;
        }
        C1223i c1223i = (C1223i) obj;
        return c1223i.c() == c() && c1223i.b() == b() && c1223i.d() == d() && c1223i.e() == e();
    }

    public boolean f() {
        return this.f13200d != c.f13207d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13197a), Integer.valueOf(this.f13198b), Integer.valueOf(this.f13199c), this.f13200d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f13200d + ", " + this.f13198b + "-byte IV, " + this.f13199c + "-byte tag, and " + this.f13197a + "-byte key)";
    }
}
