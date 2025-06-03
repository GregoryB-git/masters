package l8;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public final String f9754b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9755c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9756d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9757e;
    public final long f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f9754b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f9755c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f9756d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f9757e = str4;
        this.f = j10;
    }

    @Override // l8.k
    public final String b() {
        return this.f9755c;
    }

    @Override // l8.k
    public final String c() {
        return this.f9756d;
    }

    @Override // l8.k
    public final String d() {
        return this.f9754b;
    }

    @Override // l8.k
    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9754b.equals(kVar.d()) && this.f9755c.equals(kVar.b()) && this.f9756d.equals(kVar.c()) && this.f9757e.equals(kVar.f()) && this.f == kVar.e();
    }

    @Override // l8.k
    public final String f() {
        return this.f9757e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f9754b.hashCode() ^ 1000003) * 1000003) ^ this.f9755c.hashCode()) * 1000003) ^ this.f9756d.hashCode()) * 1000003) ^ this.f9757e.hashCode()) * 1000003;
        long j10 = this.f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RolloutAssignment{rolloutId=");
        l10.append(this.f9754b);
        l10.append(", parameterKey=");
        l10.append(this.f9755c);
        l10.append(", parameterValue=");
        l10.append(this.f9756d);
        l10.append(", variantId=");
        l10.append(this.f9757e);
        l10.append(", templateVersion=");
        l10.append(this.f);
        l10.append("}");
        return l10.toString();
    }
}
