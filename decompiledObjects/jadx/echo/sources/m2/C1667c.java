package m2;

import java.util.Set;
import m2.f;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f17671a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17672b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17673c;

    /* renamed from: m2.c$b */
    public static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f17674a;

        /* renamed from: b, reason: collision with root package name */
        public Long f17675b;

        /* renamed from: c, reason: collision with root package name */
        public Set f17676c;

        @Override // m2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f17674a == null) {
                str = " delta";
            }
            if (this.f17675b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f17676c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C1667c(this.f17674a.longValue(), this.f17675b.longValue(), this.f17676c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m2.f.b.a
        public f.b.a b(long j7) {
            this.f17674a = Long.valueOf(j7);
            return this;
        }

        @Override // m2.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f17676c = set;
            return this;
        }

        @Override // m2.f.b.a
        public f.b.a d(long j7) {
            this.f17675b = Long.valueOf(j7);
            return this;
        }
    }

    public C1667c(long j7, long j8, Set set) {
        this.f17671a = j7;
        this.f17672b = j8;
        this.f17673c = set;
    }

    @Override // m2.f.b
    public long b() {
        return this.f17671a;
    }

    @Override // m2.f.b
    public Set c() {
        return this.f17673c;
    }

    @Override // m2.f.b
    public long d() {
        return this.f17672b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f17671a == bVar.b() && this.f17672b == bVar.d() && this.f17673c.equals(bVar.c());
    }

    public int hashCode() {
        long j7 = this.f17671a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f17672b;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f17673c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f17671a + ", maxAllowedDelay=" + this.f17672b + ", flags=" + this.f17673c + "}";
    }
}
