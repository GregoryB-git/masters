package d3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends AbstractC1217c {

    /* renamed from: a, reason: collision with root package name */
    public final int f13249a;

    /* renamed from: b, reason: collision with root package name */
    public final c f13250b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f13251a;

        /* renamed from: b, reason: collision with root package name */
        public c f13252b;

        public b() {
            this.f13251a = null;
            this.f13252b = c.f13255d;
        }

        public v a() {
            Integer num = this.f13251a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f13252b != null) {
                return new v(num.intValue(), this.f13252b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i7) {
            if (i7 != 16 && i7 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
            }
            this.f13251a = Integer.valueOf(i7);
            return this;
        }

        public b c(c cVar) {
            this.f13252b = cVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13253b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f13254c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f13255d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f13256a;

        public c(String str) {
            this.f13256a = str;
        }

        public String toString() {
            return this.f13256a;
        }
    }

    public v(int i7, c cVar) {
        this.f13249a = i7;
        this.f13250b = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f13249a;
    }

    public c c() {
        return this.f13250b;
    }

    public boolean d() {
        return this.f13250b != c.f13255d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13249a), this.f13250b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f13250b + ", " + this.f13249a + "-byte key)";
    }
}
