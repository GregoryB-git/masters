package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends AbstractC1217c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13225c;

    /* renamed from: d, reason: collision with root package name */
    public final c f13226d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f13227a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13228b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13229c;

        /* renamed from: d, reason: collision with root package name */
        public c f13230d;

        public b() {
            this.f13227a = null;
            this.f13228b = null;
            this.f13229c = null;
            this.f13230d = c.f13233d;
        }

        public q a() {
            Integer num = this.f13227a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f13230d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f13228b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f13229c != null) {
                return new q(num.intValue(), this.f13228b.intValue(), this.f13229c.intValue(), this.f13230d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i7) {
            if (i7 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i7)));
            }
            this.f13228b = Integer.valueOf(i7);
            return this;
        }

        public b c(int i7) {
            if (i7 != 16 && i7 != 24 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.f13227a = Integer.valueOf(i7);
            return this;
        }

        public b d(int i7) {
            if (i7 != 12 && i7 != 13 && i7 != 14 && i7 != 15 && i7 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i7)));
            }
            this.f13229c = Integer.valueOf(i7);
            return this;
        }

        public b e(c cVar) {
            this.f13230d = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13231b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f13232c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f13233d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f13234a;

        public c(String str) {
            this.f13234a = str;
        }

        public String toString() {
            return this.f13234a;
        }
    }

    public q(int i7, int i8, int i9, c cVar) {
        this.f13223a = i7;
        this.f13224b = i8;
        this.f13225c = i9;
        this.f13226d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f13224b;
    }

    public int c() {
        return this.f13223a;
    }

    public int d() {
        return this.f13225c;
    }

    public c e() {
        return this.f13226d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f13226d != c.f13233d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13223a), Integer.valueOf(this.f13224b), Integer.valueOf(this.f13225c), this.f13226d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f13226d + ", " + this.f13224b + "-byte IV, " + this.f13225c + "-byte tag, and " + this.f13223a + "-byte key)";
    }
}
