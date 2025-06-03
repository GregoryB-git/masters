package j3;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f8328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8330c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8331d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8332e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8333g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8334h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8335i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8336j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8337k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8338l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8328a = num;
        this.f8329b = str;
        this.f8330c = str2;
        this.f8331d = str3;
        this.f8332e = str4;
        this.f = str5;
        this.f8333g = str6;
        this.f8334h = str7;
        this.f8335i = str8;
        this.f8336j = str9;
        this.f8337k = str10;
        this.f8338l = str11;
    }

    @Override // j3.a
    public final String a() {
        return this.f8338l;
    }

    @Override // j3.a
    public final String b() {
        return this.f8336j;
    }

    @Override // j3.a
    public final String c() {
        return this.f8331d;
    }

    @Override // j3.a
    public final String d() {
        return this.f8334h;
    }

    @Override // j3.a
    public final String e() {
        return this.f8330c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f8328a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f8329b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f8330c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f8331d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f8332e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f8333g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f8334h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f8335i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f8336j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f8337k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f8338l;
                                                    String a10 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a10 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a10)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // j3.a
    public final String f() {
        return this.f8335i;
    }

    @Override // j3.a
    public final String g() {
        return this.f8333g;
    }

    @Override // j3.a
    public final String h() {
        return this.f8337k;
    }

    public final int hashCode() {
        Integer num = this.f8328a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f8329b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8330c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8331d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8332e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f8333g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f8334h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f8335i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f8336j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f8337k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f8338l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // j3.a
    public final String i() {
        return this.f8329b;
    }

    @Override // j3.a
    public final String j() {
        return this.f;
    }

    @Override // j3.a
    public final String k() {
        return this.f8332e;
    }

    @Override // j3.a
    public final Integer l() {
        return this.f8328a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AndroidClientInfo{sdkVersion=");
        l10.append(this.f8328a);
        l10.append(", model=");
        l10.append(this.f8329b);
        l10.append(", hardware=");
        l10.append(this.f8330c);
        l10.append(", device=");
        l10.append(this.f8331d);
        l10.append(", product=");
        l10.append(this.f8332e);
        l10.append(", osBuild=");
        l10.append(this.f);
        l10.append(", manufacturer=");
        l10.append(this.f8333g);
        l10.append(", fingerprint=");
        l10.append(this.f8334h);
        l10.append(", locale=");
        l10.append(this.f8335i);
        l10.append(", country=");
        l10.append(this.f8336j);
        l10.append(", mccMnc=");
        l10.append(this.f8337k);
        l10.append(", applicationBuild=");
        return defpackage.g.f(l10, this.f8338l, "}");
    }
}
