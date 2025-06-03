package x9;

import q0.g;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f17210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17212c;

    /* renamed from: d, reason: collision with root package name */
    public final f f17213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17214e;

    public a(String str, String str2, String str3, f fVar, int i10) {
        this.f17210a = str;
        this.f17211b = str2;
        this.f17212c = str3;
        this.f17213d = fVar;
        this.f17214e = i10;
    }

    @Override // x9.d
    public final f a() {
        return this.f17213d;
    }

    @Override // x9.d
    public final String b() {
        return this.f17211b;
    }

    @Override // x9.d
    public final String c() {
        return this.f17212c;
    }

    @Override // x9.d
    public final int d() {
        return this.f17214e;
    }

    @Override // x9.d
    public final String e() {
        return this.f17210a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f17210a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f17211b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f17212c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f17213d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        int i10 = this.f17214e;
                        int d10 = dVar.d();
                        if (i10 == 0) {
                            if (d10 == 0) {
                                return true;
                            }
                        } else if (g.b(i10, d10)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17210a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f17211b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17212c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f17213d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        int i10 = this.f17214e;
        return hashCode4 ^ (i10 != 0 ? g.c(i10) : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("InstallationResponse{uri=");
        l10.append(this.f17210a);
        l10.append(", fid=");
        l10.append(this.f17211b);
        l10.append(", refreshToken=");
        l10.append(this.f17212c);
        l10.append(", authToken=");
        l10.append(this.f17213d);
        l10.append(", responseCode=");
        l10.append(defpackage.f.v(this.f17214e));
        l10.append("}");
        return l10.toString();
    }
}
