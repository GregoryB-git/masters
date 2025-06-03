package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class b extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10513b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10514c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10515d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10516e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10517g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10518h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10519i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10520j;

    /* renamed from: k, reason: collision with root package name */
    public final f0.e f10521k;

    /* renamed from: l, reason: collision with root package name */
    public final f0.d f10522l;

    /* renamed from: m, reason: collision with root package name */
    public final f0.a f10523m;

    public static final class a extends f0.b {

        /* renamed from: a, reason: collision with root package name */
        public String f10524a;

        /* renamed from: b, reason: collision with root package name */
        public String f10525b;

        /* renamed from: c, reason: collision with root package name */
        public int f10526c;

        /* renamed from: d, reason: collision with root package name */
        public String f10527d;

        /* renamed from: e, reason: collision with root package name */
        public String f10528e;
        public String f;

        /* renamed from: g, reason: collision with root package name */
        public String f10529g;

        /* renamed from: h, reason: collision with root package name */
        public String f10530h;

        /* renamed from: i, reason: collision with root package name */
        public String f10531i;

        /* renamed from: j, reason: collision with root package name */
        public f0.e f10532j;

        /* renamed from: k, reason: collision with root package name */
        public f0.d f10533k;

        /* renamed from: l, reason: collision with root package name */
        public f0.a f10534l;

        /* renamed from: m, reason: collision with root package name */
        public byte f10535m;

        public a() {
        }

        public a(f0 f0Var) {
            this.f10524a = f0Var.k();
            this.f10525b = f0Var.g();
            this.f10526c = f0Var.j();
            this.f10527d = f0Var.h();
            this.f10528e = f0Var.f();
            this.f = f0Var.e();
            this.f10529g = f0Var.b();
            this.f10530h = f0Var.c();
            this.f10531i = f0Var.d();
            this.f10532j = f0Var.l();
            this.f10533k = f0Var.i();
            this.f10534l = f0Var.a();
            this.f10535m = (byte) 1;
        }

        public final b a() {
            if (this.f10535m == 1 && this.f10524a != null && this.f10525b != null && this.f10527d != null && this.f10530h != null && this.f10531i != null) {
                return new b(this.f10524a, this.f10525b, this.f10526c, this.f10527d, this.f10528e, this.f, this.f10529g, this.f10530h, this.f10531i, this.f10532j, this.f10533k, this.f10534l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f10524a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f10525b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f10535m) == 0) {
                sb2.append(" platform");
            }
            if (this.f10527d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f10530h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f10531i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f10513b = str;
        this.f10514c = str2;
        this.f10515d = i10;
        this.f10516e = str3;
        this.f = str4;
        this.f10517g = str5;
        this.f10518h = str6;
        this.f10519i = str7;
        this.f10520j = str8;
        this.f10521k = eVar;
        this.f10522l = dVar;
        this.f10523m = aVar;
    }

    @Override // m8.f0
    public final f0.a a() {
        return this.f10523m;
    }

    @Override // m8.f0
    public final String b() {
        return this.f10518h;
    }

    @Override // m8.f0
    public final String c() {
        return this.f10519i;
    }

    @Override // m8.f0
    public final String d() {
        return this.f10520j;
    }

    @Override // m8.f0
    public final String e() {
        return this.f10517g;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        f0.e eVar;
        f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f10513b.equals(f0Var.k()) && this.f10514c.equals(f0Var.g()) && this.f10515d == f0Var.j() && this.f10516e.equals(f0Var.h()) && ((str = this.f) != null ? str.equals(f0Var.f()) : f0Var.f() == null) && ((str2 = this.f10517g) != null ? str2.equals(f0Var.e()) : f0Var.e() == null) && ((str3 = this.f10518h) != null ? str3.equals(f0Var.b()) : f0Var.b() == null) && this.f10519i.equals(f0Var.c()) && this.f10520j.equals(f0Var.d()) && ((eVar = this.f10521k) != null ? eVar.equals(f0Var.l()) : f0Var.l() == null) && ((dVar = this.f10522l) != null ? dVar.equals(f0Var.i()) : f0Var.i() == null)) {
            f0.a aVar = this.f10523m;
            f0.a a10 = f0Var.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.f0
    public final String f() {
        return this.f;
    }

    @Override // m8.f0
    public final String g() {
        return this.f10514c;
    }

    @Override // m8.f0
    public final String h() {
        return this.f10516e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f10513b.hashCode() ^ 1000003) * 1000003) ^ this.f10514c.hashCode()) * 1000003) ^ this.f10515d) * 1000003) ^ this.f10516e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10517g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10518h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f10519i.hashCode()) * 1000003) ^ this.f10520j.hashCode()) * 1000003;
        f0.e eVar = this.f10521k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f10522l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f10523m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // m8.f0
    public final f0.d i() {
        return this.f10522l;
    }

    @Override // m8.f0
    public final int j() {
        return this.f10515d;
    }

    @Override // m8.f0
    public final String k() {
        return this.f10513b;
    }

    @Override // m8.f0
    public final f0.e l() {
        return this.f10521k;
    }

    @Override // m8.f0
    public final a m() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CrashlyticsReport{sdkVersion=");
        l10.append(this.f10513b);
        l10.append(", gmpAppId=");
        l10.append(this.f10514c);
        l10.append(", platform=");
        l10.append(this.f10515d);
        l10.append(", installationUuid=");
        l10.append(this.f10516e);
        l10.append(", firebaseInstallationId=");
        l10.append(this.f);
        l10.append(", firebaseAuthenticationToken=");
        l10.append(this.f10517g);
        l10.append(", appQualitySessionId=");
        l10.append(this.f10518h);
        l10.append(", buildVersion=");
        l10.append(this.f10519i);
        l10.append(", displayVersion=");
        l10.append(this.f10520j);
        l10.append(", session=");
        l10.append(this.f10521k);
        l10.append(", ndkPayload=");
        l10.append(this.f10522l);
        l10.append(", appExitInfo=");
        l10.append(this.f10523m);
        l10.append("}");
        return l10.toString();
    }
}
