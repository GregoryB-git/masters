package k3;

import java.util.Arrays;
import java.util.Map;
import k3.n;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f8873a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8874b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8875c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8876d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8877e;
    public final Map<String, String> f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8878g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8879h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f8880i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f8881j;

    public static final class a extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f8882a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f8883b;

        /* renamed from: c, reason: collision with root package name */
        public m f8884c;

        /* renamed from: d, reason: collision with root package name */
        public Long f8885d;

        /* renamed from: e, reason: collision with root package name */
        public Long f8886e;
        public Map<String, String> f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f8887g;

        /* renamed from: h, reason: collision with root package name */
        public String f8888h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f8889i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f8890j;

        public final h b() {
            String str = this.f8882a == null ? " transportName" : "";
            if (this.f8884c == null) {
                str = defpackage.g.d(str, " encodedPayload");
            }
            if (this.f8885d == null) {
                str = defpackage.g.d(str, " eventMillis");
            }
            if (this.f8886e == null) {
                str = defpackage.g.d(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = defpackage.g.d(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f8882a, this.f8883b, this.f8884c, this.f8885d.longValue(), this.f8886e.longValue(), this.f, this.f8887g, this.f8888h, this.f8889i, this.f8890j);
            }
            throw new IllegalStateException(defpackage.g.d("Missing required properties:", str));
        }

        public final a c(m mVar) {
            if (mVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f8884c = mVar;
            return this;
        }

        public final a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f8882a = str;
            return this;
        }
    }

    public h() {
        throw null;
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f8873a = str;
        this.f8874b = num;
        this.f8875c = mVar;
        this.f8876d = j10;
        this.f8877e = j11;
        this.f = map;
        this.f8878g = num2;
        this.f8879h = str2;
        this.f8880i = bArr;
        this.f8881j = bArr2;
    }

    @Override // k3.n
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // k3.n
    public final Integer c() {
        return this.f8874b;
    }

    @Override // k3.n
    public final m d() {
        return this.f8875c;
    }

    @Override // k3.n
    public final long e() {
        return this.f8876d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f8873a.equals(nVar.k()) && ((num = this.f8874b) != null ? num.equals(nVar.c()) : nVar.c() == null) && this.f8875c.equals(nVar.d()) && this.f8876d == nVar.e() && this.f8877e == nVar.l() && this.f.equals(nVar.b()) && ((num2 = this.f8878g) != null ? num2.equals(nVar.i()) : nVar.i() == null) && ((str = this.f8879h) != null ? str.equals(nVar.j()) : nVar.j() == null)) {
            boolean z10 = nVar instanceof h;
            if (Arrays.equals(this.f8880i, z10 ? ((h) nVar).f8880i : nVar.f())) {
                if (Arrays.equals(this.f8881j, z10 ? ((h) nVar).f8881j : nVar.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k3.n
    public final byte[] f() {
        return this.f8880i;
    }

    @Override // k3.n
    public final byte[] g() {
        return this.f8881j;
    }

    public final int hashCode() {
        int hashCode = (this.f8873a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8874b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f8875c.hashCode()) * 1000003;
        long j10 = this.f8876d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8877e;
        int hashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.f8878g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f8879h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f8880i)) * 1000003) ^ Arrays.hashCode(this.f8881j);
    }

    @Override // k3.n
    public final Integer i() {
        return this.f8878g;
    }

    @Override // k3.n
    public final String j() {
        return this.f8879h;
    }

    @Override // k3.n
    public final String k() {
        return this.f8873a;
    }

    @Override // k3.n
    public final long l() {
        return this.f8877e;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("EventInternal{transportName=");
        l10.append(this.f8873a);
        l10.append(", code=");
        l10.append(this.f8874b);
        l10.append(", encodedPayload=");
        l10.append(this.f8875c);
        l10.append(", eventMillis=");
        l10.append(this.f8876d);
        l10.append(", uptimeMillis=");
        l10.append(this.f8877e);
        l10.append(", autoMetadata=");
        l10.append(this.f);
        l10.append(", productId=");
        l10.append(this.f8878g);
        l10.append(", pseudonymousId=");
        l10.append(this.f8879h);
        l10.append(", experimentIdsClear=");
        l10.append(Arrays.toString(this.f8880i));
        l10.append(", experimentIdsEncrypted=");
        l10.append(Arrays.toString(this.f8881j));
        l10.append("}");
        return l10.toString();
    }
}
