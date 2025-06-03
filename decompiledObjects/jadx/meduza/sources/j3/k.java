package j3;

import java.util.List;

/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    public final long f8364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8365b;

    /* renamed from: c, reason: collision with root package name */
    public final o f8366c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8368e;
    public final List<t> f;

    /* renamed from: g, reason: collision with root package name */
    public final x f8369g;

    public k() {
        throw null;
    }

    public k(long j10, long j11, o oVar, Integer num, String str, List list, x xVar) {
        this.f8364a = j10;
        this.f8365b = j11;
        this.f8366c = oVar;
        this.f8367d = num;
        this.f8368e = str;
        this.f = list;
        this.f8369g = xVar;
    }

    @Override // j3.u
    public final o a() {
        return this.f8366c;
    }

    @Override // j3.u
    public final List<t> b() {
        return this.f;
    }

    @Override // j3.u
    public final Integer c() {
        return this.f8367d;
    }

    @Override // j3.u
    public final String d() {
        return this.f8368e;
    }

    @Override // j3.u
    public final x e() {
        return this.f8369g;
    }

    public final boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f8364a == uVar.f() && this.f8365b == uVar.g() && ((oVar = this.f8366c) != null ? oVar.equals(uVar.a()) : uVar.a() == null) && ((num = this.f8367d) != null ? num.equals(uVar.c()) : uVar.c() == null) && ((str = this.f8368e) != null ? str.equals(uVar.d()) : uVar.d() == null) && ((list = this.f) != null ? list.equals(uVar.b()) : uVar.b() == null)) {
            x xVar = this.f8369g;
            x e10 = uVar.e();
            if (xVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (xVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    @Override // j3.u
    public final long f() {
        return this.f8364a;
    }

    @Override // j3.u
    public final long g() {
        return this.f8365b;
    }

    public final int hashCode() {
        long j10 = this.f8364a;
        long j11 = this.f8365b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f8366c;
        int hashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f8367d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8368e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f8369g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("LogRequest{requestTimeMs=");
        l10.append(this.f8364a);
        l10.append(", requestUptimeMs=");
        l10.append(this.f8365b);
        l10.append(", clientInfo=");
        l10.append(this.f8366c);
        l10.append(", logSource=");
        l10.append(this.f8367d);
        l10.append(", logSourceName=");
        l10.append(this.f8368e);
        l10.append(", logEvents=");
        l10.append(this.f);
        l10.append(", qosTier=");
        l10.append(this.f8369g);
        l10.append("}");
        return l10.toString();
    }
}
