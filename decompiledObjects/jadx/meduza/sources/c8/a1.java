package c8;

/* loaded from: classes.dex */
public final class a1 extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2409c;

    public a1(String str, String str2, String str3) {
        this.f2407a = str;
        this.f2408b = str2;
        this.f2409c = str3;
    }

    @Override // c8.y0
    public final String a() {
        return this.f2408b;
    }

    @Override // c8.y0
    public final String b() {
        return this.f2409c;
    }

    @Override // c8.y0
    public final String c() {
        return this.f2407a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            String str = this.f2407a;
            if (str != null ? str.equals(y0Var.c()) : y0Var.c() == null) {
                String str2 = this.f2408b;
                if (str2 != null ? str2.equals(y0Var.a()) : y0Var.a() == null) {
                    String str3 = this.f2409c;
                    String b10 = y0Var.b();
                    if (str3 != null ? str3.equals(b10) : b10 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2407a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f2408b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2409c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f2407a;
        String str2 = this.f2408b;
        String str3 = this.f2409c;
        StringBuilder sb2 = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb2.append(str);
        sb2.append(", playIntegrityToken=");
        sb2.append(str2);
        sb2.append(", recaptchaEnterpriseToken=");
        return defpackage.g.f(sb2, str3, "}");
    }
}
